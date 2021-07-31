package typings.bytewise

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bytewise", JSImport.Namespace)
  @js.native
  val ^ : Bytewise = js.native
  
  trait Bytewise
    extends StObject
       with /* k */ StringDictionary[js.Any] {
    
    def decode(value: Buffer): js.Any
    
    def encode(value: js.Any): Buffer
  }
  object Bytewise {
    
    @scala.inline
    def apply(decode: Buffer => js.Any, encode: js.Any => Buffer): Bytewise = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Bytewise]
    }
    
    @scala.inline
    implicit class BytewiseMutableBuilder[Self <: Bytewise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: Buffer => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.Any => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Bytewise
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bytewise = ^
}
