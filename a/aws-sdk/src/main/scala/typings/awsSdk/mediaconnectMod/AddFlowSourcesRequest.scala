package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowSourcesRequest extends js.Object {
  /**
    * The flow that you want to mutate.
    */
  var FlowArn: string = js.native
  /**
    * A list of sources that you want to add.
    */
  var Sources: listOfSetSourceRequest = js.native
}

object AddFlowSourcesRequest {
  @scala.inline
  def apply(FlowArn: string, Sources: listOfSetSourceRequest): AddFlowSourcesRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddFlowSourcesRequest]
  }
}

