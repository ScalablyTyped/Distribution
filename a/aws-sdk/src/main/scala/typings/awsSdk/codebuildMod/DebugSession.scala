package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugSession extends js.Object {
  
  /**
    * Specifies if session debugging is enabled for this build.
    */
  var sessionEnabled: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * Contains the identifier of the Session Manager session used for the build. To work with the paused build, you open this session to examine, control, and resume the build.
    */
  var sessionTarget: js.UndefOr[NonEmptyString] = js.native
}
object DebugSession {
  
  @scala.inline
  def apply(): DebugSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSession]
  }
  
  @scala.inline
  implicit class DebugSessionOps[Self <: DebugSession] (val x: Self) extends AnyVal {
    
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
    def setSessionEnabled(value: WrapperBoolean): Self = this.set("sessionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionEnabled: Self = this.set("sessionEnabled", js.undefined)
    
    @scala.inline
    def setSessionTarget(value: NonEmptyString): Self = this.set("sessionTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTarget: Self = this.set("sessionTarget", js.undefined)
  }
}
