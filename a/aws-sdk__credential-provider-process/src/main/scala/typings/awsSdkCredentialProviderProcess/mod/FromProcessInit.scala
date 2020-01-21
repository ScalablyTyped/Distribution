package typings.awsSdkCredentialProviderProcess.mod

import typings.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typings.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromProcessInit extends SharedConfigInit {
  /**
    * A promise that will be resolved with loaded and parsed credentials files.
    * Used to avoid loading shared config files multiple times.
    */
  var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.undefined
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.undefined
}

object FromProcessInit {
  @scala.inline
  def apply(
    configFilepath: String = null,
    filepath: String = null,
    loadedConfig: js.Promise[SharedConfigFiles] = null,
    profile: String = null
  ): FromProcessInit = {
    val __obj = js.Dynamic.literal()
    if (configFilepath != null) __obj.updateDynamic("configFilepath")(configFilepath.asInstanceOf[js.Any])
    if (filepath != null) __obj.updateDynamic("filepath")(filepath.asInstanceOf[js.Any])
    if (loadedConfig != null) __obj.updateDynamic("loadedConfig")(loadedConfig.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromProcessInit]
  }
}

