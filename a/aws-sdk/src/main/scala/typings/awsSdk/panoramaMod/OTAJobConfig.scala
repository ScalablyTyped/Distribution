package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OTAJobConfig extends StObject {
  
  /**
    * The target version of the device software.
    */
  var ImageVersion: typings.awsSdk.panoramaMod.ImageVersion
}
object OTAJobConfig {
  
  inline def apply(ImageVersion: ImageVersion): OTAJobConfig = {
    val __obj = js.Dynamic.literal(ImageVersion = ImageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OTAJobConfig]
  }
  
  extension [Self <: OTAJobConfig](x: Self) {
    
    inline def setImageVersion(value: ImageVersion): Self = StObject.set(x, "ImageVersion", value.asInstanceOf[js.Any])
  }
}
