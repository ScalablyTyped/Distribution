package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Sweep
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
  var sweepA: b2Sweep = js.native
  /**
  		* Sweep B
  		**/
  var sweepB: b2Sweep = js.native
  /**
  		* Tolerance
  		**/
  var tolerance: Double = js.native
}

