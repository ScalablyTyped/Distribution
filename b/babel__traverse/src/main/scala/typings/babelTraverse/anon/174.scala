package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  var `type`: JSXElement
}
object `174` {
  
  inline def apply(): `174` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[`174`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `174`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
