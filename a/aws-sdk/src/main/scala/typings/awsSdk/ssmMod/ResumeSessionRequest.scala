package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeSessionRequest extends StObject {
  
  /**
    * The ID of the disconnected session to resume.
    */
  var SessionId: typings.awsSdk.ssmMod.SessionId
}
object ResumeSessionRequest {
  
  @scala.inline
  def apply(SessionId: SessionId): ResumeSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeSessionRequest]
  }
  
  @scala.inline
  implicit class ResumeSessionRequestMutableBuilder[Self <: ResumeSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
  }
}
