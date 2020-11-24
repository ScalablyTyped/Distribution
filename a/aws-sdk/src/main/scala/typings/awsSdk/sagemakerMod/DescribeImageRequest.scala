package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageRequest extends js.Object {
  
  /**
    * The name of the image to describe.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName = js.native
}
object DescribeImageRequest {
  
  @scala.inline
  def apply(ImageName: ImageName): DescribeImageRequest = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageRequest]
  }
  
  @scala.inline
  implicit class DescribeImageRequestOps[Self <: DescribeImageRequest] (val x: Self) extends AnyVal {
    
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
  }
}
