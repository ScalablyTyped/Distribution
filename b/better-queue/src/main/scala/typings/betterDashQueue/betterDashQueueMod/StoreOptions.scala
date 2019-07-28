package typings.betterDashQueue.betterDashQueueMod

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
  def apply(
    `type`: String,
    StringDictionary: // store-specific options
  /* key */ StringDictionary[js.Any] = null
  ): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StoreOptions]
  }
}

