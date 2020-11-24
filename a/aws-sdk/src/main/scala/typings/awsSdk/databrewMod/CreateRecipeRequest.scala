package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRecipeRequest extends js.Object {
  
  /**
    * A description for the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.native
  
  /**
    * A unique name for the recipe.
    */
  var Name: RecipeName = js.native
  
  /**
    * An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe action and (optionally) an array of condition expressions.
    */
  var Steps: RecipeStepList = js.native
  
  /**
    * Metadata tags to apply to this recipe.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateRecipeRequest {
  
  @scala.inline
  def apply(Name: RecipeName, Steps: RecipeStepList): CreateRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Steps = Steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipeRequest]
  }
  
  @scala.inline
  implicit class CreateRecipeRequestOps[Self <: CreateRecipeRequest] (val x: Self) extends AnyVal {
    
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
    def setStepsVarargs(value: RecipeStep*): Self = this.set("Steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: RecipeStepList): Self = this.set("Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
