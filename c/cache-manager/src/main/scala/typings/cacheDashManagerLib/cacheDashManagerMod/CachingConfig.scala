package typings
package cacheDashManagerLib.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachingConfig extends js.Object {
  var ttl: scala.Double
}

object CachingConfig {
  @scala.inline
  def apply(ttl: scala.Double): CachingConfig = {
    val __obj = js.Dynamic.literal(ttl = ttl)
  
    __obj.asInstanceOf[CachingConfig]
  }
}

