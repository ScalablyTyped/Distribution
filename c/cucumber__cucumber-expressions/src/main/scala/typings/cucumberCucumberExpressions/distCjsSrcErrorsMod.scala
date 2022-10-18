package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.distCjsSrcAstMod.Node
import typings.cucumberCucumberExpressions.distCjsSrcAstMod.Token
import typings.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType
import typings.cucumberCucumberExpressions.distCjsSrcCucumberExpressionErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcErrorsMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Errors", "AmbiguousParameterTypeError")
  @js.native
  open class AmbiguousParameterTypeError () extends default
  /* static members */
  object AmbiguousParameterTypeError {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Errors", "AmbiguousParameterTypeError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _expressions(
      generatedExpressions: js.Array[typings.cucumberCucumberExpressions.distCjsSrcGeneratedExpressionMod.default]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_expressions")(generatedExpressions.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def _parameterTypeNames(
      parameterTypes: js.Array[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]]
    ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_parameterTypeNames")(parameterTypes.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def forRegExp(
      parameterTypeRegexp: String,
      expressionRegexp: js.RegExp,
      parameterTypes: js.Array[typings.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]],
      generatedExpressions: js.Array[typings.cucumberCucumberExpressions.distCjsSrcGeneratedExpressionMod.default]
    ): AmbiguousParameterTypeError = (^.asInstanceOf[js.Dynamic].applyDynamic("forRegExp")(parameterTypeRegexp.asInstanceOf[js.Any], expressionRegexp.asInstanceOf[js.Any], parameterTypes.asInstanceOf[js.Any], generatedExpressions.asInstanceOf[js.Any])).asInstanceOf[AmbiguousParameterTypeError]
  }
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Errors", "UndefinedParameterTypeError")
  @js.native
  open class UndefinedParameterTypeError protected () extends default {
    def this(undefinedParameterTypeName: String, message: String) = this()
    
    val undefinedParameterTypeName: String = js.native
  }
  
  inline def createAlternationNotAllowedInOptional(expression: String, current: Token): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlternationNotAllowedInOptional")(expression.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createAlternativeMayNotBeEmpty(node: Node, expression: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlternativeMayNotBeEmpty")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createAlternativeMayNotExclusivelyContainOptionals(node: Node, expression: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlternativeMayNotExclusivelyContainOptionals")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createCantEscaped(expression: String, index: Double): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createCantEscaped")(expression.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createInvalidParameterTypeNameInNode(token: Token, expression: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createInvalidParameterTypeNameInNode")(token.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createMissingEndToken(expression: String, beginToken: TokenType, endToken: TokenType, current: Token): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createMissingEndToken")(expression.asInstanceOf[js.Any], beginToken.asInstanceOf[js.Any], endToken.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createOptionalIsNotAllowedInOptional(node: Node, expression: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createOptionalIsNotAllowedInOptional")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createOptionalMayNotBeEmpty(node: Node, expression: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createOptionalMayNotBeEmpty")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createParameterIsNotAllowedInOptional(node: Node, expression: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createParameterIsNotAllowedInOptional")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createTheEndOfLIneCanNotBeEscaped(expression: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheEndOfLIneCanNotBeEscaped")(expression.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def createUndefinedParameterType(node: Node, expression: String, undefinedParameterTypeName: String): UndefinedParameterTypeError = (^.asInstanceOf[js.Dynamic].applyDynamic("createUndefinedParameterType")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], undefinedParameterTypeName.asInstanceOf[js.Any])).asInstanceOf[UndefinedParameterTypeError]
}
