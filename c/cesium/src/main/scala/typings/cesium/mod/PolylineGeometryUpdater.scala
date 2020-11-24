package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineGeometryUpdater")
@js.native
class PolylineGeometryUpdater protected () extends GeometryUpdater {
  def this(entity: Entity, scene: Scene) = this()
  
  val depthFailMaterialProperty: MaterialProperty = js.native
  
  val distanceDisplayConditionProperty: Property = js.native
}
