package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOpenIDConnectProviderResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new IAM OpenID Connect provider that is created. For more information, see OpenIDConnectProviderListEntry. 
    */
  var OpenIDConnectProviderArn: js.UndefOr[arnType] = js.native
}

object CreateOpenIDConnectProviderResponse {
  @scala.inline
  def apply(): CreateOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpenIDConnectProviderResponse]
  }
  @scala.inline
  implicit class CreateOpenIDConnectProviderResponseOps[Self <: CreateOpenIDConnectProviderResponse] (val x: Self) extends AnyVal {
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
    def setOpenIDConnectProviderArn(value: arnType): Self = this.set("OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIDConnectProviderArn: Self = this.set("OpenIDConnectProviderArn", js.undefined)
  }
  
}

