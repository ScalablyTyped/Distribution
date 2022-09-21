package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptProcessorNodeEventMap extends StObject {
  
  var audioprocess: AudioProcessingEvent
}
object ScriptProcessorNodeEventMap {
  
  inline def apply(audioprocess: AudioProcessingEvent): ScriptProcessorNodeEventMap = {
    val __obj = js.Dynamic.literal(audioprocess = audioprocess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptProcessorNodeEventMap]
  }
  
  extension [Self <: ScriptProcessorNodeEventMap](x: Self) {
    
    inline def setAudioprocess(value: AudioProcessingEvent): Self = StObject.set(x, "audioprocess", value.asInstanceOf[js.Any])
  }
}
