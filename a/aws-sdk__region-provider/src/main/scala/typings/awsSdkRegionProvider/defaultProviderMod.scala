package typings.awsSdkRegionProvider

import typings.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typings.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultProviderMod {
  
  @JSImport("@aws-sdk/region-provider/build/defaultProvider", "defaultProvider")
  @js.native
  def defaultProvider(): Provider[String] = js.native
  @JSImport("@aws-sdk/region-provider/build/defaultProvider", "defaultProvider")
  @js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  
  type RegionProviderConfiguration = EnvConfiguration with SharedConfigInit
}
