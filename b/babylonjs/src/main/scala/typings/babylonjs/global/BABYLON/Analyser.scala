package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Width
import typings.babylonjs.anon.Y
import typings.std.AudioNode
import typings.std.Float32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Analyser")
@js.native
class Analyser protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Analyser {
  /**
    * Creates a new analyser
    * @param scene defines hosting scene
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  
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
  var DEBUGCANVASPOS: Y = js.native
  
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  /* CompleteClass */
  var DEBUGCANVASSIZE: Width = js.native
  
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
  var _audioEngine: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _byteFreqs: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _byteTime: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _debugCanvas: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _debugCanvasContext: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _floatFreqs: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _registerFunc: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _webAudioAnalyser: js.Any = js.native
  
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
  override def getByteFrequencyData(): Uint8Array = js.native
  
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  /* CompleteClass */
  override def getByteTimeDomainData(): Uint8Array = js.native
  
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  /* CompleteClass */
  override def getFloatFrequencyData(): Float32Array = js.native
  
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
