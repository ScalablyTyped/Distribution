package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CriterionAdditionalProperties extends js.Object {
  /**
    * An equal to condition to apply to a specified property value for findings.
    */
  @JSName("eq")
  var eq_FCriterionAdditionalProperties: js.UndefOr[listOfString] = js.native
  /**
    * A greater than condition to apply to a specified property value for findings.
    */
  var gt: js.UndefOr[long] = js.native
  /**
    * A greater than or equal to condition to apply to a specified property value for findings.
    */
  var gte: js.UndefOr[long] = js.native
  /**
    * A less than condition to apply to a specified property value for findings.
    */
  var lt: js.UndefOr[long] = js.native
  /**
    * A less than or equal to condition to apply to a specified property value for findings.
    */
  var lte: js.UndefOr[long] = js.native
  /**
    * A not equal to condition to apply to a specified property value for findings.
    */
  var neq: js.UndefOr[listOfString] = js.native
}

object CriterionAdditionalProperties {
  @scala.inline
  def apply(
    eq: listOfString = null,
    gt: js.UndefOr[long] = js.undefined,
    gte: js.UndefOr[long] = js.undefined,
    lt: js.UndefOr[long] = js.undefined,
    lte: js.UndefOr[long] = js.undefined,
    neq: listOfString = null
  ): CriterionAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq.asInstanceOf[js.Any])
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gte)) __obj.updateDynamic("gte")(gte.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lte)) __obj.updateDynamic("lte")(lte.get.asInstanceOf[js.Any])
    if (neq != null) __obj.updateDynamic("neq")(neq.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriterionAdditionalProperties]
  }
}

