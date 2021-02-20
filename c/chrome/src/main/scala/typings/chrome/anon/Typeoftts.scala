package typings.chrome.anon

import typings.chrome.chrome.tts.SpeakOptions
import typings.chrome.chrome.tts.TtsVoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftts extends StObject {
  
  def getVoices(): Unit = js.native
  def getVoices(callback: js.Function1[/* voices */ js.Array[TtsVoice], Unit]): Unit = js.native
  
  def isSpeaking(): Unit = js.native
  def isSpeaking(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = js.native
  
  def pause(): Unit = js.native
  
  def resume(): Unit = js.native
  
  def speak(utterance: String): Unit = js.native
  def speak(utterance: String, callback: js.Function): Unit = js.native
  def speak(utterance: String, options: SpeakOptions): Unit = js.native
  def speak(utterance: String, options: SpeakOptions, callback: js.Function): Unit = js.native
  
  def stop(): Unit = js.native
}
