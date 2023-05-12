package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileOptionsOptimizeMode extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FileOptions_OptimizeMode")
@js.native
object FileOptionsOptimizeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileOptionsOptimizeMode & Double] = js.native
  
  /**
    * etc.
    *
    * Use ReflectionOps to implement these methods.
    *
    * @generated from enum value: CODE_SIZE = 2;
    */
  @js.native
  sealed trait CODE_SIZE
    extends StObject
       with FileOptionsOptimizeMode
  /* 2 */ val CODE_SIZE: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptionsOptimizeMode.CODE_SIZE & Double = js.native
  
  /**
    * Generate code using MessageLite and the lite runtime.
    *
    * @generated from enum value: LITE_RUNTIME = 3;
    */
  @js.native
  sealed trait LITE_RUNTIME
    extends StObject
       with FileOptionsOptimizeMode
  /* 3 */ val LITE_RUNTIME: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptionsOptimizeMode.LITE_RUNTIME & Double = js.native
  
  /**
    * Generate complete code for parsing, serialization,
    *
    * @generated from enum value: SPEED = 1;
    */
  @js.native
  sealed trait SPEED
    extends StObject
       with FileOptionsOptimizeMode
  /* 1 */ val SPEED: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptionsOptimizeMode.SPEED & Double = js.native
}
