package typings.babylonjs.BABYLON

import typings.std.AudioContext
import typings.std.AudioDestinationNode
import typings.std.MediaStreamAudioDestinationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAudioEngineOptions extends StObject {
  
  /**
    * Specifies an existing Audio Context for the audio engine
    */
  var audioContext: js.UndefOr[AudioContext] = js.undefined
  
  /**
    * Specifies a destination node for the audio engine
    */
  var audioDestination: js.UndefOr[AudioDestinationNode | MediaStreamAudioDestinationNode] = js.undefined
}
object IAudioEngineOptions {
  
  inline def apply(): IAudioEngineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAudioEngineOptions]
  }
  
  extension [Self <: IAudioEngineOptions](x: Self) {
    
    inline def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
    
    inline def setAudioContextUndefined: Self = StObject.set(x, "audioContext", js.undefined)
    
    inline def setAudioDestination(value: AudioDestinationNode | MediaStreamAudioDestinationNode): Self = StObject.set(x, "audioDestination", value.asInstanceOf[js.Any])
    
    inline def setAudioDestinationUndefined: Self = StObject.set(x, "audioDestination", js.undefined)
  }
}
