package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRJointPose
  extends StObject
     with XRPose {
  
  val radius: js.UndefOr[Double] = js.undefined
}
object XRJointPose {
  
  inline def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRJointPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRJointPose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRJointPose] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
