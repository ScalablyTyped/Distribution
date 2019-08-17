package typings.atAwsDashSdkSharedDashIniDashFileDashLoader.atAwsDashSdkSharedDashIniDashFileDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedConfigInit extends js.Object {
  /**
    * The path at which to locate the ini config file. Defaults to the value of
    * the `AWS_CONFIG_FILE` environment variable (if defined) or
    * `~/.aws/config` otherwise.
    */
  var configFilepath: js.UndefOr[String] = js.undefined
  /**
    * The path at which to locate the ini credentials file. Defaults to the
    * value of the `AWS_SHARED_CREDENTIALS_FILE` environment variable (if
    * defined) or `~/.aws/credentials` otherwise.
    */
  var filepath: js.UndefOr[String] = js.undefined
}

object SharedConfigInit {
  @scala.inline
  def apply(configFilepath: String = null, filepath: String = null): SharedConfigInit = {
    val __obj = js.Dynamic.literal()
    if (configFilepath != null) __obj.updateDynamic("configFilepath")(configFilepath)
    if (filepath != null) __obj.updateDynamic("filepath")(filepath)
    __obj.asInstanceOf[SharedConfigInit]
  }
}

