package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeIndexer_
  extends StObject
     with Node
     with Flow
     with UserWhitespacable {
  
  var id: Expression
  
  var key: FlowTypeAnnotation
  
  @JSName("type")
  var type_ObjectTypeIndexer_ : ObjectTypeIndexer
  
  var value: FlowTypeAnnotation
}
object ObjectTypeIndexer_ {
  
  inline def apply(
    end: Double,
    id: Expression,
    key: FlowTypeAnnotation,
    loc: SourceLocation,
    start: Double,
    value: FlowTypeAnnotation
  ): ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[ObjectTypeIndexer_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectTypeIndexer_] (val x: Self) extends AnyVal {
    
    inline def setId(value: Expression): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: FlowTypeAnnotation): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectTypeIndexer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FlowTypeAnnotation): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
