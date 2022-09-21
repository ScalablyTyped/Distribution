package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assignAssignMod {
  
  @JSImport("crocks/Assign/Assign", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Assign {
    
    /* CompleteClass */
    override def concat(`val`: Assign): Assign = js.native
  }
  object default {
    
    inline def apply(`val`: js.Object): Assign = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Assign]
    
    @JSImport("crocks/Assign/Assign", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Assign = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Assign]
  }
  
  trait Assign extends StObject {
    
    def concat(`val`: Assign): Assign
  }
  object Assign {
    
    inline def apply(concat: Assign => Assign): Assign = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat))
      __obj.asInstanceOf[Assign]
    }
    
    extension [Self <: Assign](x: Self) {
      
      inline def setConcat(value: Assign => Assign): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    }
  }
}
