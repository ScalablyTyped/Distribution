package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicKeyRequest extends js.Object {
  /**
    * The request to add a public key to CloudFront.
    */
  var PublicKeyConfig: typings.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}

object CreatePublicKeyRequest {
  @scala.inline
  def apply(PublicKeyConfig: PublicKeyConfig): CreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicKeyRequest]
  }
  @scala.inline
  implicit class CreatePublicKeyRequestOps[Self <: CreatePublicKeyRequest] (val x: Self) extends AnyVal {
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
    def setPublicKeyConfig(value: PublicKeyConfig): Self = this.set("PublicKeyConfig", value.asInstanceOf[js.Any])
  }
  
}

