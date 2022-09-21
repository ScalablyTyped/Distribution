package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PushMaterial")
@js.native
open class PushMaterial protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PushMaterial {
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(name: String, scene: Unit, storeEffectOnSubMeshes: Boolean) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene, storeEffectOnSubMeshes: Boolean) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
