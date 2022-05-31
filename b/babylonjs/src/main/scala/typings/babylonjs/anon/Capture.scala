package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capture extends StObject {
  
  var capture: String
  
  var captureConstraint: Double
  
  var key: String
  
  var targets: js.Array[String]
}
object Capture {
  
  inline def apply(capture: String, captureConstraint: Double, key: String, targets: js.Array[String]): Capture = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], captureConstraint = captureConstraint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capture]
  }
  
  extension [Self <: Capture](x: Self) {
    
    inline def setCapture(value: String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureConstraint(value: Double): Self = StObject.set(x, "captureConstraint", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
