package typings
package box2dLib.Box2DNs.DynamicsNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Contacts.b2Contact")
@js.native
/**
		* Constructor
		**/
class b2Contact () extends js.Object {
  /**
  		* Flag this contact for filtering. Filtering will occur the next time step.
  		**/
  def FlagForFiltering(): scala.Unit = js.native
  /**
  		* Get the first fixture in this contact.
  		* @return First fixture in this contact.
  		**/
  def GetFixtureA(): box2dLib.Box2DNs.DynamicsNs.b2Fixture = js.native
  /**
  		* Get the second fixture in this contact.
  		* @return Second fixture in this contact.
  		**/
  def GetFixtureB(): box2dLib.Box2DNs.DynamicsNs.b2Fixture = js.native
  /**
  		* Get the contact manifold. Do not modify the manifold unless you understand the internals of Box2D.
  		* @return Contact manifold.
  		**/
  def GetManifold(): box2dLib.Box2DNs.CollisionNs.b2Manifold = js.native
  /**
  		* Get the next contact in the world's contact list.
  		* @return Next contact in the world's contact list.
  		**/
  def GetNext(): b2Contact = js.native
  /**
  		* Get the world manifold.
  		* @param worldManifold World manifold out.
  		* @return World manifold.
  		**/
  def GetWorldManifold(worldManifold: box2dLib.Box2DNs.CollisionNs.b2WorldManifold): scala.Unit = js.native
  /**
  		* Does this contact generate TOI events for continuous simulation.
  		* @return True for continous, otherwise false.
  		**/
  def IsContinuous(): scala.Boolean = js.native
  /**
  		* Has this contact been disabled?
  		* @return True if disabled, otherwise false.
  		**/
  def IsEnabled(): scala.Boolean = js.native
  /**
  		* Is this contact a sensor?
  		* @return True if sensor, otherwise false.
  		**/
  def IsSensor(): scala.Boolean = js.native
  /**
  		* Is this contact touching.
  		* @return True if contact is touching, otherwise false.
  		**/
  def IsTouching(): scala.Boolean = js.native
  /**
  		* Enable/disable this contact. This can be used inside the pre-solve contact listener. The contact is only disabled for the current time step (or sub-step in continuous collision).
  		* @param flag True to enable, false to disable.
  		**/
  def SetEnabled(flag: scala.Boolean): scala.Unit = js.native
  /**
  		* Change this to be a sensor or-non-sensor contact.
  		* @param sensor True to be sensor, false to not be a sensor.
  		**/
  def SetSensor(sensor: scala.Boolean): scala.Unit = js.native
}

