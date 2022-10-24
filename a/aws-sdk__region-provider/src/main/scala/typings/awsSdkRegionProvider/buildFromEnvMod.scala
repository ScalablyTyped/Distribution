package typings.awsSdkRegionProvider

import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFromEnvMod {
  
  @JSImport("@aws-sdk/region-provider/build/fromEnv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/region-provider/build/fromEnv", "ENV_REGION")
  @js.native
  val ENV_REGION: /* "AWS_REGION" */ String = js.native
  
  inline def fromEnv(): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")().asInstanceOf[Provider[String]]
  inline def fromEnv(param0: EnvConfiguration): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")(param0.asInstanceOf[js.Any]).asInstanceOf[Provider[String]]
  
  trait EnvConfiguration extends StObject {
    
    var environmentVariableName: js.UndefOr[String] = js.undefined
  }
  object EnvConfiguration {
    
    inline def apply(): EnvConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvConfiguration]
    }
    
    extension [Self <: EnvConfiguration](x: Self) {
      
      inline def setEnvironmentVariableName(value: String): Self = StObject.set(x, "environmentVariableName", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentVariableNameUndefined: Self = StObject.set(x, "environmentVariableName", js.undefined)
    }
  }
}
