package typings.babylonjs.miscIndexMod

import typings.babylonjs.anon.PartialVideoRecorderOptio
import typings.babylonjs.enginesEngineMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "VideoRecorder")
@js.native
open class VideoRecorder protected ()
  extends typings.babylonjs.miscVideoRecorderMod.VideoRecorder {
  /**
    * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
    * @param engine Defines the BabylonJS Engine you wish to record.
    * @param options Defines options that can be used to customize the capture.
    */
  def this(engine: Engine) = this()
  def this(engine: Engine, options: PartialVideoRecorderOptio) = this()
}
/* static members */
object VideoRecorder {
  
  @JSImport("babylonjs/Misc/index", "VideoRecorder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns whether or not the VideoRecorder is available in your browser.
    * @param engine Defines the Babylon Engine.
    * @returns true if supported otherwise false.
    */
  inline def IsSupported(engine: Engine): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSupported")(engine.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("babylonjs/Misc/index", "VideoRecorder._DefaultOptions")
  @js.native
  val _DefaultOptions: Any = js.native
}
