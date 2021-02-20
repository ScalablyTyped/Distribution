package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecipeJobResponse extends StObject {
  
  /**
    * The name of the job that you updated.
    */
  var Name: JobName = js.native
}
object UpdateRecipeJobResponse {
  
  @scala.inline
  def apply(Name: JobName): UpdateRecipeJobResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecipeJobResponse]
  }
  
  @scala.inline
  implicit class UpdateRecipeJobResponseMutableBuilder[Self <: UpdateRecipeJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
