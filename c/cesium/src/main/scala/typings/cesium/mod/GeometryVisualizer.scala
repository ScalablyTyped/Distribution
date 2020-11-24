package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeometryVisualizer")
@js.native
class GeometryVisualizer protected () extends Visualizer {
  def this(scene: Scene, entityCollection: EntityCollection) = this()
  def this(scene: Scene, entityCollection: EntityCollection, primitives: PrimitiveCollection) = this()
  def this(
    scene: Scene,
    entityCollection: EntityCollection,
    primitives: js.UndefOr[scala.Nothing],
    groundPrimitives: PrimitiveCollection
  ) = this()
  def this(
    scene: Scene,
    entityCollection: EntityCollection,
    primitives: PrimitiveCollection,
    groundPrimitives: PrimitiveCollection
  ) = this()
}
