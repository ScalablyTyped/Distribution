package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.FunctionCov
import typings.bcoeV8Coverage.typesMod.ProcessCov
import typings.bcoeV8Coverage.typesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mergeFunctionCovs(funcCovs: js.Array[FunctionCov]): js.UndefOr[FunctionCov] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeFunctionCovs")(funcCovs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FunctionCov]]
  
  @scala.inline
  def mergeProcessCovs(processCovs: js.Array[ProcessCov]): ProcessCov = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProcessCovs")(processCovs.asInstanceOf[js.Any]).asInstanceOf[ProcessCov]
  
  @scala.inline
  def mergeScriptCovs(scriptCovs: js.Array[ScriptCov]): js.UndefOr[ScriptCov] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeScriptCovs")(scriptCovs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ScriptCov]]
}
