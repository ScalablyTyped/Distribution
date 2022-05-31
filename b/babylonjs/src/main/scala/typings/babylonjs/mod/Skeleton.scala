package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Skeleton")
@js.native
class Skeleton protected ()
  extends typings.babylonjs.legacyMod.Skeleton {
  /**
    * Creates a new skeleton
    * @param name defines the skeleton name
    * @param id defines the skeleton Id
    * @param scene defines the hosting scene
    */
  def this(
    /** defines the skeleton name */
  name: String,
    /** defines the skeleton Id */
  id: String,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object Skeleton {
  
  @JSImport("babylonjs", "Skeleton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the keyframes for a range of animation on a skeleton to be relative to a given reference frame.
    * @param skeleton defines the Skeleton containing the animation range to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the Skeleton to convert
    * @returns the original skeleton
    */
  inline def MakeAnimationAdditive(skeleton: typings.babylonjs.skeletonMod.Skeleton, referenceFrame: Double, range: String): Nullable[typings.babylonjs.skeletonMod.Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.skeletonMod.Skeleton]]
  inline def MakeAnimationAdditive(skeleton: typings.babylonjs.skeletonMod.Skeleton, referenceFrame: Unit, range: String): Nullable[typings.babylonjs.skeletonMod.Skeleton] = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(skeleton.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.skeletonMod.Skeleton]]
  
  /**
    * Creates a new skeleton from serialized data
    * @param parsedSkeleton defines the serialized data
    * @param scene defines the hosting scene
    * @returns a new skeleton
    */
  inline def Parse(parsedSkeleton: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.skeletonMod.Skeleton = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSkeleton.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.skeletonMod.Skeleton]
}
