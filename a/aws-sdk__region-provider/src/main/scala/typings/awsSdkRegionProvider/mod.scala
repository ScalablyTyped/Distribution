package typings.awsSdkRegionProvider

import typings.awsSdkRegionProvider.defaultProviderMod.RegionProviderConfiguration
import typings.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typings.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/region-provider", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  @JSImport("@aws-sdk/region-provider", "ENV_REGION")
  @js.native
  val ENV_REGION: /* "AWS_REGION" */ String = js.native
  
  @JSImport("@aws-sdk/region-provider", "defaultProvider")
  @js.native
  def defaultProvider(): Provider[String] = js.native
  @JSImport("@aws-sdk/region-provider", "defaultProvider")
  @js.native
  def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = js.native
  
  @JSImport("@aws-sdk/region-provider", "fromEnv")
  @js.native
  def fromEnv(): Provider[String] = js.native
  @JSImport("@aws-sdk/region-provider", "fromEnv")
  @js.native
  def fromEnv(hasEnvironmentVariableName: EnvConfiguration): Provider[String] = js.native
  
  @JSImport("@aws-sdk/region-provider", "fromSharedConfigFiles")
  @js.native
  def fromSharedConfigFiles(): Provider[String] = js.native
  @JSImport("@aws-sdk/region-provider", "fromSharedConfigFiles")
  @js.native
  def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = js.native
}
