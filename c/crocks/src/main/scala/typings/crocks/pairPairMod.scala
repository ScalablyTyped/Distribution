package typings.crocks

import typings.crocks.internalTypesMod.BinaryFunction
import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairPairMod {
  
  @JSImport("crocks/Pair/Pair", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Pair {
    
    /* CompleteClass */
    override def ap(`val`: Pair): Pair = js.native
    
    /* CompleteClass */
    override def bimap(fn1: UnaryFunction, fn2: UnaryFunction): Pair = js.native
    
    /* CompleteClass */
    override def chain(fn: js.Function1[/* val */ Any, this.type]): Pair = js.native
    
    /* CompleteClass */
    override def concat(`val`: Pair): Pair = js.native
    
    /* CompleteClass */
    override def extend(fn: js.Function1[/* val */ this.type, Any]): Pair = js.native
    
    /* CompleteClass */
    override def fst(): Any = js.native
    
    /* CompleteClass */
    override def map(fn: UnaryFunction): Pair = js.native
    
    /* CompleteClass */
    override def merge(fn: BinaryFunction): Any = js.native
    
    /* CompleteClass */
    override def sequence(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def snd(): Any = js.native
    
    /* CompleteClass */
    override def swap(fn1: UnaryFunction, fn2: UnaryFunction): Pair = js.native
    
    /* CompleteClass */
    override def toArray(): js.Tuple2[Any, Any] = js.native
    
    /* CompleteClass */
    override def traverse(`val`: Any): Any = js.native
  }
  object default {
    
    @JSImport("crocks/Pair/Pair", JSImport.Default)
    @js.native
    def apply(val1: Any, val2: Any): Pair = js.native
  }
  
  trait Pair extends StObject {
    
    def ap(`val`: Pair): Pair
    
    def bimap(fn1: UnaryFunction, fn2: UnaryFunction): Pair
    
    def chain(fn: js.Function1[/* val */ Any, this.type]): Pair
    
    def concat(`val`: Pair): Pair
    
    def extend(fn: js.Function1[/* val */ this.type, Any]): Pair
    
    def fst(): Any
    
    def map(fn: UnaryFunction): Pair
    
    def merge(fn: BinaryFunction): Any
    
    def sequence(`val`: Any): Any
    
    def snd(): Any
    
    def swap(fn1: UnaryFunction, fn2: UnaryFunction): Pair
    
    def toArray(): js.Tuple2[Any, Any]
    
    def traverse(`val`: Any): Any
  }
  object Pair {
    
    inline def apply(
      ap: Pair => Pair,
      bimap: (UnaryFunction, UnaryFunction) => Pair,
      chain: js.Function1[/* val */ Any, Pair] => Pair,
      concat: Pair => Pair,
      extend: js.Function1[Pair, Any] => Pair,
      fst: () => Any,
      map: UnaryFunction => Pair,
      merge: BinaryFunction => Any,
      sequence: Any => Any,
      snd: () => Any,
      swap: (UnaryFunction, UnaryFunction) => Pair,
      toArray: () => js.Tuple2[Any, Any],
      traverse: Any => Any
    ): Pair = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), bimap = js.Any.fromFunction2(bimap), chain = js.Any.fromFunction1(chain), concat = js.Any.fromFunction1(concat), extend = js.Any.fromFunction1(extend), fst = js.Any.fromFunction0(fst), map = js.Any.fromFunction1(map), merge = js.Any.fromFunction1(merge), sequence = js.Any.fromFunction1(sequence), snd = js.Any.fromFunction0(snd), swap = js.Any.fromFunction2(swap), toArray = js.Any.fromFunction0(toArray), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[Pair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pair] (val x: Self) extends AnyVal {
      
      inline def setAp(value: Pair => Pair): Self = StObject.set(x, "ap", js.Any.fromFunction1(value))
      
      inline def setBimap(value: (UnaryFunction, UnaryFunction) => Pair): Self = StObject.set(x, "bimap", js.Any.fromFunction2(value))
      
      inline def setChain(value: js.Function1[/* val */ Any, Pair] => Pair): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setConcat(value: Pair => Pair): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setExtend(value: js.Function1[Pair, Any] => Pair): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setFst(value: () => Any): Self = StObject.set(x, "fst", js.Any.fromFunction0(value))
      
      inline def setMap(value: UnaryFunction => Pair): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMerge(value: BinaryFunction => Any): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
      
      inline def setSequence(value: Any => Any): Self = StObject.set(x, "sequence", js.Any.fromFunction1(value))
      
      inline def setSnd(value: () => Any): Self = StObject.set(x, "snd", js.Any.fromFunction0(value))
      
      inline def setSwap(value: (UnaryFunction, UnaryFunction) => Pair): Self = StObject.set(x, "swap", js.Any.fromFunction2(value))
      
      inline def setToArray(value: () => js.Tuple2[Any, Any]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def setTraverse(value: Any => Any): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
}
