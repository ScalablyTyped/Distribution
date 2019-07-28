package typings.box2d.Box2DNs.DynamicsNs.ControllersNs

import typings.box2d.Box2DNs.CommonNs.MathNs.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Controllers.b2BuoyancyController")
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

