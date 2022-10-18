package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constConstMod {
  
  @JSImport("crocks/Const/Const", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Const {
    
    /* CompleteClass */
    override def ap(`val`: Const): Const = js.native
    
    /* CompleteClass */
    override def concat(`val`: Const): Const = js.native
    
    /* CompleteClass */
    override def map(fn: UnaryFunction): Const = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Const = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Const]
    
    @JSImport("crocks/Const/Const", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): Const = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Const]
    
    /* static member */
    inline def of(`val`: Any): Const = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Const]
  }
  
  trait Const extends StObject {
    
    def ap(`val`: Const): Const
    
    def concat(`val`: Const): Const
    
    def map(fn: UnaryFunction): Const
  }
  object Const {
    
    inline def apply(ap: Const => Const, concat: Const => Const, map: UnaryFunction => Const): Const = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), concat = js.Any.fromFunction1(concat), map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[Const]
    }
    
    extension [Self <: Const](x: Self) {
      
      inline def setAp(value: Const => Const): Self = StObject.set(x, "ap", js.Any.fromFunction1(value))
      
      inline def setConcat(value: Const => Const): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setMap(value: UnaryFunction => Const): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
}
