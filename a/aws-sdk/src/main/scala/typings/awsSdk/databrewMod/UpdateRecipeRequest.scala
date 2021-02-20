package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecipeRequest extends StObject {
  
  /**
    * A description of the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.native
  
  /**
    * The name of the recipe to be updated.
    */
  var Name: RecipeName = js.native
  
  /**
    * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which the action should succeed.
    */
  var Steps: js.UndefOr[RecipeStepList] = js.native
}
object UpdateRecipeRequest {
  
  @scala.inline
  def apply(Name: RecipeName): UpdateRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecipeRequest]
  }
  
  @scala.inline
  implicit class UpdateRecipeRequestMutableBuilder[Self <: UpdateRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: RecipeStepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: RecipeStep*): Self = StObject.set(x, "Steps", js.Array(value :_*))
  }
}
