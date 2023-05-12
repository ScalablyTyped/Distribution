package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.OmitBinaryFormatwriteMess
import typings.bufbuildProtobuf.anon.`6`
import typings.bufbuildProtobuf.distTypesBinaryEncodingMod.IBinaryWriter
import typings.bufbuildProtobuf.distTypesBinaryFormatMod.BinaryWriteOptions
import typings.bufbuildProtobuf.distTypesFieldMod.FieldInfo
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateBinaryFormatCommonMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/binary-format-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeBinaryFormatCommon(): OmitBinaryFormatwriteMess = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBinaryFormatCommon")().asInstanceOf[OmitBinaryFormatwriteMess]
  
  inline def writeMapEntry(writer: IBinaryWriter, options: BinaryWriteOptions, field: FieldInfo & `6`, key: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeMapEntry")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any], field.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeMessageField(
    writer: IBinaryWriter,
    options: BinaryWriteOptions,
    `type`: MessageType[AnyMessage],
    fieldNo: Double,
    value: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeMessageField")(writer.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fieldNo.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writePacked(writer: IBinaryWriter, `type`: ScalarType, fieldNo: Double, value: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePacked")(writer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fieldNo.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeScalar(
    writer: IBinaryWriter,
    `type`: ScalarType,
    fieldNo: Double,
    value: Any,
    emitIntrinsicDefault: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeScalar")(writer.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fieldNo.asInstanceOf[js.Any], value.asInstanceOf[js.Any], emitIntrinsicDefault.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
