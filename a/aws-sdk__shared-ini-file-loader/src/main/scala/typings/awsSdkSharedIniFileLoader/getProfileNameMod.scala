package typings.awsSdkSharedIniFileLoader

import typings.awsSdkSharedIniFileLoader.anon.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getProfileNameMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getProfileName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getProfileName", "DEFAULT_PROFILE")
  @js.native
  val DEFAULT_PROFILE: /* "default" */ String = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/getProfileName", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  inline def getProfileName(init: Profile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileName")(init.asInstanceOf[js.Any]).asInstanceOf[String]
}
