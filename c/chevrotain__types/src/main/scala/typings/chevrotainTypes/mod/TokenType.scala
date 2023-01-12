package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenType extends StObject {
  
  var CATEGORIES: js.UndefOr[js.Array[TokenType]] = js.undefined
  
  var GROUP: js.UndefOr[String] = js.undefined
  
  var LABEL: js.UndefOr[String] = js.undefined
  
  var LINE_BREAKS: js.UndefOr[Boolean] = js.undefined
  
  var LONGER_ALT: js.UndefOr[TokenType | js.Array[TokenType]] = js.undefined
  
  var PATTERN: js.UndefOr[TokenPattern] = js.undefined
  
  var POP_MODE: js.UndefOr[Boolean] = js.undefined
  
  var PUSH_MODE: js.UndefOr[String] = js.undefined
  
  var START_CHARS_HINT: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var categoryMatches: js.UndefOr[js.Array[Double]] = js.undefined
  
  var categoryMatchesMap: js.UndefOr[NumberDictionary[Boolean]] = js.undefined
  
  var isParent: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var tokenTypeIdx: js.UndefOr[Double] = js.undefined
}
object TokenType {
  
  inline def apply(name: String): TokenType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenType] (val x: Self) extends AnyVal {
    
    inline def setCATEGORIES(value: js.Array[TokenType]): Self = StObject.set(x, "CATEGORIES", value.asInstanceOf[js.Any])
    
    inline def setCATEGORIESUndefined: Self = StObject.set(x, "CATEGORIES", js.undefined)
    
    inline def setCATEGORIESVarargs(value: TokenType*): Self = StObject.set(x, "CATEGORIES", js.Array(value*))
    
    inline def setCategoryMatches(value: js.Array[Double]): Self = StObject.set(x, "categoryMatches", value.asInstanceOf[js.Any])
    
    inline def setCategoryMatchesMap(value: NumberDictionary[Boolean]): Self = StObject.set(x, "categoryMatchesMap", value.asInstanceOf[js.Any])
    
    inline def setCategoryMatchesMapUndefined: Self = StObject.set(x, "categoryMatchesMap", js.undefined)
    
    inline def setCategoryMatchesUndefined: Self = StObject.set(x, "categoryMatches", js.undefined)
    
    inline def setCategoryMatchesVarargs(value: Double*): Self = StObject.set(x, "categoryMatches", js.Array(value*))
    
    inline def setGROUP(value: String): Self = StObject.set(x, "GROUP", value.asInstanceOf[js.Any])
    
    inline def setGROUPUndefined: Self = StObject.set(x, "GROUP", js.undefined)
    
    inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
    
    inline def setIsParentUndefined: Self = StObject.set(x, "isParent", js.undefined)
    
    inline def setLABEL(value: String): Self = StObject.set(x, "LABEL", value.asInstanceOf[js.Any])
    
    inline def setLABELUndefined: Self = StObject.set(x, "LABEL", js.undefined)
    
    inline def setLINE_BREAKS(value: Boolean): Self = StObject.set(x, "LINE_BREAKS", value.asInstanceOf[js.Any])
    
    inline def setLINE_BREAKSUndefined: Self = StObject.set(x, "LINE_BREAKS", js.undefined)
    
    inline def setLONGER_ALT(value: TokenType | js.Array[TokenType]): Self = StObject.set(x, "LONGER_ALT", value.asInstanceOf[js.Any])
    
    inline def setLONGER_ALTUndefined: Self = StObject.set(x, "LONGER_ALT", js.undefined)
    
    inline def setLONGER_ALTVarargs(value: TokenType*): Self = StObject.set(x, "LONGER_ALT", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPATTERN(value: TokenPattern): Self = StObject.set(x, "PATTERN", value.asInstanceOf[js.Any])
    
    inline def setPATTERNFunction4(
      value: (/* text */ String, /* offset */ Double, /* tokens */ js.Array[IToken], /* groups */ StringDictionary[js.Array[IToken]]) => CustomPatternMatcherReturn | RegExpExecArray | Null
    ): Self = StObject.set(x, "PATTERN", js.Any.fromFunction4(value))
    
    inline def setPATTERNUndefined: Self = StObject.set(x, "PATTERN", js.undefined)
    
    inline def setPOP_MODE(value: Boolean): Self = StObject.set(x, "POP_MODE", value.asInstanceOf[js.Any])
    
    inline def setPOP_MODEUndefined: Self = StObject.set(x, "POP_MODE", js.undefined)
    
    inline def setPUSH_MODE(value: String): Self = StObject.set(x, "PUSH_MODE", value.asInstanceOf[js.Any])
    
    inline def setPUSH_MODEUndefined: Self = StObject.set(x, "PUSH_MODE", js.undefined)
    
    inline def setSTART_CHARS_HINT(value: js.Array[String | Double]): Self = StObject.set(x, "START_CHARS_HINT", value.asInstanceOf[js.Any])
    
    inline def setSTART_CHARS_HINTUndefined: Self = StObject.set(x, "START_CHARS_HINT", js.undefined)
    
    inline def setSTART_CHARS_HINTVarargs(value: (String | Double)*): Self = StObject.set(x, "START_CHARS_HINT", js.Array(value*))
    
    inline def setTokenTypeIdx(value: Double): Self = StObject.set(x, "tokenTypeIdx", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeIdxUndefined: Self = StObject.set(x, "tokenTypeIdx", js.undefined)
  }
}
