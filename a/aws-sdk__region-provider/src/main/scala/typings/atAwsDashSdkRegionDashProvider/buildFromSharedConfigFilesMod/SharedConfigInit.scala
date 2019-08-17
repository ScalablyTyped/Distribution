package typings.atAwsDashSdkRegionDashProvider.buildFromSharedConfigFilesMod

import typings.atAwsDashSdkSharedDashIniDashFileDashLoader.atAwsDashSdkSharedDashIniDashFileDashLoaderMod.SharedConfigFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedConfigInit
  extends typings.atAwsDashSdkSharedDashIniDashFileDashLoader.atAwsDashSdkSharedDashIniDashFileDashLoaderMod.SharedConfigInit {
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

object SharedConfigInit {
  @scala.inline
  def apply(
    configFilepath: String = null,
    filepath: String = null,
    loadedConfig: js.Promise[SharedConfigFiles] = null,
    profile: String = null
  ): SharedConfigInit = {
    val __obj = js.Dynamic.literal()
    if (configFilepath != null) __obj.updateDynamic("configFilepath")(configFilepath)
    if (filepath != null) __obj.updateDynamic("filepath")(filepath)
    if (loadedConfig != null) __obj.updateDynamic("loadedConfig")(loadedConfig)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[SharedConfigInit]
  }
}

