package typings
package betterDashQueueLib.betterDashQueueMod.BetterQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions
  extends // store-specific options
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `type`: java.lang.String
}

object StoreOptions {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: // store-specific options
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[StoreOptions]
  }
}

