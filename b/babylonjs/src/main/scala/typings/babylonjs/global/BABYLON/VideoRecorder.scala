package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.VideoRecorderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends StObject
     with typings.babylonjs.BABYLON.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: typings.babylonjs.BABYLON.Engine) = this()
  def this(engine: typings.babylonjs.BABYLON.Engine, options: Nullable[VideoRecorderOptions]) = this()
}
/* static members */
object VideoRecorder {
  
  @JSGlobal("BABYLON.VideoRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  inline def IsSupported(engine: typings.babylonjs.BABYLON.Engine): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSupported")(engine.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSGlobal("BABYLON.VideoRecorder._defaultOptions")
  @js.native
  val _defaultOptions: js.Any = js.native
}
