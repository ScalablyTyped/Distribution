package typings.cacheManager.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cacheManager.anon.Create
import typings.cacheManager.cacheManagerStrings.memory
import typings.cacheManager.cacheManagerStrings.none
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
  var store: memory | none | Store | Create
}

object StoreConfig {
  @scala.inline
  def apply(
    store: memory | none | Store | Create,
    ttl: Double | TtlFunction,
    StringDictionary: /**
    * You may pass in any other arguments these will be passed on to the `create` method of your store,
    * otherwise they will be ignored.
    */
  /* key */ StringDictionary[js.Any] = null,
    max: js.UndefOr[Double] = js.undefined
  ): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig]
  }
}

