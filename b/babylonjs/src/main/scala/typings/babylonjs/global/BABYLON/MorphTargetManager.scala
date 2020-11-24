package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
class MorphTargetManager ()
  extends typings.babylonjs.BABYLON.MorphTargetManager {
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
}
/* static members */
@JSGlobal("BABYLON.MorphTargetManager")
@js.native
object MorphTargetManager extends js.Object {
  
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  def Parse(serializationObject: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.MorphTargetManager = js.native
}
