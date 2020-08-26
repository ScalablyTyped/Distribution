package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRecipeResponse extends js.Object {
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image recipe that was created by this request. 
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object CreateImageRecipeResponse {
  @scala.inline
  def apply(): CreateImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImageRecipeResponse]
  }
  @scala.inline
  implicit class CreateImageRecipeResponseOps[Self <: CreateImageRecipeResponse] (val x: Self) extends AnyVal {
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
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

