package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firstFirstMod {
  
  @JSImport("crocks/First/First", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with First {
    
    /* CompleteClass */
    override def concat(`val`: First): First = js.native
    
    /* CompleteClass */
    override def option(`val`: Any): Any = js.native
  }
  object default {
    
    inline def apply(`val`: Any): First = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[First]
    
    @JSImport("crocks/First/First", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): First = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[First]
    
    /* static member */
    inline def of(`val`: Any): First = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[First]
  }
  
  trait First extends StObject {
    
    def concat(`val`: First): First
    
    def option(`val`: Any): Any
  }
  object First {
    
    inline def apply(concat: First => First, option: Any => Any): First = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), option = js.Any.fromFunction1(option))
      __obj.asInstanceOf[First]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: First] (val x: Self) extends AnyVal {
      
      inline def setConcat(value: First => First): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setOption(value: Any => Any): Self = StObject.set(x, "option", js.Any.fromFunction1(value))
    }
  }
}
