package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeReference extends StObject {
  
  /**
    * The name of the recipe.
    */
  var Name: RecipeName
  
  /**
    * The identifier for the version for the recipe. 
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.databrewMod.RecipeVersion] = js.undefined
}
object RecipeReference {
  
  inline def apply(Name: RecipeName): RecipeReference = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeReference]
  }
  
  extension [Self <: RecipeReference](x: Self) {
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
