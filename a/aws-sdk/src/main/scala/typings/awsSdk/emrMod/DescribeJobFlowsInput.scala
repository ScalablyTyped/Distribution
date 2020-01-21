package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobFlowsInput extends js.Object {
  /**
    * Return only job flows created after this date and time.
    */
  var CreatedAfter: js.UndefOr[Date] = js.native
  /**
    * Return only job flows created before this date and time.
    */
  var CreatedBefore: js.UndefOr[Date] = js.native
  /**
    * Return only job flows whose job flow ID is contained in this list.
    */
  var JobFlowIds: js.UndefOr[XmlStringList] = js.native
  /**
    * Return only job flows whose state is contained in this list.
    */
  var JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.native
}

object DescribeJobFlowsInput {
  @scala.inline
  def apply(
    CreatedAfter: Date = null,
    CreatedBefore: Date = null,
    JobFlowIds: XmlStringList = null,
    JobFlowStates: JobFlowExecutionStateList = null
  ): DescribeJobFlowsInput = {
    val __obj = js.Dynamic.literal()
    if (CreatedAfter != null) __obj.updateDynamic("CreatedAfter")(CreatedAfter.asInstanceOf[js.Any])
    if (CreatedBefore != null) __obj.updateDynamic("CreatedBefore")(CreatedBefore.asInstanceOf[js.Any])
    if (JobFlowIds != null) __obj.updateDynamic("JobFlowIds")(JobFlowIds.asInstanceOf[js.Any])
    if (JobFlowStates != null) __obj.updateDynamic("JobFlowStates")(JobFlowStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobFlowsInput]
  }
}

