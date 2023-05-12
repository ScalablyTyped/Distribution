package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageServiceDesc
import typings.bufbuildProtobuf.anon.PlainMessageServiceDescriClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
@js.native
open class ServiceDescriptorProto () extends Message[ServiceDescriptorProto] {
  def this(data: PartialMessageServiceDesc) = this()
  
  /**
    * @generated from field: repeated google.protobuf.MethodDescriptorProto method = 2;
    */
  var method: js.Array[MethodDescriptorProto] = js.native
  
  /**
    * @generated from field: optional string name = 1;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: optional google.protobuf.ServiceOptions options = 3;
    */
  var options: js.UndefOr[ServiceOptions] = js.native
}
/* static members */
object ServiceDescriptorProto {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "ServiceDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageServiceDescriClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: ServiceDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageServiceDescriClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageServiceDescriClone, b: PlainMessageServiceDescriClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageServiceDescriClone, b: ServiceDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: ServiceDescriptorProto): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: ServiceDescriptorProto, b: PlainMessageServiceDescriClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: ServiceDescriptorProto, b: ServiceDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "ServiceDescriptorProto.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): ServiceDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServiceDescriptorProto]
  
  inline def fromJson(jsonValue: JsonValue): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): ServiceDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServiceDescriptorProto]
  
  inline def fromJsonString(jsonString: String): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): ServiceDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServiceDescriptorProto]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "ServiceDescriptorProto.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "ServiceDescriptorProto.typeName")
  @js.native
  val typeName: /* "google.protobuf.ServiceDescriptorProto" */ String = js.native
}
