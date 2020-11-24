package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRecipeVersionRequest extends js.Object {
  
  /**
    * The name of the recipe to be deleted.
    */
  var Name: RecipeName = js.native
  
  /**
    * The version of the recipe to be deleted.
    */
  var RecipeVersion: typings.awsSdk.databrewMod.RecipeVersion = js.native
}
object DeleteRecipeVersionRequest {
  
  @scala.inline
  def apply(Name: RecipeName, RecipeVersion: RecipeVersion): DeleteRecipeVersionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeVersion = RecipeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecipeVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteRecipeVersionRequestOps[Self <: DeleteRecipeVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setRecipeVersion(value: RecipeVersion): Self = this.set("RecipeVersion", value.asInstanceOf[js.Any])
  }
}
