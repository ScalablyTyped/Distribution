package typings.consul.mod.Agent.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCheck extends js.Object {
  
  var http: js.UndefOr[String] = js.native
  
  var interval: js.UndefOr[String] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var script: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var ttl: js.UndefOr[String] = js.native
}
object RegisterCheck {
  
  @scala.inline
  def apply(): RegisterCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCheck]
  }
  
  @scala.inline
  implicit class RegisterCheckOps[Self <: RegisterCheck] (val x: Self) extends AnyVal {
    
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
    def setHttp(value: String): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
