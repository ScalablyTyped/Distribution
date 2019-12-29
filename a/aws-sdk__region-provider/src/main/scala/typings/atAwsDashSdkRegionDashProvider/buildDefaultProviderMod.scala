package typings.atAwsDashSdkRegionDashProvider

import typings.atAwsDashSdkRegionDashProvider.buildFromEnvMod.EnvConfiguration
import typings.atAwsDashSdkRegionDashProvider.buildFromSharedConfigFilesMod.SharedConfigInit
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider/build/defaultProvider", JSImport.Namespace)
@js.native
object buildDefaultProviderMod extends js.Object {
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  type RegionProviderConfiguration = EnvConfiguration with SharedConfigInit
}

