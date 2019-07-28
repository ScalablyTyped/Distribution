package typings.createDashEmotion.createDashEmotionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionCache extends js.Object {
  var inserted: StringDictionary[String]
  var key: String
  var nonce: js.UndefOr[String] = js.undefined
  var registered: StringDictionary[String]
}

object EmotionCache {
  @scala.inline
  def apply(
    inserted: StringDictionary[String],
    key: String,
    registered: StringDictionary[String],
    nonce: String = null
  ): EmotionCache = {
    val __obj = js.Dynamic.literal(inserted = inserted, key = key, registered = registered)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[EmotionCache]
  }
}

