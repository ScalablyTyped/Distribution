package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRJointPose extends XRPose {
  
  var radius: js.UndefOr[Double] = js.native
}
object XRJointPose {
  
  @scala.inline
  def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRJointPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRJointPose]
  }
  
  @scala.inline
  implicit class XRJointPoseMutableBuilder[Self <: XRJointPose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
