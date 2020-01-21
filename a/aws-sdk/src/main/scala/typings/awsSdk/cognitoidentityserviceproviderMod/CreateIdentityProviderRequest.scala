package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIdentityProviderRequest extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The identity provider details, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: ProviderDetailsType = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameTypeV1 = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: IdentityProviderTypeType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object CreateIdentityProviderRequest {
  @scala.inline
  def apply(
    ProviderDetails: ProviderDetailsType,
    ProviderName: ProviderNameTypeV1,
    ProviderType: IdentityProviderTypeType,
    UserPoolId: UserPoolIdType,
    AttributeMapping: AttributeMappingType = null,
    IdpIdentifiers: IdpIdentifiersListType = null
  ): CreateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderDetails = ProviderDetails.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (AttributeMapping != null) __obj.updateDynamic("AttributeMapping")(AttributeMapping.asInstanceOf[js.Any])
    if (IdpIdentifiers != null) __obj.updateDynamic("IdpIdentifiers")(IdpIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIdentityProviderRequest]
  }
}

