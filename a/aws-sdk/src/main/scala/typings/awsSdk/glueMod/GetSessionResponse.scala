package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionResponse extends StObject {
  
  /**
    * The session object is returned in the response.
    */
  var Session: js.UndefOr[typings.awsSdk.glueMod.Session] = js.undefined
}
object GetSessionResponse {
  
  inline def apply(): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionResponse]
  }
  
  extension [Self <: GetSessionResponse](x: Self) {
    
    inline def setSession(value: Session): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
