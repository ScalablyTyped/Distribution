package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MorphTargetManager")
@js.native
/**
  * Creates a new MorphTargetManager
  * @param scene defines the current scene
  */
open class MorphTargetManager ()
  extends StObject
     with typings.babylonjs.BABYLON.MorphTargetManager {
  def this(scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object MorphTargetManager {
  
  @JSGlobal("BABYLON.MorphTargetManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** Enable storing morph target data into textures when set to true (true by default) */
  @JSGlobal("BABYLON.MorphTargetManager.EnableTextureStorage")
  @js.native
  def EnableTextureStorage: Boolean = js.native
  inline def EnableTextureStorage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnableTextureStorage")(x.asInstanceOf[js.Any])
  
  /** Maximum number of active morph targets supported in the "vertex attribute" mode (i.e., not the "texture" mode) */
  @JSGlobal("BABYLON.MorphTargetManager.MaxActiveMorphTargetsInVertexAttributeMode")
  @js.native
  def MaxActiveMorphTargetsInVertexAttributeMode: Double = js.native
  inline def MaxActiveMorphTargetsInVertexAttributeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxActiveMorphTargetsInVertexAttributeMode")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a new MorphTargetManager from serialized data
    * @param serializationObject defines the serialized data
    * @param scene defines the hosting scene
    * @returns the new MorphTargetManager
    */
  inline def Parse(serializationObject: Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.MorphTargetManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.MorphTargetManager]
}
