package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSQualifiedName__
  extends StObject
     with BaseNode {
  
  var left: TSEntityName
  
  var right: Identifier_
  
  @JSName("type")
  var type_TSQualifiedName__ : "TSQualifiedName"
}
object TSQualifiedName__ {
  
  inline def apply(left: TSEntityName, right: Identifier_): TSQualifiedName__ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[TSQualifiedName__]
  }
  
  extension [Self <: TSQualifiedName__](x: Self) {
    
    inline def setLeft(value: TSEntityName): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Identifier_): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSQualifiedName"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
