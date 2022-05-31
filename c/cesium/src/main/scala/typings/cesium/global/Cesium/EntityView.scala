package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.EntityView")
@js.native
class EntityView protected ()
  extends typings.cesium.mod.EntityView {
  def this(entity: typings.cesium.mod.Entity, scene: typings.cesium.mod.Scene) = this()
  def this(
    entity: typings.cesium.mod.Entity,
    scene: typings.cesium.mod.Scene,
    ellipsoid: typings.cesium.mod.Ellipsoid
  ) = this()
  def this(
    entity: typings.cesium.mod.Entity,
    scene: typings.cesium.mod.Scene,
    ellipsoid: Unit,
    boundingSphere: typings.cesium.mod.BoundingSphere
  ) = this()
  def this(
    entity: typings.cesium.mod.Entity,
    scene: typings.cesium.mod.Scene,
    ellipsoid: typings.cesium.mod.Ellipsoid,
    boundingSphere: typings.cesium.mod.BoundingSphere
  ) = this()
}
object EntityView {
  
  @JSGlobal("Cesium.EntityView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.EntityView.defaultOffset3D")
  @js.native
  def defaultOffset3D: typings.cesium.mod.Cartesian3 = js.native
  inline def defaultOffset3D_=(x: typings.cesium.mod.Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOffset3D")(x.asInstanceOf[js.Any])
}
