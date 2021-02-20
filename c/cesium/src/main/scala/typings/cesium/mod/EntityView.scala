package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EntityView")
@js.native
class EntityView protected () extends StObject {
  def this(entity: Entity, scene: Scene) = this()
  def this(entity: Entity, scene: Scene, ellipsoid: Ellipsoid) = this()
  def this(entity: Entity, scene: Scene, ellipsoid: js.UndefOr[scala.Nothing], boundingSphere: BoundingSphere) = this()
  def this(entity: Entity, scene: Scene, ellipsoid: Ellipsoid, boundingSphere: BoundingSphere) = this()
  
  var boundingSphere: Entity = js.native
  
  var ellipsoid: Ellipsoid = js.native
  
  var entity: Entity = js.native
  
  var scene: Scene = js.native
  
  def update(time: JulianDate): Unit = js.native
}
object EntityView {
  
  @JSImport("cesium", "EntityView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "EntityView.defaultOffset3D")
  @js.native
  def defaultOffset3D: Cartesian3 = js.native
  @scala.inline
  def defaultOffset3D_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOffset3D")(x.asInstanceOf[js.Any])
}
