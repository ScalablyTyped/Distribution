package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Skeleton")
@js.native
class Skeleton protected ()
  extends typings.babylonjs.indexMod.Skeleton {
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
  
  @JSImport("babylonjs/Legacy/legacy", "Skeleton.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    skeleton: typings.babylonjs.skeletonMod.Skeleton,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String
  ): Nullable[typings.babylonjs.skeletonMod.Skeleton] = js.native
  /**
    * Convert the keyframes for a range of animation on a skeleton to be relative to a given reference frame.
    * @param skeleton defines the Skeleton containing the animation range to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the Skeleton to convert
    * @returns the original skeleton
    */
  @JSImport("babylonjs/Legacy/legacy", "Skeleton.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(skeleton: typings.babylonjs.skeletonMod.Skeleton, referenceFrame: Double, range: String): Nullable[typings.babylonjs.skeletonMod.Skeleton] = js.native
  
  /**
    * Creates a new skeleton from serialized data
    * @param parsedSkeleton defines the serialized data
    * @param scene defines the hosting scene
    * @returns a new skeleton
    */
  @JSImport("babylonjs/Legacy/legacy", "Skeleton.Parse")
  @js.native
  def Parse(parsedSkeleton: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.skeletonMod.Skeleton = js.native
}
