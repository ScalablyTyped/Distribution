package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecipeRequest extends StObject {
  
  /**
    * A description for the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.undefined
  
  /**
    * A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and space.
    */
  var Name: RecipeName
  
  /**
    * An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe action and (optionally) an array of condition expressions.
    */
  var Steps: RecipeStepList
  
  /**
    * Metadata tags to apply to this recipe.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRecipeRequest {
  
  inline def apply(Name: RecipeName, Steps: RecipeStepList): CreateRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Steps = Steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipeRequest]
  }
  
  extension [Self <: CreateRecipeRequest](x: Self) {
    
    inline def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: RecipeStepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: RecipeStep*): Self = StObject.set(x, "Steps", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
