package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Controllers")
@js.native
object Controllers extends js.Object {
  @js.native
  class b2BuoyancyController ()
    extends typings.box2d.Box2D.Dynamics.Controllers.b2BuoyancyController {
    /**
      * Linear drag co-efficient.
      * @default = 1
      **/
    /* CompleteClass */
    override var angularDrag: Double = js.native
    /**
      * The fluid density.
      * @default = 0
      **/
    /* CompleteClass */
    override var density: Double = js.native
    /**
      * Gravity vector, if the world's gravity is not used.
      * @default = null
      **/
    /* CompleteClass */
    override var gravity: b2Vec2 = js.native
    /**
      * Linear drag co-efficient.
      * @default = 2
      **/
    /* CompleteClass */
    override var linearDrag: Double = js.native
    /**
      * Body count.
      **/
    /* CompleteClass */
    override var m_bodyCount: Double = js.native
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    override var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * The outer surface normal.
      **/
    /* CompleteClass */
    override var normal: b2Vec2 = js.native
    /**
      * The height of the fluid surface along the normal.
      * @default = 0
      **/
    /* CompleteClass */
    override var offset: Double = js.native
    /**
      * If false, bodies are assumed to be uniformly dense, otherwise use the shapes densities.
      * @default = false.
      **/
    /* CompleteClass */
    override var useDensity: Boolean = js.native
    /**
      * If true, gravity is taken from the world instead of the gravity parameter.
      * @default = true.
      **/
    /* CompleteClass */
    override var useWorldGravity: Boolean = js.native
    /**
      * Fluid velocity, for drag calculations.
      **/
    /* CompleteClass */
    override var velocity: b2Vec2 = js.native
    /**
      * Adds a body to the controller.
      * @param body Body to add.
      **/
    /* CompleteClass */
    override def AddBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Removes all bodies from the controller.
      **/
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /**
      * Debug drawing.
      * @param debugDraw Handle to drawer.
      **/
    /* CompleteClass */
    override def Draw(debugDraw: typings.box2d.Box2D.Dynamics.b2DebugDraw): Unit = js.native
    /**
      * Gets the body list.
      * @return Body list.
      **/
    /* CompleteClass */
    override def GetBodyList(): typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Gets the next controller.
      * @return Next controller.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    /**
      * Gets the world.
      * @return World.
      **/
    /* CompleteClass */
    override def GetWorld(): typings.box2d.Box2D.Dynamics.b2World = js.native
    /**
      * Removes a body from the controller.
      * @param body Body to remove from this controller.
      **/
    /* CompleteClass */
    override def RemoveBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Step
      * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
      **/
    /* CompleteClass */
    override def Step(step: js.Any): Unit = js.native
  }
  
  @js.native
  class b2ConstantAccelController ()
    extends typings.box2d.Box2D.Dynamics.Controllers.b2ConstantAccelController {
    /**
      * The acceleration to apply.
      **/
    /* CompleteClass */
    override var A: b2Vec2 = js.native
    /**
      * Body count.
      **/
    /* CompleteClass */
    override var m_bodyCount: Double = js.native
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    override var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Adds a body to the controller.
      * @param body Body to add.
      **/
    /* CompleteClass */
    override def AddBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Removes all bodies from the controller.
      **/
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /**
      * Debug drawing.
      * @param debugDraw Handle to drawer.
      **/
    /* CompleteClass */
    override def Draw(debugDraw: typings.box2d.Box2D.Dynamics.b2DebugDraw): Unit = js.native
    /**
      * Gets the body list.
      * @return Body list.
      **/
    /* CompleteClass */
    override def GetBodyList(): typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Gets the next controller.
      * @return Next controller.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    /**
      * Gets the world.
      * @return World.
      **/
    /* CompleteClass */
    override def GetWorld(): typings.box2d.Box2D.Dynamics.b2World = js.native
    /**
      * Removes a body from the controller.
      * @param body Body to remove from this controller.
      **/
    /* CompleteClass */
    override def RemoveBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Step
      * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
      **/
    /* CompleteClass */
    override def Step(step: js.Any): Unit = js.native
  }
  
  @js.native
  class b2ConstantForceController ()
    extends typings.box2d.Box2D.Dynamics.Controllers.b2ConstantForceController {
    /**
      * The acceleration to apply.
      **/
    /* CompleteClass */
    override var A: b2Vec2 = js.native
    /**
      * Body count.
      **/
    /* CompleteClass */
    override var m_bodyCount: Double = js.native
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    override var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Adds a body to the controller.
      * @param body Body to add.
      **/
    /* CompleteClass */
    override def AddBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Removes all bodies from the controller.
      **/
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /**
      * Debug drawing.
      * @param debugDraw Handle to drawer.
      **/
    /* CompleteClass */
    override def Draw(debugDraw: typings.box2d.Box2D.Dynamics.b2DebugDraw): Unit = js.native
    /**
      * Gets the body list.
      * @return Body list.
      **/
    /* CompleteClass */
    override def GetBodyList(): typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Gets the next controller.
      * @return Next controller.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    /**
      * Gets the world.
      * @return World.
      **/
    /* CompleteClass */
    override def GetWorld(): typings.box2d.Box2D.Dynamics.b2World = js.native
    /**
      * Removes a body from the controller.
      * @param body Body to remove from this controller.
      **/
    /* CompleteClass */
    override def RemoveBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Step
      * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
      **/
    /* CompleteClass */
    override def Step(step: js.Any): Unit = js.native
  }
  
