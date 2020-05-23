package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Severity extends js.Object {
  /**
    * The textual representation of the severity value, such as Low or High.
    */
  var description: js.UndefOr[SeverityDescription] = js.native
  /**
    * The numeric score for the severity value, ranging from 0 (least severe) to 4 (most severe).
    */
  var score: js.UndefOr[long] = js.native
}

object Severity {
  @scala.inline
  def apply(description: SeverityDescription = null, score: js.UndefOr[long] = js.undefined): Severity = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Severity]
  }
}

