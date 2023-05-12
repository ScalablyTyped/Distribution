package typings.csstoolsCssTokenizer

import typings.csstoolsCssTokenizer.distInterfacesCodePointReaderMod.CodePointReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReaderMod {
  
  @JSImport("@csstools/css-tokenizer/dist/reader", "Reader")
  @js.native
  open class Reader protected ()
    extends StObject
       with CodePointReader {
    def this(source: String) = this()
    
    var length: Double = js.native
  }
}
