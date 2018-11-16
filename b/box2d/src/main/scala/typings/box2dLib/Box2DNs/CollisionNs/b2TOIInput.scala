package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2TOIInput")
@js.native
class b2TOIInput () extends js.Object {
  /**
  		* Proxy A
  		**/
  var proxyA: b2DistanceProxy = js.native
  /**
  		* Proxy B
  		**/
  var proxyB: b2DistanceProxy = js.native
  /**
  		* Sweep A
  		**/
  var sweepA: box2dLib.Box2DNs.CommonNs.MathNs.b2Sweep = js.native
  /**
  		* Sweep B
  		**/
  var sweepB: box2dLib.Box2DNs.CommonNs.MathNs.b2Sweep = js.native
  /**
  		* Tolerance
  		**/
  var tolerance: scala.Double = js.native
}

