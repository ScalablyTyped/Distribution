package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2FixtureDef extends js.Object {
  
  /**
    * The density, usually in kg/m^2.
    **/
  var density: Double = js.native
  
  /**
    * Contact filtering data.
    **/
  var filter: b2FilterData = js.native
  
  /**
    * The friction coefficient, usually in the range [0,1].
    **/
  var friction: Double = js.native
  
  /**
    * A sensor shape collects contact information but never generates a collision response.
    **/
  var isSensor: Boolean = js.native
  
  /**
    * The restitution (elasticity) usually in the range [0,1].
    **/
  var restitution: Double = js.native
  
  /**
    * The shape, this must be set. The shape will be cloned, so you can create the shape on the stack.
    **/
  var shape: b2Shape = js.native
  
  /**
    * Use this to store application specific fixture data.
    **/
  var userData: js.Any = js.native
}
object b2FixtureDef {
  
  @scala.inline
  def apply(
    density: Double,
    filter: b2FilterData,
    friction: Double,
    isSensor: Boolean,
    restitution: Double,
    shape: b2Shape,
    userData: js.Any
  ): b2FixtureDef = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], friction = friction.asInstanceOf[js.Any], isSensor = isSensor.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FixtureDef]
  }
  
  @scala.inline
  implicit class b2FixtureDefOps[Self <: b2FixtureDef] (val x: Self) extends AnyVal {
    
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
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: b2FilterData): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSensor(value: Boolean): Self = this.set("isSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: b2Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: js.Any): Self = this.set("userData", value.asInstanceOf[js.Any])
  }
}
