package typings.bounceJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerailizedComponent[T] extends js.Object {
  
  var bounces: Double = js.native
  
  var delay: Double = js.native
  
  var duration: Double = js.native
  
  var easing: String = js.native
  
  var from: T = js.native
  
  var stiffness: Double = js.native
  
  var to: T = js.native
  
  var `type`: String = js.native
}
object SerailizedComponent {
  
  @scala.inline
  def apply[T](
    bounces: Double,
    delay: Double,
    duration: Double,
    easing: String,
    from: T,
    stiffness: Double,
    to: T,
    `type`: String
  ): SerailizedComponent[T] = {
    val __obj = js.Dynamic.literal(bounces = bounces.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerailizedComponent[T]]
  }
  
  @scala.inline
  implicit class SerailizedComponentOps[Self <: SerailizedComponent[_], T] (val x: Self with SerailizedComponent[T]) extends AnyVal {
    
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
    def setBounces(value: Double): Self = this.set("bounces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: T): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: T): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
