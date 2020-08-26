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
  def apply(): SchemaAttributeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeType]
  }
  @scala.inline
  implicit class SchemaAttributeTypeOps[Self <: SchemaAttributeType] (val x: Self) extends AnyVal {
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
    def setAttributeDataType(value: AttributeDataType): Self = this.set("AttributeDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeDataType: Self = this.set("AttributeDataType", js.undefined)
    @scala.inline
    def setDeveloperOnlyAttribute(value: BooleanType): Self = this.set("DeveloperOnlyAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperOnlyAttribute: Self = this.set("DeveloperOnlyAttribute", js.undefined)
    @scala.inline
    def setMutable(value: BooleanType): Self = this.set("Mutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutable: Self = this.set("Mutable", js.undefined)
    @scala.inline
    def setName(value: CustomAttributeNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNumberAttributeConstraints(value: NumberAttributeConstraintsType): Self = this.set("NumberAttributeConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberAttributeConstraints: Self = this.set("NumberAttributeConstraints", js.undefined)
    @scala.inline
    def setRequired(value: BooleanType): Self = this.set("Required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("Required", js.undefined)
    @scala.inline
    def setStringAttributeConstraints(value: StringAttributeConstraintsType): Self = this.set("StringAttributeConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringAttributeConstraints: Self = this.set("StringAttributeConstraints", js.undefined)
  }
  
}

