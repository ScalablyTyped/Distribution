package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PathGraphics")
@js.native
class PathGraphics () extends js.Object {
  def this(options: typings.cesium.anon.DistanceDisplayCondition) = this()
  val definitionChanged: Event[js.Array[_]] = js.native
  var distanceDisplayCondition: Property = js.native
  var leadTime: Property | Double = js.native
  var material: MaterialProperty = js.native
  var resolution: Property | Double = js.native
  var show: Property | Boolean = js.native
  var trailTime: Property | Double = js.native
  var width: Property | Double = js.native
  def clone(result: PathGraphics): PathGraphics = js.native
  def merge(source: PathGraphics): PathGraphics = js.native
}

