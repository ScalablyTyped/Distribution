package typings.cucumberCucumber

import typings.cucumberCucumber.libModelsGherkinStepKeywordMod.GherkinStepKeyword
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ITestCaseHookParameter
import typings.cucumberCucumberExpressions.distCjsSrcTypesMod.Expression
import typings.cucumberMessages.mod.PickleStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsDefinitionMod {
  
  /* note: abstract class */ @JSImport("@cucumber/cucumber/lib/models/definition", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Definition {
    def this(param0: IDefinitionParameters[IDefinitionOptions]) = this()
  }
  
  @js.native
  trait Definition extends StObject {
    
    def baseGetInvalidCodeLengthMessage(parameters: js.Array[Any]): String = js.native
    
    def buildInvalidCodeLengthMessage(syncOrPromiseLength: String, callbackLength: String): String = js.native
    def buildInvalidCodeLengthMessage(syncOrPromiseLength: String, callbackLength: Double): String = js.native
    def buildInvalidCodeLengthMessage(syncOrPromiseLength: Double, callbackLength: String): String = js.native
    def buildInvalidCodeLengthMessage(syncOrPromiseLength: Double, callbackLength: Double): String = js.native
    
    val code: js.Function = js.native
    
    val id: String = js.native
    
    val line: Double = js.native
    
    val options: IDefinitionOptions = js.native
    
    val unwrappedCode: js.Function = js.native
    
    val uri: String = js.native
  }
  
  trait IDefinition extends StObject {
    
    val code: js.Function
    
    def getInvocationParameters(options: IGetInvocationDataRequest): js.Promise[IGetInvocationDataResponse]
    
    val id: String
    
    val line: Double
    
    val options: IDefinitionOptions
    
    val unwrappedCode: js.Function
    
    val uri: String
  }
  object IDefinition {
    
    inline def apply(
      code: js.Function,
      getInvocationParameters: IGetInvocationDataRequest => js.Promise[IGetInvocationDataResponse],
      id: String,
      line: Double,
      options: IDefinitionOptions,
      unwrappedCode: js.Function,
      uri: String
    ): IDefinition = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], getInvocationParameters = js.Any.fromFunction1(getInvocationParameters), id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], unwrappedCode = unwrappedCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefinition] (val x: Self) extends AnyVal {
      
      inline def setCode(value: js.Function): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setGetInvocationParameters(value: IGetInvocationDataRequest => js.Promise[IGetInvocationDataResponse]): Self = StObject.set(x, "getInvocationParameters", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: IDefinitionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUnwrappedCode(value: js.Function): Self = StObject.set(x, "unwrappedCode", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDefinitionOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var wrapperOptions: js.UndefOr[Any] = js.undefined
  }
  object IDefinitionOptions {
    
    inline def apply(): IDefinitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefinitionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefinitionOptions] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWrapperOptions(value: Any): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
      
      inline def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
    }
  }
  
  trait IDefinitionParameters[T /* <: IDefinitionOptions */] extends StObject {
    
    var code: js.Function
    
    var id: String
    
    var line: Double
    
    var options: T
    
    var unwrappedCode: js.UndefOr[js.Function] = js.undefined
    
    var uri: String
  }
  object IDefinitionParameters {
    
    inline def apply[T /* <: IDefinitionOptions */](code: js.Function, id: String, line: Double, options: T, uri: String): IDefinitionParameters[T] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDefinitionParameters[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefinitionParameters[?], T /* <: IDefinitionOptions */] (val x: Self & IDefinitionParameters[T]) extends AnyVal {
      
      inline def setCode(value: js.Function): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUnwrappedCode(value: js.Function): Self = StObject.set(x, "unwrappedCode", value.asInstanceOf[js.Any])
      
      inline def setUnwrappedCodeUndefined: Self = StObject.set(x, "unwrappedCode", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGetInvocationDataRequest extends StObject {
    
    var hookParameter: ITestCaseHookParameter
    
    var step: PickleStep
    
    var world: Any
  }
  object IGetInvocationDataRequest {
    
    inline def apply(hookParameter: ITestCaseHookParameter, step: PickleStep, world: Any): IGetInvocationDataRequest = {
      val __obj = js.Dynamic.literal(hookParameter = hookParameter.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetInvocationDataRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetInvocationDataRequest] (val x: Self) extends AnyVal {
      
      inline def setHookParameter(value: ITestCaseHookParameter): Self = StObject.set(x, "hookParameter", value.asInstanceOf[js.Any])
      
      inline def setStep(value: PickleStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setWorld(value: Any): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGetInvocationDataResponse extends StObject {
    
    def getInvalidCodeLengthMessage(): String
    
    var parameters: js.Array[Any]
    
    var validCodeLengths: js.Array[Double]
  }
  object IGetInvocationDataResponse {
    
    inline def apply(
      getInvalidCodeLengthMessage: () => String,
      parameters: js.Array[Any],
      validCodeLengths: js.Array[Double]
    ): IGetInvocationDataResponse = {
      val __obj = js.Dynamic.literal(getInvalidCodeLengthMessage = js.Any.fromFunction0(getInvalidCodeLengthMessage), parameters = parameters.asInstanceOf[js.Any], validCodeLengths = validCodeLengths.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGetInvocationDataResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGetInvocationDataResponse] (val x: Self) extends AnyVal {
      
      inline def setGetInvalidCodeLengthMessage(value: () => String): Self = StObject.set(x, "getInvalidCodeLengthMessage", js.Any.fromFunction0(value))
      
      inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setValidCodeLengths(value: js.Array[Double]): Self = StObject.set(x, "validCodeLengths", value.asInstanceOf[js.Any])
      
      inline def setValidCodeLengthsVarargs(value: Double*): Self = StObject.set(x, "validCodeLengths", js.Array(value*))
    }
  }
  
  trait IHookDefinitionOptions
    extends StObject
       with IDefinitionOptions {
    
    var name: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
  }
  object IHookDefinitionOptions {
    
    inline def apply(): IHookDefinitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHookDefinitionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHookDefinitionOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait IStepDefinitionParameters
    extends StObject
       with IDefinitionParameters[IDefinitionOptions] {
    
    var expression: Expression
    
    var keyword: GherkinStepKeyword
    
    var pattern: String | js.RegExp
  }
  object IStepDefinitionParameters {
    
    inline def apply(
      code: js.Function,
      expression: Expression,
      id: String,
      keyword: GherkinStepKeyword,
      line: Double,
      options: IDefinitionOptions,
      pattern: String | js.RegExp,
      uri: String
    ): IStepDefinitionParameters = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStepDefinitionParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStepDefinitionParameters] (val x: Self) extends AnyVal {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: GherkinStepKeyword): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
