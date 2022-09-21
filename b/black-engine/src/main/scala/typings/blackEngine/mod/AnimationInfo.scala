package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "AnimationInfo")
@js.native
open class AnimationInfo protected ()
  extends typings.blackEngine.animationInfoMod.AnimationInfo {
  def this(
    controller: typings.blackEngine.animationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.textureMod.Texture]
  ) = this()
  def this(
    controller: typings.blackEngine.animationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.textureMod.Texture],
    fps: Double
  ) = this()
  def this(
    controller: typings.blackEngine.animationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.textureMod.Texture],
    fps: Double,
    loop: Boolean
  ) = this()
  def this(
    controller: typings.blackEngine.animationControllerMod.AnimationController,
    name: String,
    frames: js.Array[typings.blackEngine.textureMod.Texture],
    fps: Unit,
    loop: Boolean
  ) = this()
}
