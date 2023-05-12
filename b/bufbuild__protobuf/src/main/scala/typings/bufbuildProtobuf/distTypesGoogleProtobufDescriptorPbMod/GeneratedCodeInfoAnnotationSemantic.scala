package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeneratedCodeInfoAnnotationSemantic extends StObject
@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo_Annotation_Semantic")
@js.native
object GeneratedCodeInfoAnnotationSemantic extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeneratedCodeInfoAnnotationSemantic & Double] = js.native
  
  /**
    * An alias to the element is returned.
    *
    * @generated from enum value: ALIAS = 2;
    */
  @js.native
  sealed trait ALIAS
    extends StObject
       with GeneratedCodeInfoAnnotationSemantic
  /* 2 */ val ALIAS: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotationSemantic.ALIAS & Double = js.native
  
  /**
    * There is no effect or the effect is indescribable.
    *
    * @generated from enum value: NONE = 0;
    */
  @js.native
  sealed trait NONE
    extends StObject
       with GeneratedCodeInfoAnnotationSemantic
  /* 0 */ val NONE: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotationSemantic.NONE & Double = js.native
  
  /**
    * The element is set or otherwise mutated.
    *
    * @generated from enum value: SET = 1;
    */
  @js.native
  sealed trait SET
    extends StObject
       with GeneratedCodeInfoAnnotationSemantic
  /* 1 */ val SET: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotationSemantic.SET & Double = js.native
}
