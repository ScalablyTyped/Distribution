package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typings.bcoeV8Coverage.anon.ReadonlyRangeCov
import typings.bcoeV8Coverage.anon.ReadonlyScriptCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bcoe/v8-coverage/dist/lib/compare", JSImport.Namespace)
@js.native
object compareMod extends js.Object {
  
  def compareFunctionCovs(a: ReadonlyFunctionCov, b: ReadonlyFunctionCov): Double = js.native
  
  def compareRangeCovs(a: ReadonlyRangeCov, b: ReadonlyRangeCov): Double = js.native
  
  def compareScriptCovs(a: ReadonlyScriptCov, b: ReadonlyScriptCov): Double = js.native
}
