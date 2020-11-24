package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Ray")
@js.native
class Ray () extends js.Object {
  def this(origin: Cartesian3) = this()
  def this(origin: js.UndefOr[scala.Nothing], direction: Cartesian3) = this()
  def this(origin: Cartesian3, direction: Cartesian3) = this()
  
  var direction: Cartesian3 = js.native
  
  var origin: Cartesian3 = js.native
}
/* static members */
@JSImport("cesium", "Ray")
@js.native
object Ray extends js.Object {
  
  def getPoint(ray: Ray, t: Double): Cartesian3 = js.native
  def getPoint(ray: Ray, t: Double, result: Cartesian3): Cartesian3 = js.native
}
