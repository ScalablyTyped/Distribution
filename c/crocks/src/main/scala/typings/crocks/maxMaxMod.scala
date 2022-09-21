package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxMaxMod {
  
  @JSImport("crocks/Max/Max", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Max {
    
    /* CompleteClass */
    override def concat(`val`: Max): Max = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Max = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Max]
    
    @JSImport("crocks/Max/Max", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Max = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Max]
  }
  
  trait Max extends StObject {
    
    def concat(`val`: Max): Max
  }
  object Max {
    
    inline def apply(concat: Max => Max): Max = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat))
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setConcat(value: Max => Max): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    }
  }
}
