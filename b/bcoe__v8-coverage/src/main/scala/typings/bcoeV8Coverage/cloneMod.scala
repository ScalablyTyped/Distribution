package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.FunctionCov
import typings.bcoeV8Coverage.typesMod.ProcessCov
import typings.bcoeV8Coverage.typesMod.RangeCov
import typings.bcoeV8Coverage.typesMod.ScriptCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@bcoe/v8-coverage/dist/lib/clone", JSImport.Namespace)
@js.native
object cloneMod extends js.Object {
  def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = js.native
  def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = js.native
  def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = js.native
  def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = js.native
}

