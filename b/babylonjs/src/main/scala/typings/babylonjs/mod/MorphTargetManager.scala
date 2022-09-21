package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
open class MorphTargetManager ()
  extends typings.babylonjs.legacyMod.MorphTargetManager {
  def this(scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
object MorphTargetManager {
  
  @JSImport("babylonjs", "MorphTargetManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** Enable storing morph target data into textures when set to true (true by default) */
  @JSImport("babylonjs", "MorphTargetManager.EnableTextureStorage")
  @js.native
  def EnableTextureStorage: Boolean = js.native
  inline def EnableTextureStorage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnableTextureStorage")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  inline def Parse(serializationObject: Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.morphTargetManagerMod.MorphTargetManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetManagerMod.MorphTargetManager]
}
