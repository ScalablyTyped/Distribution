package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2ContactImpulse extends StObject {
  
  /**
    * Normal impulses.
    **/
  var normalImpulses: b2Vec2
  
  /**
    * Tangent impulses.
    **/
  var tangentImpulses: b2Vec2
}
object b2ContactImpulse {
  
  inline def apply(normalImpulses: b2Vec2, tangentImpulses: b2Vec2): b2ContactImpulse = {
    val __obj = js.Dynamic.literal(normalImpulses = normalImpulses.asInstanceOf[js.Any], tangentImpulses = tangentImpulses.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactImpulse]
  }
  
  extension [Self <: b2ContactImpulse](x: Self) {
    
    inline def setNormalImpulses(value: b2Vec2): Self = StObject.set(x, "normalImpulses", value.asInstanceOf[js.Any])
    
    inline def setTangentImpulses(value: b2Vec2): Self = StObject.set(x, "tangentImpulses", value.asInstanceOf[js.Any])
  }
}
