package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecipeVersionRequest extends StObject {
  
  /**
    * The name of the recipe to be deleted.
    */
  var Name: RecipeName
  
  /**
    * The version of the recipe to be deleted.
    */
  var RecipeVersion: typings.awsSdk.databrewMod.RecipeVersion
}
object DeleteRecipeVersionRequest {
  
  @scala.inline
  def apply(Name: RecipeName, RecipeVersion: RecipeVersion): DeleteRecipeVersionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeVersion = RecipeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecipeVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteRecipeVersionRequestMutableBuilder[Self <: DeleteRecipeVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
  }
}
