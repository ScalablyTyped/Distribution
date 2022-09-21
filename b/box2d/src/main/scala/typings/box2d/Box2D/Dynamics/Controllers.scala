package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controllers {
  
  trait b2BuoyancyController
    extends StObject
       with b2Controller {
    
    /**
      * Linear drag co-efficient.
      * @default = 1
      **/
    var angularDrag: Double
    
    /**
      * The fluid density.
      * @default = 0
      **/
    var density: Double
    
    /**
      * Gravity vector, if the world's gravity is not used.
      * @default = null
      **/
    var gravity: b2Vec2
    
    /**
      * Linear drag co-efficient.
      * @default = 2
      **/
    var linearDrag: Double
    
    /**
      * The outer surface normal.
      **/
    var normal: b2Vec2
    
    /**
      * The height of the fluid surface along the normal.
      * @default = 0
      **/
    var offset: Double
    
    /**
      * If false, bodies are assumed to be uniformly dense, otherwise use the shapes densities.
      * @default = false.
      **/
    var useDensity: Boolean
    
    /**
      * If true, gravity is taken from the world instead of the gravity parameter.
      * @default = true.
      **/
    var useWorldGravity: Boolean
    
    /**
      * Fluid velocity, for drag calculations.
      **/
    var velocity: b2Vec2
  }
  object b2BuoyancyController {
    
    inline def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: Any => Unit,
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
    
    extension [Self <: b2BuoyancyController](x: Self) {
      
      inline def setAngularDrag(value: Double): Self = StObject.set(x, "angularDrag", value.asInstanceOf[js.Any])
      
      inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setGravity(value: b2Vec2): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setLinearDrag(value: Double): Self = StObject.set(x, "linearDrag", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: b2Vec2): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setUseDensity(value: Boolean): Self = StObject.set(x, "useDensity", value.asInstanceOf[js.Any])
      
      inline def setUseWorldGravity(value: Boolean): Self = StObject.set(x, "useWorldGravity", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: b2Vec2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  trait b2ConstantAccelController
    extends StObject
       with b2Controller {
    
    /**
      * The acceleration to apply.
      **/
    var A: b2Vec2
  }
  object b2ConstantAccelController {
    
    inline def apply(
      A: b2Vec2,
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: Any => Unit,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2ConstantAccelController = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ConstantAccelController]
    }
    
    extension [Self <: b2ConstantAccelController](x: Self) {
      
      inline def setA(value: b2Vec2): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
    }
  }
  
  trait b2ConstantForceController
    extends StObject
       with b2Controller {
    
    /**
      * The acceleration to apply.
      **/
    var A: b2Vec2
  }
  object b2ConstantForceController {
    
    inline def apply(
      A: b2Vec2,
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: Any => Unit,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2ConstantForceController = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ConstantForceController]
    }
    
    extension [Self <: b2ConstantForceController](x: Self) {
      
      inline def setA(value: b2Vec2): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
    }
  }
  
  trait b2Controller extends StObject {
    
    /**
      * Adds a body to the controller.
      * @param body Body to add.
      **/
    def AddBody(body: b2Body): Unit
    
    /**
      * Removes all bodies from the controller.
      **/
    def Clear(): Unit
    
    /**
      * Debug drawing.
      * @param debugDraw Handle to drawer.
      **/
    def Draw(debugDraw: b2DebugDraw): Unit
    
    /**
      * Gets the body list.
      * @return Body list.
      **/
    def GetBodyList(): b2ControllerEdge
    
    /**
      * Gets the next controller.
      * @return Next controller.
      **/
    def GetNext(): b2Controller
    
    /**
      * Gets the world.
      * @return World.
      **/
    def GetWorld(): b2World
    
    /**
      * Removes a body from the controller.
      * @param body Body to remove from this controller.
      **/
    def RemoveBody(body: b2Body): Unit
    
    /**
      * Step
      * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
      **/
    def Step(step: Any): Unit
    
    /**
      * Body count.
      **/
    var m_bodyCount: Double
    
    /**
      * List of bodies.
      **/
    var m_bodyList: b2ControllerEdge
  }
  object b2Controller {
    
    inline def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: Any => Unit,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2Controller = {
      val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2Controller]
    }
    
    extension [Self <: b2Controller](x: Self) {
      
      inline def setAddBody(value: b2Body => Unit): Self = StObject.set(x, "AddBody", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
      
      inline def setDraw(value: b2DebugDraw => Unit): Self = StObject.set(x, "Draw", js.Any.fromFunction1(value))
      
      inline def setGetBodyList(value: () => b2ControllerEdge): Self = StObject.set(x, "GetBodyList", js.Any.fromFunction0(value))
      
      inline def setGetNext(value: () => b2Controller): Self = StObject.set(x, "GetNext", js.Any.fromFunction0(value))
      
      inline def setGetWorld(value: () => b2World): Self = StObject.set(x, "GetWorld", js.Any.fromFunction0(value))
      
      inline def setM_bodyCount(value: Double): Self = StObject.set(x, "m_bodyCount", value.asInstanceOf[js.Any])
      
      inline def setM_bodyList(value: b2ControllerEdge): Self = StObject.set(x, "m_bodyList", value.asInstanceOf[js.Any])
      
      inline def setRemoveBody(value: b2Body => Unit): Self = StObject.set(x, "RemoveBody", js.Any.fromFunction1(value))
      
      inline def setStep(value: Any => Unit): Self = StObject.set(x, "Step", js.Any.fromFunction1(value))
    }
  }
  
  trait b2ControllerEdge extends StObject {
    
    /**
      * Body.
      **/
    var body: b2Body
    
    /**
      * Provides quick access to the other end of this edge.
      **/
    var controller: b2Controller
    
    /**
      * The next controller edge in the controller's body list.
      **/
    var nextBody: b2ControllerEdge
    
    /**
      * The next controller edge in the body's controller list.
      **/
    var nextController: b2ControllerEdge
    
    /**
      * The previous controller edge in the controller's body list.
      **/
    var prevBody: b2ControllerEdge
    
    /**
      * The previous controller edge in the body's controller list.
      **/
    var prevController: b2ControllerEdge
  }
  object b2ControllerEdge {
    
    inline def apply(
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
    
    extension [Self <: b2ControllerEdge](x: Self) {
      
      inline def setBody(value: b2Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setController(value: b2Controller): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setNextBody(value: b2ControllerEdge): Self = StObject.set(x, "nextBody", value.asInstanceOf[js.Any])
      
      inline def setNextController(value: b2ControllerEdge): Self = StObject.set(x, "nextController", value.asInstanceOf[js.Any])
      
      inline def setPrevBody(value: b2ControllerEdge): Self = StObject.set(x, "prevBody", value.asInstanceOf[js.Any])
      
      inline def setPrevController(value: b2ControllerEdge): Self = StObject.set(x, "prevController", value.asInstanceOf[js.Any])
    }
  }
  
  trait b2GravityController
    extends StObject
       with b2Controller {
    
    /**
      * Specifies the strength of the gravitation force.
      * @default = 1
      **/
    var G: Double
    
    /**
      * If true, gravity is proportional to r^-2, otherwise r^-1.
      **/
    var invSqr: Boolean
  }
  object b2GravityController {
    
    inline def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      G: Double,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      Step: Any => Unit,
      invSqr: Boolean,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge
    ): b2GravityController = {
      val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), G = G.asInstanceOf[js.Any], GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), invSqr = invSqr.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2GravityController]
    }
    
    extension [Self <: b2GravityController](x: Self) {
      
      inline def setG(value: Double): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
      
      inline def setInvSqr(value: Boolean): Self = StObject.set(x, "invSqr", value.asInstanceOf[js.Any])
    }
  }
  
  trait b2TensorDampingController
    extends StObject
       with b2Controller {
    
    /**
      * Helper function to set T in a common case.
      * @param xDamping x
      * @param yDamping y
      **/
    def SetAxisAligned(xDamping: Double, yDamping: Double): Unit
    
    /**
      * Tensor to use in damping model.
      **/
    var T: b2Mat22
    
    /**
      * Set this to a positive number to clamp the maximum amount of damping done.
      * @default = 0
      **/
    var maxTimeStep: Double
  }
  object b2TensorDampingController {
    
    inline def apply(
      AddBody: b2Body => Unit,
      Clear: () => Unit,
      Draw: b2DebugDraw => Unit,
      GetBodyList: () => b2ControllerEdge,
      GetNext: () => b2Controller,
      GetWorld: () => b2World,
      RemoveBody: b2Body => Unit,
      SetAxisAligned: (Double, Double) => Unit,
      Step: Any => Unit,
      T: b2Mat22,
      m_bodyCount: Double,
      m_bodyList: b2ControllerEdge,
      maxTimeStep: Double
    ): b2TensorDampingController = {
      val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), SetAxisAligned = js.Any.fromFunction2(SetAxisAligned), Step = js.Any.fromFunction1(Step), T = T.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any], maxTimeStep = maxTimeStep.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2TensorDampingController]
    }
    
    extension [Self <: b2TensorDampingController](x: Self) {
      
      inline def setMaxTimeStep(value: Double): Self = StObject.set(x, "maxTimeStep", value.asInstanceOf[js.Any])
      
      inline def setSetAxisAligned(value: (Double, Double) => Unit): Self = StObject.set(x, "SetAxisAligned", js.Any.fromFunction2(value))
      
      inline def setT(value: b2Mat22): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
}
