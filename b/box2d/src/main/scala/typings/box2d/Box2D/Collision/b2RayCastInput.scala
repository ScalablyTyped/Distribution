package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2RayCastInput extends js.Object {
  
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
  implicit class b2RayCastInputOps[Self <: b2RayCastInput] (val x: Self) extends AnyVal {
    
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
    def setMaxFraction(value: Double): Self = this.set("maxFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP1(value: b2Vec2): Self = this.set("p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2(value: b2Vec2): Self = this.set("p2", value.asInstanceOf[js.Any])
  }
}
