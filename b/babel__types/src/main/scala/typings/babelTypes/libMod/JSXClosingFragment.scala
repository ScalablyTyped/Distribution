package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingFragment
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node {
  
  @JSName("type")
  var type_JSXClosingFragment: typings.babelTypes.babelTypesStrings.JSXClosingFragment
}
object JSXClosingFragment {
  
  inline def apply(): JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[JSXClosingFragment]
  }
  
  extension [Self <: JSXClosingFragment](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXClosingFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
