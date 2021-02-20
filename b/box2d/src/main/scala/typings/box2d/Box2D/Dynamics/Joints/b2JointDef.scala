package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2JointDef extends StObject {
  
  /**
    * The first attached body.
    **/
  var bodyA: b2Body = js.native
  
  /**
    * The second attached body.
    **/
  var bodyB: b2Body = js.native
  
  /**
    * Set this flag to true if the attached bodies should collide.
    **/
  var collideConnected: Boolean = js.native
  
  /**
    * The joint type is set automatically for concrete joint types.
    **/
  var `type`: Double = js.native
  
  /**
    * Use this to attach application specific data to your joints.
    **/
  var userData: js.Any = js.native
}
object b2JointDef {
  
  @scala.inline
  def apply(bodyA: b2Body, bodyB: b2Body, collideConnected: Boolean, `type`: Double, userData: js.Any): b2JointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2JointDef]
  }
  
  @scala.inline
  implicit class b2JointDefMutableBuilder[Self <: b2JointDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyA(value: b2Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyB(value: b2Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
  }
}
