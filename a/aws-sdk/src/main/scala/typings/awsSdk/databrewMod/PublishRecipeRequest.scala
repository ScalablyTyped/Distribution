package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishRecipeRequest extends StObject {
  
  /**
    * A description of the recipe to be published, for this version of the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.native
  
  /**
    * The name of the recipe to be published.
    */
  var Name: RecipeName = js.native
}
object PublishRecipeRequest {
  
  @scala.inline
  def apply(Name: RecipeName): PublishRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRecipeRequest]
  }
  
  @scala.inline
  implicit class PublishRecipeRequestMutableBuilder[Self <: PublishRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
