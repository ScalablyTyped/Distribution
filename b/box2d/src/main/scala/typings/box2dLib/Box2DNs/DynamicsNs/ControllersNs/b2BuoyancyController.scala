package typings
package box2dLib.Box2DNs.DynamicsNs.ControllersNs

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
  var angularDrag: scala.Double = js.native
  /**
  		* The fluid density.
  		* @default = 0
  		**/
  var density: scala.Double = js.native
  /**
  		* Gravity vector, if the world's gravity is not used.
  		* @default = null
  		**/
  var gravity: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Linear drag co-efficient.
  		* @default = 2
  		**/
  var linearDrag: scala.Double = js.native
  /**
  		* The outer surface normal.
  		**/
  var normal: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* The height of the fluid surface along the normal.
  		* @default = 0
  		**/
  var offset: scala.Double = js.native
  /**
  		* If false, bodies are assumed to be uniformly dense, otherwise use the shapes densities.
  		* @default = false.
  		**/
  var useDensity: scala.Boolean = js.native
  /**
  		* If true, gravity is taken from the world instead of the gravity parameter.
  		* @default = true.
  		**/
  var useWorldGravity: scala.Boolean = js.native
  /**
  		* Fluid velocity, for drag calculations.
  		**/
  var velocity: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}

