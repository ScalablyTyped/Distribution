package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityProviderConfigurationResponse extends js.Object {
  /**
    * The SAML metadata document provided by the user’s identity provider.
    */
  var IdentityProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
  /**
    * The type of identity provider.
    */
  var IdentityProviderType: js.UndefOr[typings.awsSdk.worklinkMod.IdentityProviderType] = js.native
  /**
    * The SAML metadata document uploaded to the user’s identity provider.
    */
  var ServiceProviderSamlMetadata: js.UndefOr[SamlMetadata] = js.native
}

object DescribeIdentityProviderConfigurationResponse {
  @scala.inline
  def apply(): DescribeIdentityProviderConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityProviderConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeIdentityProviderConfigurationResponseOps[Self <: DescribeIdentityProviderConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setIdentityProviderSamlMetadata(value: SamlMetadata): Self = this.set("IdentityProviderSamlMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProviderSamlMetadata: Self = this.set("IdentityProviderSamlMetadata", js.undefined)
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = this.set("IdentityProviderType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityProviderType: Self = this.set("IdentityProviderType", js.undefined)
    @scala.inline
    def setServiceProviderSamlMetadata(value: SamlMetadata): Self = this.set("ServiceProviderSamlMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceProviderSamlMetadata: Self = this.set("ServiceProviderSamlMetadata", js.undefined)
  }
  
}

