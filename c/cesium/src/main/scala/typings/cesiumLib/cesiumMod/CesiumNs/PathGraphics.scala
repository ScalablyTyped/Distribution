package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathGraphics extends js.Object {
  val definitionChanged: Event = js.native
  var distanceDisplayCondition: Property = js.native
  var leadTime: Property | scala.Double = js.native
  var material: MaterialProperty = js.native
  var resolution: Property | scala.Double = js.native
  var show: Property | scala.Boolean = js.native
  var trailTime: Property | scala.Double = js.native
  var width: Property | scala.Double = js.native
  def clone(result: PathGraphics): PathGraphics = js.native
  def merge(source: PathGraphics): PathGraphics = js.native
}

