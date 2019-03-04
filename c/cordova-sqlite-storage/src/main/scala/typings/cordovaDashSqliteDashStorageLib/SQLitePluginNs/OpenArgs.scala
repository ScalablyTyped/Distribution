package typings
package cordovaDashSqliteDashStorageLib.SQLitePluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenArgs
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var androidDatabaseImplementation: js.UndefOr[scala.Double] = js.undefined
  var androidLockWorkaround: js.UndefOr[scala.Double] = js.undefined
  var createFromLocation: js.UndefOr[scala.Double] = js.undefined
  var iosDatabaseLocation: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object OpenArgs {
  @scala.inline
  def apply(
    name: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    androidDatabaseImplementation: scala.Int | scala.Double = null,
    androidLockWorkaround: scala.Int | scala.Double = null,
    createFromLocation: scala.Int | scala.Double = null,
    iosDatabaseLocation: java.lang.String = null,
    location: java.lang.String = null
  ): OpenArgs = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (androidDatabaseImplementation != null) __obj.updateDynamic("androidDatabaseImplementation")(androidDatabaseImplementation.asInstanceOf[js.Any])
    if (androidLockWorkaround != null) __obj.updateDynamic("androidLockWorkaround")(androidLockWorkaround.asInstanceOf[js.Any])
    if (createFromLocation != null) __obj.updateDynamic("createFromLocation")(createFromLocation.asInstanceOf[js.Any])
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[OpenArgs]
  }
}

