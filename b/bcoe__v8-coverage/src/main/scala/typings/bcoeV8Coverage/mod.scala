package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typings.bcoeV8Coverage.anon.ReadonlyProcessCov
import typings.bcoeV8Coverage.anon.ReadonlyRangeCov
import typings.bcoeV8Coverage.anon.ReadonlyScriptCov
import typings.bcoeV8Coverage.asciiMod.ReadonlyRangeTree
import typings.bcoeV8Coverage.typesMod.FunctionCov
import typings.bcoeV8Coverage.typesMod.ProcessCov
import typings.bcoeV8Coverage.typesMod.RangeCov
import typings.bcoeV8Coverage.typesMod.ScriptCov
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@bcoe/v8-coverage", "RangeTree")
  @js.native
  class RangeTree protected ()
    extends typings.bcoeV8Coverage.rangeTreeMod.RangeTree {
    def this(
      start: Double,
      end: Double,
      delta: Double,
      children: js.Array[typings.bcoeV8Coverage.rangeTreeMod.RangeTree]
    ) = this()
  }
  /* static members */
  object RangeTree {
    
    /**
      * @precodition `ranges` are well-formed and pre-order sorted
      */
    @JSImport("@bcoe/v8-coverage", "RangeTree.fromSortedRanges")
    @js.native
    def fromSortedRanges(ranges: js.Array[RangeCov]): js.UndefOr[typings.bcoeV8Coverage.rangeTreeMod.RangeTree] = js.native
  }
  
  @JSImport("@bcoe/v8-coverage", "cloneFunctionCov")
  @js.native
  def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = js.native
  
  @JSImport("@bcoe/v8-coverage", "cloneProcessCov")
  @js.native
  def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = js.native
  
  @JSImport("@bcoe/v8-coverage", "cloneRangeCov")
  @js.native
  def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = js.native
  
  @JSImport("@bcoe/v8-coverage", "cloneScriptCov")
  @js.native
  def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = js.native
  
  @JSImport("@bcoe/v8-coverage", "compareFunctionCovs")
  @js.native
  def compareFunctionCovs(a: ReadonlyFunctionCov, b: ReadonlyFunctionCov): Double = js.native
  
  @JSImport("@bcoe/v8-coverage", "compareRangeCovs")
  @js.native
  def compareRangeCovs(a: ReadonlyRangeCov, b: ReadonlyRangeCov): Double = js.native
  
  @JSImport("@bcoe/v8-coverage", "compareScriptCovs")
  @js.native
  def compareScriptCovs(a: ReadonlyScriptCov, b: ReadonlyScriptCov): Double = js.native
  
  @JSImport("@bcoe/v8-coverage", "emitForest")
  @js.native
  def emitForest(trees: js.Array[ReadonlyRangeTree]): String = js.native
  
  @JSImport("@bcoe/v8-coverage", "emitForestLines")
  @js.native
  def emitForestLines(trees: js.Array[ReadonlyRangeTree]): js.Array[String] = js.native
  
  @JSImport("@bcoe/v8-coverage", "mergeFunctionCovs")
  @js.native
  def mergeFunctionCovs(funcCovs: js.Array[FunctionCov]): js.UndefOr[FunctionCov] = js.native
  
  @JSImport("@bcoe/v8-coverage", "mergeProcessCovs")
  @js.native
  def mergeProcessCovs(processCovs: js.Array[ProcessCov]): ProcessCov = js.native
  
  @JSImport("@bcoe/v8-coverage", "mergeScriptCovs")
  @js.native
  def mergeScriptCovs(scriptCovs: js.Array[ScriptCov]): js.UndefOr[ScriptCov] = js.native
  
  @JSImport("@bcoe/v8-coverage", "parseFunctionRanges")
  @js.native
  def parseFunctionRanges(text: String, offsetMap: Map[Double, Double]): js.Array[RangeCov] = js.native
  
  @JSImport("@bcoe/v8-coverage", "parseOffsets")
  @js.native
  def parseOffsets(text: String): Map[Double, Double] = js.native
}
