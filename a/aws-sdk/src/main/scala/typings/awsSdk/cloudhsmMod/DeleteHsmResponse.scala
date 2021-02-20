package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHsmResponse extends StObject {
  
  /**
    * The status of the operation.
    */
  var Status: String = js.native
}
object DeleteHsmResponse {
  
  @scala.inline
  def apply(Status: String): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmResponse]
  }
  
  @scala.inline
  implicit class DeleteHsmResponseMutableBuilder[Self <: DeleteHsmResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
