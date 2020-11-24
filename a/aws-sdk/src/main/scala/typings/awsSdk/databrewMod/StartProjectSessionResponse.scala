package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartProjectSessionResponse extends js.Object {
  
  /**
    * A system-generated identifier for the session.
    */
  var ClientSessionId: js.UndefOr[typings.awsSdk.databrewMod.ClientSessionId] = js.native
  
  /**
    * The name of the project to be acted upon.
    */
  var Name: ProjectName = js.native
}
object StartProjectSessionResponse {
  
  @scala.inline
  def apply(Name: ProjectName): StartProjectSessionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectSessionResponse]
  }
  
  @scala.inline
  implicit class StartProjectSessionResponseOps[Self <: StartProjectSessionResponse] (val x: Self) extends AnyVal {
    
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
    def setClientSessionId(value: ClientSessionId): Self = this.set("ClientSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientSessionId: Self = this.set("ClientSessionId", js.undefined)
  }
}
