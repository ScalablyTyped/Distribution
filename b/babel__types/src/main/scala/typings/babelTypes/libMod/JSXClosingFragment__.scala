package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXClosingFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingFragment__
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  @JSName("type")
  var type_JSXClosingFragment__ : JSXClosingFragment
}
object JSXClosingFragment__ {
  
  inline def apply(): JSXClosingFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[JSXClosingFragment__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXClosingFragment__] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXClosingFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
