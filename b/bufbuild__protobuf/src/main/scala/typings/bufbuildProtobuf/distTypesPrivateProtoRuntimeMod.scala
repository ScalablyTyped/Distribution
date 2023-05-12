package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.LocalName
import typings.bufbuildProtobuf.anon.OmitEnumValueInfolocalNam
import typings.bufbuildProtobuf.distTypesBinaryFormatMod.BinaryFormat
import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import typings.bufbuildProtobuf.distTypesEnumMod.EnumValueInfo
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonFormat
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesPrivateEnumMod.EnumObject
import typings.bufbuildProtobuf.distTypesPrivateFieldListMod.FieldListSource
import typings.bufbuildProtobuf.distTypesPrivateUtilMod.Util
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateProtoRuntimeMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/proto-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeProtoRuntime(syntax: String, json: JsonFormat, bin: BinaryFormat, util: Util): ProtoRuntime = (^.asInstanceOf[js.Dynamic].applyDynamic("makeProtoRuntime")(syntax.asInstanceOf[js.Any], json.asInstanceOf[js.Any], bin.asInstanceOf[js.Any], util.asInstanceOf[js.Any])).asInstanceOf[ProtoRuntime]
  
  @js.native
  trait ProtoRuntime extends StObject {
    
    val bin: BinaryFormat = js.native
    
    /**
      * Get reflection information - the EnumType - from an enum object.
      * If this function is called on something other than a generated
      * enum, or an enum constructed with makeEnum(), it raises an error.
      */
    def getEnumType(enumObject: EnumObject): EnumType = js.native
    
    val json: JsonFormat = js.native
    
    /**
      * Create an enum object at runtime, without generating code.
      *
      * The object conforms to TypeScript enums, and comes with
      * mapping from name to value, and from value to name.
      *
      * The type name and other reflection information is accessible
      * via getEnumType().
      */
    def makeEnum(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam]): EnumObject = js.native
    def makeEnum(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam], opt: js.Object): EnumObject = js.native
    
    /**
      * Create an enum type at runtime, without generating code.
      * Note that this only creates the reflection information, not an
      * actual enum object.
      */
    def makeEnumType(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam]): EnumType = js.native
    def makeEnumType(typeName: String, values: js.Array[EnumValueInfo | OmitEnumValueInfolocalNam], opt: js.Object): EnumType = js.native
    
    /**
      * Create a message type at runtime, without generating code.
      */
    def makeMessageType[T /* <: Message[T] */](typeName: String, fields: FieldListSource): MessageType[T] = js.native
    def makeMessageType[T /* <: Message[T] */](typeName: String, fields: FieldListSource, opt: LocalName): MessageType[T] = js.native
    
    val syntax: String = js.native
    
    val util: Util = js.native
  }
}
