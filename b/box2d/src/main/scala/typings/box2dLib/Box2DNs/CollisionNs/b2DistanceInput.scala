package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DistanceInput")
@js.native
class b2DistanceInput () extends js.Object {
  /**
  		* Proxy A
  		**/
  var proxyA: b2DistanceProxy = js.native
  /**
  		* Proxy B
  		**/
  var proxyB: b2DistanceProxy = js.native
  /**
  		* Transform A
  		**/
  var transformA: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform = js.native
  /**
  		* Transform B
  		**/
  var transformB: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform = js.native
  /**
  		* Use shape radii in computation?
  		**/
  var useRadii: scala.Boolean = js.native
}

