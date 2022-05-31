package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneTransforms {
  
  @JSGlobal("Cesium.SceneTransforms")
  @js.native
  val ^ : js.Any = js.native
  
  inline def wgs84ToDrawingBufferCoordinates(scene: typings.cesium.mod.Scene, position: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToDrawingBufferCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def wgs84ToDrawingBufferCoordinates(
    scene: typings.cesium.mod.Scene,
    position: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToDrawingBufferCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  
  inline def wgs84ToWindowCoordinates(scene: typings.cesium.mod.Scene, position: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToWindowCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
  inline def wgs84ToWindowCoordinates(
    scene: typings.cesium.mod.Scene,
    position: typings.cesium.mod.Cartesian3,
    result: typings.cesium.mod.Cartesian2
  ): typings.cesium.mod.Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToWindowCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian2]
}
