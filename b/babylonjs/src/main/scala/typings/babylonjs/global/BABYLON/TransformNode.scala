package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Behavior
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TransformNode")
@js.native
open class TransformNode protected ()
  extends StObject
     with typings.babylonjs.BABYLON.TransformNode {
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(name: String, scene: Unit, isPure: Boolean) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.BABYLON.Scene], isPure: Boolean) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typings.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typings.babylonjs.BABYLON.Node]): typings.babylonjs.BABYLON.Node = js.native
}
/* static members */
object TransformNode {
  
  @JSGlobal("BABYLON.TransformNode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Object will rotate to face the camera
    */
  @JSGlobal("BABYLON.TransformNode.BILLBOARDMODE_ALL")
  @js.native
  def BILLBOARDMODE_ALL: Double = js.native
  inline def BILLBOARDMODE_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_ALL")(x.asInstanceOf[js.Any])
  
  /**
    * Object will not rotate to face the camera
    */
  @JSGlobal("BABYLON.TransformNode.BILLBOARDMODE_NONE")
  @js.native
  def BILLBOARDMODE_NONE: Double = js.native
  inline def BILLBOARDMODE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_NONE")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera's position instead of orientation
    */
  @JSGlobal("BABYLON.TransformNode.BILLBOARDMODE_USE_POSITION")
  @js.native
  def BILLBOARDMODE_USE_POSITION: Double = js.native
  inline def BILLBOARDMODE_USE_POSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_USE_POSITION")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera but only on the x axis
    */
  @JSGlobal("BABYLON.TransformNode.BILLBOARDMODE_X")
  @js.native
  def BILLBOARDMODE_X: Double = js.native
  inline def BILLBOARDMODE_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_X")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera but only on the y axis
    */
  @JSGlobal("BABYLON.TransformNode.BILLBOARDMODE_Y")
  @js.native
  def BILLBOARDMODE_Y: Double = js.native
  inline def BILLBOARDMODE_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_Y")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera but only on the z axis
    */
  @JSGlobal("BABYLON.TransformNode.BILLBOARDMODE_Z")
  @js.native
  def BILLBOARDMODE_Z: Double = js.native
  inline def BILLBOARDMODE_Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_Z")(x.asInstanceOf[js.Any])
  
  /**
    * Child transform with Billboard flags should or should not apply parent rotation (default if off)
    */
  @JSGlobal("BABYLON.TransformNode.BillboardUseParentOrientation")
  @js.native
  def BillboardUseParentOrientation: Boolean = js.native
  inline def BillboardUseParentOrientation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BillboardUseParentOrientation")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a new TransformNode object parsed from the source provided.
    * @param parsedTransformNode is the source.
    * @param scene the scene the object belongs to
    * @param rootUrl is a string, it's the root URL to prefix the `delayLoadingFile` property with
    * @returns a new TransformNode object parsed from the source provided.
    */
  inline def Parse(parsedTransformNode: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTransformNode.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.TransformNode]
  
  @JSGlobal("BABYLON.TransformNode._LookAtVectorCache")
  @js.native
  def _LookAtVectorCache: Any = js.native
  inline def _LookAtVectorCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LookAtVectorCache")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TransformNode._RotationAxisCache")
  @js.native
  def _RotationAxisCache: Any = js.native
  inline def _RotationAxisCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationAxisCache")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TransformNode._TmpRotation")
  @js.native
  def _TmpRotation: Any = js.native
  inline def _TmpRotation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpRotation")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TransformNode._TmpScaling")
  @js.native
  def _TmpScaling: Any = js.native
  inline def _TmpScaling_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpScaling")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TransformNode._TmpTranslation")
  @js.native
  def _TmpTranslation: Any = js.native
  inline def _TmpTranslation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpTranslation")(x.asInstanceOf[js.Any])
}
