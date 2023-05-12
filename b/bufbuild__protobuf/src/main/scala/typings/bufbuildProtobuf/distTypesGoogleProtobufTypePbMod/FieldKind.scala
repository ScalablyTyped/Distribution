package typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldKind extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Field_Kind")
@js.native
object FieldKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldKind & Double] = js.native
  
  /**
    * Field type bool.
    *
    * @generated from enum value: TYPE_BOOL = 8;
    */
  @js.native
  sealed trait TYPE_BOOL
    extends StObject
       with FieldKind
  /* 8 */ val TYPE_BOOL: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_BOOL & Double = js.native
  
  /**
    * Field type bytes.
    *
    * @generated from enum value: TYPE_BYTES = 12;
    */
  @js.native
  sealed trait TYPE_BYTES
    extends StObject
       with FieldKind
  /* 12 */ val TYPE_BYTES: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_BYTES & Double = js.native
  
  /**
    * Field type double.
    *
    * @generated from enum value: TYPE_DOUBLE = 1;
    */
  @js.native
  sealed trait TYPE_DOUBLE
    extends StObject
       with FieldKind
  /* 1 */ val TYPE_DOUBLE: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_DOUBLE & Double = js.native
  
  /**
    * Field type enum.
    *
    * @generated from enum value: TYPE_ENUM = 14;
    */
  @js.native
  sealed trait TYPE_ENUM
    extends StObject
       with FieldKind
  /* 14 */ val TYPE_ENUM: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_ENUM & Double = js.native
  
  /**
    * Field type fixed32.
    *
    * @generated from enum value: TYPE_FIXED32 = 7;
    */
  @js.native
  sealed trait TYPE_FIXED32
    extends StObject
       with FieldKind
  /* 7 */ val TYPE_FIXED32: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_FIXED32 & Double = js.native
  
  /**
    * Field type fixed64.
    *
    * @generated from enum value: TYPE_FIXED64 = 6;
    */
  @js.native
  sealed trait TYPE_FIXED64
    extends StObject
       with FieldKind
  /* 6 */ val TYPE_FIXED64: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_FIXED64 & Double = js.native
  
  /**
    * Field type float.
    *
    * @generated from enum value: TYPE_FLOAT = 2;
    */
  @js.native
  sealed trait TYPE_FLOAT
    extends StObject
       with FieldKind
  /* 2 */ val TYPE_FLOAT: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_FLOAT & Double = js.native
  
  /**
    * Field type group. Proto2 syntax only, and deprecated.
    *
    * @generated from enum value: TYPE_GROUP = 10;
    */
  @js.native
  sealed trait TYPE_GROUP
    extends StObject
       with FieldKind
  /* 10 */ val TYPE_GROUP: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_GROUP & Double = js.native
  
  /**
    * Field type int32.
    *
    * @generated from enum value: TYPE_INT32 = 5;
    */
  @js.native
  sealed trait TYPE_INT32
    extends StObject
       with FieldKind
  /* 5 */ val TYPE_INT32: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_INT32 & Double = js.native
  
  /**
    * Field type int64.
    *
    * @generated from enum value: TYPE_INT64 = 3;
    */
  @js.native
  sealed trait TYPE_INT64
    extends StObject
       with FieldKind
  /* 3 */ val TYPE_INT64: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_INT64 & Double = js.native
  
  /**
    * Field type message.
    *
    * @generated from enum value: TYPE_MESSAGE = 11;
    */
  @js.native
  sealed trait TYPE_MESSAGE
    extends StObject
       with FieldKind
  /* 11 */ val TYPE_MESSAGE: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_MESSAGE & Double = js.native
  
  /**
    * Field type sfixed32.
    *
    * @generated from enum value: TYPE_SFIXED32 = 15;
    */
  @js.native
  sealed trait TYPE_SFIXED32
    extends StObject
       with FieldKind
  /* 15 */ val TYPE_SFIXED32: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_SFIXED32 & Double = js.native
  
  /**
    * Field type sfixed64.
    *
    * @generated from enum value: TYPE_SFIXED64 = 16;
    */
  @js.native
  sealed trait TYPE_SFIXED64
    extends StObject
       with FieldKind
  /* 16 */ val TYPE_SFIXED64: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_SFIXED64 & Double = js.native
  
  /**
    * Field type sint32.
    *
    * @generated from enum value: TYPE_SINT32 = 17;
    */
  @js.native
  sealed trait TYPE_SINT32
    extends StObject
       with FieldKind
  /* 17 */ val TYPE_SINT32: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_SINT32 & Double = js.native
  
  /**
    * Field type sint64.
    *
    * @generated from enum value: TYPE_SINT64 = 18;
    */
  @js.native
  sealed trait TYPE_SINT64
    extends StObject
       with FieldKind
  /* 18 */ val TYPE_SINT64: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_SINT64 & Double = js.native
  
  /**
    * Field type string.
    *
    * @generated from enum value: TYPE_STRING = 9;
    */
  @js.native
  sealed trait TYPE_STRING
    extends StObject
       with FieldKind
  /* 9 */ val TYPE_STRING: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_STRING & Double = js.native
  
  /**
    * Field type uint32.
    *
    * @generated from enum value: TYPE_UINT32 = 13;
    */
  @js.native
  sealed trait TYPE_UINT32
    extends StObject
       with FieldKind
  /* 13 */ val TYPE_UINT32: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_UINT32 & Double = js.native
  
  /**
    * Field type uint64.
    *
    * @generated from enum value: TYPE_UINT64 = 4;
    */
  @js.native
  sealed trait TYPE_UINT64
    extends StObject
       with FieldKind
  /* 4 */ val TYPE_UINT64: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_UINT64 & Double = js.native
  
  /**
    * Field type unknown.
    *
    * @generated from enum value: TYPE_UNKNOWN = 0;
    */
  @js.native
  sealed trait TYPE_UNKNOWN
    extends StObject
       with FieldKind
  /* 0 */ val TYPE_UNKNOWN: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind.TYPE_UNKNOWN & Double = js.native
}
