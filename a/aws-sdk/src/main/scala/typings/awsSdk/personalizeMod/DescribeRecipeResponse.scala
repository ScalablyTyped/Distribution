package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecipeResponse extends StObject {
  
  /**
    * An object that describes the recipe.
    */
  var recipe: js.UndefOr[Recipe] = js.undefined
}
object DescribeRecipeResponse {
  
  @scala.inline
  def apply(): DescribeRecipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecipeResponse]
  }
  
  @scala.inline
  implicit class DescribeRecipeResponseMutableBuilder[Self <: DescribeRecipeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipe(value: Recipe): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
  }
}
