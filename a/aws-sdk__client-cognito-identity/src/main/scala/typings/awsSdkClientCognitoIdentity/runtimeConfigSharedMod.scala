package typings.awsSdkClientCognitoIdentity

import typings.awsSdkTypes.loggerMod.Logger
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigSharedMod {
  
  object ClientSharedValues {
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.apiVersion")
    @js.native
    def apiVersion: String = js.native
    inline def apiVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.disableHostPrefix")
    @js.native
    def disableHostPrefix: Boolean = js.native
    inline def disableHostPrefix_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHostPrefix")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.logger")
    @js.native
    def logger: Logger = js.native
    inline def logger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.regionInfoProvider")
    @js.native
    def regionInfoProvider: RegionInfoProvider = js.native
    inline def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("regionInfoProvider")(region.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[RegionInfo]]]
    inline def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("regionInfoProvider")(region.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[RegionInfo]]]
    inline def regionInfoProvider_=(x: RegionInfoProvider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regionInfoProvider")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", "ClientSharedValues.signingName")
    @js.native
    def signingName: String = js.native
    inline def signingName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signingName")(x.asInstanceOf[js.Any])
  }
}
