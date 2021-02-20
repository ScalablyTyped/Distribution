package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2RayCastInput extends StObject {
  
  /**
    * Truncate the ray to reach up to this fraction from p1 to p2
    **/
  var maxFraction: Double = js.native
  
  /**
    * The start point of the ray.
    **/
  var p1: b2Vec2 = js.native
  
  /**
    * The end point of the ray.
    **/
  var p2: b2Vec2 = js.native
}
object b2RayCastInput {
  
  @scala.inline
  def apply(maxFraction: Double, p1: b2Vec2, p2: b2Vec2): b2RayCastInput = {
    val __obj = js.Dynamic.literal(maxFraction = maxFraction.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RayCastInput]
  }
  
  @scala.inline
  implicit class b2RayCastInputMutableBuilder[Self <: b2RayCastInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxFraction(value: Double): Self = StObject.set(x, "maxFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP1(value: b2Vec2): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2(value: b2Vec2): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
  }
}
