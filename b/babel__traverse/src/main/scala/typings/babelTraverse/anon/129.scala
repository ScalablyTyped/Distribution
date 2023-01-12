package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXClosingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var `type`: JSXClosingElement
}
object `129` {
  
  inline def apply(): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `129`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
