package typings.babylonjs

import typings.babylonjs.engineMod.Engine
import typings.babylonjs.typesMod.Nullable
import typings.std.Blob
import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoRecorderMod {
  
  @JSImport("babylonjs/Misc/videoRecorder", "VideoRecorder")
  @js.native
  class VideoRecorder protected () extends StObject {
    /**
      * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
      * @param engine Defines the BabylonJS Engine you wish to record.
      * @param options Defines options that can be used to customize the capture.
      */
    def this(engine: Engine) = this()
    def this(engine: Engine, options: Nullable[VideoRecorderOptions]) = this()
    
    var _canvas: js.Any = js.native
    
    var _fileName: js.Any = js.native
    
    var _handleDataAvailable: js.Any = js.native
    
    var _handleError: js.Any = js.native
    
    var _handleStop: js.Any = js.native
    
    var _mediaRecorder: js.Any = js.native
    
    val _options: js.Any = js.native
    
    var _recordedChunks: js.Any = js.native
    
    var _reject: js.Any = js.native
    
    var _resolve: js.Any = js.native
    
    /**
      * Releases internal resources used during the recording.
      */
    def dispose(): Unit = js.native
    
    /**
      * True when a recording is already in progress.
      */
    def isRecording: Boolean = js.native
    
    /**
      * Starts recording the canvas for a max duration specified in parameters.
      * @param fileName Defines the name of the file to be downloaded when the recording stop.
      * If null no automatic download will start and you can rely on the promise to get the data back.
      * @param maxDuration Defines the maximum recording time in seconds.
      * It defaults to 7 seconds. A value of zero will not stop automatically, you would need to call stopRecording manually.
      * @return A promise callback at the end of the recording with the video data in Blob.
      */
    def startRecording(): js.Promise[Blob] = js.native
    def startRecording(fileName: js.UndefOr[Nullable[String]], maxDuration: Double): js.Promise[Blob] = js.native
    def startRecording(fileName: Nullable[String]): js.Promise[Blob] = js.native
    
    /**
      * Stops the current recording before the default capture timeout passed in the startRecording function.
      */
    def stopRecording(): Unit = js.native
  }
  /* static members */
  object VideoRecorder {
    
    /**
      * Returns whether or not the VideoRecorder is available in your browser.
      * @param engine Defines the Babylon Engine.
      * @returns true if supported otherwise false.
      */
    @JSImport("babylonjs/Misc/videoRecorder", "VideoRecorder.IsSupported")
    @js.native
    def IsSupported(engine: Engine): Boolean = js.native
    
    @JSImport("babylonjs/Misc/videoRecorder", "VideoRecorder._defaultOptions")
    @js.native
    val _defaultOptions: js.Any = js.native
  }
  
  @js.native
  trait VideoRecorderOptions extends StObject {
    
    /** The audio tracks to attach to the recording. */
    var audioTracks: js.UndefOr[js.Array[MediaStreamTrack]] = js.native
    
    /** Defines the FPS the video should be recorded at. */
    var fps: Double = js.native
    
    /** Defines the mime type of the video. */
    var mimeType: String = js.native
    
    /** Defines the chunk size for the recording data. */
    var recordChunckSize: Double = js.native
  }
  object VideoRecorderOptions {
    
    @scala.inline
    def apply(fps: Double, mimeType: String, recordChunckSize: Double): VideoRecorderOptions = {
      val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], recordChunckSize = recordChunckSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoRecorderOptions]
    }
    
    @scala.inline
    implicit class VideoRecorderOptionsMutableBuilder[Self <: VideoRecorderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioTracks(value: js.Array[MediaStreamTrack]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioTracksUndefined: Self = StObject.set(x, "audioTracks", js.undefined)
      
      @scala.inline
      def setAudioTracksVarargs(value: MediaStreamTrack*): Self = StObject.set(x, "audioTracks", js.Array(value :_*))
      
      @scala.inline
      def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordChunckSize(value: Double): Self = StObject.set(x, "recordChunckSize", value.asInstanceOf[js.Any])
    }
  }
}
