package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAttributeType extends js.Object {
  /**
    * The attribute data type.
    */
  var AttributeDataType: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.AttributeDataType] = js.native
  /**
    *  We recommend that you use WriteAttributes in the user pool client to control how attributes can be mutated for new use cases instead of using DeveloperOnlyAttribute.  Specifies whether the attribute type is developer only. This attribute can only be modified by an administrator. Users will not be able to modify this attribute using their access token. For example, DeveloperOnlyAttribute can be modified using the API but cannot be updated using the API.
    */
  var DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.native
  /**
    * Specifies whether the value of the attribute can be changed. For any user pool attribute that's mapped to an identity provider attribute, you must set this parameter to true. Amazon Cognito updates mapped attributes when users sign in to your application through an identity provider. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For more information, see Specifying Identity Provider Attribute Mappings for Your User Pool.
    */
  var Mutable: js.UndefOr[BooleanType] = js.native
  /**
    * A schema attribute of the name type.
    */
  var Name: js.UndefOr[CustomAttributeNameType] = js.native
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType] = js.native
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var Required: js.UndefOr[BooleanType] = js.native
  /**
    * Specifies the constraints for an attribute of the string type.
    */
  var StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType] = js.native
}

object SchemaAttributeType {
  @scala.inline
  def apply(
    AttributeDataType: AttributeDataType = null,
    DeveloperOnlyAttribute: js.UndefOr[Boolean] = js.undefined,
    Mutable: js.UndefOr[Boolean] = js.undefined,
    Name: CustomAttributeNameType = null,
    NumberAttributeConstraints: NumberAttributeConstraintsType = null,
    Required: js.UndefOr[Boolean] = js.undefined,
    StringAttributeConstraints: StringAttributeConstraintsType = null
  ): SchemaAttributeType = {
    val __obj = js.Dynamic.literal()
    if (AttributeDataType != null) __obj.updateDynamic("AttributeDataType")(AttributeDataType.asInstanceOf[js.Any])
    if (!js.isUndefined(DeveloperOnlyAttribute)) __obj.updateDynamic("DeveloperOnlyAttribute")(DeveloperOnlyAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(Mutable)) __obj.updateDynamic("Mutable")(Mutable.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberAttributeConstraints != null) __obj.updateDynamic("NumberAttributeConstraints")(NumberAttributeConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(Required)) __obj.updateDynamic("Required")(Required.asInstanceOf[js.Any])
    if (StringAttributeConstraints != null) __obj.updateDynamic("StringAttributeConstraints")(StringAttributeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttributeType]
  }
}

