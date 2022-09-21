package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureConstraint extends StObject {
  
  var capture: Null
  
  var captureConstraint: Null
  
  var key: String
  
  var targets: js.Array[String]
}
object CaptureConstraint {
  
  inline def apply(capture: Null, captureConstraint: Null, key: String, targets: js.Array[String]): CaptureConstraint = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], captureConstraint = captureConstraint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureConstraint]
  }
  
  extension [Self <: CaptureConstraint](x: Self) {
    
    inline def setCapture(value: Null): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureConstraint(value: Null): Self = StObject.set(x, "captureConstraint", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
