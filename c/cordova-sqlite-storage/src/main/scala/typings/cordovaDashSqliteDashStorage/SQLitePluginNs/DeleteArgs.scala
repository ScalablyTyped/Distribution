package typings.cordovaDashSqliteDashStorage.SQLitePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteArgs extends js.Object {
  var iosDatabaseLocation: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var name: String
}

object DeleteArgs {
  @scala.inline
  def apply(name: String, iosDatabaseLocation: String = null, location: String = null): DeleteArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[DeleteArgs]
  }
}

