package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPattern_
  extends StObject
     with Node
     with LVal
     with Pattern {
  
  var properties: js.Array[AssignmentProperty | RestProperty_]
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.undefined
  
  @JSName("type")
  var type_ObjectPattern_ : ObjectPattern
}
object ObjectPattern_ {
  
  inline def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty_],
    start: Double
  ): ObjectPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[ObjectPattern_]
  }
  
  extension [Self <: ObjectPattern_](x: Self) {
    
    inline def setProperties(value: js.Array[AssignmentProperty | RestProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (AssignmentProperty | RestProperty_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
