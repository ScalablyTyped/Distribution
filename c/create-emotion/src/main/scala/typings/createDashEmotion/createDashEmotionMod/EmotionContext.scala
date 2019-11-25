package typings.createDashEmotion.createDashEmotionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionContext
  extends EmotionBaseContext
     with /* key */ StringDictionary[js.Any]

object EmotionContext {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, __SECRET_EMOTION__ : Emotion = null): EmotionContext = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__SECRET_EMOTION__ != null) __obj.updateDynamic("__SECRET_EMOTION__")(__SECRET_EMOTION__.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionContext]
  }
}

