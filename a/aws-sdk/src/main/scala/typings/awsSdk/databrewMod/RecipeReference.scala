package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeReference extends StObject {
  
  /**
    * The name of the recipe.
    */
  var Name: RecipeName = js.native
  
  /**
    * The identifier for the version for the recipe. 
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.databrewMod.RecipeVersion] = js.native
}
object RecipeReference {
  
  @scala.inline
  def apply(Name: RecipeName): RecipeReference = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeReference]
  }
  
  @scala.inline
  implicit class RecipeReferenceMutableBuilder[Self <: RecipeReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
