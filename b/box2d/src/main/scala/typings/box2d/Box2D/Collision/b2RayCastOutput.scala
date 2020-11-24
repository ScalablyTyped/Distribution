package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2RayCastOutput extends js.Object {
  
  /**
    * The fraction between p1 and p2 that the collision occurs at.
    **/
  var fraction: Double = js.native
  
  /**
    * The normal at the point of collision.
    **/
  var normal: b2Vec2 = js.native
}
object b2RayCastOutput {
  
  @scala.inline
  def apply(fraction: Double, normal: b2Vec2): b2RayCastOutput = {
    val __obj = js.Dynamic.literal(fraction = fraction.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RayCastOutput]
  }
  
  @scala.inline
  implicit class b2RayCastOutputOps[Self <: b2RayCastOutput] (val x: Self) extends AnyVal {
    
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
    def setFraction(value: Double): Self = this.set("fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: b2Vec2): Self = this.set("normal", value.asInstanceOf[js.Any])
  }
}
