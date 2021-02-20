package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConsoleScreenshotResult extends StObject {
  
  /**
    * The data that comprises the image.
    */
  var ImageData: js.UndefOr[String] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}
object GetConsoleScreenshotResult {
  
  @scala.inline
  def apply(): GetConsoleScreenshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConsoleScreenshotResult]
  }
  
  @scala.inline
  implicit class GetConsoleScreenshotResultMutableBuilder[Self <: GetConsoleScreenshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageData(value: String): Self = StObject.set(x, "ImageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDataUndefined: Self = StObject.set(x, "ImageData", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
