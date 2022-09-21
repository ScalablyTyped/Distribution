package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSessionResponse extends StObject {
  
  /**
    * Returns the ID of the deleted session.
    */
  var Id: js.UndefOr[NameString] = js.undefined
}
object DeleteSessionResponse {
  
  inline def apply(): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSessionResponse]
  }
  
  extension [Self <: DeleteSessionResponse](x: Self) {
    
    inline def setId(value: NameString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
