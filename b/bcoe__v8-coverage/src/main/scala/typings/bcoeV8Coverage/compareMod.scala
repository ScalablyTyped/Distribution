package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typings.bcoeV8Coverage.anon.ReadonlyRangeCov
import typings.bcoeV8Coverage.anon.ReadonlyScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareFunctionCovs(a: ReadonlyFunctionCov, b: ReadonlyFunctionCov): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareFunctionCovs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareRangeCovs(a: ReadonlyRangeCov, b: ReadonlyRangeCov): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRangeCovs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compareScriptCovs(a: ReadonlyScriptCov, b: ReadonlyScriptCov): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareScriptCovs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
