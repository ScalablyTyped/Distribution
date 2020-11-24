package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecipeRequest extends js.Object {
  
  /**
    * The name of the recipe to be described.
    */
  var Name: RecipeName = js.native
  
  /**
    * The recipe version identifier. If this parameter isn't specified, then the latest published version is returned.
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.databrewMod.RecipeVersion] = js.native
}
object DescribeRecipeRequest {
  
  @scala.inline
  def apply(Name: RecipeName): DescribeRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecipeRequest]
  }
  
  @scala.inline
  implicit class DescribeRecipeRequestOps[Self <: DescribeRecipeRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteRecipeVersion: Self = this.set("RecipeVersion", js.undefined)
  }
}
