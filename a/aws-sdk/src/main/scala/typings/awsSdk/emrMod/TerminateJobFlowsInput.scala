package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateJobFlowsInput extends js.Object {
  /**
    * A list of job flows to be shutdown.
    */
  var JobFlowIds: XmlStringList = js.native
}

object TerminateJobFlowsInput {
  @scala.inline
  def apply(JobFlowIds: XmlStringList): TerminateJobFlowsInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateJobFlowsInput]
  }
}

