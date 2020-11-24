package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteRecipeVersionRequest extends js.Object {
  
  /**
    * The name of the recipe to be modified.
    */
  var Name: RecipeName = js.native
  
  /**
    * An array of version identifiers to be deleted.
    */
  var RecipeVersions: RecipeVersionList = js.native
}
object BatchDeleteRecipeVersionRequest {
  
  @scala.inline
  def apply(Name: RecipeName, RecipeVersions: RecipeVersionList): BatchDeleteRecipeVersionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeVersions = RecipeVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteRecipeVersionRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteRecipeVersionRequestOps[Self <: BatchDeleteRecipeVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setRecipeVersionsVarargs(value: RecipeVersion*): Self = this.set("RecipeVersions", js.Array(value :_*))
    
    @scala.inline
    def setRecipeVersions(value: RecipeVersionList): Self = this.set("RecipeVersions", value.asInstanceOf[js.Any])
  }
}
