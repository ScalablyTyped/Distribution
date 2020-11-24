package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecipeRequest extends js.Object {
  
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
  implicit class UpdateRecipeRequestOps[Self <: UpdateRecipeRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: RecipeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: RecipeStep*): Self = this.set("Steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: RecipeStepList): Self = this.set("Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("Steps", js.undefined)
  }
}
