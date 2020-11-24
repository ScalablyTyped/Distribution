package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the best recipe.
    */
  var bestRecipeArn: js.UndefOr[Arn] = js.native
}
object AutoMLResult {
  
  @scala.inline
  def apply(): AutoMLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLResult]
  }
  
  @scala.inline
  implicit class AutoMLResultOps[Self <: AutoMLResult] (val x: Self) extends AnyVal {
    
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
    def setBestRecipeArn(value: Arn): Self = this.set("bestRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBestRecipeArn: Self = this.set("bestRecipeArn", js.undefined)
  }
}
