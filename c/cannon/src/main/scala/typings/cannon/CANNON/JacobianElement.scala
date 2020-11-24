package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JacobianElement extends js.Object {
  
  def multiplyElement(element: JacobianElement): Double = js.native
  
  def multiplyVectors(spacial: Vec3, rotational: Vec3): Double = js.native
  
  var rotational: Vec3 = js.native
  
  var spatial: Vec3 = js.native
}
object JacobianElement {
  
  @scala.inline
  def apply(
    multiplyElement: JacobianElement => Double,
    multiplyVectors: (Vec3, Vec3) => Double,
    rotational: Vec3,
    spatial: Vec3
  ): JacobianElement = {
    val __obj = js.Dynamic.literal(multiplyElement = js.Any.fromFunction1(multiplyElement), multiplyVectors = js.Any.fromFunction2(multiplyVectors), rotational = rotational.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any])
    __obj.asInstanceOf[JacobianElement]
  }
  
  @scala.inline
  implicit class JacobianElementOps[Self <: JacobianElement] (val x: Self) extends AnyVal {
    
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
    def setMultiplyElement(value: JacobianElement => Double): Self = this.set("multiplyElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiplyVectors(value: (Vec3, Vec3) => Double): Self = this.set("multiplyVectors", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRotational(value: Vec3): Self = this.set("rotational", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatial(value: Vec3): Self = this.set("spatial", value.asInstanceOf[js.Any])
  }
}
