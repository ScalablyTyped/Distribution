package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiDestinationRequest extends StObject {
  
  /**
    * The name of the destination to delete.
    */
  var Name: ApiDestinationName
}
object DeleteApiDestinationRequest {
  
  inline def apply(Name: ApiDestinationName): DeleteApiDestinationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiDestinationRequest]
  }
  
  extension [Self <: DeleteApiDestinationRequest](x: Self) {
    
    inline def setName(value: ApiDestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
