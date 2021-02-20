package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRecipeResponse extends StObject {
  
  /**
    * The name of the recipe that you created.
    */
  var Name: RecipeName = js.native
}
object CreateRecipeResponse {
  
  @scala.inline
  def apply(Name: RecipeName): CreateRecipeResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipeResponse]
  }
  
  @scala.inline
  implicit class CreateRecipeResponseMutableBuilder[Self <: CreateRecipeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
