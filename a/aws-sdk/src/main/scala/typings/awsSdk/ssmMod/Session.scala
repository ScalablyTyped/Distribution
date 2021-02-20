package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  /**
    * Reserved for future use.
    */
  var Details: js.UndefOr[SessionDetails] = js.native
  
  /**
    * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.native
  
  /**
    * The date and time, in ISO-8601 Extended format, when the session was terminated.
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  
  /**
    * Reserved for future use.
    */
  var OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.native
  
  /**
    * The ID of the AWS user account that started the session.
    */
  var Owner: js.UndefOr[SessionOwner] = js.native
  
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typings.awsSdk.ssmMod.SessionId] = js.native
  
  /**
    * The date and time, in ISO-8601 Extended format, when the session began.
    */
  var StartDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The status of the session. For example, "Connected" or "Terminated".
    */
  var Status: js.UndefOr[SessionStatus] = js.native
  
  /**
    * The instance that the Session Manager session connected to.
    */
  var Target: js.UndefOr[SessionTarget] = js.native
}
object Session {
  
  @scala.inline
  def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: SessionDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    @scala.inline
    def setEndDate(value: DateTime): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    @scala.inline
    def setOutputUrl(value: SessionManagerOutputUrl): Self = StObject.set(x, "OutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUrlUndefined: Self = StObject.set(x, "OutputUrl", js.undefined)
    
    @scala.inline
    def setOwner(value: SessionOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    @scala.inline
    def setStartDate(value: DateTime): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    @scala.inline
    def setStatus(value: SessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
