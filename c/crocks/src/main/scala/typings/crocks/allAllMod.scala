package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allAllMod {
  
  @JSImport("crocks/All/All", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with All {
    
    /* CompleteClass */
    override def concat(`val`: All): All = js.native
  }
  object default {
    
    inline def apply(`val`: Any): All = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[All]
    
    @JSImport("crocks/All/All", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): All = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[All]
    
    /* static member */
    inline def of(`val`: Any): All = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[All]
  }
  
  trait All extends StObject {
    
    def concat(`val`: All): All
  }
  object All {
    
    inline def apply(concat: All => All): All = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat))
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setConcat(value: All => All): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    }
  }
}
