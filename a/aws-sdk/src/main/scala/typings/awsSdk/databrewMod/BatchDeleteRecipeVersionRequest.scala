package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRecipeVersionRequest extends StObject {
  
  /**
    * The name of the recipe whose versions are to be deleted.
    */
  var Name: RecipeName
  
  /**
    * An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (X.Y) or LATEST_WORKING. LATEST_PUBLISHED is not supported.
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
    
    inline def setRecipeVersionsVarargs(value: RecipeVersion*): Self = StObject.set(x, "RecipeVersions", js.Array(value*))
  }
}
