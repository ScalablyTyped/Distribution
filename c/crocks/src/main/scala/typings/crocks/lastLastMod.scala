package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lastLastMod {
  
  @JSImport("crocks/Last/Last", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Last {
    
    /* CompleteClass */
    override def concat(`val`: Last): Last = js.native
    
    /* CompleteClass */
    override def option(`val`: Any): Any = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Last = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Last]
    
    @JSImport("crocks/Last/Last", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Last = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Last]
    
    /* static member */
    inline def of(`val`: Any): Last = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Last]
  }
  
  trait Last extends StObject {
    
    def concat(`val`: Last): Last
    
    def option(`val`: Any): Any
  }
  object Last {
    
    inline def apply(concat: Last => Last, option: Any => Any): Last = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), option = js.Any.fromFunction1(option))
      __obj.asInstanceOf[Last]
    }
    
    extension [Self <: Last](x: Self) {
      
      inline def setConcat(value: Last => Last): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setOption(value: Any => Any): Self = StObject.set(x, "option", js.Any.fromFunction1(value))
    }
  }
}
