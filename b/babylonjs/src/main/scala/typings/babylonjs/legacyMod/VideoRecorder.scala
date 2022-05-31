package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.videoRecorderMod.VideoRecorderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends typings.babylonjs.indexMod.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: typings.babylonjs.engineMod.Engine) = this()
  def this(engine: typings.babylonjs.engineMod.Engine, options: Nullable[VideoRecorderOptions]) = this()
}
/* static members */
object VideoRecorder {
  
  @JSImport("babylonjs/Legacy/legacy", "VideoRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  inline def IsSupported(engine: typings.babylonjs.engineMod.Engine): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSupported")(engine.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("babylonjs/Legacy/legacy", "VideoRecorder._defaultOptions")
  @js.native
  val _defaultOptions: js.Any = js.native
}
