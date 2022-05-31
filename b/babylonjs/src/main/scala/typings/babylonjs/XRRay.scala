package typings.babylonjs

import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Experimental/Draft features
trait XRRay extends StObject {
  
  var direction: DOMPointReadOnly
  
  var matrix: Float32Array
  
  var origin: DOMPointReadOnly
}
object XRRay {
  
  inline def apply(direction: DOMPointReadOnly, matrix: Float32Array, origin: DOMPointReadOnly): XRRay = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRRay]
  }
  
  extension [Self <: XRRay](x: Self) {
    
    inline def setDirection(value: DOMPointReadOnly): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: Float32Array): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: DOMPointReadOnly): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
