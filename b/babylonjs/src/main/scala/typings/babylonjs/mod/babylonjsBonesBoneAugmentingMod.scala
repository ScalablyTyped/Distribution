package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsBonesBoneAugmentingMod {
  
  @js.native
  trait Bone extends StObject {
    
    /**
      * Copy an animation range from another bone
      * @param source defines the source bone
      * @param rangeName defines the range name to copy
      * @param frameOffset defines the frame offset
      * @param rescaleAsRequired defines if rescaling must be applied if required
      * @param skelDimensionsRatio defines the scaling ratio
      * @returns true if operation was successful
      */
    def copyAnimationRange(
      source: typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone,
      rangeName: String,
      frameOffset: Double,
      rescaleAsRequired: Boolean,
      skelDimensionsRatio: Nullable[typings.babylonjs.mathVectorMod.Vector3]
    ): Boolean = js.native
  }
  object Bone {
    
    @scala.inline
    def apply(
      copyAnimationRange: (typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typings.babylonjs.mathVectorMod.Vector3]) => Boolean
    ): typings.babylonjs.mod.babylonjsBonesBoneAugmentingMod.Bone = {
      val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
      __obj.asInstanceOf[typings.babylonjs.mod.babylonjsBonesBoneAugmentingMod.Bone]
    }
    
    @scala.inline
    implicit class BoneMutableBuilder[Self <: typings.babylonjs.mod.babylonjsBonesBoneAugmentingMod.Bone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyAnimationRange(
        value: (typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typings.babylonjs.mathVectorMod.Vector3]) => Boolean
      ): Self = StObject.set(x, "copyAnimationRange", js.Any.fromFunction5(value))
    }
  }
}
