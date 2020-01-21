package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.undefined
  /**
    * Promise library to replace global.Promise
    */
  var promiseDependency: js.UndefOr[js.Any] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(isCacheableValue: /* value */ js.Any => Boolean = null, promiseDependency: js.Any = null): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (isCacheableValue != null) __obj.updateDynamic("isCacheableValue")(js.Any.fromFunction1(isCacheableValue))
    if (promiseDependency != null) __obj.updateDynamic("promiseDependency")(promiseDependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
}

