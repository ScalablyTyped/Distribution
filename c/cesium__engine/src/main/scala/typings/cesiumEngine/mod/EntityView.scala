package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "EntityView")
@js.native
open class EntityView protected () extends StObject {
  def this(entity: Entity, scene: Scene) = this()
  def this(entity: Entity, scene: Scene, ellipsoid: Ellipsoid) = this()
  
  /**
    * The bounding sphere of the object.
    */
  var boundingSphere: BoundingSphere = js.native
  
  /**
    * The ellipsoid to use for orienting the camera.
    */
  var ellipsoid: Ellipsoid = js.native
  
  /**
    * The entity to track with the camera.
    */
  var entity: Entity = js.native
  
  /**
    * The scene in which to track the object.
    */
  var scene: Scene = js.native
  
  /**
    * Should be called each animation frame to update the camera
    * to the latest settings.
    * @param time - The current animation time.
    * @param [boundingSphere] - bounding sphere of the object.
    */
  def update(time: JulianDate): Unit = js.native
  def update(time: JulianDate, boundingSphere: BoundingSphere): Unit = js.native
}
/* static members */
object EntityView {
  
  @JSImport("@cesium/engine", "EntityView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets a camera offset that will be used to
    * initialize subsequent EntityViews.
    */
  @JSImport("@cesium/engine", "EntityView.defaultOffset3D")
  @js.native
  def defaultOffset3D: Cartesian3 = js.native
  inline def defaultOffset3D_=(x: Cartesian3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOffset3D")(x.asInstanceOf[js.Any])
}
