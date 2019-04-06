package typings
package createDashEmotionLib.createDashEmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionContext
  extends EmotionBaseContext
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object EmotionContext {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    __SECRET_EMOTION__ : Emotion = null
  ): EmotionContext = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (__SECRET_EMOTION__ != null) __obj.updateDynamic("__SECRET_EMOTION__")(__SECRET_EMOTION__)
    __obj.asInstanceOf[EmotionContext]
  }
}

