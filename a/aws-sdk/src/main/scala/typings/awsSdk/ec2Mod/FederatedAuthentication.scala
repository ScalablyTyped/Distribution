package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedAuthentication extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
    */
  var SamlProviderArn: js.UndefOr[String] = js.native
}

object FederatedAuthentication {
  @scala.inline
  def apply(): FederatedAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedAuthentication]
  }
  @scala.inline
  implicit class FederatedAuthenticationOps[Self <: FederatedAuthentication] (val x: Self) extends AnyVal {
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
    def setSamlProviderArn(value: String): Self = this.set("SamlProviderArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamlProviderArn: Self = this.set("SamlProviderArn", js.undefined)
  }
  
}

