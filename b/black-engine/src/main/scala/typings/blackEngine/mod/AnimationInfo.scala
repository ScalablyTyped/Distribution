package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "AnimationInfo")
@js.native
open class AnimationInfo protected ()
  extends typings.blackEngine.animationAnimationInfoMod.AnimationInfo {
  def this(
    controller: typings.blackEngine.animationAnimationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.texturesTextureMod.Texture]
  ) = this()
  def this(
    controller: typings.blackEngine.animationAnimationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.texturesTextureMod.Texture],
    fps: Double
  ) = this()
  def this(
    controller: typings.blackEngine.animationAnimationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.texturesTextureMod.Texture],
    fps: Double,
    loop: Boolean
  ) = this()
  def this(
    controller: typings.blackEngine.animationAnimationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.texturesTextureMod.Texture],
    fps: Unit,
    loop: Boolean
  ) = this()
}
