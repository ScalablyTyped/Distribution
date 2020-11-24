package typings.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IceServer extends js.Object {
  
  /**
    * A password to login to the ICE server.
    */
  var Password: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Password] = js.native
  
  /**
    * The period of time, in seconds, during which the username and password are valid.
    */
  var Ttl: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Ttl] = js.native
  
  /**
    * An array of URIs, in the form specified in the I-D.petithuguenin-behave-turn-uris spec. These URIs provide the different addresses and/or protocols that can be used to reach the TURN server.
    */
  var Uris: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Uris] = js.native
  
  /**
    * A username to login to the ICE server.
    */
  var Username: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.Username] = js.native
}
object IceServer {
  
  @scala.inline
  def apply(): IceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IceServer]
  }
  
  @scala.inline
  implicit class IceServerOps[Self <: IceServer] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: Password): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
    @scala.inline
    def setTtl(value: Ttl): Self = this.set("Ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("Ttl", js.undefined)
    
    @scala.inline
    def setUrisVarargs(value: Uri*): Self = this.set("Uris", js.Array(value :_*))
    
    @scala.inline
    def setUris(value: Uris): Self = this.set("Uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUris: Self = this.set("Uris", js.undefined)
    
    @scala.inline
    def setUsername(value: Username): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
