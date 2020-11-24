package typings.classTransformer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-transformer/enums", JSImport.Namespace)
@js.native
object enumsMod extends js.Object {
  
  @js.native
  object TransformationType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.classTransformer.transformationTypeEnumMod.TransformationType with Double
      ] = js.native
    
    /* 2 */ val CLASS_TO_CLASS: typings.classTransformer.transformationTypeEnumMod.TransformationType.CLASS_TO_CLASS with Double = js.native
    
    /* 1 */ val CLASS_TO_PLAIN: typings.classTransformer.transformationTypeEnumMod.TransformationType.CLASS_TO_PLAIN with Double = js.native
    
    /* 0 */ val PLAIN_TO_CLASS: typings.classTransformer.transformationTypeEnumMod.TransformationType.PLAIN_TO_CLASS with Double = js.native
  }
}
