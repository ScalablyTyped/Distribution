package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.Default
import typings.bufbuildProtobuf.anon.DefaultJsonName
import typings.bufbuildProtobuf.anon.JsonName
import typings.bufbuildProtobuf.anon.JsonNameOneof
import typings.bufbuildProtobuf.anon.Kind
import typings.bufbuildProtobuf.anon.KindT
import typings.bufbuildProtobuf.anon.Oneof
import typings.bufbuildProtobuf.anon.Opt
import typings.bufbuildProtobuf.anon.Packed
import typings.bufbuildProtobuf.anon.Repeated
import typings.bufbuildProtobuf.anon.T
import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import typings.bufbuildProtobuf.bufbuildProtobufStrings.`enum`
import typings.bufbuildProtobuf.bufbuildProtobufStrings.default
import typings.bufbuildProtobuf.bufbuildProtobufStrings.jsonName
import typings.bufbuildProtobuf.bufbuildProtobufStrings.localName
import typings.bufbuildProtobuf.bufbuildProtobufStrings.map
import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import typings.bufbuildProtobuf.bufbuildProtobufStrings.oneof
import typings.bufbuildProtobuf.bufbuildProtobufStrings.opt
import typings.bufbuildProtobuf.bufbuildProtobufStrings.packed
import typings.bufbuildProtobuf.bufbuildProtobufStrings.repeat
import typings.bufbuildProtobuf.bufbuildProtobufStrings.repeated
import typings.bufbuildProtobuf.bufbuildProtobufStrings.scalar
import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.BYTES
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.DOUBLE
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FLOAT
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.std.Exclude
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFieldMod {
  
  @js.native
  sealed trait ScalarType extends StObject
  @JSImport("@bufbuild/protobuf/dist/types/field", "ScalarType")
  @js.native
  object ScalarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ScalarType & Double] = js.native
    
    @js.native
    sealed trait BOOL
      extends StObject
         with ScalarType
    /* 8 */ val BOOL: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.BOOL & Double = js.native
    
    @js.native
    sealed trait BYTES
      extends StObject
         with ScalarType
    /* 12 */ val BYTES: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.BYTES & Double = js.native
    
    @js.native
    sealed trait DOUBLE
      extends StObject
         with ScalarType
    /* 1 */ val DOUBLE: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.DOUBLE & Double = js.native
    
    @js.native
    sealed trait FIXED32
      extends StObject
         with ScalarType
    /* 7 */ val FIXED32: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FIXED32 & Double = js.native
    
    @js.native
    sealed trait FIXED64
      extends StObject
         with ScalarType
    /* 6 */ val FIXED64: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FIXED64 & Double = js.native
    
    @js.native
    sealed trait FLOAT
      extends StObject
         with ScalarType
    /* 2 */ val FLOAT: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FLOAT & Double = js.native
    
    @js.native
    sealed trait INT32
      extends StObject
         with ScalarType
    /* 5 */ val INT32: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.INT32 & Double = js.native
    
    @js.native
    sealed trait INT64
      extends StObject
         with ScalarType
    /* 3 */ val INT64: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.INT64 & Double = js.native
    
    @js.native
    sealed trait SFIXED32
      extends StObject
         with ScalarType
    /* 15 */ val SFIXED32: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.SFIXED32 & Double = js.native
    
    @js.native
    sealed trait SFIXED64
      extends StObject
         with ScalarType
    /* 16 */ val SFIXED64: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.SFIXED64 & Double = js.native
    
    @js.native
    sealed trait SINT32
      extends StObject
         with ScalarType
    /* 17 */ val SINT32: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.SINT32 & Double = js.native
    
    @js.native
    sealed trait SINT64
      extends StObject
         with ScalarType
    /* 18 */ val SINT64: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.SINT64 & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with ScalarType
    /* 9 */ val STRING: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.STRING & Double = js.native
    
    @js.native
    sealed trait UINT32
      extends StObject
         with ScalarType
    /* 13 */ val UINT32: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.UINT32 & Double = js.native
    
    @js.native
    sealed trait UINT64
      extends StObject
         with ScalarType
    /* 4 */ val UINT64: typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.UINT64 & Double = js.native
  }
  
  type FieldInfo = fiRules[fiEnum | fiMap | fiMessage | fiScalar]
  
  trait OneofInfo extends StObject {
    
    val default: Unit
    
    val fields: js.Array[FieldInfo]
    
    /**
      * Return field information by local name.
      */
    def findField(localName: String): js.UndefOr[FieldInfo]
    
    val kind: oneof
    
    val localName: String
    
    val name: String
    
    val opt: `false`
    
    val packed: `false`
    
    val repeated: `false`
  }
  object OneofInfo {
    
    inline def apply(
      default: Unit,
      fields: js.Array[FieldInfo],
      findField: String => js.UndefOr[FieldInfo],
      localName: String,
      name: String
    ): OneofInfo = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], findField = js.Any.fromFunction1(findField), kind = "oneof", localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opt = false, packed = false, repeated = false)
      __obj.asInstanceOf[OneofInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OneofInfo] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[FieldInfo]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: FieldInfo*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFindField(value: String => js.UndefOr[FieldInfo]): Self = StObject.set(x, "findField", js.Any.fromFunction1(value))
      
      inline def setKind(value: oneof): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpt(value: `false`): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
      
      inline def setPacked(value: `false`): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setRepeated(value: `false`): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    }
  }
  
  type PartialFieldInfo = fiPartialRules[fiEnum | fiMap | fiMessage | fiScalar]
  
  trait fiEnum
    extends StObject
       with fiShared {
    
    /**
      * Only proto2: An explicit default value.
      */
    val default: js.UndefOr[Double] = js.undefined
    
    /**
      * Enum type information for the field.
      */
    val T: EnumType
    
    val kind: `enum`
    
    /**
      * Is the field optional?
      */
    val opt: Boolean
    
    /**
      * Is this repeated field packed?
      * Repeated enums can be packed with the field option "packed".
      * For proto3, they are packed by default.
      */
    val packed: Boolean
    
    /**
      * Is the field repeated?
      */
    val repeated: Boolean
  }
  object fiEnum {
    
    inline def apply(
      T: EnumType,
      jsonName: String,
      localName: String,
      name: String,
      no: Double,
      opt: Boolean,
      packed: Boolean,
      repeated: Boolean
    ): fiEnum = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], kind = "enum", localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any], opt = opt.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any])
      __obj.asInstanceOf[fiEnum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fiEnum] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setKind(value: `enum`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOpt(value: Boolean): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
      
      inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setT(value: EnumType): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
  
  trait fiMap
    extends StObject
       with fiShared {
    
    /**
      * An explicit default value (only proto2). Never set for maps.
      */
    val default: Unit
    
    /**
      * Map key type.
      *
      * The key_type can be any integral or string type
      * (so, any scalar type except for floating point
      * types and bytes)
      */
    val K: Exclude[ScalarType, FLOAT | DOUBLE | BYTES]
    
    /**
      * Map value type. Can be scalar, enum, or message.
      */
    val V: Kind | T | KindT
    
    val kind: map
    
    /**
      * Is this repeated field packed? Never true for maps.
      */
    val packed: `false`
    
    /**
      * Is the field repeated? Never true for maps.
      */
    val repeated: `false`
  }
  object fiMap {
    
    inline def apply(
      K: Exclude[ScalarType, FLOAT | DOUBLE | BYTES],
      V: Kind | T | KindT,
      default: Unit,
      jsonName: String,
      localName: String,
      name: String,
      no: Double
    ): fiMap = {
      val __obj = js.Dynamic.literal(K = K.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], kind = "map", localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any], packed = false, repeated = false)
      __obj.asInstanceOf[fiMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fiMap] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setK(value: Exclude[ScalarType, FLOAT | DOUBLE | BYTES]): Self = StObject.set(x, "K", value.asInstanceOf[js.Any])
      
      inline def setKind(value: map): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPacked(value: `false`): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setRepeated(value: `false`): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setV(value: Kind | T | KindT): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
    }
  }
  
  trait fiMessage
    extends StObject
       with fiShared {
    
    /**
      * An explicit default value (only proto2). Never set for messages.
      */
    val default: Unit
    
    /**
      * Message handler for the field.
      */
    val T: MessageType[AnyMessage]
    
    val kind: message_
    
    /**
      * Is this repeated field packed? Never true for messages.
      */
    val packed: `false`
    
    /**
      * Is the field repeated?
      */
    val repeated: Boolean
  }
  object fiMessage {
    
    inline def apply(
      T: MessageType[AnyMessage],
      default: Unit,
      jsonName: String,
      localName: String,
      name: String,
      no: Double,
      repeated: Boolean
    ): fiMessage = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], kind = "message", localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any], packed = false, repeated = repeated.asInstanceOf[js.Any])
      __obj.asInstanceOf[fiMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fiMessage] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setKind(value: message_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPacked(value: `false`): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setT(value: MessageType[AnyMessage]): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
  
  type fiPartialRules[T /* <: fiScalar | fiMap | fiEnum | fiMessage */] = (Default[T] & (Omit[T, jsonName | localName | oneof | repeat | repeated | packed | opt | default])) | (JsonName[T] & (Omit[T, jsonName | localName | oneof | repeat | repeated | packed | opt | default])) | (DefaultJsonName[T] & (Omit[T, jsonName | localName | oneof | repeat | repeated | packed | opt | default])) | (JsonNameOneof[T] & (Omit[T, jsonName | localName | oneof | repeat | repeated | packed | opt | default]))
  
  type fiRules[T] = (Oneof & (Omit[T, oneof | repeat | repeated | packed | opt])) | (Opt & (Omit[T, oneof | repeat | repeated | packed | opt])) | (Packed & (Omit[T, oneof | repeat | repeated | packed | opt])) | (Repeated & (Omit[T, oneof | repeat | repeated | packed | opt]))
  
  trait fiScalar
    extends StObject
       with fiShared {
    
    /**
      * Only proto2: An explicit default value.
      */
    val default: js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array] = js.undefined
    
    /**
      * Scalar type of the field.
      */
    val T: ScalarType
    
    val kind: scalar
    
    /**
      * Is the field optional?
      */
    val opt: Boolean
    
    /**
      * Is this repeated field packed?
      * BYTES and STRING can never be packed, since they are length-delimited.
      * Other types can be packed with the field option "packed".
      * For proto3, fields are packed by default.
      */
    val packed: Boolean
    
    /**
      * Is the field repeated?
      */
    val repeated: Boolean
  }
  object fiScalar {
    
    inline def apply(
      T: ScalarType,
      jsonName: String,
      localName: String,
      name: String,
      no: Double,
      opt: Boolean,
      packed: Boolean,
      repeated: Boolean
    ): fiScalar = {
      val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], jsonName = jsonName.asInstanceOf[js.Any], kind = "scalar", localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any], opt = opt.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any])
      __obj.asInstanceOf[fiScalar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fiScalar] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setKind(value: scalar): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setOpt(value: Boolean): Self = StObject.set(x, "opt", value.asInstanceOf[js.Any])
      
      inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      inline def setT(value: ScalarType): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    }
  }
  
  trait fiShared extends StObject {
    
    /**
      * The name for JSON serialization / deserialization.
      */
    val jsonName: String
    
    /**
      * The name of the field as used in generated code.
      */
    val localName: String
    
    /**
      * The original name of the .proto field.
      */
    val name: String
    
    /**
      * The field number of the .proto field.
      */
    val no: Double
    
    /**
      * The `oneof` group, if this field belongs to one.
      */
    val oneof: js.UndefOr[OneofInfo] = js.undefined
  }
  object fiShared {
    
    inline def apply(jsonName: String, localName: String, name: String, no: Double): fiShared = {
      val __obj = js.Dynamic.literal(jsonName = jsonName.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], no = no.asInstanceOf[js.Any])
      __obj.asInstanceOf[fiShared]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: fiShared] (val x: Self) extends AnyVal {
      
      inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNo(value: Double): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      inline def setOneof(value: OneofInfo): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
      
      inline def setOneofUndefined: Self = StObject.set(x, "oneof", js.undefined)
    }
  }
}
