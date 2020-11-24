package typings.classTransformer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-transformer/enums/transformation-type.enum", JSImport.Namespace)
@js.native
object transformationTypeEnumMod extends js.Object {
  
  @js.native
  sealed trait TransformationType extends js.Object
  @js.native
  object TransformationType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransformationType with Double] = js.native
    
    @js.native
    sealed trait CLASS_TO_CLASS extends TransformationType
    /* 2 */ @js.native
    object CLASS_TO_CLASS extends TopLevel[CLASS_TO_CLASS with Double]
    
    @js.native
    sealed trait CLASS_TO_PLAIN extends TransformationType
    /* 1 */ @js.native
    object CLASS_TO_PLAIN extends TopLevel[CLASS_TO_PLAIN with Double]
    
    @js.native
    sealed trait PLAIN_TO_CLASS extends TransformationType
    /* 0 */ @js.native
    object PLAIN_TO_CLASS extends TopLevel[PLAIN_TO_CLASS with Double]
  }
}
