package typings.box2d.Box2D.Dynamics.Contacts

import typings.box2d.Box2D.Collision.b2Manifold
import typings.box2d.Box2D.Collision.b2WorldManifold
import typings.box2d.Box2D.Dynamics.b2Fixture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Contact extends js.Object {
  /**
    * Flag this contact for filtering. Filtering will occur the next time step.
    **/
  def FlagForFiltering(): Unit
  /**
    * Get the first fixture in this contact.
    * @return First fixture in this contact.
    **/
  def GetFixtureA(): b2Fixture
  /**
    * Get the second fixture in this contact.
    * @return Second fixture in this contact.
    **/
  def GetFixtureB(): b2Fixture
  /**
    * Get the contact manifold. Do not modify the manifold unless you understand the internals of Box2D.
    * @return Contact manifold.
    **/
  def GetManifold(): b2Manifold
  /**
    * Get the next contact in the world's contact list.
    * @return Next contact in the world's contact list.
    **/
  def GetNext(): b2Contact
  /**
    * Get the world manifold.
    * @param worldManifold World manifold out.
    * @return World manifold.
    **/
  def GetWorldManifold(worldManifold: b2WorldManifold): Unit
  /**
    * Does this contact generate TOI events for continuous simulation.
    * @return True for continous, otherwise false.
    **/
  def IsContinuous(): Boolean
  /**
    * Has this contact been disabled?
    * @return True if disabled, otherwise false.
    **/
  def IsEnabled(): Boolean
  /**
    * Is this contact a sensor?
    * @return True if sensor, otherwise false.
    **/
  def IsSensor(): Boolean
  /**
    * Is this contact touching.
    * @return True if contact is touching, otherwise false.
    **/
  def IsTouching(): Boolean
  /**
    * Enable/disable this contact. This can be used inside the pre-solve contact listener. The contact is only disabled for the current time step (or sub-step in continuous collision).
    * @param flag True to enable, false to disable.
    **/
  def SetEnabled(flag: Boolean): Unit
  /**
    * Change this to be a sensor or-non-sensor contact.
    * @param sensor True to be sensor, false to not be a sensor.
    **/
  def SetSensor(sensor: Boolean): Unit
}

object b2Contact {
  @scala.inline
  def apply(
    FlagForFiltering: () => Unit,
    GetFixtureA: () => b2Fixture,
    GetFixtureB: () => b2Fixture,
    GetManifold: () => b2Manifold,
    GetNext: () => b2Contact,
    GetWorldManifold: b2WorldManifold => Unit,
    IsContinuous: () => Boolean,
    IsEnabled: () => Boolean,
    IsSensor: () => Boolean,
    IsTouching: () => Boolean,
    SetEnabled: Boolean => Unit,
    SetSensor: Boolean => Unit
  ): b2Contact = {
    val __obj = js.Dynamic.literal(FlagForFiltering = js.Any.fromFunction0(FlagForFiltering), GetFixtureA = js.Any.fromFunction0(GetFixtureA), GetFixtureB = js.Any.fromFunction0(GetFixtureB), GetManifold = js.Any.fromFunction0(GetManifold), GetNext = js.Any.fromFunction0(GetNext), GetWorldManifold = js.Any.fromFunction1(GetWorldManifold), IsContinuous = js.Any.fromFunction0(IsContinuous), IsEnabled = js.Any.fromFunction0(IsEnabled), IsSensor = js.Any.fromFunction0(IsSensor), IsTouching = js.Any.fromFunction0(IsTouching), SetEnabled = js.Any.fromFunction1(SetEnabled), SetSensor = js.Any.fromFunction1(SetSensor))
    __obj.asInstanceOf[b2Contact]
  }
}

