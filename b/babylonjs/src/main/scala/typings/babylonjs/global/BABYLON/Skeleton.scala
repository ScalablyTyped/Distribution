package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Skeleton")
@js.native
class Skeleton protected ()
  extends typings.babylonjs.BABYLON.Skeleton {
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
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
object Skeleton {
  
  @JSGlobal("BABYLON.Skeleton.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(
    skeleton: typings.babylonjs.BABYLON.Skeleton,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String
  ): Nullable[typings.babylonjs.BABYLON.Skeleton] = js.native
  /**
    * Convert the keyframes for a range of animation on a skeleton to be relative to a given reference frame.
    * @param skeleton defines the Skeleton containing the animation range to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the Skeleton to convert
    * @returns the original skeleton
    */
  @JSGlobal("BABYLON.Skeleton.MakeAnimationAdditive")
  @js.native
  def MakeAnimationAdditive(skeleton: typings.babylonjs.BABYLON.Skeleton, referenceFrame: Double, range: String): Nullable[typings.babylonjs.BABYLON.Skeleton] = js.native
  
  /**
    * Creates a new skeleton from serialized data
    * @param parsedSkeleton defines the serialized data
    * @param scene defines the hosting scene
    * @returns a new skeleton
    */
  @JSGlobal("BABYLON.Skeleton.Parse")
  @js.native
  def Parse(parsedSkeleton: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.Skeleton = js.native
}
