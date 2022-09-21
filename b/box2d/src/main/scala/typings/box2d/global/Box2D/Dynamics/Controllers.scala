package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controllers {
  
  @JSGlobal("Box2D.Dynamics.Controllers.b2BuoyancyController")
  @js.native
  open class b2BuoyancyController ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Controllers.b2BuoyancyController {
    
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
    override def Step(step: Any): Unit = js.native
    
    /**
      * Linear drag co-efficient.
      * @default = 1
      **/
    /* CompleteClass */
    var angularDrag: Double = js.native
    
    /**
      * The fluid density.
      * @default = 0
      **/
    /* CompleteClass */
    var density: Double = js.native
    
    /**
      * Gravity vector, if the world's gravity is not used.
      * @default = null
      **/
    /* CompleteClass */
    var gravity: b2Vec2 = js.native
    
    /**
      * Linear drag co-efficient.
      * @default = 2
      **/
    /* CompleteClass */
    var linearDrag: Double = js.native
    
    /**
      * Body count.
      **/
    /* CompleteClass */
    var m_bodyCount: Double = js.native
    
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    
    /**
      * The outer surface normal.
      **/
    /* CompleteClass */
    var normal: b2Vec2 = js.native
    
    /**
      * The height of the fluid surface along the normal.
      * @default = 0
      **/
    /* CompleteClass */
    var offset: Double = js.native
    
    /**
      * If false, bodies are assumed to be uniformly dense, otherwise use the shapes densities.
      * @default = false.
      **/
    /* CompleteClass */
    var useDensity: Boolean = js.native
    
    /**
      * If true, gravity is taken from the world instead of the gravity parameter.
      * @default = true.
      **/
    /* CompleteClass */
    var useWorldGravity: Boolean = js.native
    
    /**
      * Fluid velocity, for drag calculations.
      **/
    /* CompleteClass */
    var velocity: b2Vec2 = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Controllers.b2ConstantAccelController")
  @js.native
  open class b2ConstantAccelController ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Controllers.b2ConstantAccelController {
    
    /**
      * The acceleration to apply.
      **/
    /* CompleteClass */
    var A: b2Vec2 = js.native
    
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
    override def Step(step: Any): Unit = js.native
    
    /**
      * Body count.
      **/
    /* CompleteClass */
    var m_bodyCount: Double = js.native
    
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Controllers.b2ConstantForceController")
  @js.native
  open class b2ConstantForceController ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Controllers.b2ConstantForceController {
    
    /**
      * The acceleration to apply.
      **/
    /* CompleteClass */
    var A: b2Vec2 = js.native
    
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
    override def Step(step: Any): Unit = js.native
    
    /**
      * Body count.
      **/
    /* CompleteClass */
    var m_bodyCount: Double = js.native
    
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Controllers.b2Controller")
  @js.native
  open class b2Controller ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Controllers.b2Controller {
    
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
    override def Step(step: Any): Unit = js.native
    
    /**
      * Body count.
      **/
    /* CompleteClass */
    var m_bodyCount: Double = js.native
    
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Controllers.b2ControllerEdge")
  @js.native
  open class b2ControllerEdge ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge {
    
    /**
      * Body.
      **/
    /* CompleteClass */
    var body: typings.box2d.Box2D.Dynamics.b2Body = js.native
    
    /**
      * Provides quick access to the other end of this edge.
      **/
    /* CompleteClass */
    var controller: typings.box2d.Box2D.Dynamics.Controllers.b2Controller = js.native
    
    /**
      * The next controller edge in the controller's body list.
      **/
    /* CompleteClass */
    var nextBody: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    
    /**
      * The next controller edge in the body's controller list.
      **/
    /* CompleteClass */
    var nextController: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    
    /**
      * The previous controller edge in the controller's body list.
      **/
    /* CompleteClass */
    var prevBody: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    
    /**
      * The previous controller edge in the body's controller list.
      **/
    /* CompleteClass */
    var prevController: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Controllers.b2GravityController")
  @js.native
  open class b2GravityController ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Controllers.b2GravityController {
    
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
      * Specifies the strength of the gravitation force.
      * @default = 1
      **/
    /* CompleteClass */
    var G: Double = js.native
    
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
    override def Step(step: Any): Unit = js.native
    
    /**
      * If true, gravity is proportional to r^-2, otherwise r^-1.
      **/
    /* CompleteClass */
    var invSqr: Boolean = js.native
    
    /**
      * Body count.
      **/
    /* CompleteClass */
    var m_bodyCount: Double = js.native
    
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
  }
  
  @JSGlobal("Box2D.Dynamics.Controllers.b2TensorDampingController")
  @js.native
  open class b2TensorDampingController ()
    extends StObject
       with typings.box2d.Box2D.Dynamics.Controllers.b2TensorDampingController {
    
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
    override def Step(step: Any): Unit = js.native
    
    /**
      * Tensor to use in damping model.
      **/
    /* CompleteClass */
    var T: b2Mat22 = js.native
    
    /**
      * Body count.
      **/
    /* CompleteClass */
    var m_bodyCount: Double = js.native
    
    /**
      * List of bodies.
      **/
    /* CompleteClass */
    var m_bodyList: typings.box2d.Box2D.Dynamics.Controllers.b2ControllerEdge = js.native
    
    /**
      * Set this to a positive number to clamp the maximum amount of damping done.
      * @default = 0
      **/
    /* CompleteClass */
    var maxTimeStep: Double = js.native
  }
}
