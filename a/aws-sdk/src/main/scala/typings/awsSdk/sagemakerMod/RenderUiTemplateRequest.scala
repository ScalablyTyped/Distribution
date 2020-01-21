package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderUiTemplateRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * A RenderableTask object containing a representative task to render.
    */
  var Task: RenderableTask = js.native
  /**
    * A Template object containing the worker UI template to render.
    */
  var UiTemplate: typings.awsSdk.sagemakerMod.UiTemplate = js.native
}

object RenderUiTemplateRequest {
  @scala.inline
  def apply(RoleArn: RoleArn, Task: RenderableTask, UiTemplate: UiTemplate): RenderUiTemplateRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any], UiTemplate = UiTemplate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderUiTemplateRequest]
  }
}

