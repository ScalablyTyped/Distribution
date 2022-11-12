package typings.awsSdkSharedIniFileLoader

import typings.awsSdkSharedIniFileLoader.anon.Profile
import typings.awsSdkSharedIniFileLoader.distTypesGetSSOTokenFromFileMod.SSOToken
import typings.awsSdkSharedIniFileLoader.distTypesLoadSharedConfigFilesMod.SharedConfigInit
import typings.awsSdkSharedIniFileLoader.distTypesLoadSsoSessionDataMod.SsoSessionInit
import typings.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.distTypesProfileMod.ParsedIniData
import typings.awsSdkTypes.distTypesProfileMod.SharedConfigFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader", "DEFAULT_PROFILE")
  @js.native
  val DEFAULT_PROFILE: /* "default" */ String = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  inline def getHomeDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHomeDir")().asInstanceOf[String]
  
  inline def getProfileName(init: Profile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileName")(init.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSSOTokenFilepath(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSOTokenFilepath")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSSOTokenFromFile(id: String): js.Promise[SSOToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSOTokenFromFile")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SSOToken]]
  
  inline def loadSharedConfigFiles(): js.Promise[SharedConfigFiles] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSharedConfigFiles")().asInstanceOf[js.Promise[SharedConfigFiles]]
  inline def loadSharedConfigFiles(init: SharedConfigInit): js.Promise[SharedConfigFiles] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSharedConfigFiles")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SharedConfigFiles]]
  
  inline def loadSsoSessionData(): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSsoSessionData")().asInstanceOf[js.Promise[ParsedIniData]]
  inline def loadSsoSessionData(init: SsoSessionInit): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSsoSessionData")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedIniData]]
  
  inline def parseKnownFiles(init: SourceProfileInit): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKnownFiles")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedIniData]]
}
