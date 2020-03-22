package typings.cesium.mod

import typings.cesium.AnonShow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "WallGraphics")
@js.native
class WallGraphics () extends js.Object {
  def this(options: AnonShow) = this()
  val definitionChanged: Event[js.Array[_]] = js.native
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

