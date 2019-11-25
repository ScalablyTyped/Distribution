package typings.cacheDashManager.cacheDashManagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.cacheDashManager.Anon_Args
import typings.cacheDashManager.cacheDashManagerStrings.memory
import typings.cacheDashManager.cacheDashManagerStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreConfig
  extends CachingConfig
     with /**
  * You may pass in any other arguments these will be passed on to the `create` method of your store,
  * otherwise they will be ignored.
  */
/* key */ StringDictionary[js.Any] {
  var max: js.UndefOr[Double] = js.undefined
  var store: memory | none | Store | Anon_Args
}

object StoreConfig {
  @scala.inline
  def apply(
    store: memory | none | Store | Anon_Args,
    ttl: Double | TtlFunction,
    StringDictionary: /**
    * You may pass in any other arguments these will be passed on to the `create` method of your store,
    * otherwise they will be ignored.
    */
  /* key */ StringDictionary[js.Any] = null,
    max: Int | Double = null
  ): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig]
  }
}

