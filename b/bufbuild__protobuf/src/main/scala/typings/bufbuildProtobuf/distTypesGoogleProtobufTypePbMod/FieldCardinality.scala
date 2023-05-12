package typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldCardinality extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Field_Cardinality")
@js.native
object FieldCardinality extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldCardinality & Double] = js.native
  
  /**
    * For optional fields.
    *
    * @generated from enum value: CARDINALITY_OPTIONAL = 1;
    */
  @js.native
  sealed trait OPTIONAL
    extends StObject
       with FieldCardinality
  /* 1 */ val OPTIONAL: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldCardinality.OPTIONAL & Double = js.native
  
  /**
    * For repeated fields.
    *
    * @generated from enum value: CARDINALITY_REPEATED = 3;
    */
  @js.native
  sealed trait REPEATED
    extends StObject
       with FieldCardinality
  /* 3 */ val REPEATED: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldCardinality.REPEATED & Double = js.native
  
  /**
    * For required fields. Proto2 syntax only.
    *
    * @generated from enum value: CARDINALITY_REQUIRED = 2;
    */
  @js.native
  sealed trait REQUIRED
    extends StObject
       with FieldCardinality
  /* 2 */ val REQUIRED: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldCardinality.REQUIRED & Double = js.native
  
  /**
    * For fields with unknown cardinality.
    *
    * @generated from enum value: CARDINALITY_UNKNOWN = 0;
    */
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with FieldCardinality
  /* 0 */ val UNKNOWN: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldCardinality.UNKNOWN & Double = js.native
}
