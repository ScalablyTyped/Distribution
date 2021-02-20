package typings.babylonjs.miscIndexMod

import typings.babylonjs.engineMod.Engine
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.videoRecorderMod.VideoRecorderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "VideoRecorder")
@js.native
class VideoRecorder protected ()
  extends typings.babylonjs.videoRecorderMod.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: Engine) = this()
  def this(engine: Engine, options: Nullable[VideoRecorderOptions]) = this()
}
/* static members */
object VideoRecorder {
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  @JSImport("babylonjs/Misc/index", "VideoRecorder.IsSupported")
  @js.native
  def IsSupported(engine: Engine): Boolean = js.native
  
  @JSImport("babylonjs/Misc/index", "VideoRecorder._defaultOptions")
  @js.native
  val _defaultOptions: js.Any = js.native
}
