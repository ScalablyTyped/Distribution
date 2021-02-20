package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRecipeVersionResponse extends StObject {
  
  /**
    * The name of the recipe that was deleted.
    */
  var Name: RecipeName = js.native
  
  /**
    * The version of the recipe that was deleted.
    */
  var RecipeVersion: typings.awsSdk.databrewMod.RecipeVersion = js.native
}
object DeleteRecipeVersionResponse {
  
  @scala.inline
  def apply(Name: RecipeName, RecipeVersion: RecipeVersion): DeleteRecipeVersionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeVersion = RecipeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecipeVersionResponse]
  }
  
  @scala.inline
  implicit class DeleteRecipeVersionResponseMutableBuilder[Self <: DeleteRecipeVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
  }
}
