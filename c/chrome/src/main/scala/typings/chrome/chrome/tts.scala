package typings.chrome.chrome

import typings.chrome.chromeStrings.cancelled
import typings.chrome.chromeStrings.end
import typings.chrome.chromeStrings.error
import typings.chrome.chromeStrings.interrupted
import typings.chrome.chromeStrings.marker
import typings.chrome.chromeStrings.pause
import typings.chrome.chromeStrings.resume
import typings.chrome.chromeStrings.sentence
import typings.chrome.chromeStrings.start
import typings.chrome.chromeStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Text to Speech
////////////////////
/**
  * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
  * Permissions:  "tts"
  * @since Chrome 14.
  */
object tts {
  
  trait SpeakOptions extends StObject {
    
    /** Optional. The TTS event types that you are interested in listening to. If missing, all event types may be sent. */
    var desiredEventTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * If true, enqueues this utterance if TTS is already in progress. If false (the default), interrupts any current speech and flushes the speech queue before speaking this new utterance.
      */
    var enqueue: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The extension ID of the speech engine to use, if known. */
    var extensionId: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Gender of voice for synthesized speech.
      * One of: "male", or "female"
      */
    var gender: js.UndefOr[String] = js.undefined
    
    /** Optional. The language to be used for synthesis, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. This function is called with events that occur in the process of speaking the utterance.
      * @param event The update event from the text-to-speech engine indicating the status of this utterance.
      */
    var onEvent: js.UndefOr[js.Function1[/* event */ TtsEvent, Unit]] = js.undefined
    
    /**
      * Optional.
      * Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0 corresponds to a voice's default pitch.
      */
    var pitch: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional.
      * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. Values below 0.1 or above 10.0 are strictly disallowed, but many voices will constrain the minimum and maximum rates further—for example a particular voice may not actually speak faster than 3 times normal even if you specify a value larger than 3.0.
      */
    var rate: js.UndefOr[Double] = js.undefined
    
    /** Optional. The TTS event types the voice must support. */
    var requiredEventTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. The name of the voice to use for synthesis. If empty, uses any available voice. */
    var voiceName: js.UndefOr[String] = js.undefined
    
    /** Optional. Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a default of 1.0. */
    var volume: js.UndefOr[Double] = js.undefined
  }
  object SpeakOptions {
    
    inline def apply(): SpeakOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpeakOptions]
    }
    
    extension [Self <: SpeakOptions](x: Self) {
      
      inline def setDesiredEventTypes(value: js.Array[String]): Self = StObject.set(x, "desiredEventTypes", value.asInstanceOf[js.Any])
      
      inline def setDesiredEventTypesUndefined: Self = StObject.set(x, "desiredEventTypes", js.undefined)
      
      inline def setDesiredEventTypesVarargs(value: String*): Self = StObject.set(x, "desiredEventTypes", js.Array(value*))
      
      inline def setEnqueue(value: Boolean): Self = StObject.set(x, "enqueue", value.asInstanceOf[js.Any])
      
      inline def setEnqueueUndefined: Self = StObject.set(x, "enqueue", js.undefined)
      
      inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setOnEvent(value: /* event */ TtsEvent => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction1(value))
      
      inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setRequiredEventTypes(value: js.Array[String]): Self = StObject.set(x, "requiredEventTypes", value.asInstanceOf[js.Any])
      
      inline def setRequiredEventTypesUndefined: Self = StObject.set(x, "requiredEventTypes", js.undefined)
      
      inline def setRequiredEventTypesVarargs(value: String*): Self = StObject.set(x, "requiredEventTypes", js.Array(value*))
      
      inline def setVoiceName(value: String): Self = StObject.set(x, "voiceName", value.asInstanceOf[js.Any])
      
      inline def setVoiceNameUndefined: Self = StObject.set(x, "voiceName", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  trait TtsEvent extends StObject {
    
    /** Optional. The index of the current character in the utterance. */
    var charIndex: js.UndefOr[Double] = js.undefined
    
    /** Optional. The error description, if the event type is 'error'. */
    var errorMessage: js.UndefOr[String] = js.undefined
    
    /**
      * The length of the next part of the utterance.
      * For example, in a word event, this is the length of the word which will be spoken next.
      * It will be set to -1 if not set by the speech engine.
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * The type can be 'start' as soon as speech has started, 'word' when a word boundary is reached, 'sentence' when a sentence boundary is reached, 'marker' when an SSML mark element is reached, 'end' when the end of the utterance is reached, 'interrupted' when the utterance is stopped or interrupted before reaching the end, 'cancelled' when it's removed from the queue before ever being synthesized, or 'error' when any other error occurs. When pausing speech, a 'pause' event is fired if a particular utterance is paused in the middle, and 'resume' if an utterance resumes speech. Note that pause and resume events may not fire if speech is paused in-between utterances.
      * One of: "start", "end", "word", "sentence", "marker", "interrupted", "cancelled", "error", "pause", or "resume"
      */
    var `type`: start | end | word | sentence | marker | interrupted | cancelled | error | pause | resume
  }
  object TtsEvent {
    
    inline def apply(`type`: start | end | word | sentence | marker | interrupted | cancelled | error | pause | resume): TtsEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TtsEvent]
    }
    
    extension [Self <: TtsEvent](x: Self) {
      
      inline def setCharIndex(value: Double): Self = StObject.set(x, "charIndex", value.asInstanceOf[js.Any])
      
      inline def setCharIndexUndefined: Self = StObject.set(x, "charIndex", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setType(value: start | end | word | sentence | marker | interrupted | cancelled | error | pause | resume): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TtsVoice extends StObject {
    
    /** Optional. All of the callback event types that this voice is capable of sending. */
    var eventTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Optional. The ID of the extension providing this voice. */
    var extensionId: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. This voice's gender.
      * One of: "male", or "female"
      * @deprecated since Chrome 70. Gender is deprecated and will be ignored.
      */
    var gender: js.UndefOr[String] = js.undefined
    
    /** Optional. The language that this voice supports, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
    var lang: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. If true, the synthesis engine is a remote network resource. It may be higher latency and may incur bandwidth costs.
      * @since Chrome 33.
      */
    var remote: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. The name of the voice. */
    var voiceName: js.UndefOr[String] = js.undefined
  }
  object TtsVoice {
    
    inline def apply(): TtsVoice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TtsVoice]
    }
    
    extension [Self <: TtsVoice](x: Self) {
      
      inline def setEventTypes(value: js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
      
      inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
      
      inline def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value*))
      
      inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
      
      inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
      
      inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setRemote(value: Boolean): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      inline def setVoiceName(value: String): Self = StObject.set(x, "voiceName", value.asInstanceOf[js.Any])
      
      inline def setVoiceNameUndefined: Self = StObject.set(x, "voiceName", js.undefined)
    }
  }
}
