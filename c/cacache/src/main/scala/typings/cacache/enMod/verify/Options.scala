package typings.cacache.enMod.verify

import typings.cacache.cacacheBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Receives a formatted entry. Return false to remove it.
    * Note: might be called more than once on the same entry.
    */
  var filter: `false` | String
}

object Options {
  @scala.inline
  def apply(filter: `false` | String): Options = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

