package typings.cesium.mod

import typings.cesium.mod.KmlTourFlyTo.DoneCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "KmlTourFlyTo")
@js.native
open class KmlTourFlyTo protected () extends StObject {
  def this(duration: Double, flyToMode: String, view: KmlCamera) = this()
  def this(duration: Double, flyToMode: String, view: KmlLookAt) = this()
  
  /**
    * Returns options for {@link Camera#flyTo} or {@link Camera#flyToBoundingSphere}
    * depends on this.view type.
    * @param cameraOptions - options to merge with generated. See {@link Camera#flyTo}
    * @returns {@link Camera#flyTo} or {@link Camera#flyToBoundingSphere} options
    */
  def getCameraOptions(cameraOptions: Any): Any = js.native
  
  /**
    * Play this playlist entry
    * @param done - function which will be called when playback ends
    * @param camera - Cesium camera
    * @param [cameraOptions] - which will be merged with camera flyTo options. See {@link Camera#flyTo}
    */
  def play(done: DoneCallback, camera: Camera): Unit = js.native
  def play(done: DoneCallback, camera: Camera, cameraOptions: Any): Unit = js.native
  
  /**
    * Stop execution of curent entry. Cancel camera flyTo
    */
  def stop(): Unit = js.native
}
object KmlTourFlyTo {
  
  /**
    * A function that will be executed when the flight completes.
    * @param terminated - true if {@link KmlTourFlyTo#stop} was
    * called before entry done playback.
    */
  type DoneCallback = js.Function1[/* terminated */ Boolean, Unit]
}
