package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConsoleScreenshotResult extends StObject {
  
  /**
    * The data that comprises the image.
    */
  var ImageData: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object GetConsoleScreenshotResult {
  
  inline def apply(): GetConsoleScreenshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConsoleScreenshotResult]
  }
  
  extension [Self <: GetConsoleScreenshotResult](x: Self) {
    
    inline def setImageData(value: String): Self = StObject.set(x, "ImageData", value.asInstanceOf[js.Any])
    
    inline def setImageDataUndefined: Self = StObject.set(x, "ImageData", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
