package typings.brorand

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("brorand", JSImport.Namespace)
  @js.native
  val ^ : BrorandStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("brorand", "Rand")
  @js.native
  class Rand protected () extends RandInstance {
    def this(rand: typings.brorand.mod.rand) = this()
  }
  
  @js.native
  trait BrorandStatic extends StObject {
    
    def apply(len: Double): Buffer | Uint8Array = js.native
    
    var Rand: RandStatic = js.native
  }
  
  @js.native
  trait RandInstance extends StObject {
    
    def generate(len: Double): Buffer | Uint8Array = js.native
    
    var rand: typings.brorand.mod.rand = js.native
  }
  object RandInstance {
    
    @scala.inline
    def apply(generate: Double => Buffer | Uint8Array, rand: rand): RandInstance = {
      val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), rand = rand.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandInstance]
    }
    
    @scala.inline
    implicit class RandInstanceMutableBuilder[Self <: RandInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerate(value: Double => Buffer | Uint8Array): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRand(value: rand): Self = StObject.set(x, "rand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RandStatic extends Instantiable1[/* rand */ rand, RandInstance]
  
  type _To = BrorandStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BrorandStatic = ^
  
  @js.native
  trait rand extends StObject {
    
    def getByte(): Double = js.native
  }
  object rand {
    
    @scala.inline
    def apply(getByte: () => Double): rand = {
      val __obj = js.Dynamic.literal(getByte = js.Any.fromFunction0(getByte))
      __obj.asInstanceOf[rand]
    }
    
    @scala.inline
    implicit class randMutableBuilder[Self <: rand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetByte(value: () => Double): Self = StObject.set(x, "getByte", js.Any.fromFunction0(value))
    }
  }
}
