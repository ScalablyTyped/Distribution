package typings
package box2dLib.Box2DNs.DynamicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2Fixture")
@js.native
class b2Fixture () extends js.Object {
  /**
  		* Get the fixture's AABB. This AABB may be enlarge and/or stale. If you need a more accurate AABB, compute it using the shape and the body transform.
  		* @return Fiture's AABB.
  		**/
  def GetAABB(): box2dLib.Box2DNs.CollisionNs.b2AABB = js.native
  /**
  		* Get the parent body of this fixture. This is NULL if the fixture is not attached.
  		* @return The parent body.
  		**/
  def GetBody(): b2Body = js.native
  /**
  		* Get the density of this fixture.
  		* @return Density
  		**/
  def GetDensity(): scala.Double = js.native
  /**
  		* Get the contact filtering data.
  		* @return Filter data.
  		**/
  def GetFilterData(): b2FilterData = js.native
  /**
  		* Get the coefficient of friction.
  		* @return Friction.
  		**/
  def GetFriction(): scala.Double = js.native
  /**
  		* Get the mass data for this fixture. The mass data is based on the density and the shape. The rotational inertia is about the shape's origin. This operation may be expensive.
  		* @param massData This is a reference to a valid b2MassData, if it is null a new b2MassData is allocated and then returned.  Default = null.
  		* @return Mass data.
  		**/
  def GetMassData(): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2MassData = js.native
  def GetMassData(massData: box2dLib.Box2DNs.CollisionNs.ShapesNs.b2MassData): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2MassData = js.native
  /**
  		* Get the next fixture in the parent body's fixture list.
  		* @return Next fixture.
  		**/
  def GetNext(): b2Fixture = js.native
  /**
  		* Get the coefficient of restitution.
  		* @return Restitution.
  		**/
  def GetRestitution(): scala.Double = js.native
  /**
  		* Get the child shape. You can modify the child shape, however you should not change the number of vertices because this will crash some collision caching mechanisms.
  		* @return Fixture shape.
  		**/
  def GetShape(): box2dLib.Box2DNs.CollisionNs.ShapesNs.b2Shape = js.native
  /**
  		* Get the type of the child shape. You can use this to down cast to the concrete shape.
  		* @return Shape type enum.
  		**/
  def GetType(): scala.Double = js.native
  /**
  		* Get the user data that was assigned in the fixture definition. Use this to store your application specific data.
  		* @return User provided data.  Cast to your object type.
  		**/
  def GetUserData(): js.Any = js.native
  /**
  		* Is this fixture a sensor (non-solid)?
  		* @return True if the shape is a sensor, otherwise false.
  		**/
  def IsSensor(): scala.Boolean = js.native
  /**
  		* Perform a ray cast against this shape.
  		* @param output Ray cast results.  This argument is out.
  		* @param input Ray cast input parameters.
  		* @return True if the ray hits the shape, otherwise false.
  		**/
  def RayCast(
    output: box2dLib.Box2DNs.CollisionNs.b2RayCastOutput,
    input: box2dLib.Box2DNs.CollisionNs.b2RayCastInput
  ): scala.Boolean = js.native
  /**
  		* Set the density of this fixture. This will _not_ automatically adjust the mass of the body. You must call b2Body::ResetMassData to update the body's mass.
  		* @param density The new density.
  		**/
  def SetDensity(density: scala.Double): scala.Unit = js.native
  /**
  		* Set the contact filtering data. This will not update contacts until the next time step when either parent body is active and awake.
  		* @param filter The new filter data.
  		**/
  def SetFilterData(filter: js.Any): scala.Unit = js.native
  /**
  		* Set the coefficient of friction.
  		* @param friction The new friction coefficient.
  		**/
  def SetFriction(friction: scala.Double): scala.Unit = js.native
  /**
  		* Get the coefficient of restitution.
  		* @param resitution The new restitution coefficient.
  		**/
  def SetRestitution(restitution: scala.Double): scala.Unit = js.native
  /**
  		* Set if this fixture is a sensor.
  		* @param sensor True to set as a sensor, false to not be a sensor.
  		**/
  def SetSensor(sensor: scala.Boolean): scala.Unit = js.native
  /**
  		* Set the user data. Use this to store your application specific data.
  		* @param data User provided data.
  		**/
  def SetUserData(data: js.Any): scala.Unit = js.native
  /**
  		* Test a point for containment in this fixture.
  		* @param p Point to test against, in world coordinates.
  		* @return True if the point is in this shape, otherwise false.
  		**/
  def TestPoint(p: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Boolean = js.native
}

