package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRecipeVersionRequest extends StObject {
  
  /**
    * The name of the recipe to be modified.
    */
  var Name: RecipeName
  
  /**
    * An array of version identifiers to be deleted.
    */
  var RecipeVersions: RecipeVersionList
}
object BatchDeleteRecipeVersionRequest {
  
  inline def apply(Name: RecipeName, RecipeVersions: RecipeVersionList): BatchDeleteRecipeVersionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeVersions = RecipeVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRecipeVersionRequest]
  }
  
  extension [Self <: BatchDeleteRecipeVersionRequest](x: Self) {
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersions(value: RecipeVersionList): Self = StObject.set(x, "RecipeVersions", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersionsVarargs(value: RecipeVersion*): Self = StObject.set(x, "RecipeVersions", js.Array(value :_*))
  }
}
