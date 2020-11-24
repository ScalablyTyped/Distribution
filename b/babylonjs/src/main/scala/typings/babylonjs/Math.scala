package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Math extends js.Object {
  
  def fround(x: Double): Double = js.native
  
  def imul(a: Double, b: Double): Double = js.native
}
object Math {
  
  @scala.inline
  def apply(fround: Double => Double, imul: (Double, Double) => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround), imul = js.Any.fromFunction2(imul))
    __obj.asInstanceOf[Math]
  }
  
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
    
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
    def setFround(value: Double => Double): Self = this.set("fround", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImul(value: (Double, Double) => Double): Self = this.set("imul", js.Any.fromFunction2(value))
  }
}
