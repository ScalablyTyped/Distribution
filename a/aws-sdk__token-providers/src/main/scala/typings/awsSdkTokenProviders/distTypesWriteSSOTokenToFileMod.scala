package typings.awsSdkTokenProviders

import typings.awsSdkSharedIniFileLoader.distTypesGetSSOTokenFromFileMod.SSOToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWriteSSOTokenToFileMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/writeSSOTokenToFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeSSOTokenToFile(id: String, ssoToken: SSOToken): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSSOTokenToFile")(id.asInstanceOf[js.Any], ssoToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
