package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFilter extends js.Object {
  /**
    * The equal-to condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Double] = js.native
  /**
    * The greater-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Gte: js.UndefOr[Double] = js.native
  /**
    * The less-than-equal condition to be applied to a single field when querying for findings. 
    */
  var Lte: js.UndefOr[Double] = js.native
}

object NumberFilter {
  @scala.inline
  def apply(
    Eq: js.UndefOr[Double] = js.undefined,
    Gte: js.UndefOr[Double] = js.undefined,
    Lte: js.UndefOr[Double] = js.undefined
  ): NumberFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Eq)) __obj.updateDynamic("Eq")(Eq.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Gte)) __obj.updateDynamic("Gte")(Gte.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Lte)) __obj.updateDynamic("Lte")(Lte.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilter]
  }
}

