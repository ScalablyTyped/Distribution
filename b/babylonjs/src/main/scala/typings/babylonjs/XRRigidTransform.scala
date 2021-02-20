package typings.babylonjs

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRRigidTransform extends StObject {
  
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
  implicit class XRRigidTransformMutableBuilder[Self <: XRRigidTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInverse(value: XRRigidTransform): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: Float32Array): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: DOMPointReadOnly): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: DOMPointReadOnly): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
