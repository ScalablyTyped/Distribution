package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
class MorphTargetManager ()
  extends typings.babylonjs.legacyMod.MorphTargetManager {
  def this(scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
@JSImport("babylonjs", "MorphTargetManager")
@js.native
object MorphTargetManager extends js.Object {
  
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  def Parse(serializationObject: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.morphTargetManagerMod.MorphTargetManager = js.native
}
