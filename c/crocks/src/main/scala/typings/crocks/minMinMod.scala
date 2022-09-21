package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMinMod {
  
  @JSImport("crocks/Min/Min", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Min {
    
    /* CompleteClass */
    override def concat(`val`: Min): Min = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Min = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Min]
    
    @JSImport("crocks/Min/Min", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Min = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Min]
  }
  
  trait Min extends StObject {
    
    def concat(`val`: Min): Min
  }
  object Min {
    
    inline def apply(concat: Min => Min): Min = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat))
      __obj.asInstanceOf[Min]
    }
    
    extension [Self <: Min](x: Self) {
      
      inline def setConcat(value: Min => Min): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    }
  }
}
