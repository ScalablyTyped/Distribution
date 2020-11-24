package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutImageRecipePolicyResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that this policy was applied to. 
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object PutImageRecipePolicyResponse {
  
  @scala.inline
  def apply(): PutImageRecipePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutImageRecipePolicyResponse]
  }
  
  @scala.inline
  implicit class PutImageRecipePolicyResponseOps[Self <: PutImageRecipePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = this.set("imageRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageRecipeArn: Self = this.set("imageRecipeArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
