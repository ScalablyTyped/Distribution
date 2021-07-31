package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMemberRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string
}
object DeleteMemberRequest {
  
  @scala.inline
  def apply(id: string): DeleteMemberRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMemberRequest]
  }
  
  @scala.inline
  implicit class DeleteMemberRequestMutableBuilder[Self <: DeleteMemberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
