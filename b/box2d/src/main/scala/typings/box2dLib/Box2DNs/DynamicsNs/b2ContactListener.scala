package typings
package box2dLib.Box2DNs.DynamicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2ContactListener")
@js.native
class b2ContactListener () extends js.Object {
  /**
  		* Called when two fixtures begin to touch.
  		* @param contact Contact point.
  		**/
  def BeginContact(contact: box2dLib.Box2DNs.DynamicsNs.ContactsNs.b2Contact): scala.Unit = js.native
  /**
  		* Called when two fixtures cease to touch.
  		* @param contact Contact point.
  		**/
  def EndContact(contact: box2dLib.Box2DNs.DynamicsNs.ContactsNs.b2Contact): scala.Unit = js.native
  /**
  		* This lets you inspect a contact after the solver is finished. This is useful for inspecting impulses. Note: the contact manifold does not include time of impact impulses, which can be arbitrarily large if the sub-step is small. Hence the impulse is provided explicitly in a separate data structure. Note: this is only called for contacts that are touching, solid, and awake.
  		* @param contact Contact point.
  		* @param impulse Contact impulse.
  		**/
  def PostSolve(contact: box2dLib.Box2DNs.DynamicsNs.ContactsNs.b2Contact, impulse: b2ContactImpulse): scala.Unit = js.native
  /**
  		* This is called after a contact is updated. This allows you to inspect a contact before it goes to the solver. If you are careful, you can modify the contact manifold (e.g. disable contact). A copy of the old manifold is provided so that you can detect changes. Note: this is called only for awake bodies. Note: this is called even when the number of contact points is zero. Note: this is not called for sensors. Note: if you set the number of contact points to zero, you will not get an EndContact callback. However, you may get a BeginContact callback the next step.
  		* @param contact Contact point.
  		* @param oldManifold Old manifold.
  		**/
  def PreSolve(
    contact: box2dLib.Box2DNs.DynamicsNs.ContactsNs.b2Contact,
    oldManifold: box2dLib.Box2DNs.CollisionNs.b2Manifold
  ): scala.Unit = js.native
}

