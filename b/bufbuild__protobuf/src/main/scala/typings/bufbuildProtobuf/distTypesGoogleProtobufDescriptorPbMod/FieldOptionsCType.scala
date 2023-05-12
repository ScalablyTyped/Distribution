package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldOptionsCType extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions_CType")
@js.native
object FieldOptionsCType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldOptionsCType & Double] = js.native
  
  /**
    * @generated from enum value: CORD = 1;
    */
  @js.native
  sealed trait CORD
    extends StObject
       with FieldOptionsCType
  /* 1 */ val CORD: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsCType.CORD & Double = js.native
  
  /**
    * Default mode.
    *
    * @generated from enum value: STRING = 0;
    */
  @js.native
  sealed trait STRING
    extends StObject
       with FieldOptionsCType
  /* 0 */ val STRING: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsCType.STRING & Double = js.native
  
  /**
    * @generated from enum value: STRING_PIECE = 2;
    */
  @js.native
  sealed trait STRING_PIECE
    extends StObject
       with FieldOptionsCType
  /* 2 */ val STRING_PIECE: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsCType.STRING_PIECE & Double = js.native
}
