package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityIdentityMod {
  
  @JSImport("crocks/Identity/Identity", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Identity {
    
    /* CompleteClass */
    override def ap(`val`: Identity): Identity = js.native
    
    /* CompleteClass */
    override def chain(fn: UnaryFunction): Identity = js.native
    
    /* CompleteClass */
    override def concat(`val`: Identity): Identity = js.native
    
    /* CompleteClass */
    override def map(fn: UnaryFunction): Identity = js.native
    
    /* CompleteClass */
    override def sequence(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def traverse(`val`: Any): Any = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Identity = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Identity]
    
    @JSImport("crocks/Identity/Identity", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def of(`val`: Any): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Identity]
  }
  
  trait Identity extends StObject {
    
    def ap(`val`: Identity): Identity
    
    def chain(fn: UnaryFunction): Identity
    
    def concat(`val`: Identity): Identity
    
    def map(fn: UnaryFunction): Identity
    
    def sequence(`val`: Any): Any
    
    def traverse(`val`: Any): Any
  }
  object Identity {
    
    inline def apply(
      ap: Identity => Identity,
      chain: UnaryFunction => Identity,
      concat: Identity => Identity,
      map: UnaryFunction => Identity,
      sequence: Any => Any,
      traverse: Any => Any
    ): Identity = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), chain = js.Any.fromFunction1(chain), concat = js.Any.fromFunction1(concat), map = js.Any.fromFunction1(map), sequence = js.Any.fromFunction1(sequence), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[Identity]
    }
    
    extension [Self <: Identity](x: Self) {
      
      inline def setAp(value: Identity => Identity): Self = StObject.set(x, "ap", js.Any.fromFunction1(value))
      
      inline def setChain(value: UnaryFunction => Identity): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setConcat(value: Identity => Identity): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setMap(value: UnaryFunction => Identity): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setSequence(value: Any => Any): Self = StObject.set(x, "sequence", js.Any.fromFunction1(value))
      
      inline def setTraverse(value: Any => Any): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
}
