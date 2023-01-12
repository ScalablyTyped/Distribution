package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSParenthesizedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `227` extends StObject {
  
  var `type`: TSParenthesizedType
}
object `227` {
  
  inline def apply(): `227` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[`227`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `227`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
