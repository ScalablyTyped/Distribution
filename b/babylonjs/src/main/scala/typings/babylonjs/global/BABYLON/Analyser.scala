package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Height
import typings.babylonjs.anon.X
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Analyser")
@js.native
/**
  * Creates a new analyser
  * @param scene defines hosting scene
  */
open class Analyser ()
  extends StObject
     with typings.babylonjs.BABYLON.Analyser {
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  
  /**
    * Gets or sets the bar graph amplitude
    * @ignorenaming
    */
  /* CompleteClass */
  var BARGRAPHAMPLITUDE: Double = js.native
  
  /**
    * Gets or sets the position of the debug canvas
    * @ignorenaming
    */
  /* CompleteClass */
  var DEBUGCANVASPOS: X = js.native
  
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  /* CompleteClass */
  var DEBUGCANVASSIZE: Height = js.native
  
  /**
    * Gets or sets the FFT table size
    * @ignorenaming
    */
  /* CompleteClass */
  var FFT_SIZE: Double = js.native
  
  /**
    * Gets or sets the smoothing
    * @ignorenaming
    */
  /* CompleteClass */
  var SMOOTHING: Double = js.native
  
  /* private */ /* CompleteClass */
  var _audioEngine: Any = js.native
  
  /* private */ /* CompleteClass */
  var _byteFreqs: Any = js.native
  
  /* private */ /* CompleteClass */
  var _byteTime: Any = js.native
  
  /* private */ /* CompleteClass */
  var _debugCanvas: Any = js.native
  
  /* private */ /* CompleteClass */
  var _debugCanvasContext: Any = js.native
  
  /* private */ /* CompleteClass */
  var _floatFreqs: Any = js.native
  
  /* private */ /* CompleteClass */
  var _registerFunc: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: Any = js.native
  
  /* private */ /* CompleteClass */
  var _webAudioAnalyser: Any = js.native
  
  /**
    * Connects two audio nodes
    * @param inputAudioNode defines first node to connect
    * @param outputAudioNode defines second node to connect
    */
  /* CompleteClass */
  override def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit = js.native
  
  /**
    * Releases all associated resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Renders the debug canvas
    */
  /* CompleteClass */
  override def drawDebugCanvas(): Unit = js.native
  
  /**
    * Gets the current frequency data as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Uint8Array
    */
  /* CompleteClass */
  override def getByteFrequencyData(): js.typedarray.Uint8Array = js.native
  
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  /* CompleteClass */
  override def getByteTimeDomainData(): js.typedarray.Uint8Array = js.native
  
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  /* CompleteClass */
  override def getFloatFrequencyData(): js.typedarray.Float32Array = js.native
  
  /**
    * Get the number of data values you will have to play with for the visualization
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount
    * @returns a number
    */
  /* CompleteClass */
  override def getFrequencyBinCount(): Double = js.native
  
  /**
    * Stops rendering the debug canvas and removes it
    */
  /* CompleteClass */
  override def stopDebugCanvas(): Unit = js.native
}
