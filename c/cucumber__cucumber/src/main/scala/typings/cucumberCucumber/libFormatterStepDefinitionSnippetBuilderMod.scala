package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterHelpersKeywordTypeMod.KeywordType
import typings.cucumberCucumber.libFormatterStepDefinitionSnippetBuilderSnippetSyntaxMod.ISnippetSnytax
import typings.cucumberCucumberExpressions.mod.ParameterTypeRegistry
import typings.cucumberMessages.mod.PickleStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterStepDefinitionSnippetBuilderMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/step_definition_snippet_builder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StepDefinitionSnippetBuilder {
    def this(param0: INewStepDefinitionSnippetBuilderOptions) = this()
    
    /* CompleteClass */
    override def build(param0: IBuildRequest): String = js.native
    
    /* private */ /* CompleteClass */
    override val cucumberExpressionGenerator: Any = js.native
    
    /* CompleteClass */
    override def getFunctionName(keywordType: KeywordType): String = js.native
    
    /* CompleteClass */
    override def getStepParameterNames(step: PickleStep): js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    override val snippetSyntax: Any = js.native
  }
  
  trait IBuildRequest extends StObject {
    
    var keywordType: KeywordType
    
    var pickleStep: PickleStep
  }
  object IBuildRequest {
    
    inline def apply(keywordType: KeywordType, pickleStep: PickleStep): IBuildRequest = {
      val __obj = js.Dynamic.literal(keywordType = keywordType.asInstanceOf[js.Any], pickleStep = pickleStep.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBuildRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBuildRequest] (val x: Self) extends AnyVal {
      
      inline def setKeywordType(value: KeywordType): Self = StObject.set(x, "keywordType", value.asInstanceOf[js.Any])
      
      inline def setPickleStep(value: PickleStep): Self = StObject.set(x, "pickleStep", value.asInstanceOf[js.Any])
    }
  }
  
  trait INewStepDefinitionSnippetBuilderOptions extends StObject {
    
    var parameterTypeRegistry: ParameterTypeRegistry
    
    var snippetSyntax: ISnippetSnytax
  }
  object INewStepDefinitionSnippetBuilderOptions {
    
    inline def apply(parameterTypeRegistry: ParameterTypeRegistry, snippetSyntax: ISnippetSnytax): INewStepDefinitionSnippetBuilderOptions = {
      val __obj = js.Dynamic.literal(parameterTypeRegistry = parameterTypeRegistry.asInstanceOf[js.Any], snippetSyntax = snippetSyntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[INewStepDefinitionSnippetBuilderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INewStepDefinitionSnippetBuilderOptions] (val x: Self) extends AnyVal {
      
      inline def setParameterTypeRegistry(value: ParameterTypeRegistry): Self = StObject.set(x, "parameterTypeRegistry", value.asInstanceOf[js.Any])
      
      inline def setSnippetSyntax(value: ISnippetSnytax): Self = StObject.set(x, "snippetSyntax", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepDefinitionSnippetBuilder extends StObject {
    
    def build(param0: IBuildRequest): String
    
    /* private */ val cucumberExpressionGenerator: Any
    
    def getFunctionName(keywordType: KeywordType): String
    
    def getStepParameterNames(step: PickleStep): js.Array[String]
    
    /* private */ val snippetSyntax: Any
  }
  object StepDefinitionSnippetBuilder {
    
    inline def apply(
      build: IBuildRequest => String,
      cucumberExpressionGenerator: Any,
      getFunctionName: KeywordType => String,
      getStepParameterNames: PickleStep => js.Array[String],
      snippetSyntax: Any
    ): StepDefinitionSnippetBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), cucumberExpressionGenerator = cucumberExpressionGenerator.asInstanceOf[js.Any], getFunctionName = js.Any.fromFunction1(getFunctionName), getStepParameterNames = js.Any.fromFunction1(getStepParameterNames), snippetSyntax = snippetSyntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepDefinitionSnippetBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepDefinitionSnippetBuilder] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: IBuildRequest => String): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
      
      inline def setCucumberExpressionGenerator(value: Any): Self = StObject.set(x, "cucumberExpressionGenerator", value.asInstanceOf[js.Any])
      
      inline def setGetFunctionName(value: KeywordType => String): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction1(value))
      
      inline def setGetStepParameterNames(value: PickleStep => js.Array[String]): Self = StObject.set(x, "getStepParameterNames", js.Any.fromFunction1(value))
      
      inline def setSnippetSyntax(value: Any): Self = StObject.set(x, "snippetSyntax", value.asInstanceOf[js.Any])
    }
  }
}
