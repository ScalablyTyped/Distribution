package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.JSXOpeningElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var `type`: JSXOpeningElement
}
object `74` {
  
  inline def apply(): `74` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[`74`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `74`] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
