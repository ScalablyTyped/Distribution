package typings.betterQueue.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions
  extends // store-specific options
/* key */ StringDictionary[js.Any] {
  var `type`: String
}

object StoreOptions {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StoreOptions]
  }
}

