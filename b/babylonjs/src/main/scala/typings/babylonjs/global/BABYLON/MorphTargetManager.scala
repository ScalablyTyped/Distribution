package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
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
object MorphTargetManager {
  
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  @JSGlobal("BABYLON.MorphTargetManager.Parse")
  @js.native
  def Parse(serializationObject: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.MorphTargetManager = js.native
}
