package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXIdentifier__
  extends StObject
     with BaseNode {
  
  var name: String
  
  @JSName("type")
  var type_JSXIdentifier__ : "JSXIdentifier"
}
object JSXIdentifier__ {
  
  inline def apply(name: String): JSXIdentifier__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[JSXIdentifier__]
  }
  
  extension [Self <: JSXIdentifier__](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: "JSXIdentifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
