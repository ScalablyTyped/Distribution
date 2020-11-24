package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagnostics extends js.Object {
  
  /**
    * The associated error code:   Success: The specified script ran.   ScriptMissing: The specified script was not found in the specified location.   ScriptNotExecutable: The specified script is not a recognized executable file type.   ScriptTimedOut: The specified script did not finish running in the specified time period.   ScriptFailed: The specified script failed to run as expected.   UnknownError: The specified script did not run for an unknown reason.  
    */
  var errorCode: js.UndefOr[LifecycleErrorCode] = js.native
  
  /**
    * The last portion of the diagnostic log. If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
    */
  var logTail: js.UndefOr[LogTail] = js.native
  
  /**
    * The message associated with the error.
    */
  var message: js.UndefOr[LifecycleMessage] = js.native
  
  /**
    * The name of the script.
    */
  var scriptName: js.UndefOr[ScriptName] = js.native
}
object Diagnostics {
  
  @scala.inline
  def apply(): Diagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diagnostics]
  }
  
  @scala.inline
  implicit class DiagnosticsOps[Self <: Diagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorCode(value: LifecycleErrorCode): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setLogTail(value: LogTail): Self = this.set("logTail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogTail: Self = this.set("logTail", js.undefined)
    
    @scala.inline
    def setMessage(value: LifecycleMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setScriptName(value: ScriptName): Self = this.set("scriptName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptName: Self = this.set("scriptName", js.undefined)
  }
}
