package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Websocket extends js.Object {
  
  /**
    * The URL expiration timestamp in ISO date format. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var ConnectionExpiry: js.UndefOr[ISO8601Datetime] = js.native
  
  /**
    * The URL of the websocket.
    */
  var Url: js.UndefOr[PreSignedConnectionUrl] = js.native
}
object Websocket {
  
  @scala.inline
  def apply(): Websocket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Websocket]
  }
  
  @scala.inline
  implicit class WebsocketOps[Self <: Websocket] (val x: Self) extends AnyVal {
    
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
    def setConnectionExpiry(value: ISO8601Datetime): Self = this.set("ConnectionExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionExpiry: Self = this.set("ConnectionExpiry", js.undefined)
    
    @scala.inline
    def setUrl(value: PreSignedConnectionUrl): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
