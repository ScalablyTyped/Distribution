package typings.chevrotainCstDtsGen

import typings.chevrotainTypes.mod.GenerateDtsOptions
import typings.chevrotainTypes.mod.Rule
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chevrotain/cst-dts-gen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateCstDts(productions: Record[String, Rule]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCstDts")(productions.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateCstDts(productions: Record[String, Rule], options: GenerateDtsOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCstDts")(productions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
