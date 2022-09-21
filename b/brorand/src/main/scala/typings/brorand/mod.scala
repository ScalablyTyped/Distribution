package typings.brorand

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("brorand", JSImport.Namespace)
  @js.native
  val ^ : BrorandStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("brorand", "Rand")
  @js.native
  open class Rand protected ()
    extends StObject
       with RandInstance {
    def this(rand: typings.brorand.mod.rand) = this()
    
    /* CompleteClass */
    override def generate(len: Double): Buffer | js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var rand: typings.brorand.mod.rand = js.native
  }
  
  @js.native
  trait BrorandStatic extends StObject {
    
    def apply(len: Double): Buffer | js.typedarray.Uint8Array = js.native
    
    var Rand: RandStatic = js.native
  }
  
  trait RandInstance extends StObject {
    
    def generate(len: Double): Buffer | js.typedarray.Uint8Array
    
    var rand: typings.brorand.mod.rand
  }
  object RandInstance {
    
    inline def apply(generate: Double => Buffer | js.typedarray.Uint8Array, rand: rand): RandInstance = {
      val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), rand = rand.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandInstance]
    }
    
    extension [Self <: RandInstance](x: Self) {
      
      inline def setGenerate(value: Double => Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
      
      inline def setRand(value: rand): Self = StObject.set(x, "rand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RandStatic
    extends StObject
       with Instantiable1[/* rand */ rand, RandInstance]
  
  type _To = BrorandStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BrorandStatic = ^
  
  trait rand extends StObject {
    
    def getByte(): Double
  }
  object rand {
    
    inline def apply(getByte: () => Double): rand = {
      val __obj = js.Dynamic.literal(getByte = js.Any.fromFunction0(getByte))
      __obj.asInstanceOf[rand]
    }
    
    extension [Self <: rand](x: Self) {
      
      inline def setGetByte(value: () => Double): Self = StObject.set(x, "getByte", js.Any.fromFunction0(value))
    }
  }
}
