package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageVersionResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the image version.
    */
  var ImageVersionArn: js.UndefOr[typings.awsSdk.sagemakerMod.ImageVersionArn] = js.native
}
object CreateImageVersionResponse {
  
  @scala.inline
  def apply(): CreateImageVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageVersionResponse]
  }
  
  @scala.inline
  implicit class CreateImageVersionResponseOps[Self <: CreateImageVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setImageVersionArn(value: ImageVersionArn): Self = this.set("ImageVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageVersionArn: Self = this.set("ImageVersionArn", js.undefined)
  }
}
