package typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Syntax extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Syntax")
@js.native
object Syntax extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Syntax & Double] = js.native
  
  /**
    * Syntax `proto2`.
    *
    * @generated from enum value: SYNTAX_PROTO2 = 0;
    */
  @js.native
  sealed trait PROTO2
    extends StObject
       with Syntax
  /* 0 */ val PROTO2: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Syntax.PROTO2 & Double = js.native
  
  /**
    * Syntax `proto3`.
    *
    * @generated from enum value: SYNTAX_PROTO3 = 1;
    */
  @js.native
  sealed trait PROTO3
    extends StObject
       with Syntax
  /* 1 */ val PROTO3: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Syntax.PROTO3 & Double = js.native
}
