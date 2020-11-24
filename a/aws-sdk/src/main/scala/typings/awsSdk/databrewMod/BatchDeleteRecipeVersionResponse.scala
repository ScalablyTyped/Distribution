package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteRecipeVersionResponse extends js.Object {
  
  /**
    * Errors, if any, that were encountered when deleting the recipe versions.
    */
  var Errors: js.UndefOr[RecipeErrorList] = js.native
  
  /**
    * The name of the recipe that was modified.
    */
  var Name: RecipeName = js.native
}
object BatchDeleteRecipeVersionResponse {
  
  @scala.inline
  def apply(Name: RecipeName): BatchDeleteRecipeVersionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRecipeVersionResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteRecipeVersionResponseOps[Self <: BatchDeleteRecipeVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: RecipeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: RecipeVersionErrorDetail*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: RecipeErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
