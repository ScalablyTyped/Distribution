package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * Represents the equal condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[typings.awsSdk.guarddutyMod.Eq] = js.native
  /**
    * Represents an equal  condition to be applied to a single field when querying for findings.
    */
  var Equals: js.UndefOr[typings.awsSdk.guarddutyMod.Equals] = js.native
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var GreaterThan: js.UndefOr[Long] = js.native
  /**
    * Represents a greater than or equal condition to be applied to a single field when querying for findings.
    */
  var GreaterThanOrEqual: js.UndefOr[Long] = js.native
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var Gt: js.UndefOr[Integer] = js.native
  /**
    * Represents a greater than or equal condition to be applied to a single field when querying for findings.
    */
  var Gte: js.UndefOr[Integer] = js.native
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var LessThan: js.UndefOr[Long] = js.native
  /**
    * Represents a less than or equal condition to be applied to a single field when querying for findings.
    */
  var LessThanOrEqual: js.UndefOr[Long] = js.native
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var Lt: js.UndefOr[Integer] = js.native
  /**
    * Represents a less than or equal condition to be applied to a single field when querying for findings.
    */
  var Lte: js.UndefOr[Integer] = js.native
  /**
    * Represents the not equal condition to be applied to a single field when querying for findings.
    */
  var Neq: js.UndefOr[typings.awsSdk.guarddutyMod.Neq] = js.native
  /**
    * Represents a not equal  condition to be applied to a single field when querying for findings.
    */
  var NotEquals: js.UndefOr[typings.awsSdk.guarddutyMod.NotEquals] = js.native
}

object Condition {
  @scala.inline
  def apply(
    Eq: Eq = null,
    Equals: Equals = null,
    GreaterThan: js.UndefOr[Long] = js.undefined,
    GreaterThanOrEqual: js.UndefOr[Long] = js.undefined,
    Gt: js.UndefOr[Integer] = js.undefined,
    Gte: js.UndefOr[Integer] = js.undefined,
    LessThan: js.UndefOr[Long] = js.undefined,
    LessThanOrEqual: js.UndefOr[Long] = js.undefined,
    Lt: js.UndefOr[Integer] = js.undefined,
    Lte: js.UndefOr[Integer] = js.undefined,
    Neq: Neq = null,
    NotEquals: NotEquals = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (Eq != null) __obj.updateDynamic("Eq")(Eq.asInstanceOf[js.Any])
    if (Equals != null) __obj.updateDynamic("Equals")(Equals.asInstanceOf[js.Any])
    if (!js.isUndefined(GreaterThan)) __obj.updateDynamic("GreaterThan")(GreaterThan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GreaterThanOrEqual)) __obj.updateDynamic("GreaterThanOrEqual")(GreaterThanOrEqual.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Gt)) __obj.updateDynamic("Gt")(Gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Gte)) __obj.updateDynamic("Gte")(Gte.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LessThan)) __obj.updateDynamic("LessThan")(LessThan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LessThanOrEqual)) __obj.updateDynamic("LessThanOrEqual")(LessThanOrEqual.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Lt)) __obj.updateDynamic("Lt")(Lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Lte)) __obj.updateDynamic("Lte")(Lte.get.asInstanceOf[js.Any])
    if (Neq != null) __obj.updateDynamic("Neq")(Neq.asInstanceOf[js.Any])
    if (NotEquals != null) __obj.updateDynamic("NotEquals")(NotEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

