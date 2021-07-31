package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecipeRequest extends StObject {
  
  /**
    * The name of the recipe to be described.
    */
  var Name: RecipeName
  
  /**
    * The recipe version identifier. If this parameter isn't specified, then the latest published version is returned.
    */
  var RecipeVersion: js.UndefOr[typings.awsSdk.databrewMod.RecipeVersion] = js.undefined
}
object DescribeRecipeRequest {
  
  @scala.inline
  def apply(Name: RecipeName): DescribeRecipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecipeRequest]
  }
  
  @scala.inline
  implicit class DescribeRecipeRequestMutableBuilder[Self <: DescribeRecipeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
  }
}
