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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@bcoe/v8-coverage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@bcoe/v8-coverage", "RangeTree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @precodition `ranges` are well-formed and pre-order sorted
      */
    @scala.inline
    def fromSortedRanges(ranges: js.Array[RangeCov]): js.UndefOr[typings.bcoeV8Coverage.rangeTreeMod.RangeTree] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSortedRanges")(ranges.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.bcoeV8Coverage.rangeTreeMod.RangeTree]]
  }
  
  @scala.inline
  def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneFunctionCov")(functionCov.asInstanceOf[js.Any]).asInstanceOf[FunctionCov]
  
  @scala.inline
  def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneProcessCov")(processCov.asInstanceOf[js.Any]).asInstanceOf[ProcessCov]
  
  @scala.inline
  def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneRangeCov")(rangeCov.asInstanceOf[js.Any]).asInstanceOf[RangeCov]
  
  @scala.inline
  def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneScriptCov")(scriptCov.asInstanceOf[js.Any]).asInstanceOf[ScriptCov]
  
  @scala.inline
  def compareFunctionCovs(a: ReadonlyFunctionCov, b: ReadonlyFunctionCov): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareFunctionCovs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def compareRangeCovs(a: ReadonlyRangeCov, b: ReadonlyRangeCov): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRangeCovs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def compareScriptCovs(a: ReadonlyScriptCov, b: ReadonlyScriptCov): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareScriptCovs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def emitForest(trees: js.Array[ReadonlyRangeTree]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emitForest")(trees.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def emitForestLines(trees: js.Array[ReadonlyRangeTree]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("emitForestLines")(trees.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def mergeFunctionCovs(funcCovs: js.Array[FunctionCov]): js.UndefOr[FunctionCov] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeFunctionCovs")(funcCovs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FunctionCov]]
  
  @scala.inline
  def mergeProcessCovs(processCovs: js.Array[ProcessCov]): ProcessCov = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProcessCovs")(processCovs.asInstanceOf[js.Any]).asInstanceOf[ProcessCov]
  
  @scala.inline
  def mergeScriptCovs(scriptCovs: js.Array[ScriptCov]): js.UndefOr[ScriptCov] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeScriptCovs")(scriptCovs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ScriptCov]]
  
  @scala.inline
  def parseFunctionRanges(text: String, offsetMap: Map[Double, Double]): js.Array[RangeCov] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionRanges")(text.asInstanceOf[js.Any], offsetMap.asInstanceOf[js.Any])).asInstanceOf[js.Array[RangeCov]]
  
  @scala.inline
  def parseOffsets(text: String): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOffsets")(text.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
}
