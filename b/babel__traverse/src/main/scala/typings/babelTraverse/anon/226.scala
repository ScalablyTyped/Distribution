package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSParenthesizedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `226` extends StObject {
  
  var `type`: TSParenthesizedType
}
object `226` {
  
  inline def apply(): `226` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[`226`]
  }
  
  extension [Self <: `226`](x: Self) {
    
    inline def setType(value: TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
