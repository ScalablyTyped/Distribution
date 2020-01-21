package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderType extends js.Object {
  /**
    * A mapping of identity provider attributes to standard and custom user pool attributes.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  /**
    * The date the identity provider was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  /**
    * The date the identity provider was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The identity provider details, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.native
  /**
    * The identity provider name.
    */
  var ProviderName: js.UndefOr[ProviderNameType] = js.native
  /**
    * The identity provider type.
    */
  var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object IdentityProviderType {
  @scala.inline
  def apply(
    AttributeMapping: AttributeMappingType = null,
    CreationDate: DateType = null,
    IdpIdentifiers: IdpIdentifiersListType = null,
    LastModifiedDate: DateType = null,
    ProviderDetails: ProviderDetailsType = null,
    ProviderName: ProviderNameType = null,
    ProviderType: IdentityProviderTypeType = null,
    UserPoolId: UserPoolIdType = null
  ): IdentityProviderType = {
    val __obj = js.Dynamic.literal()
    if (AttributeMapping != null) __obj.updateDynamic("AttributeMapping")(AttributeMapping.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (IdpIdentifiers != null) __obj.updateDynamic("IdpIdentifiers")(IdpIdentifiers.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (ProviderDetails != null) __obj.updateDynamic("ProviderDetails")(ProviderDetails.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderType]
  }
}

