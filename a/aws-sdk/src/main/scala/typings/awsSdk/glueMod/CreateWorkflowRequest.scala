package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkflowRequest extends js.Object {
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  /**
    * The name to be assigned to the workflow. It should be unique within your account.
    */
  var Name: NameString = js.native
  /**
    * The tags to be used with this workflow.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}

object CreateWorkflowRequest {
  @scala.inline
  def apply(
    Name: NameString,
    DefaultRunProperties: WorkflowRunProperties = null,
    Description: GenericString = null,
    Tags: TagsMap = null
  ): CreateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (DefaultRunProperties != null) __obj.updateDynamic("DefaultRunProperties")(DefaultRunProperties.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowRequest]
  }
}

