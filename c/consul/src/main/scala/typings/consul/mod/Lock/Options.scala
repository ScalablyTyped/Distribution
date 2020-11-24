package typings.consul.mod.Lock

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var key: String = js.native
  
  var lockretrytime: js.UndefOr[String] = js.native
  
  var lockwaittime: js.UndefOr[String] = js.native
  
  var session: js.UndefOr[js.Object | String] = js.native
  
  var value: js.UndefOr[String | Buffer] = js.native
}
object Options {
  
  @scala.inline
  def apply(key: String): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockretrytime(value: String): Self = this.set("lockretrytime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockretrytime: Self = this.set("lockretrytime", js.undefined)
    
    @scala.inline
    def setLockwaittime(value: String): Self = this.set("lockwaittime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockwaittime: Self = this.set("lockwaittime", js.undefined)
    
    @scala.inline
    def setSession(value: js.Object | String): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setValue(value: String | Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
