package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConsoleScreenshotResult extends js.Object {
  
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
  implicit class GetConsoleScreenshotResultOps[Self <: GetConsoleScreenshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageData(value: String): Self = this.set("ImageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageData: Self = this.set("ImageData", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
}
