package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.Rule
import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarName extends StObject {
  
  var grammarName: String
  
  var rules: js.Array[Rule]
  
  var tokenTypes: js.Array[TokenType]
}
object GrammarName {
  
  inline def apply(grammarName: String, rules: js.Array[Rule], tokenTypes: js.Array[TokenType]): GrammarName = {
    val __obj = js.Dynamic.literal(grammarName = grammarName.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrammarName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrammarName] (val x: Self) extends AnyVal {
    
    inline def setGrammarName(value: String): Self = StObject.set(x, "grammarName", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setTokenTypes(value: js.Array[TokenType]): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
    
    inline def setTokenTypesVarargs(value: TokenType*): Self = StObject.set(x, "tokenTypes", js.Array(value*))
  }
}
