package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controllers {
  
  @js.native
  trait b2BuoyancyController extends b2Controller {
    
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
  object b2BuoyancyController {
    
    @scala.inline
    def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: js.Any => Unit,
      angularDrag: Double,
      density: Double,
      gravity: b2Vec2,
      linearDrag: Double,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge,
      normal: b2Vec2,
      offset: Double,
      useDensity: Boolean,
      useWorldGravity: Boolean,
      velocity: b2Vec2
    ): b2BuoyancyController = {
      val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), angularDrag = angularDrag.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], linearDrag = linearDrag.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], useDensity = useDensity.asInstanceOf[js.Any], useWorldGravity = useWorldGravity.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2BuoyancyController]
    }
    
    @scala.inline
    implicit class b2BuoyancyControllerMutableBuilder[Self <: b2BuoyancyController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngularDrag(value: Double): Self = StObject.set(x, "angularDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravity(value: b2Vec2): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinearDrag(value: Double): Self = StObject.set(x, "linearDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormal(value: b2Vec2): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDensity(value: Boolean): Self = StObject.set(x, "useDensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWorldGravity(value: Boolean): Self = StObject.set(x, "useWorldGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocity(value: b2Vec2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait b2ConstantAccelController extends b2Controller {
    
    /**
      * The acceleration to apply.
      **/
    var A: b2Vec2 = js.native
  }
  object b2ConstantAccelController {
    
    @scala.inline
    def apply(
      A: b2Vec2,
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: js.Any => Unit,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2ConstantAccelController = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ConstantAccelController]
    }
    
    @scala.inline
    implicit class b2ConstantAccelControllerMutableBuilder[Self <: b2ConstantAccelController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: b2Vec2): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait b2ConstantForceController extends b2Controller {
    
    /**
      * The acceleration to apply.
      **/
    var A: b2Vec2 = js.native
  }
  object b2ConstantForceController {
    
    @scala.inline
    def apply(
      A: b2Vec2,
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: js.Any => Unit,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2ConstantForceController = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ConstantForceController]
    }
    
    @scala.inline
    implicit class b2ConstantForceControllerMutableBuilder[Self <: b2ConstantForceController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: b2Vec2): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait b2Controller extends StObject {
    
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
    
    /**
      * Body count.
      **/
    var m_bodyCount: Double = js.native
    
    /**
      * List of bodies.
      **/
    var m_bodyList: b2ControllerEdge = js.native
  }
  object b2Controller {
    
    @scala.inline
    def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: js.Any => Unit,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2Controller = {
      val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2Controller]
    }
    
    @scala.inline
    implicit class b2ControllerMutableBuilder[Self <: b2Controller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBody(value: b2Body => Unit): Self = StObject.set(x, "AddBody", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDraw(value: b2DebugDraw => Unit): Self = StObject.set(x, "Draw", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBodyList(value: () => b2ControllerEdge): Self = StObject.set(x, "GetBodyList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNext(value: () => b2Controller): Self = StObject.set(x, "GetNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWorld(value: () => b2World): Self = StObject.set(x, "GetWorld", js.Any.fromFunction0(value))
      
      @scala.inline
      def setM_bodyCount(value: Double): Self = StObject.set(x, "m_bodyCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM_bodyList(value: b2ControllerEdge): Self = StObject.set(x, "m_bodyList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveBody(value: b2Body => Unit): Self = StObject.set(x, "RemoveBody", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStep(value: js.Any => Unit): Self = StObject.set(x, "Step", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait b2ControllerEdge extends StObject {
    
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
  object b2ControllerEdge {
    
    @scala.inline
    def apply(
      body: b2Body,
      controller: b2Controller,
      nextBody: b2ControllerEdge,
      nextController: b2ControllerEdge,
      prevBody: b2ControllerEdge,
      prevController: b2ControllerEdge
    ): b2ControllerEdge = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], nextBody = nextBody.asInstanceOf[js.Any], nextController = nextController.asInstanceOf[js.Any], prevBody = prevBody.asInstanceOf[js.Any], prevController = prevController.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ControllerEdge]
    }
    
    @scala.inline
    implicit class b2ControllerEdgeMutableBuilder[Self <: b2ControllerEdge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: b2Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setController(value: b2Controller): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextBody(value: b2ControllerEdge): Self = StObject.set(x, "nextBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextController(value: b2ControllerEdge): Self = StObject.set(x, "nextController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevBody(value: b2ControllerEdge): Self = StObject.set(x, "prevBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevController(value: b2ControllerEdge): Self = StObject.set(x, "prevController", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait b2GravityController extends b2Controller {
    
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
  object b2GravityController {
    
    @scala.inline
    def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      G: Double,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: js.Any => Unit,
      invSqr: Boolean,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2GravityController = {
      val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), G = G.asInstanceOf[js.Any], GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), invSqr = invSqr.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2GravityController]
    }
    
    @scala.inline
    implicit class b2GravityControllerMutableBuilder[Self <: b2GravityController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvSqr(value: Boolean): Self = StObject.set(x, "invSqr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait b2TensorDampingController extends b2Controller {
    
    /**
      * Helper function to set T in a common case.
      * @param xDamping x
      * @param yDamping y
      **/
    def SetAxisAligned(xDamping: Double, yDamping: Double): Unit = js.native
    
    /**
      * Tensor to use in damping model.
      **/
    var T: b2Mat22 = js.native
    
    /**
      * Set this to a positive number to clamp the maximum amount of damping done.
      * @default = 0
      **/
    var maxTimeStep: Double = js.native
  }
  object b2TensorDampingController {
    
    @scala.inline
    def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      SetAxisAligned: (Double, Double) => Unit,
      Step: js.Any => Unit,
      T: b2Mat22,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge,
      maxTimeStep: Double
    ): b2TensorDampingController = {
      val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), SetAxisAligned = js.Any.fromFunction2(SetAxisAligned), Step = js.Any.fromFunction1(Step), T = T.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any], maxTimeStep = maxTimeStep.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2TensorDampingController]
    }
    
    @scala.inline
    implicit class b2TensorDampingControllerMutableBuilder[Self <: b2TensorDampingController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxTimeStep(value: Double): Self = StObject.set(x, "maxTimeStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAxisAligned(value: (Double, Double) => Unit): Self = StObject.set(x, "SetAxisAligned", js.Any.fromFunction2(value))
      
      @scala.inline
      def setT(value: b2Mat22): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
}
