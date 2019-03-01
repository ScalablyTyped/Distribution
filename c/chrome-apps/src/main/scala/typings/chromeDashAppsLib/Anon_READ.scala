package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_READ extends js.Object {
  var READ: chromeDashAppsLib.chromeDashAppsLibStrings.READ
  var WRITE: chromeDashAppsLib.chromeDashAppsLibStrings.WRITE
}

object Anon_READ {
  @scala.inline
  def apply(
    READ: chromeDashAppsLib.chromeDashAppsLibStrings.READ,
    WRITE: chromeDashAppsLib.chromeDashAppsLibStrings.WRITE
  ): Anon_READ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("READ")(READ)
    __obj.updateDynamic("WRITE")(WRITE)
    __obj.asInstanceOf[Anon_READ]
  }
}

