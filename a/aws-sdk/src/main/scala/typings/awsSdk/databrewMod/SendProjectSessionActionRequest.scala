package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendProjectSessionActionRequest extends StObject {
  
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
  implicit class SendProjectSessionActionRequestMutableBuilder[Self <: SendProjectSessionActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientSessionId(value: ClientSessionId): Self = StObject.set(x, "ClientSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSessionIdUndefined: Self = StObject.set(x, "ClientSessionId", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: Preview): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "Preview", js.undefined)
    
    @scala.inline
    def setRecipeStep(value: RecipeStep): Self = StObject.set(x, "RecipeStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeStepUndefined: Self = StObject.set(x, "RecipeStep", js.undefined)
    
    @scala.inline
    def setStepIndex(value: StepIndex): Self = StObject.set(x, "StepIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIndexUndefined: Self = StObject.set(x, "StepIndex", js.undefined)
    
    @scala.inline
    def setViewFrame(value: ViewFrame): Self = StObject.set(x, "ViewFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFrameUndefined: Self = StObject.set(x, "ViewFrame", js.undefined)
  }
}
