package typings.babylonjs

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Experimental/Draft features
@js.native
trait XRRay extends StObject {
  
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
  implicit class XRRayMutableBuilder[Self <: XRRay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: DOMPointReadOnly): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrix(value: Float32Array): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: DOMPointReadOnly): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
