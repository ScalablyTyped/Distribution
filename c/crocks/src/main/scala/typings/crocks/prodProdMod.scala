package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prodProdMod {
  
  @JSImport("crocks/Prod/Prod", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Prod {
    
    /* CompleteClass */
    override def concat(`val`: Prod): Prod = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Prod = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Prod]
    
    @JSImport("crocks/Prod/Prod", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Prod = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Prod]
  }
  
  trait Prod extends StObject {
    
    def concat(`val`: Prod): Prod
  }
  object Prod {
    
    inline def apply(concat: Prod => Prod): Prod = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat))
      __obj.asInstanceOf[Prod]
    }
    
    extension [Self <: Prod](x: Self) {
      
      inline def setConcat(value: Prod => Prod): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    }
  }
}
