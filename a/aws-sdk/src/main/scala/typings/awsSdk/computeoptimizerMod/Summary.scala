package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Summary extends js.Object {
  /**
    * The finding classification of the recommendation.
    */
  var name: js.UndefOr[Finding] = js.native
  /**
    * The value of the recommendation summary.
    */
  var value: js.UndefOr[SummaryValue] = js.native
}

object Summary {
  @scala.inline
  def apply(name: Finding = null, value: Int | Double = null): Summary = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
}

