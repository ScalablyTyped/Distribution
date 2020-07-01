package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFilter extends js.Object {
  /**
    * The name of the filter. Specify ResourceType to return export jobs of a specific resource type (e.g., Ec2Instance). Specify JobStatus to return export jobs with a specific status (e.g, Complete).
    */
  var name: js.UndefOr[JobFilterName] = js.native
  /**
    * The value of the filter. If you specify the name parameter as ResourceType, the valid values are Ec2Instance or AutoScalingGroup. If you specify the name parameter as JobStatus, the valid values are Queued, InProgress, Complete, or Failed.
    */
  var values: js.UndefOr[FilterValues] = js.native
}

object JobFilter {
  @scala.inline
  def apply(name: JobFilterName = null, values: FilterValues = null): JobFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFilter]
  }
}