  @js.native
  class b2Controller ()
    extends typings.box2d.Box2D.Dynamics.Controllers.b2Controller {
    /**
      * Body count.
      **/
    /* CompleteClass */
    override var m_bodyCount: Double = js.native
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    override var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Adds a body to the controller.
      * @param body Body to add.
      **/
    /* CompleteClass */
    override def AddBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Removes all bodies from the controller.
      **/
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /**
      * Debug drawing.
      * @param debugDraw Handle to drawer.
      **/
    /* CompleteClass */
    override def Draw(debugDraw: typings.box2d.Box2D.Dynamics.b2DebugDraw): Unit = js.native
    /**
      * Gets the body list.
      * @return Body list.
      **/
    /* CompleteClass */
    override def GetBodyList(): typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Gets the next controller.
      * @return Next controller.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    /**
      * Gets the world.
      * @return World.
      **/
    /* CompleteClass */
    override def GetWorld(): typings.box2d.Box2D.Dynamics.b2World = js.native
    /**
      * Removes a body from the controller.
      * @param body Body to remove from this controller.
      **/
    /* CompleteClass */
    override def RemoveBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Step
      * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
      **/
    /* CompleteClass */
    override def Step(step: js.Any): Unit = js.native
  }
  
  @js.native
  class b2ControllerEdge ()
    extends typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge {
    /**
      * Body.
      **/
    /* CompleteClass */
    override var body: typings.box2d.Box2D.Dynamics.b2Body = js.native
    /**
      * Provides quick access to the other end of this edge.
      **/
    /* CompleteClass */
    override var controller: typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    /**
      * The next controller edge in the controller's body list.
      **/
    /* CompleteClass */
    override var nextBody: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * The next controller edge in the body's controller list.
      **/
    /* CompleteClass */
    override var nextController: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * The previous controller edge in the controller's body list.
      **/
    /* CompleteClass */
    override var prevBody: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * The previous controller edge in the body's controller list.
      **/
    /* CompleteClass */
    override var prevController: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
  }
  
  @js.native
  class b2GravityController ()
    extends typings.box2d.Box2D.Dynamics.Controllers.b2GravityController {
    /**
      * Specifies the strength of the gravitation force.
      * @default = 1
      **/
    /* CompleteClass */
    override var G: Double = js.native
    /**
      * If true, gravity is proportional to r^-2, otherwise r^-1.
      **/
    /* CompleteClass */
    override var invSqr: Boolean = js.native
    /**
      * Body count.
      **/
    /* CompleteClass */
    override var m_bodyCount: Double = js.native
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    override var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Adds a body to the controller.
      * @param body Body to add.
      **/
    /* CompleteClass */
    override def AddBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Removes all bodies from the controller.
      **/
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /**
      * Debug drawing.
      * @param debugDraw Handle to drawer.
      **/
    /* CompleteClass */
    override def Draw(debugDraw: typings.box2d.Box2D.Dynamics.b2DebugDraw): Unit = js.native
    /**
      * Gets the body list.
      * @return Body list.
      **/
    /* CompleteClass */
    override def GetBodyList(): typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Gets the next controller.
      * @return Next controller.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    /**
      * Gets the world.
      * @return World.
      **/
    /* CompleteClass */
    override def GetWorld(): typings.box2d.Box2D.Dynamics.b2World = js.native
    /**
      * Removes a body from the controller.
      * @param body Body to remove from this controller.
      **/
    /* CompleteClass */
    override def RemoveBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Step
      * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
      **/
    /* CompleteClass */
    override def Step(step: js.Any): Unit = js.native
  }
  
  @js.native
  class b2TensorDampingController ()
    extends typings.box2d.Box2D.Dynamics.Controllers.b2TensorDampingController {
    /**
      * Tensor to use in damping model.
      **/
    /* CompleteClass */
    override var T: b2Mat22 = js.native
    /**
      * Body count.
      **/
    /* CompleteClass */
    override var m_bodyCount: Double = js.native
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    override var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Set this to a positive number to clamp the maximum amount of damping done.
      * @default = 0
      **/
    /* CompleteClass */
    override var maxTimeStep: Double = js.native
    /**
      * Adds a body to the controller.
      * @param body Body to add.
      **/
    /* CompleteClass */
    override def AddBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Removes all bodies from the controller.
      **/
    /* CompleteClass */
    override def Clear(): Unit = js.native
    /**
      * Debug drawing.
      * @param debugDraw Handle to drawer.
      **/
    /* CompleteClass */
    override def Draw(debugDraw: typings.box2d.Box2D.Dynamics.b2DebugDraw): Unit = js.native
    /**
      * Gets the body list.
      * @return Body list.
      **/
    /* CompleteClass */
    override def GetBodyList(): typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    /**
      * Gets the next controller.
      * @return Next controller.
      **/
    /* CompleteClass */
    override def GetNext(): typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    /**
      * Gets the world.
      * @return World.
      **/
    /* CompleteClass */
    override def GetWorld(): typings.box2d.Box2D.Dynamics.b2World = js.native
    /**
      * Removes a body from the controller.
      * @param body Body to remove from this controller.
      **/
    /* CompleteClass */
    override def RemoveBody(body: typings.box2d.Box2D.Dynamics.b2Body): Unit = js.native
    /**
      * Helper function to set T in a common case.
      * @param xDamping x
      * @param yDamping y
      **/
    /* CompleteClass */
    override def SetAxisAligned(xDamping: Double, yDamping: Double): Unit = js.native
    /**
      * Step
      * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
      **/
    /* CompleteClass */
    override def Step(step: js.Any): Unit = js.native
  }
  
}

