package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecipeVersionResponse extends StObject {
  
  /**
    * The name of the recipe that was deleted.
    */
  var Name: RecipeName
  
  /**
    * The version of the recipe that was deleted.
    */
  var RecipeVersion: typings.awsSdk.databrewMod.RecipeVersion
}
object DeleteRecipeVersionResponse {
  
  inline def apply(Name: RecipeName, RecipeVersion: RecipeVersion): DeleteRecipeVersionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeVersion = RecipeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecipeVersionResponse]
  }
  
  extension [Self <: DeleteRecipeVersionResponse](x: Self) {
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
  }
}
