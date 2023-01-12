package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateStateMod {
  
  @JSImport("crocks/State/State", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with State {
    
    /* CompleteClass */
    override def ap(`val`: State): State = js.native
    
    /* CompleteClass */
    override def chain(fn: UnaryFunction): State = js.native
    
    /* CompleteClass */
    override def evalWith(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def execWith(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def map(fn: UnaryFunction): State = js.native
    
    /* CompleteClass */
    override def runWith(`val`: Any): typings.crocks.pairMod.default = js.native
  }
  object default {
    
    inline def apply(`val`: js.Function1[/* state */ Any, typings.crocks.pairMod.default]): State = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[State]
    
    @JSImport("crocks/State/State", JSImport.Default)
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
  
  trait State extends StObject {
    
    def ap(`val`: State): State
    
    def chain(fn: UnaryFunction): State
    
    def evalWith(`val`: Any): Any
    
    def execWith(`val`: Any): Any
    
    def map(fn: UnaryFunction): State
    
    def runWith(`val`: Any): typings.crocks.pairMod.default
  }
  object State {
    
    inline def apply(
      ap: State => State,
      chain: UnaryFunction => State,
      evalWith: Any => Any,
      execWith: Any => Any,
      map: UnaryFunction => State,
      runWith: Any => typings.crocks.pairMod.default
    ): State = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), chain = js.Any.fromFunction1(chain), evalWith = js.Any.fromFunction1(evalWith), execWith = js.Any.fromFunction1(execWith), map = js.Any.fromFunction1(map), runWith = js.Any.fromFunction1(runWith))
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setAp(value: State => State): Self = StObject.set(x, "ap", js.Any.fromFunction1(value))
      
      inline def setChain(value: UnaryFunction => State): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setEvalWith(value: Any => Any): Self = StObject.set(x, "evalWith", js.Any.fromFunction1(value))
      
      inline def setExecWith(value: Any => Any): Self = StObject.set(x, "execWith", js.Any.fromFunction1(value))
      
      inline def setMap(value: UnaryFunction => State): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setRunWith(value: Any => typings.crocks.pairMod.default): Self = StObject.set(x, "runWith", js.Any.fromFunction1(value))
    }
  }
}
