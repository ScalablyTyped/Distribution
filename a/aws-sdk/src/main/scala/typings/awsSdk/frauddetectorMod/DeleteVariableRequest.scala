package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVariableRequest extends StObject {
  
  /**
    * The name of the variable to delete.
    */
  var name: String = js.native
}
object DeleteVariableRequest {
  
  @scala.inline
  def apply(name: String): DeleteVariableRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVariableRequest]
  }
  
  @scala.inline
  implicit class DeleteVariableRequestMutableBuilder[Self <: DeleteVariableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
