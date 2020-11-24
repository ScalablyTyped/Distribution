package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRecipeRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the recipe to describe.
    */
  var recipeArn: Arn = js.native
}
object DescribeRecipeRequest {
  
  @scala.inline
  def apply(recipeArn: Arn): DescribeRecipeRequest = {
    val __obj = js.Dynamic.literal(recipeArn = recipeArn.asInstanceOf[js.Any])
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
    def setRecipeArn(value: Arn): Self = this.set("recipeArn", value.asInstanceOf[js.Any])
  }
}
