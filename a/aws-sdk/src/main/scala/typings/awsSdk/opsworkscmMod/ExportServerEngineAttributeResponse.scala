package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportServerEngineAttributeResponse extends js.Object {
  
  /**
    * The requested engine attribute pair with attribute name and value.
    */
  var EngineAttribute: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttribute] = js.native
  
  /**
    * The server name used in the request.
    */
  var ServerName: js.UndefOr[typings.awsSdk.opsworkscmMod.ServerName] = js.native
}
object ExportServerEngineAttributeResponse {
  
  @scala.inline
  def apply(): ExportServerEngineAttributeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportServerEngineAttributeResponse]
  }
  
  @scala.inline
  implicit class ExportServerEngineAttributeResponseOps[Self <: ExportServerEngineAttributeResponse] (val x: Self) extends AnyVal {
    
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
    def setEngineAttribute(value: EngineAttribute): Self = this.set("EngineAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineAttribute: Self = this.set("EngineAttribute", js.undefined)
    
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
  }
}
