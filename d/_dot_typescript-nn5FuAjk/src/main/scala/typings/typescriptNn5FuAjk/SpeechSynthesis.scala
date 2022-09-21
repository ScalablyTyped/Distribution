package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.voiceschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface is the controller interface for the speech service; this can be used to retrieve information about the synthesis voices available on the device, start and pause speech, and other commands besides. */
@js.native
trait SpeechSynthesis
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_voiceschanged(`type`: voiceschanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def cancel(): Unit = js.native
  
  def getVoices(): Array[SpeechSynthesisVoice] = js.native
  
  var onvoiceschanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  def pause(): Unit = js.native
  
  val paused: scala.Boolean = js.native
  
  val pending: scala.Boolean = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(`type`: voiceschanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_voiceschanged(
    `type`: voiceschanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  def resume(): Unit = js.native
  
  def speak(utterance: SpeechSynthesisUtterance): Unit = js.native
  
  val speaking: scala.Boolean = js.native
}
