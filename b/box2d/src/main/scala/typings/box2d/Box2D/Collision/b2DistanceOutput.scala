package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2DistanceOutput extends js.Object {
  
  /**
    *  Calculated distance.
    **/
  var distance: Double = js.native
  
  /**
    * Number of gjk iterations used in calculation.
    **/
  var iterations: Double = js.native
  
  /**
    * Closest point on shape A.
    **/
  var pointA: b2Vec2 = js.native
  
  /**
    * Closest point on shape B.
    **/
  var pointB: b2Vec2 = js.native
}
object b2DistanceOutput {
  
  @scala.inline
  def apply(distance: Double, iterations: Double, pointA: b2Vec2, pointB: b2Vec2): b2DistanceOutput = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], pointA = pointA.asInstanceOf[js.Any], pointB = pointB.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceOutput]
  }
  
  @scala.inline
  implicit class b2DistanceOutputOps[Self <: b2DistanceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointA(value: b2Vec2): Self = this.set("pointA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointB(value: b2Vec2): Self = this.set("pointB", value.asInstanceOf[js.Any])
  }
}
