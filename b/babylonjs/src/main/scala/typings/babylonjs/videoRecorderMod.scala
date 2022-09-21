package typings.babylonjs

import typings.babylonjs.anon.PartialVideoRecorderOptio
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.typesMod.Nullable
import typings.std.Blob
import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoRecorderMod {
  
  @JSImport("babylonjs/Misc/videoRecorder", "VideoRecorder")
  @js.native
  open class VideoRecorder protected () extends StObject {
    /**
      * Create a new VideoCapture object which can help converting what you see in Babylon to a video file.
      * @param engine Defines the BabylonJS Engine you wish to record.
      * @param options Defines options that can be used to customize the capture.
      */
    def this(engine: Engine) = this()
    def this(engine: Engine, options: PartialVideoRecorderOptio) = this()
    
    /* private */ var _canvas: Any = js.native
    
    /* private */ var _fileName: Any = js.native
    
    /* private */ var _handleDataAvailable: Any = js.native
    
    /* private */ var _handleError: Any = js.native
    
    /* private */ var _handleStop: Any = js.native
    
    /* private */ var _mediaRecorder: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /* private */ var _recordedChunks: Any = js.native
    
    /* private */ var _reject: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
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
      * @returns A promise callback at the end of the recording with the video data in Blob.
      */
    def startRecording(): js.Promise[Blob] = js.native
    def startRecording(fileName: Unit, maxDuration: Double): js.Promise[Blob] = js.native
    def startRecording(fileName: Nullable[String]): js.Promise[Blob] = js.native
    def startRecording(fileName: Nullable[String], maxDuration: Double): js.Promise[Blob] = js.native
    
    /**
      * Stops the current recording before the default capture timeout passed in the startRecording function.
      */
    def stopRecording(): Unit = js.native
  }
  /* static members */
  object VideoRecorder {
    
    @JSImport("babylonjs/Misc/videoRecorder", "VideoRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns whether or not the VideoRecorder is available in your browser.
      * @param engine Defines the Babylon Engine.
      * @returns true if supported otherwise false.
      */
    inline def IsSupported(engine: Engine): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSupported")(engine.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("babylonjs/Misc/videoRecorder", "VideoRecorder._DefaultOptions")
    @js.native
    val _DefaultOptions: Any = js.native
  }
  
  trait VideoRecorderOptions extends StObject {
    
    /** The audio tracks to attach to the recording. */
    var audioTracks: js.UndefOr[js.Array[MediaStreamTrack]] = js.undefined
    
    /** Defines the FPS the video should be recorded at. */
    var fps: Double
    
    /** Defines the mime type of the video. */
    var mimeType: String
    
    /** Defines the chunk size for the recording data. */
    var recordChunckSize: Double
  }
  object VideoRecorderOptions {
    
    inline def apply(fps: Double, mimeType: String, recordChunckSize: Double): VideoRecorderOptions = {
      val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], recordChunckSize = recordChunckSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoRecorderOptions]
    }
    
    extension [Self <: VideoRecorderOptions](x: Self) {
      
      inline def setAudioTracks(value: js.Array[MediaStreamTrack]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
      
      inline def setAudioTracksUndefined: Self = StObject.set(x, "audioTracks", js.undefined)
      
      inline def setAudioTracksVarargs(value: MediaStreamTrack*): Self = StObject.set(x, "audioTracks", js.Array(value*))
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setRecordChunckSize(value: Double): Self = StObject.set(x, "recordChunckSize", value.asInstanceOf[js.Any])
    }
  }
}
