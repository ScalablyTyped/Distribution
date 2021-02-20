package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2FixtureDef extends StObject {
  
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
  implicit class b2FixtureDefMutableBuilder[Self <: b2FixtureDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: b2FilterData): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSensor(value: Boolean): Self = StObject.set(x, "isSensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: b2Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
  }
}
