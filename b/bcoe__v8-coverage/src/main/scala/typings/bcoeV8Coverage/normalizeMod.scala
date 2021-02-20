package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.rangeTreeMod.RangeTree
import typings.bcoeV8Coverage.typesMod.FunctionCov
import typings.bcoeV8Coverage.typesMod.ProcessCov
import typings.bcoeV8Coverage.typesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/normalize", "deepNormalizeProcessCov")
  @js.native
  def deepNormalizeProcessCov(processCov: ProcessCov): Unit = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/normalize", "deepNormalizeScriptCov")
  @js.native
  def deepNormalizeScriptCov(scriptCov: ScriptCov): Unit = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/normalize", "normalizeFunctionCov")
  @js.native
  def normalizeFunctionCov(funcCov: FunctionCov): Unit = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/normalize", "normalizeProcessCov")
  @js.native
  def normalizeProcessCov(processCov: ProcessCov): Unit = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/normalize", "normalizeRangeTree")
  @js.native
  def normalizeRangeTree(tree: RangeTree): Unit = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/normalize", "normalizeScriptCov")
  @js.native
  def normalizeScriptCov(scriptCov: ScriptCov): Unit = js.native
}
