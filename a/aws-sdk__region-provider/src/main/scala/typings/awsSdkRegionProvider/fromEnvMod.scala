package typings.awsSdkRegionProvider

import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEnvMod {
  
  @JSImport("@aws-sdk/region-provider/build/fromEnv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/region-provider/build/fromEnv", "ENV_REGION")
  @js.native
  val ENV_REGION: /* "AWS_REGION" */ String = js.native
  
  @scala.inline
  def fromEnv(): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")().asInstanceOf[Provider[String]]
  @scala.inline
  def fromEnv(hasEnvironmentVariableName: EnvConfiguration): Provider[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEnv")(hasEnvironmentVariableName.asInstanceOf[js.Any]).asInstanceOf[Provider[String]]
  
  trait EnvConfiguration extends StObject {
    
    var environmentVariableName: js.UndefOr[String] = js.undefined
  }
  object EnvConfiguration {
    
    @scala.inline
    def apply(): EnvConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvConfiguration]
    }
    
    @scala.inline
    implicit class EnvConfigurationMutableBuilder[Self <: EnvConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironmentVariableName(value: String): Self = StObject.set(x, "environmentVariableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentVariableNameUndefined: Self = StObject.set(x, "environmentVariableName", js.undefined)
    }
  }
}
