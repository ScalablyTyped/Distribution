package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.ISnippetSnytax
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.ISnippetSyntaxBuildOptions
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.SnippetInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterStepDefinitionSnippetBuilderJavascriptSnippetSyntaxMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/step_definition_snippet_builder/javascript_snippet_syntax", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with JavaScriptSnippetSyntax {
    def this(snippetInterface: SnippetInterface) = this()
    
    /* CompleteClass */
    override def build(options: ISnippetSyntaxBuildOptions): String = js.native
    
    /* private */ /* CompleteClass */
    var escapeSpecialCharacters: Any = js.native
    
    /* private */ /* CompleteClass */
    override val snippetInterface: Any = js.native
  }
  
  trait JavaScriptSnippetSyntax
    extends StObject
       with ISnippetSnytax {
    
    /* private */ var escapeSpecialCharacters: Any
    
    /* private */ val snippetInterface: Any
  }
  object JavaScriptSnippetSyntax {
    
    inline def apply(build: ISnippetSyntaxBuildOptions => String, escapeSpecialCharacters: Any, snippetInterface: Any): JavaScriptSnippetSyntax = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), escapeSpecialCharacters = escapeSpecialCharacters.asInstanceOf[js.Any], snippetInterface = snippetInterface.asInstanceOf[js.Any])
      __obj.asInstanceOf[JavaScriptSnippetSyntax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JavaScriptSnippetSyntax] (val x: Self) extends AnyVal {
      
      inline def setEscapeSpecialCharacters(value: Any): Self = StObject.set(x, "escapeSpecialCharacters", value.asInstanceOf[js.Any])
      
      inline def setSnippetInterface(value: Any): Self = StObject.set(x, "snippetInterface", value.asInstanceOf[js.Any])
    }
  }
}
