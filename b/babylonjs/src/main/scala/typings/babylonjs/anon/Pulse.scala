package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pulse extends StObject {
  
  def pulse(value: Double, duration: Double): js.Promise[Boolean] = js.native
}
object Pulse {
  
  @scala.inline
  def apply(pulse: (Double, Double) => js.Promise[Boolean]): Pulse = {
    val __obj = js.Dynamic.literal(pulse = js.Any.fromFunction2(pulse))
    __obj.asInstanceOf[Pulse]
  }
  
  @scala.inline
  implicit class PulseMutableBuilder[Self <: Pulse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPulse(value: (Double, Double) => js.Promise[Boolean]): Self = StObject.set(x, "pulse", js.Any.fromFunction2(value))
  }
}
