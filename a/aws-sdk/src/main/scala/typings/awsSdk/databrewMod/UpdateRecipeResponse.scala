package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecipeResponse extends StObject {
  
  /**
    * The name of the recipe that was updated.
    */
  var Name: RecipeName = js.native
}
object UpdateRecipeResponse {
  
  @scala.inline
  def apply(Name: RecipeName): UpdateRecipeResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecipeResponse]
  }
  
  @scala.inline
  implicit class UpdateRecipeResponseMutableBuilder[Self <: UpdateRecipeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
