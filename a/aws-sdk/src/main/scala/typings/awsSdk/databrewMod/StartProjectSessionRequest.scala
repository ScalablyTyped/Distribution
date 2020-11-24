package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartProjectSessionRequest extends js.Object {
  
  /**
    * A value that, if true, enables you to take control of a session, even if a different client is currently accessing the project.
    */
  var AssumeControl: js.UndefOr[typings.awsSdk.databrewMod.AssumeControl] = js.native
  
  /**
    * The name of the project to act upon.
    */
  var Name: ProjectName = js.native
}
object StartProjectSessionRequest {
  
  @scala.inline
  def apply(Name: ProjectName): StartProjectSessionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectSessionRequest]
  }
  
  @scala.inline
  implicit class StartProjectSessionRequestOps[Self <: StartProjectSessionRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: ProjectName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeControl(value: AssumeControl): Self = this.set("AssumeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumeControl: Self = this.set("AssumeControl", js.undefined)
  }
}
