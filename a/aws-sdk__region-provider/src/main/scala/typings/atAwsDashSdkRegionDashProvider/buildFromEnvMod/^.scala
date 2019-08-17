package typings.atAwsDashSdkRegionDashProvider.buildFromEnvMod

import typings.atAwsDashSdkRegionDashProvider.atAwsDashSdkRegionDashProviderStrings.AWS_REGION
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider/build/fromEnv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ENV_REGION: AWS_REGION = js.native
  def fromEnv(): Provider[String] = js.native
  def fromEnv(hasEnvironmentVariableName: EnvConfiguration): Provider[String] = js.native
}

