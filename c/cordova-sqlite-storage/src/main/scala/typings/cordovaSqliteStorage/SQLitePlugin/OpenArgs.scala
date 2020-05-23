package typings.cordovaSqliteStorage.SQLitePlugin

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    androidDatabaseImplementation: js.UndefOr[Double] = js.undefined,
    androidLockWorkaround: js.UndefOr[Double] = js.undefined,
    createFromLocation: js.UndefOr[Double] = js.undefined,
    iosDatabaseLocation: String = null,
    location: String = null
  ): OpenArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(androidDatabaseImplementation)) __obj.updateDynamic("androidDatabaseImplementation")(androidDatabaseImplementation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(androidLockWorkaround)) __obj.updateDynamic("androidLockWorkaround")(androidLockWorkaround.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createFromLocation)) __obj.updateDynamic("createFromLocation")(createFromLocation.get.asInstanceOf[js.Any])
    if (iosDatabaseLocation != null) __obj.updateDynamic("iosDatabaseLocation")(iosDatabaseLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenArgs]
  }
}

