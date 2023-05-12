package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.RecordRuntimeSymbolNameRu
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnum
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnumValue
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMethod
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescService
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCodegenInfoMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/codegen-info", "codegenInfo")
  @js.native
  val codegenInfo: CodegenInfo_ = js.native
  
  @js.native
  trait CodegenInfo_ extends StObject {
    
    def getUnwrappedFieldType(field: DescField): js.UndefOr[ScalarType] = js.native
    
    def localName(desc: DescEnum): String = js.native
    def localName(desc: DescEnumValue): String = js.native
    def localName(desc: DescField): String = js.native
    def localName(desc: DescMessage): String = js.native
    def localName(desc: DescMethod): String = js.native
    def localName(desc: DescOneof): String = js.native
    def localName(desc: DescService): String = js.native
    
    val packageName: String = js.native
    
    def reifyWkt(message: DescMessage): js.UndefOr[DescWkt] = js.native
    
    def safeIdentifier(name: String): String = js.native
    
    def safeObjectProperty(name: String): String = js.native
    
    def scalarDefaultValue(`type`: ScalarType): Any = js.native
    
    val symbols: RecordRuntimeSymbolNameRu = js.native
    
    val wktSourceFiles: js.Array[String] = js.native
  }
  
  trait RuntimeSymbolInfo extends StObject {
    
    var privateImportPath: String
    
    var publicImportPath: String
    
    var typeOnly: Boolean
  }
  object RuntimeSymbolInfo {
    
    inline def apply(privateImportPath: String, publicImportPath: String, typeOnly: Boolean): RuntimeSymbolInfo = {
      val __obj = js.Dynamic.literal(privateImportPath = privateImportPath.asInstanceOf[js.Any], publicImportPath = publicImportPath.asInstanceOf[js.Any], typeOnly = typeOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeSymbolInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeSymbolInfo] (val x: Self) extends AnyVal {
      
      inline def setPrivateImportPath(value: String): Self = StObject.set(x, "privateImportPath", value.asInstanceOf[js.Any])
      
      inline def setPublicImportPath(value: String): Self = StObject.set(x, "publicImportPath", value.asInstanceOf[js.Any])
      
      inline def setTypeOnly(value: Boolean): Self = StObject.set(x, "typeOnly", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.proto2
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.proto3
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.Message
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.PartialMessage
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.PlainMessage
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.FieldList
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.MessageType
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.BinaryReadOptions
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.BinaryWriteOptions
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonReadOptions
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonWriteOptions
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonValue
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonObject
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.protoInt64
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.ScalarType
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.MethodKind
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.MethodIdempotency
    - typings.bufbuildProtobuf.bufbuildProtobufStrings.IMessageTypeRegistry
  */
  trait RuntimeSymbolName extends StObject
  object RuntimeSymbolName {
    
    inline def BinaryReadOptions: typings.bufbuildProtobuf.bufbuildProtobufStrings.BinaryReadOptions = "BinaryReadOptions".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.BinaryReadOptions]
    
    inline def BinaryWriteOptions: typings.bufbuildProtobuf.bufbuildProtobufStrings.BinaryWriteOptions = "BinaryWriteOptions".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.BinaryWriteOptions]
    
    inline def FieldList: typings.bufbuildProtobuf.bufbuildProtobufStrings.FieldList = "FieldList".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.FieldList]
    
    inline def IMessageTypeRegistry: typings.bufbuildProtobuf.bufbuildProtobufStrings.IMessageTypeRegistry = "IMessageTypeRegistry".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.IMessageTypeRegistry]
    
    inline def JsonObject: typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonObject = "JsonObject".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonObject]
    
    inline def JsonReadOptions: typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonReadOptions = "JsonReadOptions".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonReadOptions]
    
    inline def JsonValue: typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonValue = "JsonValue".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonValue]
    
    inline def JsonWriteOptions: typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonWriteOptions = "JsonWriteOptions".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.JsonWriteOptions]
    
    inline def Message: typings.bufbuildProtobuf.bufbuildProtobufStrings.Message = "Message".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.Message]
    
    inline def MessageType: typings.bufbuildProtobuf.bufbuildProtobufStrings.MessageType = "MessageType".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.MessageType]
    
    inline def MethodIdempotency: typings.bufbuildProtobuf.bufbuildProtobufStrings.MethodIdempotency = "MethodIdempotency".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.MethodIdempotency]
    
    inline def MethodKind: typings.bufbuildProtobuf.bufbuildProtobufStrings.MethodKind = "MethodKind".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.MethodKind]
    
    inline def PartialMessage: typings.bufbuildProtobuf.bufbuildProtobufStrings.PartialMessage = "PartialMessage".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.PartialMessage]
    
    inline def PlainMessage: typings.bufbuildProtobuf.bufbuildProtobufStrings.PlainMessage = "PlainMessage".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.PlainMessage]
    
    inline def ScalarType: typings.bufbuildProtobuf.bufbuildProtobufStrings.ScalarType = "ScalarType".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.ScalarType]
    
    inline def proto2: typings.bufbuildProtobuf.bufbuildProtobufStrings.proto2 = "proto2".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.proto2]
    
    inline def proto3: typings.bufbuildProtobuf.bufbuildProtobufStrings.proto3 = "proto3".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.proto3]
    
    inline def protoInt64: typings.bufbuildProtobuf.bufbuildProtobufStrings.protoInt64 = "protoInt64".asInstanceOf[typings.bufbuildProtobuf.bufbuildProtobufStrings.protoInt64]
  }
}
