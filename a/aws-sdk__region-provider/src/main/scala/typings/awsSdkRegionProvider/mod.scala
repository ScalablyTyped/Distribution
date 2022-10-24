package typings.awsSdkRegionProvider

import typings.awsSdkRegionProvider.buildDefaultProviderMod.RegionProviderConfiguration
import typings.awsSdkRegionProvider.buildFromEnvMod.EnvConfiguration
import typings.awsSdkRegionProvider.buildFromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/region-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/region-provider", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  @JSImport("@aws-sdk/region-provider", "ENV_REGION")
  @js.native
  val ENV_REGION: /* "AWS_REGION" */ String = js.native
  
  inline def defaultProvider(): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")().asInstanceOf[Provider[String]]
  inline def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")(configuration.asInstanceOf[js.Any]).asInstanceOf[Provider[String]]
  
  inline def fromEnv(): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")().asInstanceOf[Provider[String]]
  inline def fromEnv(param0: EnvConfiguration): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")(param0.asInstanceOf[js.Any]).asInstanceOf[Provider[String]]
  
  inline def fromSharedConfigFiles(): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")().asInstanceOf[Provider[String]]
  inline def fromSharedConfigFiles(init: SharedConfigInit): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSharedConfigFiles")(init.asInstanceOf[js.Any]).asInstanceOf[Provider[String]]
}
