package typings.crocks

import typings.crocks.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherEitherMod {
  
  @JSImport("crocks/Either/Either", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Either {
    
    /* CompleteClass */
    override def alt(`val`: Either): Either = js.native
    
    /* CompleteClass */
    override def ap(`val`: Either): Either = js.native
    
    /* CompleteClass */
    override def bichain(fn1: UnaryFunction, fn2: UnaryFunction): Either = js.native
    
    /* CompleteClass */
    override def bimap(fn1: UnaryFunction, fn2: UnaryFunction): Either = js.native
    
    /* CompleteClass */
    override def chain(fn: UnaryFunction): Either = js.native
    
    /* CompleteClass */
    override def coalesce(fn1: UnaryFunction, fn2: UnaryFunction): Either = js.native
    
    /* CompleteClass */
    override def concat(`val`: Either): Either = js.native
    
    /* CompleteClass */
    override def either(fn1: UnaryFunction, fn2: UnaryFunction): Any = js.native
    
    /* CompleteClass */
    override def map(fn: UnaryFunction): Either = js.native
    
    /* CompleteClass */
    override def sequence(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def swap(fn1: UnaryFunction, fn2: UnaryFunction): Either = js.native
    
    /* CompleteClass */
    override def traverse(`val`: Any): Any = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
    
    @JSImport("crocks/Either/Either", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Left(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].applyDynamic("Left")(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
    
    /* static member */
    inline def Right(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].applyDynamic("Right")(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
    
    /* static member */
    inline def of(`val`: Any): Either = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Either]
  }
  
  trait Either extends StObject {
    
    def alt(`val`: Either): Either
    
    def ap(`val`: Either): Either
    
    def bichain(fn1: UnaryFunction, fn2: UnaryFunction): Either
    
    def bimap(fn1: UnaryFunction, fn2: UnaryFunction): Either
    
    def chain(fn: UnaryFunction): Either
    
    def coalesce(fn1: UnaryFunction, fn2: UnaryFunction): Either
    
    def concat(`val`: Either): Either
    
    def either(fn1: UnaryFunction, fn2: UnaryFunction): Any
    
    def map(fn: UnaryFunction): Either
    
    def sequence(`val`: Any): Any
    
    def swap(fn1: UnaryFunction, fn2: UnaryFunction): Either
    
    def traverse(`val`: Any): Any
  }
  object Either {
    
    inline def apply(
      alt: Either => Either,
      ap: Either => Either,
      bichain: (UnaryFunction, UnaryFunction) => Either,
      bimap: (UnaryFunction, UnaryFunction) => Either,
      chain: UnaryFunction => Either,
      coalesce: (UnaryFunction, UnaryFunction) => Either,
      concat: Either => Either,
      either: (UnaryFunction, UnaryFunction) => Any,
      map: UnaryFunction => Either,
      sequence: Any => Any,
      swap: (UnaryFunction, UnaryFunction) => Either,
      traverse: Any => Any
    ): Either = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt), ap = js.Any.fromFunction1(ap), bichain = js.Any.fromFunction2(bichain), bimap = js.Any.fromFunction2(bimap), chain = js.Any.fromFunction1(chain), coalesce = js.Any.fromFunction2(coalesce), concat = js.Any.fromFunction1(concat), either = js.Any.fromFunction2(either), map = js.Any.fromFunction1(map), sequence = js.Any.fromFunction1(sequence), swap = js.Any.fromFunction2(swap), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[Either]
    }
    
    extension [Self <: Either](x: Self) {
      
      inline def setAlt(value: Either => Either): Self = StObject.set(x, "alt", js.Any.fromFunction1(value))
      
      inline def setAp(value: Either => Either): Self = StObject.set(x, "ap", js.Any.fromFunction1(value))
      
      inline def setBichain(value: (UnaryFunction, UnaryFunction) => Either): Self = StObject.set(x, "bichain", js.Any.fromFunction2(value))
      
      inline def setBimap(value: (UnaryFunction, UnaryFunction) => Either): Self = StObject.set(x, "bimap", js.Any.fromFunction2(value))
      
      inline def setChain(value: UnaryFunction => Either): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setCoalesce(value: (UnaryFunction, UnaryFunction) => Either): Self = StObject.set(x, "coalesce", js.Any.fromFunction2(value))
      
      inline def setConcat(value: Either => Either): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setEither(value: (UnaryFunction, UnaryFunction) => Any): Self = StObject.set(x, "either", js.Any.fromFunction2(value))
      
      inline def setMap(value: UnaryFunction => Either): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setSequence(value: Any => Any): Self = StObject.set(x, "sequence", js.Any.fromFunction1(value))
      
      inline def setSwap(value: (UnaryFunction, UnaryFunction) => Either): Self = StObject.set(x, "swap", js.Any.fromFunction2(value))
      
      inline def setTraverse(value: Any => Any): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
}
