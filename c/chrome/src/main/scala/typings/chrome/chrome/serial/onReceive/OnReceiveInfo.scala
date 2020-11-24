package typings.chrome.chrome.serial.onReceive

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnReceiveInfo extends js.Object {
  
  /** The connection identifier. */
  var connectionId: Double = js.native
  
  /** The data received. */
  var data: ArrayBuffer = js.native
}
object OnReceiveInfo {
  
  @scala.inline
  def apply(connectionId: Double, data: ArrayBuffer): OnReceiveInfo = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnReceiveInfo]
  }
  
  @scala.inline
  implicit class OnReceiveInfoOps[Self <: OnReceiveInfo] (val x: Self) extends AnyVal {
    
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
    def setConnectionId(value: Double): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
