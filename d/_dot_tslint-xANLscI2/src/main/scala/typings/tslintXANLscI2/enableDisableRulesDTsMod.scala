package typings.tslintXANLscI2

import typings.tslintXANLscI2.ruleDTsMod.RuleFailure
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableDisableRulesDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/enableDisableRules.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".tslint-xANLscI2/lib/enableDisableRules.d.ts", "ENABLE_DISABLE_REGEX")
  @js.native
  val ENABLE_DISABLE_REGEX: js.RegExp = js.native
  
  inline def removeDisabledFailures(sourceFile: SourceFile, failures: js.Array[RuleFailure]): js.Array[RuleFailure] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeDisabledFailures")(sourceFile.asInstanceOf[js.Any], failures.asInstanceOf[js.Any])).asInstanceOf[js.Array[RuleFailure]]
}
