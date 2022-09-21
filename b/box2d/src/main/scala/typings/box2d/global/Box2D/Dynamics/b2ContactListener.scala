package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Collision.b2Manifold
import typings.box2d.Box2D.Dynamics.Contacts.b2Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2ContactListener")
@js.native
open class b2ContactListener ()
  extends StObject
     with typings.box2d.Box2D.Dynamics.b2ContactListener {
  
  /**
    * Called when two fixtures begin to touch.
    * @param contact Contact point.
    **/
  /* CompleteClass */
  override def BeginContact(contact: b2Contact): Unit = js.native
  
  /**
    * Called when two fixtures cease to touch.
    * @param contact Contact point.
    **/
  /* CompleteClass */
  override def EndContact(contact: b2Contact): Unit = js.native
  
  /**
    * This lets you inspect a contact after the solver is finished. This is useful for inspecting impulses. Note: the contact manifold does not include time of impact impulses, which can be arbitrarily large if the sub-step is small. Hence the impulse is provided explicitly in a separate data structure. Note: this is only called for contacts that are touching, solid, and awake.
    * @param contact Contact point.
    * @param impulse Contact impulse.
    **/
  /* CompleteClass */
  override def PostSolve(contact: b2Contact, impulse: typings.box2d.Box2D.Dynamics.b2ContactImpulse): Unit = js.native
  
  /**
    * This is called after a contact is updated. This allows you to inspect a contact before it goes to the solver. If you are careful, you can modify the contact manifold (e.g. disable contact). A copy of the old manifold is provided so that you can detect changes. Note: this is called only for awake bodies. Note: this is called even when the number of contact points is zero. Note: this is not called for sensors. Note: if you set the number of contact points to zero, you will not get an EndContact callback. However, you may get a BeginContact callback the next step.
    * @param contact Contact point.
    * @param oldManifold Old manifold.
    **/
  /* CompleteClass */
  override def PreSolve(contact: b2Contact, oldManifold: b2Manifold): Unit = js.native
}
