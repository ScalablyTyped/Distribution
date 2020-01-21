package typings.awsSdkRegionProvider

import typings.awsSdkRegionProvider.awsSdkRegionProviderStrings.AWS_PROFILE
import typings.awsSdkRegionProvider.awsSdkRegionProviderStrings.AWS_REGION
import typings.awsSdkRegionProvider.defaultProviderMod.RegionProviderConfiguration
import typings.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typings.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ENV_PROFILE: AWS_PROFILE = js.native
  val ENV_REGION: AWS_REGION = js.native
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  def fromEnv(): Provider[String] = js.native
  def fromEnv(hasEnvironmentVariableName: EnvConfiguration): Provider[String] = js.native
  def fromSharedConfigFiles(): Provider[String] = js.native
  def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = js.native
}

