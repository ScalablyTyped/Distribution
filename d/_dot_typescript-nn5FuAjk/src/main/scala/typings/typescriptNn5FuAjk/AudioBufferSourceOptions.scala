package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioBufferSourceOptions extends StObject {
  
  var buffer: js.UndefOr[AudioBuffer | Null] = js.undefined
  
  var detune: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  
  var loopEnd: js.UndefOr[Double] = js.undefined
  
  var loopStart: js.UndefOr[Double] = js.undefined
  
  var playbackRate: js.UndefOr[Double] = js.undefined
}
object AudioBufferSourceOptions {
  
  inline def apply(): AudioBufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioBufferSourceOptions]
  }
  
  extension [Self <: AudioBufferSourceOptions](x: Self) {
    
    inline def setBuffer(value: AudioBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferNull: Self = StObject.set(x, "buffer", null)
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    inline def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    inline def setLoop(value: scala.Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopEnd(value: Double): Self = StObject.set(x, "loopEnd", value.asInstanceOf[js.Any])
    
    inline def setLoopEndUndefined: Self = StObject.set(x, "loopEnd", js.undefined)
    
    inline def setLoopStart(value: Double): Self = StObject.set(x, "loopStart", value.asInstanceOf[js.Any])
    
    inline def setLoopStartUndefined: Self = StObject.set(x, "loopStart", js.undefined)
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
  }
}
