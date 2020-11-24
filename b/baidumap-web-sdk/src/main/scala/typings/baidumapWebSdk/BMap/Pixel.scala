package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pixel extends js.Object {
  
  def equals(other: Pixel): Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Pixel {
  
  @scala.inline
  def apply(equals: Pixel => Boolean, x: Double, y: Double): Pixel = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pixel]
  }
  
  @scala.inline
  implicit class PixelOps[Self <: Pixel] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: Pixel => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
