package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneTransforms {
  
  @JSImport("cesium", "SceneTransforms")
  @js.native
  val ^ : js.Any = js.native
  
  inline def wgs84ToDrawingBufferCoordinates(scene: Scene, position: Cartesian3): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToDrawingBufferCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  inline def wgs84ToDrawingBufferCoordinates(scene: Scene, position: Cartesian3, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToDrawingBufferCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  inline def wgs84ToWindowCoordinates(scene: Scene, position: Cartesian3): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToWindowCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  inline def wgs84ToWindowCoordinates(scene: Scene, position: Cartesian3, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToWindowCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
}
