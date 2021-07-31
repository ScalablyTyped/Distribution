package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRecipeVersionResponse extends StObject {
  
  /**
    * Errors, if any, that were encountered when deleting the recipe versions.
    */
  var Errors: js.UndefOr[RecipeErrorList] = js.undefined
  
  /**
    * The name of the recipe that was modified.
    */
  var Name: RecipeName
}
object BatchDeleteRecipeVersionResponse {
  
  @scala.inline
  def apply(Name: RecipeName): BatchDeleteRecipeVersionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRecipeVersionResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteRecipeVersionResponseMutableBuilder[Self <: BatchDeleteRecipeVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: RecipeErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: RecipeVersionErrorDetail*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
