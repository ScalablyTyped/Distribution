package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import typings.box2d.Box2D.Dynamics.b2DebugDraw
import typings.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2BuoyancyController extends b2Controller {
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
}

