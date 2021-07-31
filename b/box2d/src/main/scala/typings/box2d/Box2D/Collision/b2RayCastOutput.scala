package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2RayCastOutput extends StObject {
  
  /**
    * The fraction between p1 and p2 that the collision occurs at.
    **/
  var fraction: Double
  
  /**
    * The normal at the point of collision.
    **/
  var normal: b2Vec2
}
object b2RayCastOutput {
  
  @scala.inline
  def apply(fraction: Double, normal: b2Vec2): b2RayCastOutput = {
    val __obj = js.Dynamic.literal(fraction = fraction.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RayCastOutput]
  }
  
  @scala.inline
  implicit class b2RayCastOutputMutableBuilder[Self <: b2RayCastOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: b2Vec2): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
  }
}
