package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldDescriptorProtoType extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldDescriptorProto_Type")
@js.native
object FieldDescriptorProtoType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldDescriptorProtoType & Double] = js.native
  
  /**
    * @generated from enum value: TYPE_BOOL = 8;
    */
  @js.native
  sealed trait BOOL
    extends StObject
       with FieldDescriptorProtoType
  /* 8 */ val BOOL: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.BOOL & Double = js.native
  
  /**
    * New in version 2.
    *
    * @generated from enum value: TYPE_BYTES = 12;
    */
  @js.native
  sealed trait BYTES
    extends StObject
       with FieldDescriptorProtoType
  /* 12 */ val BYTES: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.BYTES & Double = js.native
  
  /**
    * 0 is reserved for errors.
    * Order is weird for historical reasons.
    *
    * @generated from enum value: TYPE_DOUBLE = 1;
    */
  @js.native
  sealed trait DOUBLE
    extends StObject
       with FieldDescriptorProtoType
  /* 1 */ val DOUBLE: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.DOUBLE & Double = js.native
  
  /**
    * @generated from enum value: TYPE_ENUM = 14;
    */
  @js.native
  sealed trait ENUM
    extends StObject
       with FieldDescriptorProtoType
  /* 14 */ val ENUM: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.ENUM & Double = js.native
  
  /**
    * @generated from enum value: TYPE_FIXED32 = 7;
    */
  @js.native
  sealed trait FIXED32
    extends StObject
       with FieldDescriptorProtoType
  /* 7 */ val FIXED32: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.FIXED32 & Double = js.native
  
  /**
    * @generated from enum value: TYPE_FIXED64 = 6;
    */
  @js.native
  sealed trait FIXED64
    extends StObject
       with FieldDescriptorProtoType
  /* 6 */ val FIXED64: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.FIXED64 & Double = js.native
  
  /**
    * @generated from enum value: TYPE_FLOAT = 2;
    */
  @js.native
  sealed trait FLOAT
    extends StObject
       with FieldDescriptorProtoType
  /* 2 */ val FLOAT: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.FLOAT & Double = js.native
  
  /**
    * Tag-delimited aggregate.
    * Group type is deprecated and not supported in proto3. However, Proto3
    * implementations should still be able to parse the group wire format and
    * treat group fields as unknown fields.
    *
    * @generated from enum value: TYPE_GROUP = 10;
    */
  @js.native
  sealed trait GROUP
    extends StObject
       with FieldDescriptorProtoType
  /* 10 */ val GROUP: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.GROUP & Double = js.native
  
  /**
    * Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT32 if
    * negative values are likely.
    *
    * @generated from enum value: TYPE_INT32 = 5;
    */
  @js.native
  sealed trait INT32
    extends StObject
       with FieldDescriptorProtoType
  /* 5 */ val INT32: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.INT32 & Double = js.native
  
  /**
    * Not ZigZag encoded.  Negative numbers take 10 bytes.  Use TYPE_SINT64 if
    * negative values are likely.
    *
    * @generated from enum value: TYPE_INT64 = 3;
    */
  @js.native
  sealed trait INT64
    extends StObject
       with FieldDescriptorProtoType
  /* 3 */ val INT64: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.INT64 & Double = js.native
  
  /**
    * Length-delimited aggregate.
    *
    * @generated from enum value: TYPE_MESSAGE = 11;
    */
  @js.native
  sealed trait MESSAGE
    extends StObject
       with FieldDescriptorProtoType
  /* 11 */ val MESSAGE: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.MESSAGE & Double = js.native
  
  /**
    * @generated from enum value: TYPE_SFIXED32 = 15;
    */
  @js.native
  sealed trait SFIXED32
    extends StObject
       with FieldDescriptorProtoType
  /* 15 */ val SFIXED32: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.SFIXED32 & Double = js.native
  
  /**
    * @generated from enum value: TYPE_SFIXED64 = 16;
    */
  @js.native
  sealed trait SFIXED64
    extends StObject
       with FieldDescriptorProtoType
  /* 16 */ val SFIXED64: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.SFIXED64 & Double = js.native
  
  /**
    * Uses ZigZag encoding.
    *
    * @generated from enum value: TYPE_SINT32 = 17;
    */
  @js.native
  sealed trait SINT32
    extends StObject
       with FieldDescriptorProtoType
  /* 17 */ val SINT32: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.SINT32 & Double = js.native
  
  /**
    * Uses ZigZag encoding.
    *
    * @generated from enum value: TYPE_SINT64 = 18;
    */
  @js.native
  sealed trait SINT64
    extends StObject
       with FieldDescriptorProtoType
  /* 18 */ val SINT64: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.SINT64 & Double = js.native
  
  /**
    * @generated from enum value: TYPE_STRING = 9;
    */
  @js.native
  sealed trait STRING
    extends StObject
       with FieldDescriptorProtoType
  /* 9 */ val STRING: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.STRING & Double = js.native
  
  /**
    * @generated from enum value: TYPE_UINT32 = 13;
    */
  @js.native
  sealed trait UINT32
    extends StObject
       with FieldDescriptorProtoType
  /* 13 */ val UINT32: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.UINT32 & Double = js.native
  
  /**
    * @generated from enum value: TYPE_UINT64 = 4;
    */
  @js.native
  sealed trait UINT64
    extends StObject
       with FieldDescriptorProtoType
  /* 4 */ val UINT64: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType.UINT64 & Double = js.native
}
