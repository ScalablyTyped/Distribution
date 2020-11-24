package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendProjectSessionActionRequest extends js.Object {
  
  /**
    * A unique identifier for an interactive session that's currently open and ready for work. The action will be performed on this session.
    */
  var ClientSessionId: js.UndefOr[typings.awsSdk.databrewMod.ClientSessionId] = js.native
  
  /**
    * The name of the project to apply the action to.
    */
  var Name: ProjectName = js.native
  
  /**
    * Returns the result of the recipe step, without applying it. The result isn't added to the view frame stack.
    */
  var Preview: js.UndefOr[typings.awsSdk.databrewMod.Preview] = js.native
  
  var RecipeStep: js.UndefOr[typings.awsSdk.databrewMod.RecipeStep] = js.native
  
  /**
    * The index from which to preview a step. This index is used to preview the result of steps that have already been applied, so that the resulting view frame is from earlier in the view frame stack.
    */
  var StepIndex: js.UndefOr[typings.awsSdk.databrewMod.StepIndex] = js.native
  
  var ViewFrame: js.UndefOr[typings.awsSdk.databrewMod.ViewFrame] = js.native
}
object SendProjectSessionActionRequest {
  
  @scala.inline
  def apply(Name: ProjectName): SendProjectSessionActionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendProjectSessionActionRequest]
  }
  
  @scala.inline
  implicit class SendProjectSessionActionRequestOps[Self <: SendProjectSessionActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: ProjectName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSessionId(value: ClientSessionId): Self = this.set("ClientSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSessionId: Self = this.set("ClientSessionId", js.undefined)
    
    @scala.inline
    def setPreview(value: Preview): Self = this.set("Preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("Preview", js.undefined)
    
    @scala.inline
    def setRecipeStep(value: RecipeStep): Self = this.set("RecipeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeStep: Self = this.set("RecipeStep", js.undefined)
    
    @scala.inline
    def setStepIndex(value: StepIndex): Self = this.set("StepIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepIndex: Self = this.set("StepIndex", js.undefined)
    
    @scala.inline
    def setViewFrame(value: ViewFrame): Self = this.set("ViewFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewFrame: Self = this.set("ViewFrame", js.undefined)
  }
}
