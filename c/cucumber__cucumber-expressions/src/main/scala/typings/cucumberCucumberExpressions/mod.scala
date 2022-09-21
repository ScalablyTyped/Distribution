package typings.cucumberCucumberExpressions

import typings.cucumberCucumberExpressions.argumentMod.default
import typings.cucumberCucumberExpressions.astMod.NodeType
import typings.cucumberCucumberExpressions.astMod.TokenType
import typings.cucumberCucumberExpressions.parameterTypeMod.Constructor
import typings.cucumberCucumberExpressions.parameterTypeMod.Factory
import typings.cucumberCucumberExpressions.parameterTypeMod.RegExps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/cucumber-expressions", "Argument")
  @js.native
  open class Argument protected () extends default {
    def this(
      group: typings.cucumberCucumberExpressions.groupMod.default,
      parameterType: typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]
    ) = this()
  }
  /* static members */
  object Argument {
    
    @JSImport("@cucumber/cucumber-expressions", "Argument")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(
      group: typings.cucumberCucumberExpressions.groupMod.default,
      parameterTypes: js.Array[typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]]
    ): js.Array[typings.cucumberCucumberExpressions.argumentMod.Argument] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(group.asInstanceOf[js.Any], parameterTypes.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.cucumberCucumberExpressions.argumentMod.Argument]]
  }
  
  @JSImport("@cucumber/cucumber-expressions", "CucumberExpression")
  @js.native
  open class CucumberExpression protected ()
    extends typings.cucumberCucumberExpressions.cucumberExpressionMod.default {
    /**
      * @param expression
      * @param parameterTypeRegistry
      */
    def this(
      expression: String,
      parameterTypeRegistry: typings.cucumberCucumberExpressions.parameterTypeRegistryMod.default
    ) = this()
  }
  /* static members */
  object CucumberExpression {
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpression")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpression.escapeRegex")
    @js.native
    def escapeRegex: Any = js.native
    inline def escapeRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeRegex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@cucumber/cucumber-expressions", "CucumberExpressionGenerator")
  @js.native
  open class CucumberExpressionGenerator protected ()
    extends typings.cucumberCucumberExpressions.cucumberExpressionGeneratorMod.default {
    def this(parameterTypes: js.Function0[js.Iterable[typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]]]) = this()
  }
  /* static members */
  object CucumberExpressionGenerator {
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpressionGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpressionGenerator.createParameterTypeMatchers2")
    @js.native
    def createParameterTypeMatchers2: Any = js.native
    inline def createParameterTypeMatchers2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createParameterTypeMatchers2")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@cucumber/cucumber-expressions", "ExpressionFactory")
  @js.native
  open class ExpressionFactory protected ()
    extends typings.cucumberCucumberExpressions.expressionFactoryMod.default {
    def this(parameterTypeRegistry: typings.cucumberCucumberExpressions.parameterTypeRegistryMod.default) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "GeneratedExpression")
  @js.native
  open class GeneratedExpression protected ()
    extends typings.cucumberCucumberExpressions.generatedExpressionMod.default {
    def this(
      expressionTemplate: String,
      parameterTypes: js.Array[typings.cucumberCucumberExpressions.parameterTypeMod.default[Any]]
    ) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "Group")
  @js.native
  open class Group protected ()
    extends typings.cucumberCucumberExpressions.groupMod.default {
    def this(
      value: String,
      start: Double,
      end: Double,
      children: js.Array[typings.cucumberCucumberExpressions.groupMod.Group]
    ) = this()
    def this(
      value: String,
      start: Double,
      end: Unit,
      children: js.Array[typings.cucumberCucumberExpressions.groupMod.Group]
    ) = this()
    def this(
      value: String,
      start: Unit,
      end: Double,
      children: js.Array[typings.cucumberCucumberExpressions.groupMod.Group]
    ) = this()
    def this(
      value: String,
      start: Unit,
      end: Unit,
      children: js.Array[typings.cucumberCucumberExpressions.groupMod.Group]
    ) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "Node")
  @js.native
  open class Node protected ()
    extends typings.cucumberCucumberExpressions.astMod.Node {
    def this(
      `type`: NodeType,
      nodes: js.Array[typings.cucumberCucumberExpressions.astMod.Node],
      token: String,
      start: Double,
      end: Double
    ) = this()
    def this(
      `type`: NodeType,
      nodes: js.Array[typings.cucumberCucumberExpressions.astMod.Node],
      token: Unit,
      start: Double,
      end: Double
    ) = this()
    def this(`type`: NodeType, nodes: Unit, token: String, start: Double, end: Double) = this()
    def this(`type`: NodeType, nodes: Unit, token: Unit, start: Double, end: Double) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.cucumberCucumberExpressions.astMod.NodeType & String] = js.native
    
    /* "ALTERNATION_NODE" */ val alternation: typings.cucumberCucumberExpressions.astMod.NodeType.alternation & String = js.native
    
    /* "ALTERNATIVE_NODE" */ val alternative: typings.cucumberCucumberExpressions.astMod.NodeType.alternative & String = js.native
    
    /* "EXPRESSION_NODE" */ val expression: typings.cucumberCucumberExpressions.astMod.NodeType.expression & String = js.native
    
    /* "OPTIONAL_NODE" */ val optional: typings.cucumberCucumberExpressions.astMod.NodeType.optional & String = js.native
    
    /* "PARAMETER_NODE" */ val parameter: typings.cucumberCucumberExpressions.astMod.NodeType.parameter & String = js.native
    
    /* "TEXT_NODE" */ val text: typings.cucumberCucumberExpressions.astMod.NodeType.text & String = js.native
  }
  
  @JSImport("@cucumber/cucumber-expressions", "ParameterType")
  @js.native
  open class ParameterType[T] protected ()
    extends typings.cucumberCucumberExpressions.parameterTypeMod.default[T] {
    def this(
      name: String,
      regexps: RegExps,
      `type`: Null,
      transform: js.Function1[/* repeated */ String, T | js.Thenable[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    /**
      * @param name {String} the name of the type
      * @param regexps {Array.<RegExp | String>,RegExp,String} that matche the type
      * @param type {Function} the prototype (constructor) of the type. May be null.
      * @param transform {Function} function transforming string to another type. May be null.
      * @param useForSnippets {boolean} true if this should be used for snippets. Defaults to true.
      * @param preferForRegexpMatch {boolean} true if this is a preferential type. Defaults to false.
      */
    def this(
      name: String,
      regexps: RegExps,
      `type`: Constructor[T],
      transform: js.Function1[/* repeated */ String, T | js.Thenable[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: String,
      regexps: RegExps,
      `type`: Factory[T],
      transform: js.Function1[/* repeated */ String, T | js.Thenable[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Null,
      transform: js.Function1[/* repeated */ String, T | js.Thenable[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Constructor[T],
      transform: js.Function1[/* repeated */ String, T | js.Thenable[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Factory[T],
      transform: js.Function1[/* repeated */ String, T | js.Thenable[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
  }
  /* static members */
  object ParameterType {
    
    @JSImport("@cucumber/cucumber-expressions", "ParameterType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkParameterTypeName(typeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkParameterTypeName")(typeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def compare(
      pt1: typings.cucumberCucumberExpressions.parameterTypeMod.ParameterType[Any],
      pt2: typings.cucumberCucumberExpressions.parameterTypeMod.ParameterType[Any]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isValidParameterTypeName(typeName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidParameterTypeName")(typeName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@cucumber/cucumber-expressions", "ParameterTypeRegistry")
  @js.native
  open class ParameterTypeRegistry ()
    extends typings.cucumberCucumberExpressions.parameterTypeRegistryMod.default
  
  @JSImport("@cucumber/cucumber-expressions", "RegularExpression")
  @js.native
  open class RegularExpression protected ()
    extends typings.cucumberCucumberExpressions.regularExpressionMod.default {
    def this(
      regexp: js.RegExp,
      parameterTypeRegistry: typings.cucumberCucumberExpressions.parameterTypeRegistryMod.default
    ) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "Token")
  @js.native
  open class Token protected ()
    extends typings.cucumberCucumberExpressions.astMod.Token {
    def this(`type`: TokenType, text: String, start: Double, end: Double) = this()
  }
  /* static members */
  object Token {
    
    @JSImport("@cucumber/cucumber-expressions", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canEscape(codePoint: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canEscape")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEscapeCharacter(codePoint: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEscapeCharacter")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def typeOf(codePoint: String): TokenType = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(codePoint.asInstanceOf[js.Any]).asInstanceOf[TokenType]
  }
  
  @JSImport("@cucumber/cucumber-expressions", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.cucumberCucumberExpressions.astMod.TokenType & String] = js.native
    
    /* "ALTERNATION" */ val alternation: typings.cucumberCucumberExpressions.astMod.TokenType.alternation & String = js.native
    
    /* "BEGIN_OPTIONAL" */ val beginOptional: typings.cucumberCucumberExpressions.astMod.TokenType.beginOptional & String = js.native
    
    /* "BEGIN_PARAMETER" */ val beginParameter: typings.cucumberCucumberExpressions.astMod.TokenType.beginParameter & String = js.native
    
    /* "END_OF_LINE" */ val endOfLine: typings.cucumberCucumberExpressions.astMod.TokenType.endOfLine & String = js.native
    
    /* "END_OPTIONAL" */ val endOptional: typings.cucumberCucumberExpressions.astMod.TokenType.endOptional & String = js.native
    
    /* "END_PARAMETER" */ val endParameter: typings.cucumberCucumberExpressions.astMod.TokenType.endParameter & String = js.native
    
    /* "START_OF_LINE" */ val startOfLine: typings.cucumberCucumberExpressions.astMod.TokenType.startOfLine & String = js.native
    
    /* "TEXT" */ val text: typings.cucumberCucumberExpressions.astMod.TokenType.text & String = js.native
    
    /* "WHITE_SPACE" */ val whiteSpace: typings.cucumberCucumberExpressions.astMod.TokenType.whiteSpace & String = js.native
  }
}
