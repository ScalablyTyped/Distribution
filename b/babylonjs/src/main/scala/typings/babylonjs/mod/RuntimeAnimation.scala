package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "RuntimeAnimation")
@js.native
class RuntimeAnimation protected ()
  extends typings.babylonjs.legacyMod.RuntimeAnimation {
  /**
    * Create a new RuntimeAnimation object
    * @param target defines the target of the animation
    * @param animation defines the source animation object
    * @param scene defines the hosting scene
    * @param host defines the initiating Animatable
    */
  def this(
    target: js.Any,
    animation: typings.babylonjs.animationMod.Animation,
    scene: typings.babylonjs.sceneMod.Scene,
    host: typings.babylonjs.animatableMod.Animatable
  ) = this()
}

