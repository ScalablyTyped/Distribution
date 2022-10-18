package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.stateStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("crocks/State", JSImport.Default)
  @js.native
  open class default ()
    extends typings.crocks.stateStateMod.default
  object default {
    
    inline def apply(`val`: js.Function1[/* state */ Any, typings.crocks.pairMod.default]): State = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[State]
    
    @JSImport("crocks/State", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def get(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[State]
    inline def get(fn: UnaryFunction): State = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(fn.asInstanceOf[js.Any]).asInstanceOf[State]
    
    /* static member */
    inline def modify(fn: UnaryFunction): State = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(fn.asInstanceOf[js.Any]).asInstanceOf[State]
    
    /* static member */
    inline def of(`val`: Any): State = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[State]
    
    /* static member */
    inline def put(`val`: Any): State = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(`val`.asInstanceOf[js.Any]).asInstanceOf[State]
  }
}
