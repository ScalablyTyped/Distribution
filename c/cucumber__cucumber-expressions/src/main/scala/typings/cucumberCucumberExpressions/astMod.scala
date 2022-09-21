package typings.cucumberCucumberExpressions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Ast", "Node")
  @js.native
  open class Node protected ()
    extends StObject
       with Located {
    def this(`type`: NodeType, nodes: js.Array[Node], token: String, start: Double, end: Double) = this()
    def this(`type`: NodeType, nodes: js.Array[Node], token: Unit, start: Double, end: Double) = this()
    def this(`type`: NodeType, nodes: Unit, token: String, start: Double, end: Double) = this()
    def this(`type`: NodeType, nodes: Unit, token: Unit, start: Double, end: Double) = this()
    
    /* CompleteClass */
    override val end: Double = js.native
    
    val nodes: js.UndefOr[js.Array[Node]] = js.native
    
    /* CompleteClass */
    override val start: Double = js.native
    
    def text(): String = js.native
    
    /* private */ val token: Any = js.native
    
    val `type`: NodeType = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Ast", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeType & String] = js.native
    
    @js.native
    sealed trait alternation
      extends StObject
         with NodeType
    /* "ALTERNATION_NODE" */ val alternation: typings.cucumberCucumberExpressions.astMod.NodeType.alternation & String = js.native
    
    @js.native
    sealed trait alternative
      extends StObject
         with NodeType
    /* "ALTERNATIVE_NODE" */ val alternative: typings.cucumberCucumberExpressions.astMod.NodeType.alternative & String = js.native
    
    @js.native
    sealed trait expression
      extends StObject
         with NodeType
    /* "EXPRESSION_NODE" */ val expression: typings.cucumberCucumberExpressions.astMod.NodeType.expression & String = js.native
    
    @js.native
    sealed trait optional
      extends StObject
         with NodeType
    /* "OPTIONAL_NODE" */ val optional: typings.cucumberCucumberExpressions.astMod.NodeType.optional & String = js.native
    
    @js.native
    sealed trait parameter
      extends StObject
         with NodeType
    /* "PARAMETER_NODE" */ val parameter: typings.cucumberCucumberExpressions.astMod.NodeType.parameter & String = js.native
    
    @js.native
    sealed trait text
      extends StObject
         with NodeType
    /* "TEXT_NODE" */ val text: typings.cucumberCucumberExpressions.astMod.NodeType.text & String = js.native
  }
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Ast", "Token")
  @js.native
  open class Token protected ()
    extends StObject
       with Located {
    def this(`type`: TokenType, text: String, start: Double, end: Double) = this()
    
    /* CompleteClass */
    override val end: Double = js.native
    
    /* CompleteClass */
    override val start: Double = js.native
    
    val text: String = js.native
    
    val `type`: TokenType = js.native
  }
  /* static members */
  object Token {
    
    @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Ast", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canEscape(codePoint: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canEscape")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEscapeCharacter(codePoint: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEscapeCharacter")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def typeOf(codePoint: String): TokenType = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(codePoint.asInstanceOf[js.Any]).asInstanceOf[TokenType]
  }
  
  @js.native
  sealed trait TokenType extends StObject
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/Ast", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TokenType & String] = js.native
    
    @js.native
    sealed trait alternation
      extends StObject
         with TokenType
    /* "ALTERNATION" */ val alternation: typings.cucumberCucumberExpressions.astMod.TokenType.alternation & String = js.native
    
    @js.native
    sealed trait beginOptional
      extends StObject
         with TokenType
    /* "BEGIN_OPTIONAL" */ val beginOptional: typings.cucumberCucumberExpressions.astMod.TokenType.beginOptional & String = js.native
    
    @js.native
    sealed trait beginParameter
      extends StObject
         with TokenType
    /* "BEGIN_PARAMETER" */ val beginParameter: typings.cucumberCucumberExpressions.astMod.TokenType.beginParameter & String = js.native
    
    @js.native
    sealed trait endOfLine
      extends StObject
         with TokenType
    /* "END_OF_LINE" */ val endOfLine: typings.cucumberCucumberExpressions.astMod.TokenType.endOfLine & String = js.native
    
    @js.native
    sealed trait endOptional
      extends StObject
         with TokenType
    /* "END_OPTIONAL" */ val endOptional: typings.cucumberCucumberExpressions.astMod.TokenType.endOptional & String = js.native
    
    @js.native
    sealed trait endParameter
      extends StObject
         with TokenType
    /* "END_PARAMETER" */ val endParameter: typings.cucumberCucumberExpressions.astMod.TokenType.endParameter & String = js.native
    
    @js.native
    sealed trait startOfLine
      extends StObject
         with TokenType
    /* "START_OF_LINE" */ val startOfLine: typings.cucumberCucumberExpressions.astMod.TokenType.startOfLine & String = js.native
    
    @js.native
    sealed trait text
      extends StObject
         with TokenType
    /* "TEXT" */ val text: typings.cucumberCucumberExpressions.astMod.TokenType.text & String = js.native
    
    @js.native
    sealed trait whiteSpace
      extends StObject
         with TokenType
    /* "WHITE_SPACE" */ val whiteSpace: typings.cucumberCucumberExpressions.astMod.TokenType.whiteSpace & String = js.native
  }
  
  inline def purposeOf(token: TokenType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("purposeOf")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def symbolOf(token: TokenType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolOf")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Located extends StObject {
    
    val end: Double
    
    val start: Double
  }
  object Located {
    
    inline def apply(end: Double, start: Double): Located = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Located]
    }
    
    extension [Self <: Located](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
