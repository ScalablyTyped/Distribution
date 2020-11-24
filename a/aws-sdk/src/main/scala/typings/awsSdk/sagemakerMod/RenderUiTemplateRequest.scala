package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderUiTemplateRequest extends js.Object {
  
  /**
    * The HumanTaskUiArn of the worker UI that you want to render. Do not provide a HumanTaskUiArn if you use the UiTemplate parameter. See a list of available Human Ui Amazon Resource Names (ARNs) in UiConfig.
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
  def apply(RoleArn: RoleArn, Task: RenderableTask): RenderUiTemplateRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUiTemplateRequest]
  }
  
  @scala.inline
  implicit class RenderUiTemplateRequestOps[Self <: RenderUiTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: RenderableTask): Self = this.set("Task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = this.set("HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanTaskUiArn: Self = this.set("HumanTaskUiArn", js.undefined)
    
    @scala.inline
    def setUiTemplate(value: UiTemplate): Self = this.set("UiTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiTemplate: Self = this.set("UiTemplate", js.undefined)
  }
}
