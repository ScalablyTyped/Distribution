package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasFalseKeyword extends StObject {
  
  var hasFalseKeyword: Boolean
  
  var hasTrueKeyword: Boolean
  
  var mediaQueryList: js.UndefOr[js.Array[And | Media | String]] = js.undefined
  
  var name: js.Array[CSSToken]
  
  var nameValue: java.lang.String
  
  var string: java.lang.String
  
  var trueOrFalseKeyword: js.Array[CSSToken] | Null
  
  var `type`: NodeType
}
object HasFalseKeyword {
  
  inline def apply(
    hasFalseKeyword: Boolean,
    hasTrueKeyword: Boolean,
    name: js.Array[CSSToken],
    nameValue: java.lang.String,
    string: java.lang.String,
    `type`: NodeType
  ): HasFalseKeyword = {
    val __obj = js.Dynamic.literal(hasFalseKeyword = hasFalseKeyword.asInstanceOf[js.Any], hasTrueKeyword = hasTrueKeyword.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameValue = nameValue.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], trueOrFalseKeyword = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasFalseKeyword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasFalseKeyword] (val x: Self) extends AnyVal {
    
    inline def setHasFalseKeyword(value: Boolean): Self = StObject.set(x, "hasFalseKeyword", value.asInstanceOf[js.Any])
    
    inline def setHasTrueKeyword(value: Boolean): Self = StObject.set(x, "hasTrueKeyword", value.asInstanceOf[js.Any])
    
    inline def setMediaQueryList(value: js.Array[And | Media | String]): Self = StObject.set(x, "mediaQueryList", value.asInstanceOf[js.Any])
    
    inline def setMediaQueryListUndefined: Self = StObject.set(x, "mediaQueryList", js.undefined)
    
    inline def setMediaQueryListVarargs(value: (And | Media | String)*): Self = StObject.set(x, "mediaQueryList", js.Array(value*))
    
    inline def setName(value: js.Array[CSSToken]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameValue(value: java.lang.String): Self = StObject.set(x, "nameValue", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: CSSToken*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setTrueOrFalseKeyword(value: js.Array[CSSToken]): Self = StObject.set(x, "trueOrFalseKeyword", value.asInstanceOf[js.Any])
    
    inline def setTrueOrFalseKeywordNull: Self = StObject.set(x, "trueOrFalseKeyword", null)
    
    inline def setTrueOrFalseKeywordVarargs(value: CSSToken*): Self = StObject.set(x, "trueOrFalseKeyword", js.Array(value*))
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
