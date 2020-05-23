package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionProperty extends js.Object {
  /**
    * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this threshold is reached. The maximum value you can specify is controlled by a service limit.
    */
  var MaxConcurrentRuns: js.UndefOr[typings.awsSdk.glueMod.MaxConcurrentRuns] = js.native
}

object ExecutionProperty {
  @scala.inline
  def apply(MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns] = js.undefined): ExecutionProperty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxConcurrentRuns)) __obj.updateDynamic("MaxConcurrentRuns")(MaxConcurrentRuns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionProperty]
  }
}

