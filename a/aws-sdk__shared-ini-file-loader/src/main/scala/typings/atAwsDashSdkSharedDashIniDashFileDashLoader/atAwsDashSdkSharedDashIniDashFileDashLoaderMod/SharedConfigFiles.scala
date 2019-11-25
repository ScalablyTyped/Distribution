package typings.atAwsDashSdkSharedDashIniDashFileDashLoader.atAwsDashSdkSharedDashIniDashFileDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedConfigFiles extends js.Object {
  var configFile: ParsedIniData
  var credentialsFile: ParsedIniData
}

object SharedConfigFiles {
  @scala.inline
  def apply(configFile: ParsedIniData, credentialsFile: ParsedIniData): SharedConfigFiles = {
    val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any], credentialsFile = credentialsFile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharedConfigFiles]
  }
}

