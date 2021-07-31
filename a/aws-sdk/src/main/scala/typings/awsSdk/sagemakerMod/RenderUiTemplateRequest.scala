package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderUiTemplateRequest extends StObject {
  
  /**
    * The HumanTaskUiArn of the worker UI that you want to render. Do not provide a HumanTaskUiArn if you use the UiTemplate parameter. See a list of available Human Ui Amazon Resource Names (ARNs) in UiConfig.
    */
  var HumanTaskUiArn: js.UndefOr[typings.awsSdk.sagemakerMod.HumanTaskUiArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn
  
  /**
    * A RenderableTask object containing a representative task to render.
    */
  var Task: RenderableTask
  
  /**
    * A Template object containing the worker UI template to render.
    */
  var UiTemplate: js.UndefOr[typings.awsSdk.sagemakerMod.UiTemplate] = js.undefined
}
object RenderUiTemplateRequest {
  
  @scala.inline
  def apply(RoleArn: RoleArn, Task: RenderableTask): RenderUiTemplateRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUiTemplateRequest]
  }
  
  @scala.inline
  implicit class RenderUiTemplateRequestMutableBuilder[Self <: RenderUiTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanTaskUiArnUndefined: Self = StObject.set(x, "HumanTaskUiArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: RenderableTask): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiTemplate(value: UiTemplate): Self = StObject.set(x, "UiTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiTemplateUndefined: Self = StObject.set(x, "UiTemplate", js.undefined)
  }
}
