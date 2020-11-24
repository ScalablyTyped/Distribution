package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdiagnostics extends js.Object {
  
  /** @todo TODO PROPER DOCS */
  def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit = js.native
}
object Typeofdiagnostics {
  
  @scala.inline
  def apply(sendPacket: (js.Object, js.Function0[Unit]) => Unit): Typeofdiagnostics = {
    val __obj = js.Dynamic.literal(sendPacket = js.Any.fromFunction2(sendPacket))
    __obj.asInstanceOf[Typeofdiagnostics]
  }
  
  @scala.inline
  implicit class TypeofdiagnosticsOps[Self <: Typeofdiagnostics] (val x: Self) extends AnyVal {
    
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
    def setSendPacket(value: (js.Object, js.Function0[Unit]) => Unit): Self = this.set("sendPacket", js.Any.fromFunction2(value))
  }
}
