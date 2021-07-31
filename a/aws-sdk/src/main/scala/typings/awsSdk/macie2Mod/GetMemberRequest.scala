package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string
}
object GetMemberRequest {
  
  @scala.inline
  def apply(id: string): GetMemberRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberRequest]
  }
  
  @scala.inline
  implicit class GetMemberRequestMutableBuilder[Self <: GetMemberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
