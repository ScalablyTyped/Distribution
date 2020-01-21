package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "syncCaldavAccount")
@js.native
object syncCaldavAccount extends js.Object {
  def apply(account: Account, options: SyncCaldavAccountOptions): js.Promise[Account] = js.native
}

