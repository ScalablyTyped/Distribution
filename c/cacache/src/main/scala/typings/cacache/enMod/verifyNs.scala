package typings.cacache.enMod

import typings.cacache.cacacheNumbers.`false`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "verify")
@js.native
object verifyNs extends js.Object {
  trait Options extends js.Object {
    /**
      * Receives a formatted entry. Return false to remove it.
      * Note: might be called more than once on the same entry.
      */
    var filter: `false` | String
  }
  
  /**
    * Returns a Date representing the last time `cacache.verify` was run on
    * `cache`.
    */
  def lastRun(cachePath: String): js.Promise[Date] = js.native
}

