package typings.cordovaDashSqliteDashStorage.SQLitePlugin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenArgs
  extends /* key */ StringDictionary[js.Any] {
  var androidDatabaseImplementation: js.UndefOr[Double] = js.undefined
  var androidLockWorkaround: js.UndefOr[Double] = js.undefined
  var createFromLocation: js.UndefOr[Double] = js.undefined
  var iosDatabaseLocation: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var name: String
}

object OpenArgs {
  @scala.inline
  def apply(
    name: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    androidDatabaseImplementation: Int | Double = null,
    androidLockWorkaround: Int | Double = null,
    createFromLocation: Int | Double = null,
    iosDatabaseLocation: String = null,
    location: String = null
  ): OpenArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (androidDatabaseImplementation != null) __obj.updateDynamic("androidDatabaseImplementation")(androidDatabaseImplementation.asInstanceOf[js.Any])
    if (androidLockWorkaround != null) __obj.updateDynamic("androidLockWorkaround")(androidLockWorkaround.asInstanceOf[js.Any])
    if (createFromLocation != null) __obj.updateDynamic("createFromLocation")(createFromLocation.asInstanceOf[js.Any])
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenArgs]
  }
}

