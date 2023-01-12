package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXIdentifier__
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  var name: String
  
  @JSName("type")
  var type_JSXIdentifier__ : JSXIdentifier
}
object JSXIdentifier__ {
  
  inline def apply(name: String): JSXIdentifier__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[JSXIdentifier__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXIdentifier__] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
