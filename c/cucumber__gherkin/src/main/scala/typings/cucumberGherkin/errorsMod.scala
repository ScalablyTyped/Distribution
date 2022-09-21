package typings.cucumberGherkin

import typings.cucumberMessages.mod.Location
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@cucumber/gherkin/dist/src/Errors", "AstBuilderException")
  @js.native
  open class AstBuilderException protected () extends GherkinException {
    def this(message: String) = this()
  }
  /* static members */
  object AstBuilderException {
    
    @JSImport("@cucumber/gherkin/dist/src/Errors", "AstBuilderException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(message: String, location: Location): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  @JSImport("@cucumber/gherkin/dist/src/Errors", "CompositeParserException")
  @js.native
  open class CompositeParserException protected () extends GherkinException {
    def this(message: String) = this()
  }
  /* static members */
  object CompositeParserException {
    
    @JSImport("@cucumber/gherkin/dist/src/Errors", "CompositeParserException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(errors: js.Array[js.Error]): CompositeParserException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(errors.asInstanceOf[js.Any]).asInstanceOf[CompositeParserException]
  }
  
  @JSImport("@cucumber/gherkin/dist/src/Errors", "GherkinException")
  @js.native
  open class GherkinException protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    var errors: js.Array[js.Error] = js.native
    
    var location: Location = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object GherkinException {
    
    @JSImport("@cucumber/gherkin/dist/src/Errors", "GherkinException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _create(message: String): GherkinException = ^.asInstanceOf[js.Dynamic].applyDynamic("_create")(message.asInstanceOf[js.Any]).asInstanceOf[GherkinException]
    inline def _create(message: String, location: Location): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(message.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  @JSImport("@cucumber/gherkin/dist/src/Errors", "NoSuchLanguageException")
  @js.native
  open class NoSuchLanguageException protected () extends GherkinException {
    def this(message: String) = this()
  }
  /* static members */
  object NoSuchLanguageException {
    
    @JSImport("@cucumber/gherkin/dist/src/Errors", "NoSuchLanguageException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(language: String): GherkinException = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(language.asInstanceOf[js.Any]).asInstanceOf[GherkinException]
    inline def create(language: String, location: Location): GherkinException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(language.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[GherkinException]
  }
  
  @JSImport("@cucumber/gherkin/dist/src/Errors", "ParserException")
  @js.native
  open class ParserException protected () extends GherkinException {
    def this(message: String) = this()
  }
  /* static members */
  object ParserException {
    
    @JSImport("@cucumber/gherkin/dist/src/Errors", "ParserException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(message: String, line: Double, column: Double): ParserException = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(message.asInstanceOf[js.Any], line.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[ParserException]
  }
}
