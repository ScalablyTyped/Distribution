package typings.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalOptions extends js.Object {
  var mod: InternalModule
}

object InternalOptions {
  @scala.inline
  def apply(mod: InternalModule): InternalOptions = {
    val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalOptions]
  }
}

