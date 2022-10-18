package typings.awsSdkSharedIniFileLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetCredentialsFilepathMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getCredentialsFilepath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getCredentialsFilepath", "ENV_CREDENTIALS_PATH")
  @js.native
  val ENV_CREDENTIALS_PATH: /* "AWS_SHARED_CREDENTIALS_FILE" */ String = js.native
  
  inline def getCredentialsFilepath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCredentialsFilepath")().asInstanceOf[String]
}
