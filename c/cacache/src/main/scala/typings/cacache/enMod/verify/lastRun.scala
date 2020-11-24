package typings.cacache.enMod.verify

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cacache/en", "verify.lastRun")
@js.native
object lastRun extends js.Object {
  
  /**
    * Returns a Date representing the last time `cacache.verify` was run on
    * `cache`.
    */
  def apply(cachePath: String): js.Promise[Date] = js.native
}
