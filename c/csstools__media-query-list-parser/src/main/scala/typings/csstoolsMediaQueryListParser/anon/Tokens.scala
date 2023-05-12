package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokens extends StObject {
  
  var tokens: js.Array[CSSToken]
  
  var `type`: NodeType
}
object Tokens {
  
  inline def apply(tokens: js.Array[CSSToken], `type`: NodeType): Tokens = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokens]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tokens] (val x: Self) extends AnyVal {
    
    inline def setTokens(value: js.Array[CSSToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: CSSToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
