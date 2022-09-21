package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tupleTupleMod {
  
  @JSImport("crocks/Tuple/Tuple", "Tuple")
  @js.native
  open class Tuple () extends StObject {
    
    def concat(`val`: Tuple): Tuple = js.native
  }
  /* static members */
  object Tuple {
    
    inline def apply(val1: Any, val2: Any): Tuple = (^.asInstanceOf[js.Dynamic].apply(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[Tuple]
    
    @JSImport("crocks/Tuple/Tuple", "Tuple")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Tuple]
    
    inline def of(`val`: Any): Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Tuple]
  }
}
