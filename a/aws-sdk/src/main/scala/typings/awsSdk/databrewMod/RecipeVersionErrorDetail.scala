package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipeVersionErrorDetail extends js.Object {
  
  /**
    * The HTTP status code for the error.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.databrewMod.ErrorCode] = js.native
  
  /**
    * The text of the error message.
    */
  var ErrorMessage: js.UndefOr[RecipeErrorMessage] = js.native
  
  /**
    * The identifier for the recipe version associated with this error.
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.databrewMod.RecipeVersion] = js.native
}
object RecipeVersionErrorDetail {
  
  @scala.inline
  def apply(): RecipeVersionErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipeVersionErrorDetail]
  }
  
  @scala.inline
  implicit class RecipeVersionErrorDetailOps[Self <: RecipeVersionErrorDetail] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: RecipeErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = this.set("RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeVersion: Self = this.set("RecipeVersion", js.undefined)
  }
}
