package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Controllers")
@js.native
object Controllers extends js.Object {
  @js.native
  class b2BuoyancyController () extends b2Controller {
    /**
    		* Linear drag co-efficient.
    		* @default = 1
    		**/
    var angularDrag: Double = js.native
    /**
    		* The fluid density.
    		* @default = 0
    		**/
    var density: Double = js.native
    /**
    		* Gravity vector, if the world's gravity is not used.
    		* @default = null
    		**/
    var gravity: b2Vec2 = js.native
    /**
    		* Linear drag co-efficient.
    		* @default = 2
    		**/
    var linearDrag: Double = js.native
    /**
    		* The outer surface normal.
    		**/
    var normal: b2Vec2 = js.native
    /**
    		* The height of the fluid surface along the normal.
    		* @default = 0
    		**/
    var offset: Double = js.native
    /**
    		* If false, bodies are assumed to be uniformly dense, otherwise use the shapes densities.
    		* @default = false.
    		**/
    var useDensity: Boolean = js.native
    /**
    		* If true, gravity is taken from the world instead of the gravity parameter.
    		* @default = true.
    		**/
    var useWorldGravity: Boolean = js.native
    /**
    		* Fluid velocity, for drag calculations.
    		**/
    var velocity: b2Vec2 = js.native
  }
  
  @js.native
  class b2ConstantAccelController () extends b2Controller {
    /**
    		* The acceleration to apply.
    		**/
    var A: b2Vec2 = js.native
  }
  
  @js.native
  class b2ConstantForceController () extends b2Controller {
    /**
    		* The acceleration to apply.
    		**/
    var A: b2Vec2 = js.native
  }
  
  @js.native
  class b2Controller () extends js.Object {
    /**
    		* Body count.
    		**/
    var m_bodyCount: Double = js.native
    /**
    		* List of bodies.
    		**/
    var m_bodyList: b2ControllerEdge = js.native
    /**
    		* Adds a body to the controller.
    		* @param body Body to add.
    		**/
    def AddBody(body: b2Body): Unit = js.native
    /**
    		* Removes all bodies from the controller.
    		**/
    def Clear(): Unit = js.native
    /**
    		* Debug drawing.
    		* @param debugDraw Handle to drawer.
    		**/
    def Draw(debugDraw: b2DebugDraw): Unit = js.native
    /**
    		* Gets the body list.
    		* @return Body list.
    		**/
    def GetBodyList(): b2ControllerEdge = js.native
    /**
    		* Gets the next controller.
    		* @return Next controller.
    		**/
    def GetNext(): b2Controller = js.native
    /**
    		* Gets the world.
    		* @return World.
    		**/
    def GetWorld(): b2World = js.native
    /**
    		* Removes a body from the controller.
    		* @param body Body to remove from this controller.
    		**/
    def RemoveBody(body: b2Body): Unit = js.native
    /**
    		* Step
    		* @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
    		**/
    def Step(step: js.Any): Unit = js.native
  }
  
  @js.native
  class b2ControllerEdge () extends js.Object {
    /**
    		* Body.
    		**/
    var body: b2Body = js.native
    /**
    		* Provides quick access to the other end of this edge.
    		**/
    var controller: b2Controller = js.native
    /**
    		* The next controller edge in the controller's body list.
    		**/
    var nextBody: b2ControllerEdge = js.native
    /**
    		* The next controller edge in the body's controller list.
    		**/
    var nextController: b2ControllerEdge = js.native
    /**
    		* The previous controller edge in the controller's body list.
    		**/
    var prevBody: b2ControllerEdge = js.native
    /**
    		* The previous controller edge in the body's controller list.
    		**/
    var prevController: b2ControllerEdge = js.native
  }
  
  @js.native
  class b2GravityController () extends b2Controller {
    /**
    		* Specifies the strength of the gravitation force.
    		* @default = 1
    		**/
    var G: Double = js.native
    /**
    		* If true, gravity is proportional to r^-2, otherwise r^-1.
    		**/
    var invSqr: Boolean = js.native
  }
  
  @js.native
  class b2TensorDampingController () extends b2Controller {
    /**
    		* Tensor to use in damping model.
    		**/
    var T: b2Mat22 = js.native
    /**
    		* Set this to a positive number to clamp the maximum amount of damping done.
    		* @default = 0
    		**/
    var maxTimeStep: Double = js.native
    /**
    		* Helper function to set T in a common case.
    		* @param xDamping x
    		* @param yDamping y
    		**/
    def SetAxisAligned(xDamping: Double, yDamping: Double): Unit = js.native
  }
  
}

