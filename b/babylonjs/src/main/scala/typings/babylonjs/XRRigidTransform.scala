package typings.babylonjs

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRRigidTransform extends js.Object {
  
  var inverse: XRRigidTransform = js.native
  
  var matrix: Float32Array = js.native
  
  var orientation: DOMPointReadOnly = js.native
  
  var position: DOMPointReadOnly = js.native
}
object XRRigidTransform {
  
  @scala.inline
  def apply(
    inverse: XRRigidTransform,
    matrix: Float32Array,
    orientation: DOMPointReadOnly,
    position: DOMPointReadOnly
  ): XRRigidTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRigidTransform]
  }
  
  @scala.inline
  implicit class XRRigidTransformOps[Self <: XRRigidTransform] (val x: Self) extends AnyVal {
    
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
    def setInverse(value: XRRigidTransform): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: Float32Array): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: DOMPointReadOnly): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: DOMPointReadOnly): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
