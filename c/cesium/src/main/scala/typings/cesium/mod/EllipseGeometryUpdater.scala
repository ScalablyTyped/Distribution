package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipseGeometryUpdater")
@js.native
class EllipseGeometryUpdater protected () extends GeometryUpdater {
  def this(entity: Entity, scene: Scene) = this()
  val onTerrain: Boolean = js.native
}

