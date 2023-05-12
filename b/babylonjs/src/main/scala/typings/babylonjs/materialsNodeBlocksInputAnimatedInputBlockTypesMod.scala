package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksInputAnimatedInputBlockTypesMod {
  
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
    /* 0 */ val None: typings.babylonjs.materialsNodeBlocksInputAnimatedInputBlockTypesMod.AnimatedInputBlockTypes.None & Double = js.native
    
    /** Time elapsed (in seconds) since the engine was initialized. Will only work for floats */
    @js.native
    sealed trait RealTime
      extends StObject
         with AnimatedInputBlockTypes
    /* 2 */ val RealTime: typings.babylonjs.materialsNodeBlocksInputAnimatedInputBlockTypesMod.AnimatedInputBlockTypes.RealTime & Double = js.native
    
    /** Time based animation (is incremented by 0.6 each second). Will only work for floats */
    @js.native
    sealed trait Time
      extends StObject
         with AnimatedInputBlockTypes
    /* 1 */ val Time: typings.babylonjs.materialsNodeBlocksInputAnimatedInputBlockTypesMod.AnimatedInputBlockTypes.Time & Double = js.native
  }
}
