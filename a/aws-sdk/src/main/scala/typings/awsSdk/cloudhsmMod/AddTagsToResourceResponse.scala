package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceResponse extends StObject {
  
  /**
    * The status of the operation.
    */
  var Status: String
}
object AddTagsToResourceResponse {
  
  @scala.inline
  def apply(Status: String): AddTagsToResourceResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceResponse]
  }
  
  @scala.inline
  implicit class AddTagsToResourceResponseMutableBuilder[Self <: AddTagsToResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
