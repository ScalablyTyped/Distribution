package typings.awsSdkClientCognitoIdentity

import typings.awsSdkTypes.loggerMod.Logger
import typings.awsSdkTypes.utilMod.RegionInfo
import typings.awsSdkTypes.utilMod.RegionInfoProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/types/runtimeConfig.shared", JSImport.Namespace)
@js.native
object runtimeConfigSharedMod extends js.Object {
  
  @js.native
  object ClientSharedValues extends js.Object {
    
    var apiVersion: String = js.native
    
    var disableHostPrefix: Boolean = js.native
    
    var logger: Logger = js.native
    
    def regionInfoProvider(region: String): js.Promise[js.UndefOr[RegionInfo]] = js.native
    def regionInfoProvider(region: String, options: js.Any): js.Promise[js.UndefOr[RegionInfo]] = js.native
    @JSName("regionInfoProvider")
    var regionInfoProvider_Original: RegionInfoProvider = js.native
    
    var signingName: String = js.native
  }
}
