package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanStatus extends StObject {
  
  /**
    * The description of the image scan status.
    */
  var description: js.UndefOr[ScanStatusDescription] = js.undefined
  
  /**
    * The current state of an image scan.
    */
  var status: js.UndefOr[ScanStatus] = js.undefined
}
object ImageScanStatus {
  
  inline def apply(): ImageScanStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanStatus]
  }
  
  extension [Self <: ImageScanStatus](x: Self) {
    
    inline def setDescription(value: ScanStatusDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStatus(value: ScanStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
