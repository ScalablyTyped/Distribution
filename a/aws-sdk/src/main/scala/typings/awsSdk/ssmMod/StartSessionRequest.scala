package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSessionRequest extends js.Object {
  
  /**
    * The name of the SSM document to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell. You can call the GetDocument API to verify the document exists before attempting to start a session. If no document name is provided, a shell to the instance is launched by default.
    */
  var DocumentName: js.UndefOr[DocumentARN] = js.native
  
  /**
    * Reserved for future use.
    */
  var Parameters: js.UndefOr[SessionManagerParameters] = js.native
  
  /**
    * The instance to connect to for the session.
    */
  var Target: SessionTarget = js.native
}
object StartSessionRequest {
  
  @scala.inline
  def apply(Target: SessionTarget): StartSessionRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionRequest]
  }
  
  @scala.inline
  implicit class StartSessionRequestOps[Self <: StartSessionRequest] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: SessionTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentName(value: DocumentARN): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentName: Self = this.set("DocumentName", js.undefined)
    
    @scala.inline
    def setParameters(value: SessionManagerParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
