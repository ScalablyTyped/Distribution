package typings.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */] extends StObject {
  
  var `type`: T
}
object Type {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */](`type`: T): Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
  
  extension [Self <: Type[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 249, starting with typings.babelTypes.babelTypesStrings.ClassAccessorProperty, typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder */ Any */](x: Self & Type[T]) {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
