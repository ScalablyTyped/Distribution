package typings
package cacheDashManagerLib.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachingConfig extends js.Object {
  var ttl: scala.Double | TtlFunction
}

object CachingConfig {
  @scala.inline
  def apply(ttl: scala.Double | TtlFunction): CachingConfig = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CachingConfig]
  }
}

