package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2JointDef extends StObject {
  
  /**
    * The first attached body.
    **/
  var bodyA: b2Body
  
  /**
    * The second attached body.
    **/
  var bodyB: b2Body
  
  /**
    * Set this flag to true if the attached bodies should collide.
    **/
  var collideConnected: Boolean
  
  /**
    * The joint type is set automatically for concrete joint types.
    **/
  var `type`: Double
  
  /**
    * Use this to attach application specific data to your joints.
    **/
  var userData: Any
}
object b2JointDef {
  
  inline def apply(bodyA: b2Body, bodyB: b2Body, collideConnected: Boolean, `type`: Double, userData: Any): b2JointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2JointDef]
  }
  
  extension [Self <: b2JointDef](x: Self) {
    
    inline def setBodyA(value: b2Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    inline def setBodyB(value: b2Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    inline def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
  }
}
