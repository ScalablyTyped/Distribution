package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Collision.b2Manifold
import typings.box2d.Box2D.Dynamics.Contacts.b2Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2ContactListener extends js.Object {
  /**
    * Called when two fixtures begin to touch.
    * @param contact Contact point.
    **/
  def BeginContact(contact: b2Contact): Unit
  /**
    * Called when two fixtures cease to touch.
    * @param contact Contact point.
    **/
  def EndContact(contact: b2Contact): Unit
  /**
    * This lets you inspect a contact after the solver is finished. This is useful for inspecting impulses. Note: the contact manifold does not include time of impact impulses, which can be arbitrarily large if the sub-step is small. Hence the impulse is provided explicitly in a separate data structure. Note: this is only called for contacts that are touching, solid, and awake.
    * @param contact Contact point.
    * @param impulse Contact impulse.
    **/
  def PostSolve(contact: b2Contact, impulse: b2ContactImpulse): Unit
  /**
    * This is called after a contact is updated. This allows you to inspect a contact before it goes to the solver. If you are careful, you can modify the contact manifold (e.g. disable contact). A copy of the old manifold is provided so that you can detect changes. Note: this is called only for awake bodies. Note: this is called even when the number of contact points is zero. Note: this is not called for sensors. Note: if you set the number of contact points to zero, you will not get an EndContact callback. However, you may get a BeginContact callback the next step.
    * @param contact Contact point.
    * @param oldManifold Old manifold.
    **/
  def PreSolve(contact: b2Contact, oldManifold: b2Manifold): Unit
}

object b2ContactListener {
  @scala.inline
  def apply(
    BeginContact: b2Contact => Unit,
    EndContact: b2Contact => Unit,
    PostSolve: (b2Contact, b2ContactImpulse) => Unit,
    PreSolve: (b2Contact, b2Manifold) => Unit
  ): b2ContactListener = {
    val __obj = js.Dynamic.literal(BeginContact = js.Any.fromFunction1(BeginContact), EndContact = js.Any.fromFunction1(EndContact), PostSolve = js.Any.fromFunction2(PostSolve), PreSolve = js.Any.fromFunction2(PreSolve))
    __obj.asInstanceOf[b2ContactListener]
  }
}

