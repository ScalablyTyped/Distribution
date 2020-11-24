package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AnimationGroup")
@js.native
class AnimationGroup protected ()
  extends typings.babylonjs.legacyMod.AnimationGroup {
  /**
    * Instantiates a new Animation Group.
    * This helps managing several animations at once.
    * @see https://doc.babylonjs.com/how_to/group
    * @param name Defines the name of the group
    * @param scene Defines the scene the group belongs to
    */
  def this(/** The name of the animation group */
  name: String) = this()
  def this(
    /** The name of the animation group */
  name: String,
    scene: Nullable[typings.babylonjs.sceneMod.Scene]
  ) = this()
}
/* static members */
@JSImport("babylonjs", "AnimationGroup")
@js.native
object AnimationGroup extends js.Object {
  
  /**
    * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
    * @param sourceAnimationGroup defines the AnimationGroup containing animations to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the animations in the group to convert
    * @param cloneOriginal defines whether or not to clone the group and convert the clone or convert the original group (default is false)
    * @param clonedName defines the name of the resulting cloned AnimationGroup if cloneOriginal is true
    * @returns a new AnimationGroup if cloneOriginal is true or the original AnimationGroup if cloneOriginal is false
    */
  def MakeAnimationAdditive(sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String,
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: js.UndefOr[scala.Nothing],
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup, referenceFrame: Double): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: js.UndefOr[scala.Nothing],
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String,
    cloneOriginal: js.UndefOr[scala.Nothing],
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
  
  /**
    * Returns a new AnimationGroup object parsed from the source provided.
    * @param parsedAnimationGroup defines the source
    * @param scene defines the scene that will receive the animationGroup
    * @returns a new AnimationGroup
    */
  def Parse(parsedAnimationGroup: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.animationGroupMod.AnimationGroup = js.native
}
