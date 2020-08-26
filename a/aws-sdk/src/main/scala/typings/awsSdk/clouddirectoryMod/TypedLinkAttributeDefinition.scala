package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkAttributeDefinition extends js.Object {
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.native
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.native
  /**
    * The unique name of the typed link attribute.
    */
  var Name: AttributeName = js.native
  /**
    * The required behavior of the TypedLinkAttributeDefinition.
    */
  var RequiredBehavior: RequiredAttributeBehavior = js.native
  /**
    * Validation rules that are attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.native
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType = js.native
}

object TypedLinkAttributeDefinition {
  @scala.inline
  def apply(Name: AttributeName, RequiredBehavior: RequiredAttributeBehavior, Type: FacetAttributeType): TypedLinkAttributeDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequiredBehavior = RequiredBehavior.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeDefinition]
  }
  @scala.inline
  implicit class TypedLinkAttributeDefinitionOps[Self <: TypedLinkAttributeDefinition] (val x: Self) extends AnyVal {
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
    def setName(value: AttributeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredBehavior(value: RequiredAttributeBehavior): Self = this.set("RequiredBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FacetAttributeType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: TypedAttributeValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    @scala.inline
    def setIsImmutable(value: Bool): Self = this.set("IsImmutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsImmutable: Self = this.set("IsImmutable", js.undefined)
    @scala.inline
    def setRules(value: RuleMap): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
  
}

