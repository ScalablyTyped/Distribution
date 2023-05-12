package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.bufbuildProtobufStrings.proto2
import typings.bufbuildProtobuf.bufbuildProtobufStrings.proto3
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescriptorSet
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCreateDescriptorSetMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/create-descriptor-set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDescriptorSet(input: js.Array[FileDescriptorProto]): DescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDescriptorSet")(input.asInstanceOf[js.Any]).asInstanceOf[DescriptorSet]
  inline def createDescriptorSet(input: js.typedarray.Uint8Array): DescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDescriptorSet")(input.asInstanceOf[js.Any]).asInstanceOf[DescriptorSet]
  inline def createDescriptorSet(input: FileDescriptorSet): DescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDescriptorSet")(input.asInstanceOf[js.Any]).asInstanceOf[DescriptorSet]
  
  inline def isPackedFieldByDefault(proto: FieldDescriptorProto, syntax: proto2 | proto3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPackedFieldByDefault")(proto.asInstanceOf[js.Any], syntax.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
