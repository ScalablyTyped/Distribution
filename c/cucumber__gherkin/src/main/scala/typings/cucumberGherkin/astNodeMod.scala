package typings.cucumberGherkin

import typings.cucumberGherkin.itokenMod.IToken
import typings.cucumberGherkin.parserMod.RuleType
import typings.cucumberGherkin.parserMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astNodeMod {
  
  @JSImport("@cucumber/gherkin/dist/src/AstNode", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AstNode {
    def this(ruleType: RuleType) = this()
    
    /* CompleteClass */
    override def add(`type`: Any, obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def getItems(ruleType: RuleType): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getSingle(ruleType: RuleType): Any = js.native
    
    /* CompleteClass */
    override def getToken(tokenType: TokenType): Any = js.native
    
    /* CompleteClass */
    override def getTokens(tokenType: TokenType): js.Array[IToken[TokenType]] = js.native
    
    /* CompleteClass */
    override val ruleType: RuleType = js.native
    
    /* private */ /* CompleteClass */
    override val subItems: Any = js.native
  }
  
  trait AstNode extends StObject {
    
    def add(`type`: Any, obj: Any): Unit
    
    def getItems(ruleType: RuleType): js.Array[Any]
    
    def getSingle(ruleType: RuleType): Any
    
    def getToken(tokenType: TokenType): Any
    
    def getTokens(tokenType: TokenType): js.Array[IToken[TokenType]]
    
    val ruleType: RuleType
    
    /* private */ val subItems: Any
  }
  object AstNode {
    
    inline def apply(
      add: (Any, Any) => Unit,
      getItems: RuleType => js.Array[Any],
      getSingle: RuleType => Any,
      getToken: TokenType => Any,
      getTokens: TokenType => js.Array[IToken[TokenType]],
      ruleType: RuleType,
      subItems: Any
    ): AstNode = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), getItems = js.Any.fromFunction1(getItems), getSingle = js.Any.fromFunction1(getSingle), getToken = js.Any.fromFunction1(getToken), getTokens = js.Any.fromFunction1(getTokens), ruleType = ruleType.asInstanceOf[js.Any], subItems = subItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[AstNode]
    }
    
    extension [Self <: AstNode](x: Self) {
      
      inline def setAdd(value: (Any, Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setGetItems(value: RuleType => js.Array[Any]): Self = StObject.set(x, "getItems", js.Any.fromFunction1(value))
      
      inline def setGetSingle(value: RuleType => Any): Self = StObject.set(x, "getSingle", js.Any.fromFunction1(value))
      
      inline def setGetToken(value: TokenType => Any): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      inline def setGetTokens(value: TokenType => js.Array[IToken[TokenType]]): Self = StObject.set(x, "getTokens", js.Any.fromFunction1(value))
      
      inline def setRuleType(value: RuleType): Self = StObject.set(x, "ruleType", value.asInstanceOf[js.Any])
      
      inline def setSubItems(value: Any): Self = StObject.set(x, "subItems", value.asInstanceOf[js.Any])
    }
  }
}
