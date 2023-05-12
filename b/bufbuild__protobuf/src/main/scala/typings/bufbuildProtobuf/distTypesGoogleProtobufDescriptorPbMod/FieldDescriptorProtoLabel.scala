package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldDescriptorProtoLabel extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldDescriptorProto_Label")
@js.native
object FieldDescriptorProtoLabel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldDescriptorProtoLabel & Double] = js.native
  
  /**
    * 0 is reserved for errors
    *
    * @generated from enum value: LABEL_OPTIONAL = 1;
    */
  @js.native
  sealed trait OPTIONAL
    extends StObject
       with FieldDescriptorProtoLabel
  /* 1 */ val OPTIONAL: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoLabel.OPTIONAL & Double = js.native
  
  /**
    * @generated from enum value: LABEL_REPEATED = 3;
    */
  @js.native
  sealed trait REPEATED
    extends StObject
       with FieldDescriptorProtoLabel
  /* 3 */ val REPEATED: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoLabel.REPEATED & Double = js.native
  
  /**
    * @generated from enum value: LABEL_REQUIRED = 2;
    */
  @js.native
  sealed trait REQUIRED
    extends StObject
       with FieldDescriptorProtoLabel
  /* 2 */ val REQUIRED: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoLabel.REQUIRED & Double = js.native
}
