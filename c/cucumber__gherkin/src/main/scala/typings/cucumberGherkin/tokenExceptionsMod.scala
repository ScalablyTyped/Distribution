package typings.cucumberGherkin

import typings.cucumberGherkin.errorsMod.GherkinException
import typings.cucumberGherkin.itokenMod.IToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenExceptionsMod {
  
  @JSImport("@cucumber/gherkin/dist/src/TokenExceptions", "UnexpectedEOFException")
  @js.native
  open class UnexpectedEOFException protected () extends GherkinException {
    def this(message: String) = this()
  }
  /* static members */
  object UnexpectedEOFException {
    
    @JSImport("@cucumber/gherkin/dist/src/TokenExceptions", "UnexpectedEOFException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[TokenType](token: IToken[TokenType], expectedTokenTypes: js.Array[String]): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(token.asInstanceOf[js.Any], expectedTokenTypes.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  @JSImport("@cucumber/gherkin/dist/src/TokenExceptions", "UnexpectedTokenException")
  @js.native
  open class UnexpectedTokenException protected () extends GherkinException {
    def this(message: String) = this()
  }
  /* static members */
  object UnexpectedTokenException {
    
    @JSImport("@cucumber/gherkin/dist/src/TokenExceptions", "UnexpectedTokenException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create[TokenType](token: IToken[TokenType], expectedTokenTypes: js.Array[String]): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(token.asInstanceOf[js.Any], expectedTokenTypes.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
}
