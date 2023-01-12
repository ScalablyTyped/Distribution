package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsImpostorJoint extends StObject {
  
  /** Defines the impostor that is connected to the main impostor using this joint */
  var connectedImpostor: PhysicsImpostor
  
  /** Defines the joint itself */
  var joint: PhysicsJoint
  
  /** Defines the main impostor to which the joint is linked */
  var mainImpostor: PhysicsImpostor
}
object PhysicsImpostorJoint {
  
  inline def apply(connectedImpostor: PhysicsImpostor, joint: PhysicsJoint, mainImpostor: PhysicsImpostor): PhysicsImpostorJoint = {
    val __obj = js.Dynamic.literal(connectedImpostor = connectedImpostor.asInstanceOf[js.Any], joint = joint.asInstanceOf[js.Any], mainImpostor = mainImpostor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsImpostorJoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicsImpostorJoint] (val x: Self) extends AnyVal {
    
    inline def setConnectedImpostor(value: PhysicsImpostor): Self = StObject.set(x, "connectedImpostor", value.asInstanceOf[js.Any])
    
    inline def setJoint(value: PhysicsJoint): Self = StObject.set(x, "joint", value.asInstanceOf[js.Any])
    
    inline def setMainImpostor(value: PhysicsImpostor): Self = StObject.set(x, "mainImpostor", value.asInstanceOf[js.Any])
  }
}
