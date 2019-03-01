package typings
package cordovaDashSqliteDashStorageLib.SQLitePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteArgs extends js.Object {
  var iosDatabaseLocation: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object DeleteArgs {
  @scala.inline
  def apply(
    name: java.lang.String,
    iosDatabaseLocation: java.lang.String = null,
    location: java.lang.String = null
  ): DeleteArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[DeleteArgs]
  }
}

