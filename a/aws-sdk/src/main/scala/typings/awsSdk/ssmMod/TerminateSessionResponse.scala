package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateSessionResponse extends StObject {
  
  /**
    * The ID of the session that has been terminated.
    */
  var SessionId: js.UndefOr[typings.awsSdk.ssmMod.SessionId] = js.native
}
object TerminateSessionResponse {
  
  @scala.inline
  def apply(): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateSessionResponse]
  }
  
  @scala.inline
  implicit class TerminateSessionResponseMutableBuilder[Self <: TerminateSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
  }
}
