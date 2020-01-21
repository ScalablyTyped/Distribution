package typings.chromeApps.chrome.tts

import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.female
import typings.chromeApps.chromeAppsStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeakOptions extends js.Object {
  /** The TTS event types that you are interested in listening to. If missing, all event types may be sent. */
  var desiredEventTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional.
    * If true, enqueues this utterance if TTS is already in progress. If false (the default), interrupts any current speech and flushes the speech queue before speaking this new utterance.
    */
  var enqueue: js.UndefOr[Boolean] = js.undefined
  /** The extension ID of the speech engine to use, if known. */
  var extensionId: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Deprecated since Chrome 70. Gender is deprecated and will be ignored.
    * @description Gender of voice for synthesized speech.
    */
  var gender: js.UndefOr[male | female] = js.undefined
  /** The language to be used for synthesis, in the form language-region. Examples: 'en', 'en-US', 'en-GB', 'zh-CN'. */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * This function is called with events that occur in the process of speaking the utterance.
    * @param event The update event from the text-to-speech engine indicating the status of this utterance.
    */
  var onEvent: js.UndefOr[js.Function1[/* event */ TtsEvent, Unit]] = js.undefined
  /**
    * Optional.
    * Speaking pitch between 0 and 2 inclusive, with 0 being lowest and 2 being highest. 1.0 corresponds to a voice's default pitch.
    */
  var pitch: js.UndefOr[integer] = js.undefined
  /**
    * Optional.
    * Speaking rate relative to the default rate for this voice. 1.0 is the default rate, normally around 180 to 220 words per minute. 2.0 is twice as fast, and 0.5 is half as fast. Values below 0.1 or above 10.0 are strictly disallowed, but many voices will constrain the minimum and maximum rates further—for example a particular voice may not actually speak faster than 3 times normal even if you specify a value larger than 3.0.
    */
  var rate: js.UndefOr[integer] = js.undefined
  /** The TTS event types the voice must support. */
  var requiredEventTypes: js.UndefOr[js.Array[String]] = js.undefined
  /** The name of the voice to use for synthesis. If empty, uses any available voice. */
  var voiceName: js.UndefOr[String] = js.undefined
  /** Speaking volume between 0 and 1 inclusive, with 0 being lowest and 1 being highest, with a default of 1.0. */
  var volume: js.UndefOr[integer] = js.undefined
}

object SpeakOptions {
  @scala.inline
  def apply(
    desiredEventTypes: js.Array[String] = null,
    enqueue: js.UndefOr[Boolean] = js.undefined,
    extensionId: String = null,
    gender: male | female = null,
    lang: String = null,
    onEvent: /* event */ TtsEvent => Unit = null,
    pitch: Int | Double = null,
    rate: Int | Double = null,
    requiredEventTypes: js.Array[String] = null,
    voiceName: String = null,
    volume: Int | Double = null
  ): SpeakOptions = {
    val __obj = js.Dynamic.literal()
    if (desiredEventTypes != null) __obj.updateDynamic("desiredEventTypes")(desiredEventTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(enqueue)) __obj.updateDynamic("enqueue")(enqueue.asInstanceOf[js.Any])
    if (extensionId != null) __obj.updateDynamic("extensionId")(extensionId.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction1(onEvent))
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (requiredEventTypes != null) __obj.updateDynamic("requiredEventTypes")(requiredEventTypes.asInstanceOf[js.Any])
    if (voiceName != null) __obj.updateDynamic("voiceName")(voiceName.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeakOptions]
  }
}

