package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassProperty_
  extends StObject
     with Node
     with Flow
     with Property {
  
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.undefined
  
  var key: Identifier_
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.undefined
  
  @JSName("type")
  var type_ClassProperty_ : ClassProperty
  
  var value: Expression
}
object ClassProperty_ {
  
  inline def apply(end: Double, key: Identifier_, loc: SourceLocation, start: Double, value: Expression): ClassProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[ClassProperty_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassProperty_] (val x: Self) extends AnyVal {
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setKey(value: Identifier_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: ClassProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
