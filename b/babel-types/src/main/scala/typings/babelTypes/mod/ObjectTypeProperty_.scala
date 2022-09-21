package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeProperty_
  extends StObject
     with Node
     with Flow
     with UserWhitespacable {
  
  var key: Expression
  
  @JSName("type")
  var type_ObjectTypeProperty_ : ObjectTypeProperty
  
  var value: FlowTypeAnnotation
}
object ObjectTypeProperty_ {
  
  inline def apply(end: Double, key: Expression, loc: SourceLocation, start: Double, value: FlowTypeAnnotation): ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[ObjectTypeProperty_]
  }
  
  extension [Self <: ObjectTypeProperty_](x: Self) {
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectTypeProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FlowTypeAnnotation): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
