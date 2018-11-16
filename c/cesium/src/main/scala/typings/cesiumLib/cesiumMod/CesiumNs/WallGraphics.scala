package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WallGraphics extends js.Object {
  val definitionChanged: Event = js.native
  var fill: Property = js.native
  var granularity: Property = js.native
  var material: MaterialProperty = js.native
  var maximumHeights: Property = js.native
  var minimumHeights: Property = js.native
  var outline: Property = js.native
  var outlineColor: Property = js.native
  var outlineWidth: Property = js.native
  var positions: Property = js.native
  var show: Property = js.native
  def clone(result: WallGraphics): WallGraphics = js.native
  def merge(source: WallGraphics): WallGraphics = js.native
}

