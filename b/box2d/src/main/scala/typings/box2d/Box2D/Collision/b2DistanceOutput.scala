package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DistanceOutput extends StObject {
  
  /**
    *  Calculated distance.
    **/
  var distance: Double
  
  /**
    * Number of gjk iterations used in calculation.
    **/
  var iterations: Double
  
  /**
    * Closest point on shape A.
    **/
  var pointA: b2Vec2
  
  /**
    * Closest point on shape B.
    **/
  var pointB: b2Vec2
}
object b2DistanceOutput {
  
  @scala.inline
  def apply(distance: Double, iterations: Double, pointA: b2Vec2, pointB: b2Vec2): b2DistanceOutput = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], pointA = pointA.asInstanceOf[js.Any], pointB = pointB.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceOutput]
  }
  
  @scala.inline
  implicit class b2DistanceOutputMutableBuilder[Self <: b2DistanceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointA(value: b2Vec2): Self = StObject.set(x, "pointA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointB(value: b2Vec2): Self = StObject.set(x, "pointB", value.asInstanceOf[js.Any])
  }
}
