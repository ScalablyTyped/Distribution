package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateEvalWithMod {
  
  @JSImport("crocks/State/evalWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(`val`: Any): js.Function1[/* state */ typings.crocks.stateStateMod.default, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* state */ typings.crocks.stateStateMod.default, Any]]
  // evalWith :: s -> State s a -> a
  inline def default(`val`: Any, state: typings.crocks.stateStateMod.default): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Any]
}
