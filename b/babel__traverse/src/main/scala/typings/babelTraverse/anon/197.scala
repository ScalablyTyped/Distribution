package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXMemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `197` extends StObject {
  
  var `type`: JSXMemberExpression
}
object `197` {
  
  inline def apply(): `197` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[`197`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `197`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
