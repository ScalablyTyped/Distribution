package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statistics extends js.Object {
  /**
    * The approximate number of objects that the job has yet to process during its current run.
    */
  var approximateNumberOfObjectsToProcess: js.UndefOr[double] = js.native
  /**
    * The number of times that the job has run.
    */
  var numberOfRuns: js.UndefOr[double] = js.native
}

object Statistics {
  @scala.inline
  def apply(
    approximateNumberOfObjectsToProcess: js.UndefOr[double] = js.undefined,
    numberOfRuns: js.UndefOr[double] = js.undefined
  ): Statistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(approximateNumberOfObjectsToProcess)) __obj.updateDynamic("approximateNumberOfObjectsToProcess")(approximateNumberOfObjectsToProcess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRuns)) __obj.updateDynamic("numberOfRuns")(numberOfRuns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

