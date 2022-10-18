package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.distLibTypesMod.FunctionCov
import typings.bcoeV8Coverage.distLibTypesMod.ProcessCov
import typings.bcoeV8Coverage.distLibTypesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMergeMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeFunctionCovs(funcCovs: js.Array[FunctionCov]): js.UndefOr[FunctionCov] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeFunctionCovs")(funcCovs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FunctionCov]]
  
  inline def mergeProcessCovs(processCovs: js.Array[ProcessCov]): ProcessCov = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProcessCovs")(processCovs.asInstanceOf[js.Any]).asInstanceOf[ProcessCov]
  
  inline def mergeScriptCovs(scriptCovs: js.Array[ScriptCov]): js.UndefOr[ScriptCov] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeScriptCovs")(scriptCovs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ScriptCov]]
}
