package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecipeResponse extends js.Object {
  
  /**
    * An object that describes the recipe.
    */
  var recipe: js.UndefOr[Recipe] = js.native
}
object DescribeRecipeResponse {
  
  @scala.inline
  def apply(): DescribeRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecipeResponse]
  }
  
  @scala.inline
  implicit class DescribeRecipeResponseOps[Self <: DescribeRecipeResponse] (val x: Self) extends AnyVal {
    
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
    def setRecipe(value: Recipe): Self = this.set("recipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipe: Self = this.set("recipe", js.undefined)
  }
}
