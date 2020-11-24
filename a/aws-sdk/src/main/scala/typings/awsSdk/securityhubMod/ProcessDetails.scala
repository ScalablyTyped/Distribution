package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessDetails extends js.Object {
  
  /**
    * Indicates when the process was launched. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the process.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The parent process ID.
    */
  var ParentPid: js.UndefOr[Integer] = js.native
  
  /**
    * The path to the process executable.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The process ID.
    */
  var Pid: js.UndefOr[Integer] = js.native
  
  /**
    * Indicates when the process was terminated. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var TerminatedAt: js.UndefOr[NonEmptyString] = js.native
}
object ProcessDetails {
  
  @scala.inline
  def apply(): ProcessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessDetails]
  }
  
  @scala.inline
  implicit class ProcessDetailsOps[Self <: ProcessDetails] (val x: Self) extends AnyVal {
    
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
    def setLaunchedAt(value: NonEmptyString): Self = this.set("LaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchedAt: Self = this.set("LaunchedAt", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setParentPid(value: Integer): Self = this.set("ParentPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentPid: Self = this.set("ParentPid", js.undefined)
    
    @scala.inline
    def setPath(value: NonEmptyString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setPid(value: Integer): Self = this.set("Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePid: Self = this.set("Pid", js.undefined)
    
    @scala.inline
    def setTerminatedAt(value: NonEmptyString): Self = this.set("TerminatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminatedAt: Self = this.set("TerminatedAt", js.undefined)
  }
}
