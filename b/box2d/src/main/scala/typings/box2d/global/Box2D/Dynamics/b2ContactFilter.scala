package typings.box2d.global.Box2D.Dynamics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2ContactFilter")
@js.native
class b2ContactFilter ()
  extends StObject
     with typings.box2d.Box2D.Dynamics.b2ContactFilter {
  
  /**
    * Return true if the given fixture should be considered for ray intersection. By default, userData is cast as a b2Fixture and collision is resolved according to ShouldCollide.
    * @note This function is not in the box2dweb.as code -- might not work.
    * @see b2World.Raycast()
    * @see b2ContactFilter.ShouldCollide()
    * @param userData User provided data.  Comments indicate that this might be a b2Fixture.
    * @return True if the fixture should be considered for ray intersection, otherwise false.
    **/
  /* CompleteClass */
  override def RayCollide(userData: js.Any): Boolean = js.native
  
  /**
    * Return true if contact calculations should be performed between these two fixtures.
    * @warning For performance reasons this is only called when the AABBs begin to overlap.
    * @param fixtureA b2Fixture potentially colliding with fixtureB.
    * @param fixtureB b2Fixture potentially colliding with fixtureA.
    * @return True if fixtureA and fixtureB probably collide requiring more calculations, otherwise false.
    **/
  /* CompleteClass */
  override def ShouldCollide(fixtureA: typings.box2d.Box2D.Dynamics.b2Fixture, fixtureB: typings.box2d.Box2D.Dynamics.b2Fixture): Boolean = js.native
}
