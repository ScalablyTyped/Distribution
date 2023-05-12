package typings.awsSdkSharedIniFileLoader

import typings.awsSdkTypes.distTypesProfileMod.ParsedIniData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMergeConfigFilesMod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader/dist-types/mergeConfigFiles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeConfigFiles(files: ParsedIniData*): ParsedIniData = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfigFiles")(files.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ParsedIniData]
}
