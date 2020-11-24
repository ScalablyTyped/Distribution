package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Node/Blocks/Input/animatedInputBlockTypes", JSImport.Namespace)
@js.native
object animatedInputBlockTypesMod extends js.Object {
  
  @js.native
  sealed trait AnimatedInputBlockTypes extends js.Object
  @js.native
  object AnimatedInputBlockTypes extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnimatedInputBlockTypes with Double] = js.native
    
    /** No animation */
    @js.native
    sealed trait None extends AnimatedInputBlockTypes
    /* 0 */ @js.native
    object None extends TopLevel[None with Double]
    
    /** Time based animation. Will only work for floats */
    @js.native
    sealed trait Time extends AnimatedInputBlockTypes
    /* 1 */ @js.native
    object Time extends TopLevel[Time with Double]
  }
}
