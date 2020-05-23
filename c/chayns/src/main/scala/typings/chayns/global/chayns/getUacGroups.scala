package typings.chayns.global.chayns

import typings.chayns.UacGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.getUacGroups")
@js.native
object getUacGroups extends js.Object {
  def apply(siteId: Double): js.Promise[js.Array[UacGroup]] = js.native
  def apply(siteId: Double, updateCache: Boolean): js.Promise[js.Array[UacGroup]] = js.native
}

