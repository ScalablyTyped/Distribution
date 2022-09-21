package typings.blackEngine

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundEffectMod {
  
  @JSImport("black-engine/audio/SoundEffect", "SoundEffect")
  @js.native
  open class SoundEffect () extends StObject {
    
    def _inputNode: AudioNode = js.native
    
    def _outputNode: AudioNode = js.native
    
    /* protected */ var mInputNode: AudioNode = js.native
    
    /* protected */ var mOutputNode: AudioNode = js.native
  }
}
