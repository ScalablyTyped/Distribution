package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateMemberRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string
}
object DisassociateMemberRequest {
  
  inline def apply(id: string): DisassociateMemberRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMemberRequest]
  }
  
  extension [Self <: DisassociateMemberRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
