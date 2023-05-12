package typings.csstoolsCssTokenizer

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesErrorMod {
  
  @JSImport("@csstools/css-tokenizer/dist/interfaces/error", "ParseError")
  @js.native
  open class ParseError protected ()
    extends StObject
       with Error {
    def this(message: String, sourceStart: Double, sourceEnd: Double, parserState: js.Array[String]) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /** The parser steps that preceded the error. */
    var parserState: js.Array[String] = js.native
    
    /** The index of the end character of the current token. */
    var sourceEnd: Double = js.native
    
    /** The index of the start character of the current token. */
    var sourceStart: Double = js.native
  }
}
