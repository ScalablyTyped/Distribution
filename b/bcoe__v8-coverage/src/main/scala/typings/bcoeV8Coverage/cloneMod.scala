package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typings.bcoeV8Coverage.anon.ReadonlyProcessCov
import typings.bcoeV8Coverage.anon.ReadonlyRangeCov
import typings.bcoeV8Coverage.anon.ReadonlyScriptCov
import typings.bcoeV8Coverage.typesMod.FunctionCov
import typings.bcoeV8Coverage.typesMod.ProcessCov
import typings.bcoeV8Coverage.typesMod.RangeCov
import typings.bcoeV8Coverage.typesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneFunctionCov")(functionCov.asInstanceOf[js.Any]).asInstanceOf[FunctionCov]
  
  inline def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneProcessCov")(processCov.asInstanceOf[js.Any]).asInstanceOf[ProcessCov]
  
  inline def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneRangeCov")(rangeCov.asInstanceOf[js.Any]).asInstanceOf[RangeCov]
  
  inline def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneScriptCov")(scriptCov.asInstanceOf[js.Any]).asInstanceOf[ScriptCov]
}
