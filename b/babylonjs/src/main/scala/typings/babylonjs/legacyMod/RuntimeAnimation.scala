package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "RuntimeAnimation")
@js.native
class RuntimeAnimation protected ()
  extends typings.babylonjs.indexMod.RuntimeAnimation {
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
