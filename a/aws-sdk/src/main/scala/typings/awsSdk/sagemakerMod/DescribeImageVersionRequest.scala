package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageVersionRequest extends js.Object {
  
  /**
    * The name of the image.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName = js.native
  
  /**
    * The version of the image. If not specified, the latest version is described.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.native
}
object DescribeImageVersionRequest {
  
  @scala.inline
  def apply(ImageName: ImageName): DescribeImageVersionRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageVersionRequest]
  }
  
  @scala.inline
  implicit class DescribeImageVersionRequestOps[Self <: DescribeImageVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setImageName(value: ImageName): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ImageVersionNumber): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
