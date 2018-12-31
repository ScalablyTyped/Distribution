package typings
package cacheDashManagerLib.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreConfig extends CachingConfig {
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, scala.Boolean]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var store: java.lang.String
}

