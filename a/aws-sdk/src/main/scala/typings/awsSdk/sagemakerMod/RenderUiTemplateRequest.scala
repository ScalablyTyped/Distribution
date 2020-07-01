package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderUiTemplateRequest extends js.Object {
  /**
    * The HumanTaskUiArn of the worker UI that you want to render. Do not provide a HumanTaskUiArn if you use the UiTemplate parameter.
    */
  var HumanTaskUiArn: js.UndefOr[typings.awsSdk.sagemakerMod.HumanTaskUiArn] = js.native
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
  var UiTemplate: js.UndefOr[typings.awsSdk.sagemakerMod.UiTemplate] = js.native
}

object RenderUiTemplateRequest {
  @scala.inline
  def apply(
    RoleArn: RoleArn,
    Task: RenderableTask,
    HumanTaskUiArn: HumanTaskUiArn = null,
    UiTemplate: UiTemplate = null
  ): RenderUiTemplateRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any])
    if (HumanTaskUiArn != null) __obj.updateDynamic("HumanTaskUiArn")(HumanTaskUiArn.asInstanceOf[js.Any])
    if (UiTemplate != null) __obj.updateDynamic("UiTemplate")(UiTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUiTemplateRequest]
  }
}

