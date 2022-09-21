package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileResponse extends StObject {
  
  /**
    * A message that indicates the delete request is done.
    */
  var Message: js.UndefOr[message] = js.undefined
}
object DeleteProfileResponse {
  
  inline def apply(): DeleteProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProfileResponse]
  }
  
  extension [Self <: DeleteProfileResponse](x: Self) {
    
    inline def setMessage(value: message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
