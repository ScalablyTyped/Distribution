package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2RayCastInput extends StObject {
  
  /**
    * Truncate the ray to reach up to this fraction from p1 to p2
    **/
  var maxFraction: Double
  
  /**
    * The start point of the ray.
    **/
  var p1: b2Vec2
  
  /**
    * The end point of the ray.
    **/
  var p2: b2Vec2
}
object b2RayCastInput {
  
  inline def apply(maxFraction: Double, p1: b2Vec2, p2: b2Vec2): b2RayCastInput = {
    val __obj = js.Dynamic.literal(maxFraction = maxFraction.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RayCastInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: b2RayCastInput] (val x: Self) extends AnyVal {
    
    inline def setMaxFraction(value: Double): Self = StObject.set(x, "maxFraction", value.asInstanceOf[js.Any])
    
    inline def setP1(value: b2Vec2): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    inline def setP2(value: b2Vec2): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
  }
}
