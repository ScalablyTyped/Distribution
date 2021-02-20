package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typings.bcoeV8Coverage.anon.ReadonlyRangeCov
import typings.bcoeV8Coverage.anon.ReadonlyScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/compare", "compareFunctionCovs")
  @js.native
  def compareFunctionCovs(a: ReadonlyFunctionCov, b: ReadonlyFunctionCov): Double = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/compare", "compareRangeCovs")
  @js.native
  def compareRangeCovs(a: ReadonlyRangeCov, b: ReadonlyRangeCov): Double = js.native
  
  @JSImport("@bcoe/v8-coverage/dist/lib/compare", "compareScriptCovs")
  @js.native
  def compareScriptCovs(a: ReadonlyScriptCov, b: ReadonlyScriptCov): Double = js.native
}
