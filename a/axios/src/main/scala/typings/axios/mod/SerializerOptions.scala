package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializerOptions extends StObject {
  
  var dots: js.UndefOr[Boolean] = js.undefined
  
  var indexes: js.UndefOr[Boolean | Null] = js.undefined
  
  var metaTokens: js.UndefOr[Boolean] = js.undefined
  
  var visitor: js.UndefOr[SerializerVisitor] = js.undefined
}
object SerializerOptions {
  
  inline def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    
    inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    inline def setIndexes(value: Boolean): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesNull: Self = StObject.set(x, "indexes", null)
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setMetaTokens(value: Boolean): Self = StObject.set(x, "metaTokens", value.asInstanceOf[js.Any])
    
    inline def setMetaTokensUndefined: Self = StObject.set(x, "metaTokens", js.undefined)
    
    inline def setVisitor(value: SerializerVisitor): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
    
    inline def setVisitorUndefined: Self = StObject.set(x, "visitor", js.undefined)
  }
}
