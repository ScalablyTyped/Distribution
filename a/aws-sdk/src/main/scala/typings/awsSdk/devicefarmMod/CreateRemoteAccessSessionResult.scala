package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRemoteAccessSessionResult extends js.Object {
  
  /**
    * A container that describes the remote access session when the request to create a remote access session is sent.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.native
}
object CreateRemoteAccessSessionResult {
  
  @scala.inline
  def apply(): CreateRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRemoteAccessSessionResult]
  }
  
  @scala.inline
  implicit class CreateRemoteAccessSessionResultOps[Self <: CreateRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    
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
    def setRemoteAccessSession(value: RemoteAccessSession): Self = this.set("remoteAccessSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAccessSession: Self = this.set("remoteAccessSession", js.undefined)
  }
}
