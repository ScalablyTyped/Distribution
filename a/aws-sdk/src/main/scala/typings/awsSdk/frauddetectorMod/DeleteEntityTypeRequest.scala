package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEntityTypeRequest extends StObject {
  
  /**
    * The name of the entity type to delete.
    */
  var name: identifier
}
object DeleteEntityTypeRequest {
  
  @scala.inline
  def apply(name: identifier): DeleteEntityTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEntityTypeRequest]
  }
  
  @scala.inline
  implicit class DeleteEntityTypeRequestMutableBuilder[Self <: DeleteEntityTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
