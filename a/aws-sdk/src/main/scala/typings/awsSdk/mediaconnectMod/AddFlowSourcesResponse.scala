package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowSourcesResponse extends js.Object {
  /**
    * The ARN of the flow that these sources were added to.
    */
  var FlowArn: js.UndefOr[string] = js.native
  /**
    * The details of the newly added sources.
    */
  var Sources: js.UndefOr[listOfSource] = js.native
}

object AddFlowSourcesResponse {
  @scala.inline
  def apply(FlowArn: string = null, Sources: listOfSource = null): AddFlowSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowSourcesResponse]
  }
}

