package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRecipeRequest extends StObject {
  
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
  implicit class CreateRecipeRequestMutableBuilder[Self <: CreateRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: RecipeStepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: RecipeStep*): Self = StObject.set(x, "Steps", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
