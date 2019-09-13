package typings.cacheDashManager

import typings.cacheDashManager.cacheDashManagerMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  def create(args: js.Any*): Store
}

object Anon_Args {
  @scala.inline
  def apply(create: /* repeated */ js.Any => Store): Anon_Args = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[Anon_Args]
  }
}

