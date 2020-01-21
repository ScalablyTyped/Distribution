package typings.createEmotion.mod

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
    val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionCache]
  }
}

