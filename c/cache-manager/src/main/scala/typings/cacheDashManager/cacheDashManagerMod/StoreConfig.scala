package typings.cacheDashManager.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreConfig extends CachingConfig {
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var store: String
}

object StoreConfig {
  @scala.inline
  def apply(
    store: String,
    ttl: Double | TtlFunction,
    isCacheableValue: /* value */ js.Any => Boolean = null,
    max: Int | Double = null
  ): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store, ttl = ttl.asInstanceOf[js.Any])
    if (isCacheableValue != null) __obj.updateDynamic("isCacheableValue")(js.Any.fromFunction1(isCacheableValue))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig]
  }
}

