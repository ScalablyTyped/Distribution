package typings.chrome.anon

import typings.chrome.chrome.events.Event
import typings.chrome.chrome.ttsEngine.TtsEngineSpeakEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofttsEngine extends StObject {
  
  var onPause: Event[js.Function0[Unit]] = js.native
  
  var onResume: Event[js.Function0[Unit]] = js.native
  
  var onSpeak: TtsEngineSpeakEvent = js.native
  
  var onStop: Event[js.Function0[Unit]] = js.native
}
object TypeofttsEngine {
  
  @scala.inline
  def apply(
    onPause: Event[js.Function0[Unit]],
    onResume: Event[js.Function0[Unit]],
    onSpeak: TtsEngineSpeakEvent,
    onStop: Event[js.Function0[Unit]]
  ): TypeofttsEngine = {
    val __obj = js.Dynamic.literal(onPause = onPause.asInstanceOf[js.Any], onResume = onResume.asInstanceOf[js.Any], onSpeak = onSpeak.asInstanceOf[js.Any], onStop = onStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofttsEngine]
  }
  
  @scala.inline
  implicit class TypeofttsEngineMutableBuilder[Self <: TypeofttsEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPause(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResume(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSpeak(value: TtsEngineSpeakEvent): Self = StObject.set(x, "onSpeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStop(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
  }
}
