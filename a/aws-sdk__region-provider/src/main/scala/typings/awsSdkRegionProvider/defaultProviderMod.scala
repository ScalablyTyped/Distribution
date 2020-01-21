package typings.awsSdkRegionProvider

import typings.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typings.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/region-provider/build/defaultProvider", JSImport.Namespace)
@js.native
object defaultProviderMod extends js.Object {
  def defaultProvider(): Provider[String] = js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  type RegionProviderConfiguration = EnvConfiguration with SharedConfigInit
}

