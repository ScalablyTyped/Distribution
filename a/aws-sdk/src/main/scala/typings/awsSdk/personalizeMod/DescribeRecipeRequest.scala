package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecipeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recipe to describe.
    */
  var recipeArn: Arn
}
object DescribeRecipeRequest {
  
  @scala.inline
  def apply(recipeArn: Arn): DescribeRecipeRequest = {
    val __obj = js.Dynamic.literal(recipeArn = recipeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecipeRequest]
  }
  
  @scala.inline
  implicit class DescribeRecipeRequestMutableBuilder[Self <: DescribeRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
  }
}
