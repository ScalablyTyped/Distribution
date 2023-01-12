package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSessionResponse extends StObject {
  
  /**
    * The session.
    */
  var session: js.UndefOr[SessionData] = js.undefined
}
object CreateSessionResponse {
  
  inline def apply(): CreateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setSession(value: SessionData): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
