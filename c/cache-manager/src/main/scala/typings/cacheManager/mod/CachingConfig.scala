package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachingConfig extends js.Object {
  var ttl: Double | TtlFunction
}

object CachingConfig {
  @scala.inline
  def apply(ttl: Double | TtlFunction): CachingConfig = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CachingConfig]
  }
}

