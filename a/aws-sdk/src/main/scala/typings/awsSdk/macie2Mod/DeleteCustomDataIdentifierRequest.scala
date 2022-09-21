package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomDataIdentifierRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource that the request applies to.
    */
  var id: string
}
object DeleteCustomDataIdentifierRequest {
  
  inline def apply(id: string): DeleteCustomDataIdentifierRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomDataIdentifierRequest]
  }
  
  extension [Self <: DeleteCustomDataIdentifierRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
