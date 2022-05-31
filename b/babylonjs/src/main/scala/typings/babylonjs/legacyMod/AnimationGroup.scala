package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AnimationGroup")
@js.native
class AnimationGroup protected ()
  extends typings.babylonjs.indexMod.AnimationGroup {
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
object AnimationGroup {
  
  @JSImport("babylonjs/Legacy/legacy", "AnimationGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
    * @param sourceAnimationGroup defines the AnimationGroup containing animations to convert
    * @param referenceFrame defines the frame that keyframes in the range will be relative to
    * @param range defines the name of the AnimationRange belonging to the animations in the group to convert
    * @param cloneOriginal defines whether or not to clone the group and convert the clone or convert the original group (default is false)
    * @param clonedName defines the name of the resulting cloned AnimationGroup if cloneOriginal is true
    * @returns a new AnimationGroup if cloneOriginal is true or the original AnimationGroup if cloneOriginal is false
    */
  inline def MakeAnimationAdditive(sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup): typings.babylonjs.animationGroupMod.AnimationGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup, referenceFrame: Double): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: String,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: Unit,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: Unit,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Double,
    range: Unit,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Unit,
    range: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Unit,
    range: String,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Unit,
    range: String,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Unit,
    range: String,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Unit,
    range: Unit,
    cloneOriginal: Boolean
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Unit,
    range: Unit,
    cloneOriginal: Boolean,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  inline def MakeAnimationAdditive(
    sourceAnimationGroup: typings.babylonjs.animationGroupMod.AnimationGroup,
    referenceFrame: Unit,
    range: Unit,
    cloneOriginal: Unit,
    clonedName: String
  ): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeAnimationAdditive")(sourceAnimationGroup.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], range.asInstanceOf[js.Any], cloneOriginal.asInstanceOf[js.Any], clonedName.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
  
  /**
    * Returns a new AnimationGroup object parsed from the source provided.
    * @param parsedAnimationGroup defines the source
    * @param scene defines the scene that will receive the animationGroup
    * @returns a new AnimationGroup
    */
  inline def Parse(parsedAnimationGroup: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.animationGroupMod.AnimationGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedAnimationGroup.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.animationGroupMod.AnimationGroup]
}
