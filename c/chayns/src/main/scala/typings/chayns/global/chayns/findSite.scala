package typings.chayns.global.chayns

import typings.chayns.Site
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.findSite")
@js.native
object findSite extends js.Object {
  def apply(name: String): js.Promise[js.Array[Site]] = js.native
  def apply(name: String, skip: Double): js.Promise[js.Array[Site]] = js.native
  def apply(name: String, skip: Double, take: Double): js.Promise[js.Array[Site]] = js.native
}

