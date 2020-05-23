package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketCriteriaAdditionalProperties extends js.Object {
  /**
    * An equal to condition to apply to a specified attribute value for buckets.
    */
  @JSName("eq")
  var eq_FBucketCriteriaAdditionalProperties: js.UndefOr[listOfString] = js.native
  /**
    * A greater than condition to apply to a specified attribute value for buckets.
    */
  var gt: js.UndefOr[long] = js.native
  /**
    * A greater than or equal to condition to apply to a specified attribute value for buckets.
    */
  var gte: js.UndefOr[long] = js.native
  /**
    * A less than condition to apply to a specified attribute value for buckets.
    */
  var lt: js.UndefOr[long] = js.native
  /**
    * A less than or equal to condition to apply to a specified attribute value for buckets.
    */
  var lte: js.UndefOr[long] = js.native
  /**
    * A not equal to condition to apply to a specified attribute value for buckets.
    */
  var neq: js.UndefOr[listOfString] = js.native
  /**
    * The prefix of the buckets to include in the results.
    */
  var prefix: js.UndefOr[string] = js.native
}

object BucketCriteriaAdditionalProperties {
  @scala.inline
  def apply(
    eq: listOfString = null,
    gt: js.UndefOr[long] = js.undefined,
    gte: js.UndefOr[long] = js.undefined,
    lt: js.UndefOr[long] = js.undefined,
    lte: js.UndefOr[long] = js.undefined,
    neq: listOfString = null,
    prefix: string = null
  ): BucketCriteriaAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    if (eq != null) __obj.updateDynamic("eq")(eq.asInstanceOf[js.Any])
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gte)) __obj.updateDynamic("gte")(gte.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lte)) __obj.updateDynamic("lte")(lte.get.asInstanceOf[js.Any])
    if (neq != null) __obj.updateDynamic("neq")(neq.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCriteriaAdditionalProperties]
  }
}

