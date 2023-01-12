package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXOpeningFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningFragment__
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  @JSName("type")
  var type_JSXOpeningFragment__ : JSXOpeningFragment
}
object JSXOpeningFragment__ {
  
  inline def apply(): JSXOpeningFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[JSXOpeningFragment__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXOpeningFragment__] (val x: Self) extends AnyVal {
    
    inline def setType(value: JSXOpeningFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
