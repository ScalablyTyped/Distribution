package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Width
import typings.babylonjs.anon.Y
import typings.std.AudioNode
import typings.std.Float32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analyser extends StObject {
  
  /**
    * Gets or sets the bar graph amplitude
    * @ignorenaming
    */
  var BARGRAPHAMPLITUDE: Double = js.native
  
  /**
    * Gets or sets the position of the debug canvas
    * @ignorenaming
    */
  var DEBUGCANVASPOS: Y = js.native
  
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  var DEBUGCANVASSIZE: Width = js.native
  
  /**
    * Gets or sets the FFT table size
    * @ignorenaming
    */
  var FFT_SIZE: Double = js.native
  
  /**
    * Gets or sets the smoothing
    * @ignorenaming
    */
  var SMOOTHING: Double = js.native
  
  var _audioEngine: js.Any = js.native
  
  var _byteFreqs: js.Any = js.native
  
  var _byteTime: js.Any = js.native
  
  var _debugCanvas: js.Any = js.native
  
  var _debugCanvasContext: js.Any = js.native
  
  var _floatFreqs: js.Any = js.native
  
  var _registerFunc: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _webAudioAnalyser: js.Any = js.native
  
  /**
    * Connects two audio nodes
    * @param inputAudioNode defines first node to connect
    * @param outputAudioNode defines second node to connect
    */
  def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit = js.native
  
  /**
    * Releases all associated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Renders the debug canvas
    */
  def drawDebugCanvas(): Unit = js.native
  
  /**
    * Gets the current frequency data as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Uint8Array
    */
  def getByteFrequencyData(): Uint8Array = js.native
  
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  def getByteTimeDomainData(): Uint8Array = js.native
  
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  def getFloatFrequencyData(): Float32Array = js.native
  
  /**
    * Get the number of data values you will have to play with for the visualization
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount
    * @returns a number
    */
  def getFrequencyBinCount(): Double = js.native
  
  /**
    * Stops rendering the debug canvas and removes it
    */
  def stopDebugCanvas(): Unit = js.native
}
object Analyser {
  
  @scala.inline
  def apply(
    BARGRAPHAMPLITUDE: Double,
    DEBUGCANVASPOS: Y,
    DEBUGCANVASSIZE: Width,
    FFT_SIZE: Double,
    SMOOTHING: Double,
    _audioEngine: js.Any,
    _byteFreqs: js.Any,
    _byteTime: js.Any,
    _debugCanvas: js.Any,
    _debugCanvasContext: js.Any,
    _floatFreqs: js.Any,
    _registerFunc: js.Any,
    _scene: js.Any,
    _webAudioAnalyser: js.Any,
    connectAudioNodes: (AudioNode, AudioNode) => Unit,
    dispose: () => Unit,
    drawDebugCanvas: () => Unit,
    getByteFrequencyData: () => Uint8Array,
    getByteTimeDomainData: () => Uint8Array,
    getFloatFrequencyData: () => Float32Array,
    getFrequencyBinCount: () => Double,
    stopDebugCanvas: () => Unit
  ): Analyser = {
    val __obj = js.Dynamic.literal(BARGRAPHAMPLITUDE = BARGRAPHAMPLITUDE.asInstanceOf[js.Any], DEBUGCANVASPOS = DEBUGCANVASPOS.asInstanceOf[js.Any], DEBUGCANVASSIZE = DEBUGCANVASSIZE.asInstanceOf[js.Any], FFT_SIZE = FFT_SIZE.asInstanceOf[js.Any], SMOOTHING = SMOOTHING.asInstanceOf[js.Any], _audioEngine = _audioEngine.asInstanceOf[js.Any], _byteFreqs = _byteFreqs.asInstanceOf[js.Any], _byteTime = _byteTime.asInstanceOf[js.Any], _debugCanvas = _debugCanvas.asInstanceOf[js.Any], _debugCanvasContext = _debugCanvasContext.asInstanceOf[js.Any], _floatFreqs = _floatFreqs.asInstanceOf[js.Any], _registerFunc = _registerFunc.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _webAudioAnalyser = _webAudioAnalyser.asInstanceOf[js.Any], connectAudioNodes = js.Any.fromFunction2(connectAudioNodes), dispose = js.Any.fromFunction0(dispose), drawDebugCanvas = js.Any.fromFunction0(drawDebugCanvas), getByteFrequencyData = js.Any.fromFunction0(getByteFrequencyData), getByteTimeDomainData = js.Any.fromFunction0(getByteTimeDomainData), getFloatFrequencyData = js.Any.fromFunction0(getFloatFrequencyData), getFrequencyBinCount = js.Any.fromFunction0(getFrequencyBinCount), stopDebugCanvas = js.Any.fromFunction0(stopDebugCanvas))
    __obj.asInstanceOf[Analyser]
  }
  
  @scala.inline
  implicit class AnalyserMutableBuilder[Self <: Analyser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBARGRAPHAMPLITUDE(value: Double): Self = StObject.set(x, "BARGRAPHAMPLITUDE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectAudioNodes(value: (AudioNode, AudioNode) => Unit): Self = StObject.set(x, "connectAudioNodes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDEBUGCANVASPOS(value: Y): Self = StObject.set(x, "DEBUGCANVASPOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEBUGCANVASSIZE(value: Width): Self = StObject.set(x, "DEBUGCANVASSIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawDebugCanvas(value: () => Unit): Self = StObject.set(x, "drawDebugCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFFT_SIZE(value: Double): Self = StObject.set(x, "FFT_SIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetByteFrequencyData(value: () => Uint8Array): Self = StObject.set(x, "getByteFrequencyData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetByteTimeDomainData(value: () => Uint8Array): Self = StObject.set(x, "getByteTimeDomainData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFloatFrequencyData(value: () => Float32Array): Self = StObject.set(x, "getFloatFrequencyData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFrequencyBinCount(value: () => Double): Self = StObject.set(x, "getFrequencyBinCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSMOOTHING(value: Double): Self = StObject.set(x, "SMOOTHING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopDebugCanvas(value: () => Unit): Self = StObject.set(x, "stopDebugCanvas", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_audioEngine(value: js.Any): Self = StObject.set(x, "_audioEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_byteFreqs(value: js.Any): Self = StObject.set(x, "_byteFreqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_byteTime(value: js.Any): Self = StObject.set(x, "_byteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_debugCanvas(value: js.Any): Self = StObject.set(x, "_debugCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_debugCanvasContext(value: js.Any): Self = StObject.set(x, "_debugCanvasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_floatFreqs(value: js.Any): Self = StObject.set(x, "_floatFreqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_registerFunc(value: js.Any): Self = StObject.set(x, "_registerFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scene(value: js.Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_webAudioAnalyser(value: js.Any): Self = StObject.set(x, "_webAudioAnalyser", value.asInstanceOf[js.Any])
  }
}
