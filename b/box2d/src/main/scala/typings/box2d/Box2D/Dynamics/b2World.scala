package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Collision.IBroadPhase
import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Collision.b2AABB
import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.Contacts.b2Contact
import typings.box2d.Box2D.Dynamics.Controllers.b2Controller
import typings.box2d.Box2D.Dynamics.Joints.b2Joint
import typings.box2d.Box2D.Dynamics.Joints.b2JointDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2World extends js.Object {
  /**
    * Add a controller to the world list.
    * @param c Controller to add.
    * @return Controller that was added to the world.
    **/
  def AddController(c: b2Controller): b2Controller = js.native
  /**
    * Call this after you are done with time steps to clear the forces. You normally call this after each call to Step, unless you are performing sub-steps.
    **/
  def ClearForces(): Unit = js.native
  /**
    * Create a rigid body given a definition. No reference to the definition is retained.
    * @param def Body's definition.
    * @return Created rigid body.
    **/
  def CreateBody(`def`: b2BodyDef): b2Body = js.native
  /**
    * Creates a new controller.
    * @param controller New controller.
    * @return New controller.
    **/
  def CreateController(controller: b2Controller): b2Controller = js.native
  /**
    * Create a joint to constrain bodies together. No reference to the definition is retained. This may cause the connected bodies to cease colliding.
    * @warning This function is locked during callbacks.
    * @param def Joint definition.
    * @return New created joint.
    **/
  def CreateJoint(`def`: b2JointDef): b2Joint = js.native
  /**
    * Destroy a rigid body given a definition. No reference to the definition is retained. This function is locked during callbacks.
    * @param b Body to destroy.
    * @warning This function is locked during callbacks.
    **/
  def DestroyBody(b: b2Body): Unit = js.native
  /**
    * Destroy a controller given the controller instance.
    * @warning This function is locked during callbacks.
    * @param controller Controller to destroy.
    **/
  def DestroyController(controller: b2Controller): Unit = js.native
  /**
    * Destroy a joint. This may cause the connected bodies to begin colliding.
    * @param j Joint to destroy.
    **/
  def DestroyJoint(j: b2Joint): Unit = js.native
  /**
    * Call this to draw shapes and other debug draw data.
    **/
  def DrawDebugData(): Unit = js.native
  /**
    * Get the number of bodies.
    * @return Number of bodies in this world.
    **/
  def GetBodyCount(): Double = js.native
  /**
    * Get the world body list. With the returned body, use b2Body::GetNext to get the next body in the world list. A NULL body indicates the end of the list.
    * @return The head of the world body list.
    **/
  def GetBodyList(): b2Body = js.native
  /**
    * Get the number of contacts (each may have 0 or more contact points).
    * @return Number of contacts.
    **/
  def GetContactCount(): Double = js.native
  /**
    * Get the world contact list. With the returned contact, use b2Contact::GetNext to get the next contact in the world list. A NULL contact indicates the end of the list.
    * @return The head of the world contact list.
    **/
  def GetContactList(): b2Contact = js.native
  /**
    * Get the global gravity vector.
    * @return Global gravity vector.
    **/
  def GetGravity(): b2Vec2 = js.native
  /**
    * The world provides a single static ground body with no collision shapes. You can use this to simplify the creation of joints and static shapes.
    * @return The ground body.
    **/
  def GetGroundBody(): b2Body = js.native
  /**
    * Get the number of joints.
    * @return The number of joints in the world.
    **/
  def GetJointCount(): Double = js.native
  /**
    * Get the world joint list. With the returned joint, use b2Joint::GetNext to get the next joint in the world list. A NULL joint indicates the end of the list.
    * @return The head of the world joint list.
    **/
  def GetJointList(): b2Joint = js.native
  /**
    * Get the number of broad-phase proxies.
    * @return Number of borad-phase proxies.
    **/
  def GetProxyCount(): Double = js.native
  /**
    * Is the world locked (in the middle of a time step).
    * @return True if the world is locked and in the middle of a time step, otherwise false.
    **/
  def IsLocked(): Boolean = js.native
  /**
    * Query the world for all fixtures that potentially overlap the provided AABB.
    * @param callback  A user implemented callback class. It should match signature function Callback(fixture:b2Fixture):Boolean.  Return true to continue to the next fixture.
    * @param aabb The query bounding box.
    **/
  def QueryAABB(callback: js.Function1[/* fixutre */ b2Fixture, Boolean], aabb: b2AABB): Unit = js.native
  /**
    * Query the world for all fixtures that contain a point.
    * @note This provides a feature specific to this port.
    * @param callback A user implemented callback class.  It should match signature function Callback(fixture:b2Fixture):Boolean.  Return true to continue to the next fixture.
    * @param p The query point.
    **/
  def QueryPoint(callback: js.Function1[/* fixture */ b2Fixture, Boolean], p: b2Vec2): Unit = js.native
  /**
    * Query the world for all fixtures that precisely overlap the provided transformed shape.
    * @note This provides a feature specific to this port.
    * @param callback A user implemented callback class.  It should match signature function Callback(fixture:b2Fixture):Boolean.  Return true to continue to the next fixture.
    * @param shape The query shape.
    * @param transform Optional transform, default = null.
    **/
  def QueryShape(callback: js.Function1[/* fixture */ b2Fixture, Boolean], shape: b2Shape): Unit = js.native
  def QueryShape(callback: js.Function1[/* fixture */ b2Fixture, Boolean], shape: b2Shape, transform: b2Transform): Unit = js.native
  /**
    * Ray-cast the world for all fixtures in the path of the ray. Your callback Controls whether you get the closest point, any point, or n-points The ray-cast ignores shapes that contain the starting point.
    * @param callback A callback function which must be of signature:
    *    function Callback(
    *        fixture:b2Fixture,    // The fixture hit by the ray
    *        point:b2Vec2,        // The point of initial intersection
    *        normal:b2Vec2,        // The normal vector at the point of intersection
    *        fraction:Number        // The fractional length along the ray of the intersection
    *     ):Number
    *     Callback should return the new length of the ray as a fraction of the original length. By returning 0, you immediately terminate. By returning 1, you continue wiht the original ray. By returning the current fraction, you proceed to find the closest point.
    * @param point1 The ray starting point.
    * @param point2 The ray ending point.
    **/
  def RayCast(
    callback: js.Function4[
      /* fixture */ b2Fixture, 
      /* point */ b2Vec2, 
      /* normal */ b2Vec2, 
      /* fraction */ Double, 
      Double
    ],
    point1: b2Vec2,
    point2: b2Vec2
  ): Unit = js.native
  /**
    * Ray-cast the world for all fixture in the path of the ray.
    * @param point1 The ray starting point.
    * @param point2 The ray ending point.
    * @return Array of all the fixtures intersected by the ray.
    **/
  def RayCastAll(point1: b2Vec2, point2: b2Vec2): js.Array[b2Fixture] = js.native
  /**
    * Ray-cast the world for the first fixture in the path of the ray.
    * @param point1 The ray starting point.
    * @param point2 The ray ending point.
    * @return First fixture intersected by the ray.
    **/
  def RayCastOne(point1: b2Vec2, point2: b2Vec2): b2Fixture = js.native
  /**
    * Removes the controller from the world.
    * @param c Controller to remove.
    **/
  def RemoveController(c: b2Controller): Unit = js.native
  /**
    * Use the given object as a broadphase. The old broadphase will not be cleanly emptied.
    * @warning This function is locked during callbacks.
    * @param broadphase: Broad phase implementation.
    **/
  def SetBroadPhase(broadPhase: IBroadPhase): Unit = js.native
  /**
    * Register a contact filter to provide specific control over collision. Otherwise the default filter is used (b2_defaultFilter).
    * @param filter Contact filter'er.
    **/
  def SetContactFilter(filter: b2ContactFilter): Unit = js.native
  /**
    * Register a contact event listener.
    * @param listener Contact event listener.
    **/
  def SetContactListener(listener: b2ContactListener): Unit = js.native
  /**
    * Enable/disable continuous physics. For testing.
    * @param flag True for continuous physics, otherwise false.
    **/
  def SetContinuousPhysics(flag: Boolean): Unit = js.native
  /**
    * Register a routine for debug drawing. The debug draw functions are called inside the b2World::Step method, so make sure your renderer is ready to consume draw commands when you call Step().
    * @param debugDraw Debug drawing instance.
    **/
  def SetDebugDraw(debugDraw: b2DebugDraw): Unit = js.native
  /**
    * Destruct the world. All physics entities are destroyed and all heap memory is released.
    * @param listener Destruction listener instance.
    **/
  def SetDestructionListener(listener: b2DestructionListener): Unit = js.native
  /**
    * Change the global gravity vector.
    * @param gravity New global gravity vector.
    **/
  def SetGravity(gravity: b2Vec2): Unit = js.native
  /**
    * Enable/disable warm starting. For testing.
    * @param flag True for warm starting, otherwise false.
    **/
  def SetWarmStarting(flag: Boolean): Unit = js.native
  /**
    * Take a time step. This performs collision detection, integration, and constraint solution.
    * @param dt The amout of time to simulate, this should not vary.
    * @param velocityIterations For the velocity constraint solver.
    * @param positionIterations For the position constraint solver.
    **/
  def Step(dt: Double, velocityIterations: Double, positionIterations: Double): Unit = js.native
  /**
    * Perform validation of internal data structures.
    **/
  def Validate(): Unit = js.native
}

