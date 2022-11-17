package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAttribute_
  extends StObject
     with BaseNode {
  
  var key: Identifier_ | StringLiteral_
  
  @JSName("type")
  var type_ImportAttribute_ : "ImportAttribute"
  
  var value: StringLiteral_
}
object ImportAttribute_ {
  
  inline def apply(key: Identifier_ | StringLiteral_, value: StringLiteral_): ImportAttribute_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportAttribute")
    __obj.asInstanceOf[ImportAttribute_]
  }
  
  extension [Self <: ImportAttribute_](x: Self) {
    
    inline def setKey(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ImportAttribute"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringLiteral_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
