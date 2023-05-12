package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateFieldWrapperMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/field-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUnwrappedFieldType(field: DescField): js.UndefOr[ScalarType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnwrappedFieldType")(field.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ScalarType]]
  
  inline def wrapField[T /* <: Message[T] */](`type`: MessageType[T], value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapField")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait FieldWrapper[T /* <: Message[T] */, U] extends StObject {
    
    def unwrapField(value: T): U
    
    def wrapField(value: U): T
  }
  object FieldWrapper {
    
    inline def apply[T /* <: Message[T] */, U](unwrapField: T => U, wrapField: U => T): FieldWrapper[T, U] = {
      val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
      __obj.asInstanceOf[FieldWrapper[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldWrapper[?, ?], T /* <: Message[T] */, U] (val x: Self & (FieldWrapper[T, U])) extends AnyVal {
      
      inline def setUnwrapField(value: T => U): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
      
      inline def setWrapField(value: U => T): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
    }
  }
}
