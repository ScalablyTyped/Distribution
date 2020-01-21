package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttributeDefinition extends js.Object {
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.native
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.native
  /**
    * Validation rules attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.native
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType = js.native
}

object FacetAttributeDefinition {
  @scala.inline
  def apply(
    Type: FacetAttributeType,
    DefaultValue: TypedAttributeValue = null,
    IsImmutable: js.UndefOr[Boolean] = js.undefined,
    Rules: RuleMap = null
  ): FacetAttributeDefinition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(IsImmutable)) __obj.updateDynamic("IsImmutable")(IsImmutable.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttributeDefinition]
  }
}

