package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureConstraint extends StObject {
  
  var capture: Null = js.native
  
  var captureConstraint: Null = js.native
  
  var key: String = js.native
  
  var targets: js.Array[String] = js.native
}
object CaptureConstraint {
  
  @scala.inline
  def apply(capture: Null, captureConstraint: Null, key: String, targets: js.Array[String]): CaptureConstraint = {
    val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], captureConstraint = captureConstraint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureConstraint]
  }
  
  @scala.inline
  implicit class CaptureConstraintMutableBuilder[Self <: CaptureConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: Null): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureConstraint(value: Null): Self = StObject.set(x, "captureConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
