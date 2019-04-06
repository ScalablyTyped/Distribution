package typings
package createDashEmotionLib.createDashEmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionCache extends js.Object {
  var inserted: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var key: java.lang.String
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var registered: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object EmotionCache {
  @scala.inline
  def apply(
    inserted: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    key: java.lang.String,
    registered: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    nonce: java.lang.String = null
  ): EmotionCache = {
    val __obj = js.Dynamic.literal(inserted = inserted, key = key, registered = registered)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[EmotionCache]
  }
}

