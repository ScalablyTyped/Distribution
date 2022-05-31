package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsBonesBoneAugmentingMod {
  
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
    ): Boolean
  }
  object Bone {
    
    inline def apply(
      copyAnimationRange: (typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typings.babylonjs.mathVectorMod.Vector3]) => Boolean
    ): typings.babylonjs.legacyMod.babylonjsBonesBoneAugmentingMod.Bone = {
      val __obj = js.Dynamic.literal(copyAnimationRange = js.Any.fromFunction5(copyAnimationRange))
      __obj.asInstanceOf[typings.babylonjs.legacyMod.babylonjsBonesBoneAugmentingMod.Bone]
    }
    
    extension [Self <: typings.babylonjs.legacyMod.babylonjsBonesBoneAugmentingMod.Bone](x: Self) {
      
      inline def setCopyAnimationRange(
        value: (typings.babylonjs.animatableMod.babylonjsBonesBoneAugmentingMod.Bone, String, Double, Boolean, Nullable[typings.babylonjs.mathVectorMod.Vector3]) => Boolean
      ): Self = StObject.set(x, "copyAnimationRange", js.Any.fromFunction5(value))
    }
  }
}
