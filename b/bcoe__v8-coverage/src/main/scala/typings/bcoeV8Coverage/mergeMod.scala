package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.FunctionCov
import typings.bcoeV8Coverage.typesMod.ProcessCov
import typings.bcoeV8Coverage.typesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/merge", "mergeFunctionCovs")
  @js.native
  def mergeFunctionCovs(funcCovs: js.Array[FunctionCov]): js.UndefOr[FunctionCov] = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/merge", "mergeProcessCovs")
  @js.native
  def mergeProcessCovs(processCovs: js.Array[ProcessCov]): ProcessCov = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/merge", "mergeScriptCovs")
  @js.native
  def mergeScriptCovs(scriptCovs: js.Array[ScriptCov]): js.UndefOr[ScriptCov] = js.native
}
