package typings.crocks

import typings.crocks.typesMod.NullaryFunction
import typings.crocks.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeMaybeMod {
  
  @JSImport("crocks/Maybe/Maybe", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Maybe {
    
    /* CompleteClass */
    override def alt(`val`: Maybe): Maybe = js.native
    
    /* CompleteClass */
    override def ap(`val`: Maybe): Maybe = js.native
    
    /* CompleteClass */
    override def bichain(fn1: NullaryFunction, fn2: UnaryFunction): Maybe = js.native
    
    /* CompleteClass */
    override def chain(fn: UnaryFunction): Maybe = js.native
    
    /* CompleteClass */
    override def coalesce(fn1: NullaryFunction, fn2: UnaryFunction): Maybe = js.native
    
    /* CompleteClass */
    override def concat(`val`: Maybe): Maybe = js.native
    
    /* CompleteClass */
    override def either(fn1: NullaryFunction, fn2: UnaryFunction): Any = js.native
    
    /* CompleteClass */
    override def map(fn: UnaryFunction): Maybe = js.native
    
    /* CompleteClass */
    override def option(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def sequence(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def traverse(`val`: Any): Any = js.native
  }
  object default {
    
    inline def apply(`val`: Any): Maybe = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[Maybe]
    
    @JSImport("crocks/Maybe/Maybe", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("crocks/Maybe/Maybe", "default.Just")
    @js.native
    def Just: js.Function1[/* val */ Any, typings.crocks.maybeMaybeMod.Just] = js.native
    inline def Just_=(x: js.Function1[/* val */ Any, Just]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Just")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("crocks/Maybe/Maybe", "default.Nothing")
    @js.native
    def Nothing: js.Function1[/* val */ Any, typings.crocks.maybeMaybeMod.Nothing] = js.native
    inline def Nothing_=(x: js.Function1[/* val */ Any, Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nothing")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def of(`val`: Any): Just = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[Just]
    
    /* static member */
    inline def zero(): Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Nothing]
  }
  
  @js.native
  trait Just
    extends StObject
       with Maybe {
    
    def apply(`val`: Any): Just = js.native
  }
  
  trait Maybe extends StObject {
    
    def alt(`val`: Maybe): Maybe
    
    def ap(`val`: Maybe): Maybe
    
    def bichain(fn1: NullaryFunction, fn2: UnaryFunction): Maybe
    
    def chain(fn: UnaryFunction): Maybe
    
    def coalesce(fn1: NullaryFunction, fn2: UnaryFunction): Maybe
    
    def concat(`val`: Maybe): Maybe
    
    def either(fn1: NullaryFunction, fn2: UnaryFunction): Any
    
    def map(fn: UnaryFunction): Maybe
    
    def option(`val`: Any): Any
    
    def sequence(`val`: Any): Any
    
    def traverse(`val`: Any): Any
  }
  object Maybe {
    
    inline def apply(
      alt: Maybe => Maybe,
      ap: Maybe => Maybe,
      bichain: (NullaryFunction, UnaryFunction) => Maybe,
      chain: UnaryFunction => Maybe,
      coalesce: (NullaryFunction, UnaryFunction) => Maybe,
      concat: Maybe => Maybe,
      either: (NullaryFunction, UnaryFunction) => Any,
      map: UnaryFunction => Maybe,
      option: Any => Any,
      sequence: Any => Any,
      traverse: Any => Any
    ): Maybe = {
      val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt), ap = js.Any.fromFunction1(ap), bichain = js.Any.fromFunction2(bichain), chain = js.Any.fromFunction1(chain), coalesce = js.Any.fromFunction2(coalesce), concat = js.Any.fromFunction1(concat), either = js.Any.fromFunction2(either), map = js.Any.fromFunction1(map), option = js.Any.fromFunction1(option), sequence = js.Any.fromFunction1(sequence), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[Maybe]
    }
    
    extension [Self <: Maybe](x: Self) {
      
      inline def setAlt(value: Maybe => Maybe): Self = StObject.set(x, "alt", js.Any.fromFunction1(value))
      
      inline def setAp(value: Maybe => Maybe): Self = StObject.set(x, "ap", js.Any.fromFunction1(value))
      
      inline def setBichain(value: (NullaryFunction, UnaryFunction) => Maybe): Self = StObject.set(x, "bichain", js.Any.fromFunction2(value))
      
      inline def setChain(value: UnaryFunction => Maybe): Self = StObject.set(x, "chain", js.Any.fromFunction1(value))
      
      inline def setCoalesce(value: (NullaryFunction, UnaryFunction) => Maybe): Self = StObject.set(x, "coalesce", js.Any.fromFunction2(value))
      
      inline def setConcat(value: Maybe => Maybe): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setEither(value: (NullaryFunction, UnaryFunction) => Any): Self = StObject.set(x, "either", js.Any.fromFunction2(value))
      
      inline def setMap(value: UnaryFunction => Maybe): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setOption(value: Any => Any): Self = StObject.set(x, "option", js.Any.fromFunction1(value))
      
      inline def setSequence(value: Any => Any): Self = StObject.set(x, "sequence", js.Any.fromFunction1(value))
      
      inline def setTraverse(value: Any => Any): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Nothing
    extends StObject
       with Maybe {
    
    def apply(): Nothing = js.native
  }
}
