package typings.chrome.anon

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.ttsEngine.TtsEngineSpeakEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofttsEngine extends StObject {
  
  var onPause: Event[js.Function0[Unit]]
  
  var onResume: Event[js.Function0[Unit]]
  
  var onSpeak: TtsEngineSpeakEvent
  
  var onStop: Event[js.Function0[Unit]]
}
object TypeofttsEngine {
  
  inline def apply(
    onPause: Event[js.Function0[Unit]],
    onResume: Event[js.Function0[Unit]],
    onSpeak: TtsEngineSpeakEvent,
    onStop: Event[js.Function0[Unit]]
  ): TypeofttsEngine = {
    val __obj = js.Dynamic.literal(onPause = onPause.asInstanceOf[js.Any], onResume = onResume.asInstanceOf[js.Any], onSpeak = onSpeak.asInstanceOf[js.Any], onStop = onStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofttsEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofttsEngine] (val x: Self) extends AnyVal {
    
    inline def setOnPause(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnResume(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnSpeak(value: TtsEngineSpeakEvent): Self = StObject.set(x, "onSpeak", value.asInstanceOf[js.Any])
    
    inline def setOnStop(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
  }
}
