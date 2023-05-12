package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.bufbuildProtobufStrings.bool
import typings.bufbuildProtobuf.bufbuildProtobufStrings.bytes
import typings.bufbuildProtobuf.bufbuildProtobufStrings.double
import typings.bufbuildProtobuf.bufbuildProtobufStrings.finish
import typings.bufbuildProtobuf.bufbuildProtobufStrings.fixed32
import typings.bufbuildProtobuf.bufbuildProtobufStrings.fixed64
import typings.bufbuildProtobuf.bufbuildProtobufStrings.float
import typings.bufbuildProtobuf.bufbuildProtobufStrings.fork
import typings.bufbuildProtobuf.bufbuildProtobufStrings.int32
import typings.bufbuildProtobuf.bufbuildProtobufStrings.int64
import typings.bufbuildProtobuf.bufbuildProtobufStrings.join
import typings.bufbuildProtobuf.bufbuildProtobufStrings.raw
import typings.bufbuildProtobuf.bufbuildProtobufStrings.sfixed32
import typings.bufbuildProtobuf.bufbuildProtobufStrings.sfixed64
import typings.bufbuildProtobuf.bufbuildProtobufStrings.sint32
import typings.bufbuildProtobuf.bufbuildProtobufStrings.sint64
import typings.bufbuildProtobuf.bufbuildProtobufStrings.string
import typings.bufbuildProtobuf.bufbuildProtobufStrings.tag
import typings.bufbuildProtobuf.bufbuildProtobufStrings.uint32
import typings.bufbuildProtobuf.bufbuildProtobufStrings.uint64
import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateScalarsMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/scalars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scalarDefaultValue(`type`: ScalarType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scalarDefaultValue")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def scalarEquals(`type`: ScalarType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: String, b: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: String, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: String, b: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: String, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.BigInt, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.BigInt, b: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.BigInt, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.BigInt, b: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.BigInt, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.typedarray.Uint8Array, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.typedarray.Uint8Array, b: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.typedarray.Uint8Array, b: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: js.typedarray.Uint8Array, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Boolean, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Boolean, b: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Boolean, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Boolean, b: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Boolean, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Double, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Double, b: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Double, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Double, b: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Unit, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Unit, b: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Unit, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Unit, b: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def scalarEquals(`type`: ScalarType, a: Unit, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarEquals")(`type`.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def scalarTypeInfo(`type`: ScalarType): js.Tuple3[
    WireType, 
    Exclude[
      /* keyof @bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-encoding.IBinaryWriter */ finish | fork | join | tag | raw | uint32 | int32 | sint32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | fixed32 | sfixed32 | float | double | bytes | string, 
      tag | raw | fork | join | finish
    ], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("scalarTypeInfo")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    WireType, 
    Exclude[
      /* keyof @bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-encoding.IBinaryWriter */ finish | fork | join | tag | raw | uint32 | int32 | sint32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | fixed32 | sfixed32 | float | double | bytes | string, 
      tag | raw | fork | join | finish
    ], 
    Boolean
  ]]
  inline def scalarTypeInfo(`type`: ScalarType, value: Any): js.Tuple3[
    WireType, 
    Exclude[
      /* keyof @bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-encoding.IBinaryWriter */ finish | fork | join | tag | raw | uint32 | int32 | sint32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | fixed32 | sfixed32 | float | double | bytes | string, 
      tag | raw | fork | join | finish
    ], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("scalarTypeInfo")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    WireType, 
    Exclude[
      /* keyof @bufbuild/protobuf.@bufbuild/protobuf/dist/types/binary-encoding.IBinaryWriter */ finish | fork | join | tag | raw | uint32 | int32 | sint32 | int64 | uint64 | sint64 | fixed64 | sfixed64 | bool | fixed32 | sfixed32 | float | double | bytes | string, 
      tag | raw | fork | join | finish
    ], 
    Boolean
  ]]
}
