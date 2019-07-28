package typings.dbDashMigrateDashBase.dbDashMigrateDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalModule extends js.Object {
  var log: js.Any
  var `type`: js.Any
}

object InternalModule {
  @scala.inline
  def apply(log: js.Any, `type`: js.Any): InternalModule = {
    val __obj = js.Dynamic.literal(log = log)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InternalModule]
  }
}

