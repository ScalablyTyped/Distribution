package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIdentityProviderRequest extends js.Object {
  /**
    * The identity provider attribute mapping to be changed.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The identity provider details to be updated, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object UpdateIdentityProviderRequest {
  @scala.inline
  def apply(
    ProviderName: ProviderNameType,
    UserPoolId: UserPoolIdType,
    AttributeMapping: AttributeMappingType = null,
    IdpIdentifiers: IdpIdentifiersListType = null,
    ProviderDetails: ProviderDetailsType = null
  ): UpdateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (AttributeMapping != null) __obj.updateDynamic("AttributeMapping")(AttributeMapping.asInstanceOf[js.Any])
    if (IdpIdentifiers != null) __obj.updateDynamic("IdpIdentifiers")(IdpIdentifiers.asInstanceOf[js.Any])
    if (ProviderDetails != null) __obj.updateDynamic("ProviderDetails")(ProviderDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderRequest]
  }
}

