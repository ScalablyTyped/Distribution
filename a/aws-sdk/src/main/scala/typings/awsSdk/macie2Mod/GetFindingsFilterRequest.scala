package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsFilterRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string
}
object GetFindingsFilterRequest {
  
  @scala.inline
  def apply(id: string): GetFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsFilterRequest]
  }
  
  @scala.inline
  implicit class GetFindingsFilterRequestMutableBuilder[Self <: GetFindingsFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
