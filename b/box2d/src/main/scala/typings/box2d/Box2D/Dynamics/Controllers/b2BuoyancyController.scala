package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import typings.box2d.Box2D.Dynamics.b2DebugDraw
import typings.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class b2BuoyancyControllerOps[Self <: b2BuoyancyController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngularDrag(value: Double): Self = this.set("angularDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravity(value: b2Vec2): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearDrag(value: Double): Self = this.set("linearDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: b2Vec2): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDensity(value: Boolean): Self = this.set("useDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWorldGravity(value: Boolean): Self = this.set("useWorldGravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: b2Vec2): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
}
