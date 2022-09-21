package typings.cucumberGherkin

import typings.cucumberGherkin.itokenMod.IToken
import typings.cucumberMessages.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenScannerMod {
  
  @JSImport("@cucumber/gherkin/dist/src/TokenScanner", JSImport.Default)
  @js.native
  open class default[TokenType] protected ()
    extends StObject
       with TokenScanner[TokenType] {
    def this(
      source: String,
      makeToken: js.Function2[/* line */ String, /* location */ Location, IToken[TokenType]]
    ) = this()
    
    /* private */ /* CompleteClass */
    var lineNumber: Any = js.native
    
    /* private */ /* CompleteClass */
    var lines: Any = js.native
    
    /* private */ /* CompleteClass */
    override val makeToken: Any = js.native
    
    /* CompleteClass */
    override def read(): IToken[TokenType] = js.native
  }
  
  trait TokenScanner[TokenType] extends StObject {
    
    /* private */ var lineNumber: Any
    
    /* private */ var lines: Any
    
    /* private */ val makeToken: Any
    
    def read(): IToken[TokenType]
  }
  object TokenScanner {
    
    inline def apply[TokenType](lineNumber: Any, lines: Any, makeToken: Any, read: () => IToken[TokenType]): TokenScanner[TokenType] = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], makeToken = makeToken.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[TokenScanner[TokenType]]
    }
    
    extension [Self <: TokenScanner[?], TokenType](x: Self & TokenScanner[TokenType]) {
      
      inline def setLineNumber(value: Any): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Any): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setMakeToken(value: Any): Self = StObject.set(x, "makeToken", value.asInstanceOf[js.Any])
      
      inline def setRead(value: () => IToken[TokenType]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}
