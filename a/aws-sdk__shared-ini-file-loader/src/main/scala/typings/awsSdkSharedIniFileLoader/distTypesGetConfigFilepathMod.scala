package typings.awsSdkSharedIniFileLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetConfigFilepathMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getConfigFilepath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getConfigFilepath", "ENV_CONFIG_PATH")
  @js.native
  val ENV_CONFIG_PATH: /* "AWS_CONFIG_FILE" */ String = js.native
  
  inline def getConfigFilepath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilepath")().asInstanceOf[String]
}
