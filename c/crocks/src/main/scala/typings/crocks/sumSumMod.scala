package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sumSumMod {
  
  @JSImport("crocks/Sum/Sum", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Sum {
    
    /* CompleteClass */
    override def concat(`val`: Sum): Sum = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Sum = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Sum]
    
    @JSImport("crocks/Sum/Sum", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Sum = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Sum]
  }
  
  trait Sum extends StObject {
    
    def concat(`val`: Sum): Sum
  }
  object Sum {
    
    inline def apply(concat: Sum => Sum): Sum = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat))
      __obj.asInstanceOf[Sum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sum] (val x: Self) extends AnyVal {
      
      inline def setConcat(value: Sum => Sum): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    }
  }
}
