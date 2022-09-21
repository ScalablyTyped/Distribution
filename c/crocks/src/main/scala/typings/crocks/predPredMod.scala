package typings.crocks

import typings.crocks.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predPredMod {
  
  @JSImport("crocks/Pred/Pred", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Pred {
    
    /* CompleteClass */
    override def concat(`val`: Pred): Pred = js.native
    
    /* CompleteClass */
    override def contramap(fn: UnaryFunction): Pred = js.native
    
    /* CompleteClass */
    override def runWith(`val`: Any): Boolean = js.native
  }
  object default {
    
    inline def apply(fn: UnaryFunction): Pred = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Pred]
    
    @JSImport("crocks/Pred/Pred", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Pred = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Pred]
  }
  
  trait Pred extends StObject {
    
    def concat(`val`: Pred): Pred
    
    def contramap(fn: UnaryFunction): Pred
    
    def runWith(`val`: Any): Boolean
  }
  object Pred {
    
    inline def apply(concat: Pred => Pred, contramap: UnaryFunction => Pred, runWith: Any => Boolean): Pred = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), contramap = js.Any.fromFunction1(contramap), runWith = js.Any.fromFunction1(runWith))
      __obj.asInstanceOf[Pred]
    }
    
    extension [Self <: Pred](x: Self) {
      
      inline def setConcat(value: Pred => Pred): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setContramap(value: UnaryFunction => Pred): Self = StObject.set(x, "contramap", js.Any.fromFunction1(value))
      
      inline def setRunWith(value: Any => Boolean): Self = StObject.set(x, "runWith", js.Any.fromFunction1(value))
    }
  }
}
