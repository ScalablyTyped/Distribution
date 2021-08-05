package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeCallProperty_
  extends StObject
     with Node
     with Flow
     with UserWhitespacable {
  
  @JSName("type")
  var type_ObjectTypeCallProperty_ : ObjectTypeCallProperty
  
  var value: FlowTypeAnnotation
}
object ObjectTypeCallProperty_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, value: FlowTypeAnnotation): ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[ObjectTypeCallProperty_]
  }
  
  extension [Self <: ObjectTypeCallProperty_](x: Self) {
    
    inline def setType(value: ObjectTypeCallProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FlowTypeAnnotation): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
