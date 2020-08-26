package typings.createEmotion.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmotionCache extends js.Object {
  var inserted: StringDictionary[String] = js.native
  var key: String = js.native
  var nonce: js.UndefOr[String] = js.native
  var registered: StringDictionary[String] = js.native
}

object EmotionCache {
  @scala.inline
  def apply(inserted: StringDictionary[String], key: String, registered: StringDictionary[String]): EmotionCache = {
    val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionCache]
  }
  @scala.inline
  implicit class EmotionCacheOps[Self <: EmotionCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInserted(value: StringDictionary[String]): Self = this.set("inserted", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistered(value: StringDictionary[String]): Self = this.set("registered", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
  
}

