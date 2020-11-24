package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionCredentials extends js.Object {
  
  /**
    * The connection token.
    */
  var ConnectionToken: js.UndefOr[ParticipantToken] = js.native
  
  /**
    * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var Expiry: js.UndefOr[ISO8601Datetime] = js.native
}
object ConnectionCredentials {
  
  @scala.inline
  def apply(): ConnectionCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionCredentials]
  }
  
  @scala.inline
  implicit class ConnectionCredentialsOps[Self <: ConnectionCredentials] (val x: Self) extends AnyVal {
    
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
    def setConnectionToken(value: ParticipantToken): Self = this.set("ConnectionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionToken: Self = this.set("ConnectionToken", js.undefined)
    
    @scala.inline
    def setExpiry(value: ISO8601Datetime): Self = this.set("Expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiry: Self = this.set("Expiry", js.undefined)
  }
}
