package typings.awsSdkSharedIniFileLoader

import typings.awsSdkTypes.profileMod.ParsedIniData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseIniMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/parseIni", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseIni(iniData: String): ParsedIniData = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIni")(iniData.asInstanceOf[js.Any]).asInstanceOf[ParsedIniData]
}
