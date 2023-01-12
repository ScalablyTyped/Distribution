package typings.babylonjs

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a position and orientation in space relative to an XRSpace.
  *
  * ref: https://immersive-web.github.io/webxr/#xrpose-interface
  */
trait XRPose extends StObject {
  
  val angularVelocity: js.UndefOr[DOMPointReadOnly] = js.undefined
  
  val emulatedPosition: Boolean
  
  val linearVelocity: js.UndefOr[DOMPointReadOnly] = js.undefined
  
  val transform: XRRigidTransform
}
object XRPose {
  
  inline def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRPose] (val x: Self) extends AnyVal {
    
    inline def setAngularVelocity(value: DOMPointReadOnly): Self = StObject.set(x, "angularVelocity", value.asInstanceOf[js.Any])
    
    inline def setAngularVelocityUndefined: Self = StObject.set(x, "angularVelocity", js.undefined)
    
    inline def setEmulatedPosition(value: Boolean): Self = StObject.set(x, "emulatedPosition", value.asInstanceOf[js.Any])
    
    inline def setLinearVelocity(value: DOMPointReadOnly): Self = StObject.set(x, "linearVelocity", value.asInstanceOf[js.Any])
    
    inline def setLinearVelocityUndefined: Self = StObject.set(x, "linearVelocity", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
