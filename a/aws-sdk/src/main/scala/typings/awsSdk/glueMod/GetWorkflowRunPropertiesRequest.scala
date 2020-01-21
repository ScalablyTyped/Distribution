package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkflowRunPropertiesRequest extends js.Object {
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString = js.native
  /**
    * The ID of the workflow run whose run properties should be returned.
    */
  var RunId: IdString = js.native
}

object GetWorkflowRunPropertiesRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString): GetWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetWorkflowRunPropertiesRequest]
  }
}

