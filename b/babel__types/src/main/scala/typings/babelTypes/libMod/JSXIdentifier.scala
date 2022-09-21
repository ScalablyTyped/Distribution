package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXIdentifier
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  var name: String
  
  @JSName("type")
  var type_JSXIdentifier: typings.babelTypes.babelTypesStrings.JSXIdentifier
}
object JSXIdentifier {
  
  inline def apply(name: String): JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[JSXIdentifier]
  }
  
  extension [Self <: JSXIdentifier](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
