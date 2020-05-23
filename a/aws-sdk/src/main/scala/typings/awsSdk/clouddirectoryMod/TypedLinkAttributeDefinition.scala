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
  def apply(
    Name: AttributeName,
    RequiredBehavior: RequiredAttributeBehavior,
    Type: FacetAttributeType,
    DefaultValue: TypedAttributeValue = null,
    IsImmutable: js.UndefOr[Bool] = js.undefined,
    Rules: RuleMap = null
  ): TypedLinkAttributeDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequiredBehavior = RequiredBehavior.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(IsImmutable)) __obj.updateDynamic("IsImmutable")(IsImmutable.get.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeDefinition]
  }
}

