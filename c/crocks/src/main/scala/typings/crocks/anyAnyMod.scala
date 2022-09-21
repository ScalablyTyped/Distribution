package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyAnyMod {
  
  @JSImport("crocks/Any/Any", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Any {
    
    /* CompleteClass */
    override def concat(`val`: Any): Any = js.native
  }
  object default {
    
    inline def apply(`val`: scala.Any): Any = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("crocks/Any/Any", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Any]
    
    /* static member */
    inline def of(`val`: scala.Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  trait Any extends StObject {
    
    def concat(`val`: Any): Any
  }
  object Any {
    
    inline def apply(concat: Any => Any): Any = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat))
      __obj.asInstanceOf[Any]
    }
    
    extension [Self <: Any](x: Self) {
      
      inline def setConcat(value: Any => Any): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    }
  }
}
