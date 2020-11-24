package typings.awsSdk.kinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIceServerConfigResponse extends js.Object {
  
  /**
    * The list of ICE server information objects.
    */
  var IceServerList: js.UndefOr[typings.awsSdk.kinesisvideosignalingchannelsMod.IceServerList] = js.native
}
object GetIceServerConfigResponse {
  
  @scala.inline
  def apply(): GetIceServerConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIceServerConfigResponse]
  }
  
  @scala.inline
  implicit class GetIceServerConfigResponseOps[Self <: GetIceServerConfigResponse] (val x: Self) extends AnyVal {
    
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
    def setIceServerListVarargs(value: IceServer*): Self = this.set("IceServerList", js.Array(value :_*))
    
    @scala.inline
    def setIceServerList(value: IceServerList): Self = this.set("IceServerList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceServerList: Self = this.set("IceServerList", js.undefined)
  }
}
