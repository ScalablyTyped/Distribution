package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldOptionsJSType extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions_JSType")
@js.native
object FieldOptionsJSType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldOptionsJSType & Double] = js.native
  
  /**
    * Use the default type.
    *
    * @generated from enum value: JS_NORMAL = 0;
    */
  @js.native
  sealed trait JS_NORMAL
    extends StObject
       with FieldOptionsJSType
  /* 0 */ val JS_NORMAL: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsJSType.JS_NORMAL & Double = js.native
  
  /**
    * Use JavaScript numbers.
    *
    * @generated from enum value: JS_NUMBER = 2;
    */
  @js.native
  sealed trait JS_NUMBER
    extends StObject
       with FieldOptionsJSType
  /* 2 */ val JS_NUMBER: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsJSType.JS_NUMBER & Double = js.native
  
  /**
    * Use JavaScript strings.
    *
    * @generated from enum value: JS_STRING = 1;
    */
  @js.native
  sealed trait JS_STRING
    extends StObject
       with FieldOptionsJSType
  /* 1 */ val JS_STRING: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsJSType.JS_STRING & Double = js.native
}
