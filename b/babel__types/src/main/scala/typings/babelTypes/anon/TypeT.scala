package typings.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeT[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253, starting with typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder, typings.babelTypes.babelTypesStrings.ArrayExpression */ Any */] extends StObject {
  
  var `type`: T
}
object TypeT {
  
  inline def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253, starting with typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder, typings.babelTypes.babelTypesStrings.ArrayExpression */ Any */](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeT[?], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 253, starting with typings.babelTypes.babelTypesStrings.AnyTypeAnnotation, typings.babelTypes.babelTypesStrings.ArgumentPlaceholder, typings.babelTypes.babelTypesStrings.ArrayExpression */ Any */] (val x: Self & TypeT[T]) extends AnyVal {
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
