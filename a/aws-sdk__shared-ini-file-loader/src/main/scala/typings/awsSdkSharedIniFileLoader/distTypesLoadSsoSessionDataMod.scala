package typings.awsSdkSharedIniFileLoader

import typings.awsSdkTypes.distTypesProfileMod.ParsedIniData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoadSsoSessionDataMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/loadSsoSessionData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadSsoSessionData(): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSsoSessionData")().asInstanceOf[js.Promise[ParsedIniData]]
  inline def loadSsoSessionData(init: SsoSessionInit): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSsoSessionData")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedIniData]]
  
  trait SsoSessionInit extends StObject {
    
    /**
      * The path at which to locate the ini config file. Defaults to the value of
      * the `AWS_CONFIG_FILE` environment variable (if defined) or
      * `~/.aws/config` otherwise.
      */
    var configFilepath: js.UndefOr[String] = js.undefined
  }
  object SsoSessionInit {
    
    inline def apply(): SsoSessionInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SsoSessionInit]
    }
    
    extension [Self <: SsoSessionInit](x: Self) {
      
      inline def setConfigFilepath(value: String): Self = StObject.set(x, "configFilepath", value.asInstanceOf[js.Any])
      
      inline def setConfigFilepathUndefined: Self = StObject.set(x, "configFilepath", js.undefined)
    }
  }
}
