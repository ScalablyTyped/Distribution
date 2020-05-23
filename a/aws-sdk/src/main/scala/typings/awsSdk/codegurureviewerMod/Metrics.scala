package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  /**
    *  Total number of recommendations found in the code review. 
    */
  var FindingsCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.FindingsCount] = js.native
  /**
    *  Lines of code metered in the code review. 
    */
  var MeteredLinesOfCodeCount: js.UndefOr[typings.awsSdk.codegurureviewerMod.MeteredLinesOfCodeCount] = js.native
}

object Metrics {
  @scala.inline
  def apply(
    FindingsCount: js.UndefOr[FindingsCount] = js.undefined,
    MeteredLinesOfCodeCount: js.UndefOr[MeteredLinesOfCodeCount] = js.undefined
  ): Metrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FindingsCount)) __obj.updateDynamic("FindingsCount")(FindingsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MeteredLinesOfCodeCount)) __obj.updateDynamic("MeteredLinesOfCodeCount")(MeteredLinesOfCodeCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
}

