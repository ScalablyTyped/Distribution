package typings.bufferhelper

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bufferhelper", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with BufferHelper {
    
    /* CompleteClass */
    override def concat(buffer: js.Any): BufferHelper = js.native
    
    /* CompleteClass */
    override def empty(): BufferHelper = js.native
    
    /* CompleteClass */
    override def load(stream: js.Any, callback: js.Function1[/* arg */ js.Any, js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def toBuffer(): Buffer = js.native
    
    /* CompleteClass */
    override def toString(encoding: encoding): String = js.native
  }
  
  trait BufferHelper extends StObject {
    
    def concat(buffer: js.Any): BufferHelper
    
    def empty(): BufferHelper
    
    def load(stream: js.Any, callback: js.Function1[/* arg */ js.Any, js.Any]): Unit
    
    def toBuffer(): Buffer
    
    def toString(encoding: encoding): String
  }
  object BufferHelper {
    
    inline def apply(
      concat: js.Any => BufferHelper,
      empty: () => BufferHelper,
      load: (js.Any, js.Function1[/* arg */ js.Any, js.Any]) => Unit,
      toBuffer: () => Buffer,
      toString_ : encoding => String
    ): BufferHelper = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), empty = js.Any.fromFunction0(empty), load = js.Any.fromFunction2(load), toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[BufferHelper]
    }
    
    extension [Self <: BufferHelper](x: Self) {
      
      inline def setConcat(value: js.Any => BufferHelper): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: () => BufferHelper): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setLoad(value: (js.Any, js.Function1[/* arg */ js.Any, js.Any]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
      
      inline def setToString_(value: encoding => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bufferhelper.bufferhelperStrings.ascii
    - typings.bufferhelper.bufferhelperStrings.utf8
    - typings.bufferhelper.bufferhelperStrings.utf16le
    - typings.bufferhelper.bufferhelperStrings.ucs2
    - typings.bufferhelper.bufferhelperStrings.base64
    - typings.bufferhelper.bufferhelperStrings.binary
    - typings.bufferhelper.bufferhelperStrings.hex
  */
  trait encoding extends StObject
  object encoding {
    
    inline def ascii: typings.bufferhelper.bufferhelperStrings.ascii = "ascii".asInstanceOf[typings.bufferhelper.bufferhelperStrings.ascii]
    
    inline def base64: typings.bufferhelper.bufferhelperStrings.base64 = "base64".asInstanceOf[typings.bufferhelper.bufferhelperStrings.base64]
    
    inline def binary: typings.bufferhelper.bufferhelperStrings.binary = "binary".asInstanceOf[typings.bufferhelper.bufferhelperStrings.binary]
    
    inline def hex: typings.bufferhelper.bufferhelperStrings.hex = "hex".asInstanceOf[typings.bufferhelper.bufferhelperStrings.hex]
    
    inline def ucs2: typings.bufferhelper.bufferhelperStrings.ucs2 = "ucs2".asInstanceOf[typings.bufferhelper.bufferhelperStrings.ucs2]
    
    inline def utf16le: typings.bufferhelper.bufferhelperStrings.utf16le = "utf16le".asInstanceOf[typings.bufferhelper.bufferhelperStrings.utf16le]
    
    inline def utf8: typings.bufferhelper.bufferhelperStrings.utf8 = "utf8".asInstanceOf[typings.bufferhelper.bufferhelperStrings.utf8]
  }
}
