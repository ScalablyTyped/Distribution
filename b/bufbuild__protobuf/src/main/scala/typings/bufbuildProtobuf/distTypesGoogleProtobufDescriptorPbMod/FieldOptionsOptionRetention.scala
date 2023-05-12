package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldOptionsOptionRetention extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions_OptionRetention")
@js.native
object FieldOptionsOptionRetention extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldOptionsOptionRetention & Double] = js.native
  
  /**
    * @generated from enum value: RETENTION_RUNTIME = 1;
    */
  @js.native
  sealed trait RETENTION_RUNTIME
    extends StObject
       with FieldOptionsOptionRetention
  /* 1 */ val RETENTION_RUNTIME: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsOptionRetention.RETENTION_RUNTIME & Double = js.native
  
  /**
    * @generated from enum value: RETENTION_SOURCE = 2;
    */
  @js.native
  sealed trait RETENTION_SOURCE
    extends StObject
       with FieldOptionsOptionRetention
  /* 2 */ val RETENTION_SOURCE: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsOptionRetention.RETENTION_SOURCE & Double = js.native
  
  /**
    * @generated from enum value: RETENTION_UNKNOWN = 0;
    */
  @js.native
  sealed trait RETENTION_UNKNOWN
    extends StObject
       with FieldOptionsOptionRetention
  /* 0 */ val RETENTION_UNKNOWN: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsOptionRetention.RETENTION_UNKNOWN & Double = js.native
}
