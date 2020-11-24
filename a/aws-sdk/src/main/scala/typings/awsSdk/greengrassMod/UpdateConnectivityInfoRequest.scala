package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnectivityInfoRequest extends js.Object {
  
  /**
    * A list of connectivity info.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.native
  
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}
object UpdateConnectivityInfoRequest {
  
  @scala.inline
  def apply(ThingName: string): UpdateConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectivityInfoRequest]
  }
  
  @scala.inline
  implicit class UpdateConnectivityInfoRequestOps[Self <: UpdateConnectivityInfoRequest] (val x: Self) extends AnyVal {
    
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
    def setThingName(value: string): Self = this.set("ThingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectivityInfoVarargs(value: ConnectivityInfo*): Self = this.set("ConnectivityInfo", js.Array(value :_*))
    
    @scala.inline
    def setConnectivityInfo(value: listOfConnectivityInfo): Self = this.set("ConnectivityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectivityInfo: Self = this.set("ConnectivityInfo", js.undefined)
  }
}
