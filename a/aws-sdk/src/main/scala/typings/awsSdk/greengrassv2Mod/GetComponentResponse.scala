package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentResponse extends StObject {
  
  /**
    * The recipe of the component version.
    */
  var recipe: RecipeBlob
  
  /**
    * The format of the recipe.
    */
  var recipeOutputFormat: RecipeOutputFormat
  
  /**
    * A list of key-value pairs that contain metadata for the resource. For more information, see Tag your resources in the IoT Greengrass V2 Developer Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetComponentResponse {
  
  inline def apply(recipe: RecipeBlob, recipeOutputFormat: RecipeOutputFormat): GetComponentResponse = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any], recipeOutputFormat = recipeOutputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentResponse]
  }
  
  extension [Self <: GetComponentResponse](x: Self) {
    
    inline def setRecipe(value: RecipeBlob): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setRecipeOutputFormat(value: RecipeOutputFormat): Self = StObject.set(x, "recipeOutputFormat", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
