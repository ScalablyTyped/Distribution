package typings.chardet

import typings.chardet.libEncodingMod.Recogniser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingUnicodeMod {
  
  @JSImport("chardet/lib/encoding/unicode", "UTF_16BE")
  @js.native
  open class UTF_16BE ()
    extends StObject
       with Recogniser
  
  @JSImport("chardet/lib/encoding/unicode", "UTF_16LE")
  @js.native
  open class UTF_16LE ()
    extends StObject
       with Recogniser
  
  @JSImport("chardet/lib/encoding/unicode", "UTF_32BE")
  @js.native
  open class UTF_32BE ()
    extends StObject
       with UTF_32 {
    
    /* CompleteClass */
    override def getChar(input: js.typedarray.Uint8Array, index: Double): Double = js.native
  }
  
  @JSImport("chardet/lib/encoding/unicode", "UTF_32LE")
  @js.native
  open class UTF_32LE ()
    extends StObject
       with UTF_32 {
    
    /* CompleteClass */
    override def getChar(input: js.typedarray.Uint8Array, index: Double): Double = js.native
  }
  
  @js.native
  trait UTF_32
    extends StObject
       with Recogniser
       with WithGetChar
  
  trait WithGetChar extends StObject {
    
    def getChar(input: js.typedarray.Uint8Array, index: Double): Double
  }
  object WithGetChar {
    
    inline def apply(getChar: (js.typedarray.Uint8Array, Double) => Double): WithGetChar = {
      val __obj = js.Dynamic.literal(getChar = js.Any.fromFunction2(getChar))
      __obj.asInstanceOf[WithGetChar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithGetChar] (val x: Self) extends AnyVal {
      
      inline def setGetChar(value: (js.typedarray.Uint8Array, Double) => Double): Self = StObject.set(x, "getChar", js.Any.fromFunction2(value))
    }
  }
}
