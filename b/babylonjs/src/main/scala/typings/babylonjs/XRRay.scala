package typings.babylonjs

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Experimental/Draft features
@js.native
trait XRRay extends js.Object {
  
  var direction: DOMPointReadOnly = js.native
  
  var matrix: Float32Array = js.native
  
  var origin: DOMPointReadOnly = js.native
}
object XRRay {
  
  @scala.inline
  def apply(direction: DOMPointReadOnly, matrix: Float32Array, origin: DOMPointReadOnly): XRRay = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRay]
  }
  
  @scala.inline
  implicit class XRRayOps[Self <: XRRay] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: DOMPointReadOnly): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: Float32Array): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: DOMPointReadOnly): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
}
