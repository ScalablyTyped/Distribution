package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatestDeviceJob extends StObject {
  
  /**
    * The target version of the device software.
    */
  var ImageVersion: js.UndefOr[typings.awsSdk.panoramaMod.ImageVersion] = js.undefined
  
  /**
    * Status of the latest device job.
    */
  var Status: js.UndefOr[UpdateProgress] = js.undefined
}
object LatestDeviceJob {
  
  inline def apply(): LatestDeviceJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatestDeviceJob]
  }
  
  extension [Self <: LatestDeviceJob](x: Self) {
    
    inline def setImageVersion(value: ImageVersion): Self = StObject.set(x, "ImageVersion", value.asInstanceOf[js.Any])
    
    inline def setImageVersionUndefined: Self = StObject.set(x, "ImageVersion", js.undefined)
    
    inline def setStatus(value: UpdateProgress): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
