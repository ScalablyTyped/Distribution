package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.resultResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firstResultToFirstMod {
  
  @JSImport("crocks/First/resultToFirst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  inline def default(`val`: Result): typings.crocks.firstFirstMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.firstFirstMod.default]
}
