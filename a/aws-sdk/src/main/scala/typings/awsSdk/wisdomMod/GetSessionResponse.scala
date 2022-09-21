package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionResponse extends StObject {
  
  /**
    * The session.
    */
  var session: js.UndefOr[SessionData] = js.undefined
}
object GetSessionResponse {
  
  inline def apply(): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionResponse]
  }
  
  extension [Self <: GetSessionResponse](x: Self) {
    
    inline def setSession(value: SessionData): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
