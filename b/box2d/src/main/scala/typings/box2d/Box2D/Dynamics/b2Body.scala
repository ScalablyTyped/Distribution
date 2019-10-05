package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2MassData
import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Transform
import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.Contacts.b2ContactEdge
import typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge
import typings.box2d.Box2D.Dynamics.Joints.b2JointEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2Body")
@js.native
class b2Body () extends js.Object {
  /**
  		* Apply a force at a world point. If the force is not applied at the center of mass, it will generate a torque and affect the angular velocity. This wakes up the body.
  		* @param force The world force vector, usually in Newtons (N).
  		* @param point The world position of the point of application.
  		**/
  def ApplyForce(force: b2Vec2, point: b2Vec2): Unit = js.native
  /**
  		* Apply an impulse at a point. This immediately modifies the velocity. It also modifies the angular velocity if the point of application is not at the center of mass. This wakes up the body.
  		* @param impules The world impulse vector, usually in N-seconds or kg-m/s.
  		* @param point The world position of the point of application.
  		**/
  def ApplyImpulse(impulse: b2Vec2, point: b2Vec2): Unit = js.native
  /**
  		* Apply a torque. This affects the angular velocity without affecting the linear velocity of the center of mass. This wakes up the body.
  		* @param torque Force applied about the z-axis (out of the screen), usually in N-m.
  		**/
  def ApplyTorque(torque: Double): Unit = js.native
  /**
  		* Creates a fixture and attach it to this body. Use this function if you need to set some fixture parameters, like friction. Otherwise you can create the fixture directly from a shape. If the density is non-zero, this function automatically updates the mass of the body. Contacts are not created until the next time step.
  		* @warning This function is locked during callbacks.
  		* @param def The fixture definition;
  		* @return The created fixture.
  		**/
  def CreateFixture(`def`: b2FixtureDef): b2Fixture = js.native
  /**
  		* Creates a fixture from a shape and attach it to this body. This is a convenience function. Use b2FixtureDef if you need to set parameters like friction, restitution, user data, or filtering. This function automatically updates the mass of the body.
  		* @warning This function is locked during callbacks.
  		* @param shape The shaped of the fixture (to be cloned).
  		* @param density The shape density, default is 0.0, set to zero for static bodies.
  		* @return The created fixture.
  		**/
  def CreateFixture2(shape: b2Shape): b2Fixture = js.native
  def CreateFixture2(shape: b2Shape, density: Double): b2Fixture = js.native
  /**
  		* Destroy a fixture. This removes the fixture from the broad-phase and destroys all contacts associated with this fixture. This will automatically adjust the mass of the body if the body is dynamic and the fixture has positive density. All fixtures attached to a body are implicitly destroyed when the body is destroyed.
  		* @warning This function is locked during callbacks.
  		* @param fixture The fixed to be removed.
  		**/
  def DestroyFixture(fixture: b2Fixture): Unit = js.native
  /**
  		* Get the angle in radians.
  		* @return The current world rotation angle in radians
  		**/
  def GetAngle(): Double = js.native
  /**
  		* Get the angular damping of the body.
  		* @return Angular damping of the body.
  		**/
  def GetAngularDamping(): Double = js.native
  /**
  		* Get the angular velocity.
  		* @return The angular velocity in radians/second.
  		**/
  def GetAngularVelocity(): Double = js.native
  /**
  		* Get the list of all contacts attached to this body.
  		* @return List of all contacts attached to this body.
  		**/
  def GetContactList(): b2ContactEdge = js.native
  /**
  		* Get the list of all controllers attached to this body.
  		* @return List of all controllers attached to this body.
  		**/
  def GetControllerList(): b2ControllerEdge = js.native
  /**
  		* Get the definition containing the body properties.
  		* @note This provides a feature specific to this port.
  		* @return The body's definition.
  		**/
  def GetDefinition(): b2BodyDef = js.native
  /**
  		* Get the list of all fixtures attached to this body.
  		* @return List of all fixtures attached to this body.
  		**/
  def GetFixtureList(): b2Fixture = js.native
  /**
  		* Get the central rotational inertia of the body.
  		* @return The rotational inertia, usually in kg-m^2.
  		**/
  def GetInertia(): Double = js.native
  /**
  		* Get the list of all joints attached to this body.
  		* @return List of all joints attached to this body.
  		**/
  def GetJointList(): b2JointEdge = js.native
  /**
  		* Get the linear damping of the body.
  		* @return The linear damping of the body.
  		**/
  def GetLinearDamping(): Double = js.native
  /**
  		* Get the linear velocity of the center of mass.
  		* @return The linear velocity of the center of mass.
  		**/
  def GetLinearVelocity(): b2Vec2 = js.native
  /**
  		* Get the world velocity of a local point.
  		* @param localPoint Point in local coordinates.
  		* @return The world velocity of the point.
  		**/
  def GetLinearVelocityFromLocalPoint(localPoint: b2Vec2): b2Vec2 = js.native
  /**
  		* Get the world linear velocity of a world point attached to this body.
  		* @param worldPoint Point in world coordinates.
  		* @return The world velocity of the point.
  		**/
  def GetLinearVelocityFromWorldPoint(worldPoint: b2Vec2): b2Vec2 = js.native
  /**
  		* Get the local position of the center of mass.
  		* @return Local position of the center of mass.
  		**/
  def GetLocalCenter(): b2Vec2 = js.native
  /**
  		* Gets a local point relative to the body's origin given a world point.
  		* @param worldPoint Pointin world coordinates.
  		* @return The corresponding local point relative to the body's origin.
  		**/
  def GetLocalPoint(worldPoint: b2Vec2): b2Vec2 = js.native
  /**
  		* Gets a local vector given a world vector.
  		* @param worldVector World vector.
  		* @return The corresponding local vector.
  		**/
  def GetLocalVector(worldVector: b2Vec2): b2Vec2 = js.native
  /**
  		* Get the total mass of the body.
  		* @return The body's mass, usually in kilograms (kg).
  		**/
  def GetMass(): Double = js.native
  /**
  		* Get the mass data of the body. The rotational inertial is relative to the center of mass.
  		* @param data Body's mass data, this argument is `out`.
  		**/
  def GetMassData(data: b2MassData): Unit = js.native
  /**
  		* Get the next body in the world's body list.
  		* @return Next body in the world's body list.
  		**/
  def GetNext(): b2Body = js.native
  /**
  		* Get the world body origin position.
  		* @return World position of the body's origin.
  		**/
  def GetPosition(): b2Vec2 = js.native
  /**
  		* Get the body transform for the body's origin.
  		* @return World transform of the body's origin.
  		**/
  def GetTransform(): b2Transform = js.native
  /**
  		* Get the type of this body.
  		* @return Body type as uint.
  		**/
  def GetType(): Double = js.native
  /**
  		* Get the user data pointer that was provided in the body definition.
  		* @return User's data, cast to the correct type.
  		**/
  def GetUserData(): js.Any = js.native
  /**
  		* Get the parent world of this body.
  		* @return Body's world.
  		**/
  def GetWorld(): b2World = js.native
  /**
  		* Get the world position of the center of mass.
  		* @return World position of the center of mass.
  		**/
  def GetWorldCenter(): b2Vec2 = js.native
  /**
  		* Get the world coordinates of a point given the local coordinates.
  		* @param localPoint Point on the body measured relative to the body's origin.
  		* @return localPoint expressed in world coordinates.
  		**/
  def GetWorldPoint(localPoint: b2Vec2): b2Vec2 = js.native
  /**
  		* Get the world coordinates of a vector given the local coordinates.
  		* @param localVector Vector fixed in the body.
  		* @return localVector expressed in world coordinates.
  		**/
  def GetWorldVector(localVector: b2Vec2): b2Vec2 = js.native
  /**
  		* Get the active state of the body.
  		* @return True if the body is active, otherwise false.
  		**/
  def IsActive(): Boolean = js.native
  /**
  		* Get the sleeping state of this body.
  		* @return True if the body is awake, otherwise false.
  		**/
  def IsAwake(): Boolean = js.native
  /**
  		* Is the body treated like a bullet for continuous collision detection?
  		* @return True if the body is treated like a bullet, otherwise false.
  		**/
  def IsBullet(): Boolean = js.native
  /**
  		* Does this body have fixed rotation?
  		* @return True for fixed, otherwise false.
  		**/
  def IsFixedRotation(): Boolean = js.native
  /**
  		* Is this body allowed to sleep?
  		* @return True if the body can sleep, otherwise false.
  		**/
  def IsSleepingAllowed(): Boolean = js.native
  /**
  		* Merges another body into this. Only fixtures, mass and velocity are effected, Other properties are ignored.
  		* @note This provides a feature specific to this port.
  		**/
  def Merge(other: b2Body): Unit = js.native
  /**
  		* This resets the mass properties to the sum of the mass properties of the fixtures. This normally does not need to be called unless you called SetMassData to override the mass and later you want to reset the mass.
  		**/
  def ResetMassData(): Unit = js.native
  /**
  		* Set the active state of the body. An inactive body is not simulated and cannot be collided with or woken up. If you pass a flag of true, all fixtures will be added to the broad-phase. If you pass a flag of false, all fixtures will be removed from the broad-phase and all contacts will be destroyed. Fixtures and joints are otherwise unaffected. You may continue to create/destroy fixtures and joints on inactive bodies. Fixtures on an inactive body are implicitly inactive and will not participate in collisions, ray-casts, or queries. Joints connected to an inactive body are implicitly inactive. An inactive body is still owned by a b2World object and remains in the body list.
  		* @param flag True to activate, false to deactivate.
  		**/
  def SetActive(flag: Boolean): Unit = js.native
  /**
  		* Set the world body angle
  		* @param angle New angle of the body.
  		**/
  def SetAngle(angle: Double): Unit = js.native
  /**
  		* Set the angular damping of the body.
  		* @param angularDamping New angular damping value.
  		**/
  def SetAngularDamping(angularDamping: Double): Unit = js.native
  /**
  		* Set the angular velocity.
  		* @param omega New angular velocity in radians/second.
  		**/
  def SetAngularVelocity(omega: Double): Unit = js.native
  /**
  		* Set the sleep state of the body. A sleeping body has vety low CPU cost.
  		* @param flag True to set the body to awake, false to put it to sleep.
  		**/
  def SetAwake(flag: Boolean): Unit = js.native
  /**
  		* Should this body be treated like a bullet for continuous collision detection?
  		* @param flag True for bullet, false for normal.
  		**/
  def SetBullet(flag: Boolean): Unit = js.native
  /**
  		* Set this body to have fixed rotation. This causes the mass to be reset.
  		* @param fixed True for no rotation, false to allow for rotation.
  		**/
  def SetFixedRotation(fixed: Boolean): Unit = js.native
  /**
  		* Set the linear damping of the body.
  		* @param linearDamping The new linear damping for this body.
  		**/
  def SetLinearDamping(linearDamping: Double): Unit = js.native
  /**
  		* Set the linear velocity of the center of mass.
  		* @param v New linear velocity of the center of mass.
  		**/
  def SetLinearVelocity(v: b2Vec2): Unit = js.native
  /**
  		* Set the mass properties to override the mass properties of the fixtures Note that this changes the center of mass position. Note that creating or destroying fixtures can also alter the mass. This function has no effect if the body isn't dynamic.
  		* @warning The supplied rotational inertia should be relative to the center of mass.
  		* @param massData New mass data properties.
  		**/
  def SetMassData(massData: b2MassData): Unit = js.native
  /**
  		* Set the world body origin position.
  		* @param position New world body origin position.
  		**/
  def SetPosition(position: b2Vec2): Unit = js.native
  /**
  		* Set the position of the body's origin and rotation (radians). This breaks any contacts and wakes the other bodies.
  		* @param position New world body origin position.
  		* @param angle New world rotation angle of the body in radians.
  		**/
  def SetPositionAndAngle(position: b2Vec2, angle: Double): Unit = js.native
  /**
  		* Is this body allowed to sleep
  		* @param flag True if the body can sleep, false if not.
  		**/
  def SetSleepingAllowed(flag: Boolean): Unit = js.native
  /**
  		* Set the position of the body's origin and rotation (radians). This breaks any contacts and wakes the other bodies. Note this is less efficient than the other overload - you should use that if the angle is available.
  		* @param xf Body's origin and rotation (radians).
  		**/
  def SetTransform(xf: b2Transform): Unit = js.native
  /**
  		* Set the type of this body. This may alter the mass and velocity
  		* @param type Type enum.
  		**/
  def SetType(`type`: Double): Unit = js.native
  /**
  		* Set the user data. Use this to store your application specific data.
  		* @param data The user data for this body.
  		**/
  def SetUserData(data: js.Any): Unit = js.native
  /**
  		* Splits a body into two, preserving dynamic properties
  		* @note This provides a feature specific to this port.
  		* @param callback
  		* @return The newly created bodies from the split.
  		**/
  def Split(callback: js.Function1[/* fixture */ b2Fixture, Boolean]): b2Body = js.native
}

/* static members */
@JSGlobal("Box2D.Dynamics.b2Body")
@js.native
object b2Body extends js.Object {
  /**
  		* Dynamic Body
  		**/
  var b2_dynamicBody: Double = js.native
  /**
  		* Kinematic Body
  		**/
  var b2_kinematicBody: Double = js.native
  /**
  		* Static Body
  		**/
  var b2_staticBody: Double = js.native
}

