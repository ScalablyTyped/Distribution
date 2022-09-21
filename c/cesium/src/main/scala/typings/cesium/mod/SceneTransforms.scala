package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneTransforms {
  
  @JSImport("cesium", "SceneTransforms")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Transforms a position in WGS84 coordinates to drawing buffer coordinates.  This may produce different
    * results from SceneTransforms.wgs84ToWindowCoordinates when the browser zoom is not 100%, or on high-DPI displays.
    * @example
    * // Output the window position of longitude/latitude (0, 0) every time the mouse moves.
    * const scene = widget.scene;
    * const ellipsoid = scene.globe.ellipsoid;
    * const position = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
    * const handler = new Cesium.ScreenSpaceEventHandler(scene.canvas);
    * handler.setInputAction(function(movement) {
    *     console.log(Cesium.SceneTransforms.wgs84ToWindowCoordinates(scene, position));
    * }, Cesium.ScreenSpaceEventType.MOUSE_MOVE);
    * @param scene - The scene.
    * @param position - The position in WGS84 (world) coordinates.
    * @param [result] - An optional object to return the input position transformed to window coordinates.
    * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be <code>undefined</code> if the input position is near the center of the ellipsoid.
    */
  inline def wgs84ToDrawingBufferCoordinates(scene: Scene, position: Cartesian3): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToDrawingBufferCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  inline def wgs84ToDrawingBufferCoordinates(scene: Scene, position: Cartesian3, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToDrawingBufferCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  
  /**
    * Transforms a position in WGS84 coordinates to window coordinates.  This is commonly used to place an
    * HTML element at the same screen position as an object in the scene.
    * @example
    * // Output the window position of longitude/latitude (0, 0) every time the mouse moves.
    * const scene = widget.scene;
    * const ellipsoid = scene.globe.ellipsoid;
    * const position = Cesium.Cartesian3.fromDegrees(0.0, 0.0);
    * const handler = new Cesium.ScreenSpaceEventHandler(scene.canvas);
    * handler.setInputAction(function(movement) {
    *     console.log(Cesium.SceneTransforms.wgs84ToWindowCoordinates(scene, position));
    * }, Cesium.ScreenSpaceEventType.MOUSE_MOVE);
    * @param scene - The scene.
    * @param position - The position in WGS84 (world) coordinates.
    * @param [result] - An optional object to return the input position transformed to window coordinates.
    * @returns The modified result parameter or a new Cartesian2 instance if one was not provided.  This may be <code>undefined</code> if the input position is near the center of the ellipsoid.
    */
  inline def wgs84ToWindowCoordinates(scene: Scene, position: Cartesian3): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToWindowCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
  inline def wgs84ToWindowCoordinates(scene: Scene, position: Cartesian3, result: Cartesian2): Cartesian2 = (^.asInstanceOf[js.Dynamic].applyDynamic("wgs84ToWindowCoordinates")(scene.asInstanceOf[js.Any], position.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian2]
}
