package typings.dashjs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedKeySystem extends js.Object {
  
  var cdmData: ArrayBuffer | Null = js.native
  
  var initData: ArrayBuffer = js.native
  
  var ks: KeySystem = js.native
  
  var sessionId: String | Null = js.native
}
object SupportedKeySystem {
  
  @scala.inline
  def apply(initData: ArrayBuffer, ks: KeySystem): SupportedKeySystem = {
    val __obj = js.Dynamic.literal(initData = initData.asInstanceOf[js.Any], ks = ks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedKeySystem]
  }
  
  @scala.inline
  implicit class SupportedKeySystemOps[Self <: SupportedKeySystem] (val x: Self) extends AnyVal {
    
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
    def setInitData(value: ArrayBuffer): Self = this.set("initData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKs(value: KeySystem): Self = this.set("ks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdmData(value: ArrayBuffer): Self = this.set("cdmData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdmDataNull: Self = this.set("cdmData", null)
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdNull: Self = this.set("sessionId", null)
  }
}
