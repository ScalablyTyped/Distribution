package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.V8IntrinsicIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V8IntrinsicIdentifier_
  extends StObject
     with BaseNode
     with Miscellaneous
     with Node {
  
  var name: String
  
  @JSName("type")
  var type_V8IntrinsicIdentifier_ : V8IntrinsicIdentifier
}
object V8IntrinsicIdentifier_ {
  
  inline def apply(name: String): V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[V8IntrinsicIdentifier_]
  }
  
  extension [Self <: V8IntrinsicIdentifier_](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: V8IntrinsicIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
