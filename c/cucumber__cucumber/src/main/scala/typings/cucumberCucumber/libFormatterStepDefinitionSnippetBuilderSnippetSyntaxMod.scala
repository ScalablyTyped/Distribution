package typings.cucumberCucumber

import typings.cucumberCucumberExpressions.mod.GeneratedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod {
  
  @js.native
  sealed trait SnippetInterface extends StObject
  @JSImport("@cucumber/cucumber/lib/formatter/step_definition_snippet_builder/snippet_syntax", "SnippetInterface")
  @js.native
  object SnippetInterface extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SnippetInterface & String] = js.native
    
    @js.native
    sealed trait AsyncAwait
      extends StObject
         with SnippetInterface
    /* "async-await" */ val AsyncAwait: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.SnippetInterface.AsyncAwait & String = js.native
    
    @js.native
    sealed trait Callback
      extends StObject
         with SnippetInterface
    /* "callback" */ val Callback: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.SnippetInterface.Callback & String = js.native
    
    @js.native
    sealed trait Promise
      extends StObject
         with SnippetInterface
    /* "promise" */ val Promise: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.SnippetInterface.Promise & String = js.native
    
    @js.native
    sealed trait Synchronous
      extends StObject
         with SnippetInterface
    /* "synchronous" */ val Synchronous: typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.SnippetInterface.Synchronous & String = js.native
  }
  
  trait ISnippetSnytax extends StObject {
    
    def build(options: ISnippetSyntaxBuildOptions): String
  }
  object ISnippetSnytax {
    
    inline def apply(build: ISnippetSyntaxBuildOptions => String): ISnippetSnytax = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build))
      __obj.asInstanceOf[ISnippetSnytax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISnippetSnytax] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: ISnippetSyntaxBuildOptions => String): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
    }
  }
  
  trait ISnippetSyntaxBuildOptions extends StObject {
    
    var comment: String
    
    var functionName: String
    
    var generatedExpressions: js.Array[GeneratedExpression]
    
    var stepParameterNames: js.Array[String]
  }
  object ISnippetSyntaxBuildOptions {
    
    inline def apply(
      comment: String,
      functionName: String,
      generatedExpressions: js.Array[GeneratedExpression],
      stepParameterNames: js.Array[String]
    ): ISnippetSyntaxBuildOptions = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], generatedExpressions = generatedExpressions.asInstanceOf[js.Any], stepParameterNames = stepParameterNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISnippetSyntaxBuildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISnippetSyntaxBuildOptions] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setGeneratedExpressions(value: js.Array[GeneratedExpression]): Self = StObject.set(x, "generatedExpressions", value.asInstanceOf[js.Any])
      
      inline def setGeneratedExpressionsVarargs(value: GeneratedExpression*): Self = StObject.set(x, "generatedExpressions", js.Array(value*))
      
      inline def setStepParameterNames(value: js.Array[String]): Self = StObject.set(x, "stepParameterNames", value.asInstanceOf[js.Any])
      
      inline def setStepParameterNamesVarargs(value: String*): Self = StObject.set(x, "stepParameterNames", js.Array(value*))
    }
  }
}
