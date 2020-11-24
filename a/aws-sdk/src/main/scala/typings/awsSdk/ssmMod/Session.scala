package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
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
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetails(value: SessionDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentName): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentName: Self = this.set("DocumentName", js.undefined)
    
    @scala.inline
    def setEndDate(value: DateTime): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    
    @scala.inline
    def setOutputUrl(value: SessionManagerOutputUrl): Self = this.set("OutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUrl: Self = this.set("OutputUrl", js.undefined)
    
    @scala.inline
    def setOwner(value: SessionOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setSessionId(value: SessionId): Self = this.set("SessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionId: Self = this.set("SessionId", js.undefined)
    
    @scala.inline
    def setStartDate(value: DateTime): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
    
    @scala.inline
    def setStatus(value: SessionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTarget(value: SessionTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
  }
}
