package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MethodOptionsIdempotencyLevel extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MethodOptions_IdempotencyLevel")
@js.native
object MethodOptionsIdempotencyLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MethodOptionsIdempotencyLevel & Double] = js.native
  
  /**
    * @generated from enum value: IDEMPOTENCY_UNKNOWN = 0;
    */
  @js.native
  sealed trait IDEMPOTENCY_UNKNOWN
    extends StObject
       with MethodOptionsIdempotencyLevel
  /* 0 */ val IDEMPOTENCY_UNKNOWN: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MethodOptionsIdempotencyLevel.IDEMPOTENCY_UNKNOWN & Double = js.native
  
  /**
    * idempotent, but may have side effects
    *
    * @generated from enum value: IDEMPOTENT = 2;
    */
  @js.native
  sealed trait IDEMPOTENT
    extends StObject
       with MethodOptionsIdempotencyLevel
  /* 2 */ val IDEMPOTENT: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MethodOptionsIdempotencyLevel.IDEMPOTENT & Double = js.native
  
  /**
    * implies idempotent
    *
    * @generated from enum value: NO_SIDE_EFFECTS = 1;
    */
  @js.native
  sealed trait NO_SIDE_EFFECTS
    extends StObject
       with MethodOptionsIdempotencyLevel
  /* 1 */ val NO_SIDE_EFFECTS: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MethodOptionsIdempotencyLevel.NO_SIDE_EFFECTS & Double = js.native
}
