package typings.box2d.Box2D.Dynamics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2ContactFilter extends StObject {
  
  /**
    * Return true if the given fixture should be considered for ray intersection. By default, userData is cast as a b2Fixture and collision is resolved according to ShouldCollide.
    * @note This function is not in the box2dweb.as code -- might not work.
    * @see b2World.Raycast()
    * @see b2ContactFilter.ShouldCollide()
    * @param userData User provided data.  Comments indicate that this might be a b2Fixture.
    * @return True if the fixture should be considered for ray intersection, otherwise false.
    **/
  def RayCollide(userData: Any): Boolean
  
  /**
    * Return true if contact calculations should be performed between these two fixtures.
    * @warning For performance reasons this is only called when the AABBs begin to overlap.
    * @param fixtureA b2Fixture potentially colliding with fixtureB.
    * @param fixtureB b2Fixture potentially colliding with fixtureA.
    * @return True if fixtureA and fixtureB probably collide requiring more calculations, otherwise false.
    **/
  def ShouldCollide(fixtureA: b2Fixture, fixtureB: b2Fixture): Boolean
}
object b2ContactFilter {
  
  inline def apply(RayCollide: Any => Boolean, ShouldCollide: (b2Fixture, b2Fixture) => Boolean): b2ContactFilter = {
    val __obj = js.Dynamic.literal(RayCollide = js.Any.fromFunction1(RayCollide), ShouldCollide = js.Any.fromFunction2(ShouldCollide))
    __obj.asInstanceOf[b2ContactFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: b2ContactFilter] (val x: Self) extends AnyVal {
    
    inline def setRayCollide(value: Any => Boolean): Self = StObject.set(x, "RayCollide", js.Any.fromFunction1(value))
    
    inline def setShouldCollide(value: (b2Fixture, b2Fixture) => Boolean): Self = StObject.set(x, "ShouldCollide", js.Any.fromFunction2(value))
  }
}
