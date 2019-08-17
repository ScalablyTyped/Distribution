package typings.atAwsDashSdkSharedDashIniDashFileDashLoader.atAwsDashSdkSharedDashIniDashFileDashLoaderMod

import typings.atAwsDashSdkSharedDashIniDashFileDashLoader.atAwsDashSdkSharedDashIniDashFileDashLoaderStrings.AWS_CONFIG_FILE
import typings.atAwsDashSdkSharedDashIniDashFileDashLoader.atAwsDashSdkSharedDashIniDashFileDashLoaderStrings.AWS_SHARED_CREDENTIALS_FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/shared-ini-file-loader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ENV_CONFIG_PATH: AWS_CONFIG_FILE = js.native
  val ENV_CREDENTIALS_PATH: AWS_SHARED_CREDENTIALS_FILE = js.native
  def loadSharedConfigFiles(): js.Promise[SharedConfigFiles] = js.native
  def loadSharedConfigFiles(init: SharedConfigInit): js.Promise[SharedConfigFiles] = js.native
}

