package typings.classTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformationTypeEnumMod {
  
  @js.native
  sealed trait TransformationType extends StObject
  @JSImport("class-transformer/enums/transformation-type.enum", "TransformationType")
  @js.native
  object TransformationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransformationType with Double] = js.native
    
    @js.native
    sealed trait CLASS_TO_CLASS extends TransformationType
    /* 2 */ val CLASS_TO_CLASS: typings.classTransformer.transformationTypeEnumMod.TransformationType.CLASS_TO_CLASS with Double = js.native
    
    @js.native
    sealed trait CLASS_TO_PLAIN extends TransformationType
    /* 1 */ val CLASS_TO_PLAIN: typings.classTransformer.transformationTypeEnumMod.TransformationType.CLASS_TO_PLAIN with Double = js.native
    
    @js.native
    sealed trait PLAIN_TO_CLASS extends TransformationType
    /* 0 */ val PLAIN_TO_CLASS: typings.classTransformer.transformationTypeEnumMod.TransformationType.PLAIN_TO_CLASS with Double = js.native
  }
}
