package typings
package createDashEmotionLib.createDashEmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionBaseContext extends js.Object {
  var __SECRET_EMOTION__ : js.UndefOr[Emotion] = js.undefined
}

object EmotionBaseContext {
  @scala.inline
  def apply(__SECRET_EMOTION__ : Emotion = null): EmotionBaseContext = {
    val __obj = js.Dynamic.literal()
    if (__SECRET_EMOTION__ != null) __obj.updateDynamic("__SECRET_EMOTION__")(__SECRET_EMOTION__)
    __obj.asInstanceOf[EmotionBaseContext]
  }
}

