package typings.awsSdkRegionProvider

import typings.awsSdkRegionProvider.fromEnvMod.EnvConfiguration
import typings.awsSdkRegionProvider.fromSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultProviderMod {
  
  @JSImport("@aws-sdk/region-provider/build/defaultProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultProvider(): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")().asInstanceOf[Provider[String]]
  inline def defaultProvider(configuration: RegionProviderConfiguration): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")(configuration.asInstanceOf[js.Any]).asInstanceOf[Provider[String]]
  
  trait RegionProviderConfiguration
    extends StObject
       with EnvConfiguration
       with SharedConfigInit
  object RegionProviderConfiguration {
    
    inline def apply(): RegionProviderConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegionProviderConfiguration]
    }
  }
}
