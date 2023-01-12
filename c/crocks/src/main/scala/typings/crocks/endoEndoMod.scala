package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endoEndoMod {
  
  @JSImport("crocks/Endo/Endo", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Endo {
    
    /* CompleteClass */
    override def concat(`val`: Endo): Endo = js.native
    
    /* CompleteClass */
    override def runWith(`val`: Any): Any = js.native
  }
  object default {
    
    inline def apply(`val`: js.Function1[/* repeated */ Any, Any]): Endo = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Endo]
    
    @JSImport("crocks/Endo/Endo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Endo = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Endo]
    
    /* static member */
    inline def of(`val`: js.Function1[/* repeated */ Any, Any]): Endo = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Endo]
  }
  
  trait Endo extends StObject {
    
    def concat(`val`: Endo): Endo
    
    def runWith(`val`: Any): Any
  }
  object Endo {
    
    inline def apply(concat: Endo => Endo, runWith: Any => Any): Endo = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), runWith = js.Any.fromFunction1(runWith))
      __obj.asInstanceOf[Endo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Endo] (val x: Self) extends AnyVal {
      
      inline def setConcat(value: Endo => Endo): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setRunWith(value: Any => Any): Self = StObject.set(x, "runWith", js.Any.fromFunction1(value))
    }
  }
}
