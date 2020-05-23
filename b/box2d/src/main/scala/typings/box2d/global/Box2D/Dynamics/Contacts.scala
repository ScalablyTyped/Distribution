package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Collision.b2ContactID
import typings.box2d.Box2D.Collision.b2Manifold
import typings.box2d.Box2D.Collision.b2WorldManifold
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Contacts")
@js.native
object Contacts extends js.Object {
  @js.native
  /**
    * Constructor
    **/
  class b2Contact ()
    extends typings.box2d.Box2D.Dynamics.Contacts.b2Contact {
    /**
      * Flag this contact for filtering. Filtering will occur the next time step.
      **/
    /* CompleteClass */
    override def FlagForFiltering(): Unit = js.native
    /**
      * Get the first fixture in this contact.
      * @return First fixture in this contact.
      **/
    /* CompleteClass */
    override def GetFixtureA(): typings.box2d.Box2D.Dynamics.b2Fixture = js.native
    /**
      * Get the second fixture in this contact.
      * @return Second fixture in this contact.
      **/
    /* CompleteClass */
    override def GetFixtureB(): typings.box2d.Box2D.Dynamics.b2Fixture = js.native
    /**
      * Get the contact manifold. Do not modify the manifold unless you understand the internals of Box2D.
      * @return Contact manifold.
      **/
    /* CompleteClass */
    override def GetManifold(): b2Manifold = js.native
    /**
      * Get the next contact in the world's contact list.
      * @return Next contact in the world's contact list.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Contacts.b2Contact = js.native
    /**
      * Get the world manifold.
      * @param worldManifold World manifold out.
      * @return World manifold.
      **/
    /* CompleteClass */
    override def GetWorldManifold(worldManifold: b2WorldManifold): Unit = js.native
    /**
      * Does this contact generate TOI events for continuous simulation.
      * @return True for continous, otherwise false.
      **/
    /* CompleteClass */
    override def IsContinuous(): Boolean = js.native
    /**
      * Has this contact been disabled?
      * @return True if disabled, otherwise false.
      **/
    /* CompleteClass */
    override def IsEnabled(): Boolean = js.native
    /**
      * Is this contact a sensor?
      * @return True if sensor, otherwise false.
      **/
    /* CompleteClass */
    override def IsSensor(): Boolean = js.native
    /**
      * Is this contact touching.
      * @return True if contact is touching, otherwise false.
      **/
    /* CompleteClass */
    override def IsTouching(): Boolean = js.native
    /**
      * Enable/disable this contact. This can be used inside the pre-solve contact listener. The contact is only disabled for the current time step (or sub-step in continuous collision).
      * @param flag True to enable, false to disable.
      **/
    /* CompleteClass */
    override def SetEnabled(flag: Boolean): Unit = js.native
    /**
      * Change this to be a sensor or-non-sensor contact.
      * @param sensor True to be sensor, false to not be a sensor.
      **/
    /* CompleteClass */
    override def SetSensor(sensor: Boolean): Unit = js.native
  }
  
  @js.native
  class b2ContactEdge ()
    extends typings.box2d.Box2D.Dynamics.Contacts.b2ContactEdge {
    /**
      * Contact.
      **/
    /* CompleteClass */
    override var contact: typings.box2d.Box2D.Dynamics.Contacts.b2Contact = js.native
    /**
      * Next contact edge.
      **/
    /* CompleteClass */
    override var next: typings.box2d.Box2D.Dynamics.Contacts.b2ContactEdge = js.native
    /**
      * Contact body.
      **/
    /* CompleteClass */
    override var other: typings.box2d.Box2D.Dynamics.b2Body = js.native
    /**
      * Previous contact edge.
      **/
    /* CompleteClass */
    override var prev: typings.box2d.Box2D.Dynamics.Contacts.b2ContactEdge = js.native
  }
  
  @js.native
  class b2ContactResult ()
    extends typings.box2d.Box2D.Dynamics.Contacts.b2ContactResult {
    /**
      * The contact id identifies the features in contact.
      **/
    /* CompleteClass */
    override var id: b2ContactID = js.native
    /**
      * Points from shape1 to shape2.
      **/
    /* CompleteClass */
    override var normal: b2Vec2 = js.native
    /**
      * The normal impulse applied to body2.
      **/
    /* CompleteClass */
    override var normalImpulse: Double = js.native
    /**
      * Position in world coordinates.
      **/
    /* CompleteClass */
    override var position: b2Vec2 = js.native
    /**
      * The first shape.
      **/
    /* CompleteClass */
    override var shape1: b2Shape = js.native
    /**
      * The second shape.
      **/
    /* CompleteClass */
    override var shape2: b2Shape = js.native
    /**
      * The tangent impulse applied to body2.
      **/
    /* CompleteClass */
    override var tangentImpulse: Double = js.native
  }
  
}

