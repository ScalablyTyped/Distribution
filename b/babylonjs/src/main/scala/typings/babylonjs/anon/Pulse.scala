package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pulse extends js.Object {
  
  def pulse(value: Double, duration: Double): js.Promise[Boolean] = js.native
}
object Pulse {
  
  @scala.inline
  def apply(pulse: (Double, Double) => js.Promise[Boolean]): Pulse = {
    val __obj = js.Dynamic.literal(pulse = js.Any.fromFunction2(pulse))
    __obj.asInstanceOf[Pulse]
  }
  
  @scala.inline
  implicit class PulseOps[Self <: Pulse] (val x: Self) extends AnyVal {
    
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
    def setPulse(value: (Double, Double) => js.Promise[Boolean]): Self = this.set("pulse", js.Any.fromFunction2(value))
  }
}
