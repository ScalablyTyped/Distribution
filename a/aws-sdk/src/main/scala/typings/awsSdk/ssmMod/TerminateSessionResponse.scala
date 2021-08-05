package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateSessionResponse extends StObject {
  
  /**
    * The ID of the session that has been terminated.
    */
  var SessionId: js.UndefOr[typings.awsSdk.ssmMod.SessionId] = js.undefined
}
object TerminateSessionResponse {
  
  inline def apply(): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateSessionResponse]
  }
  
  extension [Self <: TerminateSessionResponse](x: Self) {
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
  }
}
