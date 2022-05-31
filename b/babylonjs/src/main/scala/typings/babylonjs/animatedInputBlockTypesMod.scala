package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedInputBlockTypesMod {
  
  @js.native
  sealed trait AnimatedInputBlockTypes extends StObject
  @JSImport("babylonjs/Materials/Node/Blocks/Input/animatedInputBlockTypes", "AnimatedInputBlockTypes")
  @js.native
  object AnimatedInputBlockTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnimatedInputBlockTypes & Double] = js.native
    
    /** No animation */
    @js.native
    sealed trait None
      extends StObject
         with AnimatedInputBlockTypes
    /* 0 */ val None: typings.babylonjs.animatedInputBlockTypesMod.AnimatedInputBlockTypes.None & Double = js.native
    
    /** Time based animation. Will only work for floats */
    @js.native
    sealed trait Time
      extends StObject
         with AnimatedInputBlockTypes
    /* 1 */ val Time: typings.babylonjs.animatedInputBlockTypesMod.AnimatedInputBlockTypes.Time & Double = js.native
  }
}
