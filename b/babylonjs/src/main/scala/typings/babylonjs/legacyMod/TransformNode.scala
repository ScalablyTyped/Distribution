package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "TransformNode")
@js.native
class TransformNode protected ()
  extends typings.babylonjs.indexMod.TransformNode {
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
  def this(name: String, scene: Unit, isPure: Boolean) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.sceneMod.Scene], isPure: Boolean) = this()
}
/* static members */
object TransformNode {
  
  @JSImport("babylonjs/Legacy/legacy", "TransformNode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Object will rotate to face the camera
    */
  @JSImport("babylonjs/Legacy/legacy", "TransformNode.BILLBOARDMODE_ALL")
  @js.native
  def BILLBOARDMODE_ALL: Double = js.native
  inline def BILLBOARDMODE_ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_ALL")(x.asInstanceOf[js.Any])
  
  /**
    * Object will not rotate to face the camera
    */
  @JSImport("babylonjs/Legacy/legacy", "TransformNode.BILLBOARDMODE_NONE")
  @js.native
  def BILLBOARDMODE_NONE: Double = js.native
  inline def BILLBOARDMODE_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_NONE")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera's position instead of orientation
    */
  @JSImport("babylonjs/Legacy/legacy", "TransformNode.BILLBOARDMODE_USE_POSITION")
  @js.native
  def BILLBOARDMODE_USE_POSITION: Double = js.native
  inline def BILLBOARDMODE_USE_POSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_USE_POSITION")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera but only on the x axis
    */
  @JSImport("babylonjs/Legacy/legacy", "TransformNode.BILLBOARDMODE_X")
  @js.native
  def BILLBOARDMODE_X: Double = js.native
  inline def BILLBOARDMODE_X_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_X")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera but only on the y axis
    */
  @JSImport("babylonjs/Legacy/legacy", "TransformNode.BILLBOARDMODE_Y")
  @js.native
  def BILLBOARDMODE_Y: Double = js.native
  inline def BILLBOARDMODE_Y_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_Y")(x.asInstanceOf[js.Any])
  
  /**
    * Object will rotate to face the camera but only on the z axis
    */
  @JSImport("babylonjs/Legacy/legacy", "TransformNode.BILLBOARDMODE_Z")
  @js.native
  def BILLBOARDMODE_Z: Double = js.native
  inline def BILLBOARDMODE_Z_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BILLBOARDMODE_Z")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a new TransformNode object parsed from the source provided.
    * @param parsedTransformNode is the source.
    * @param scene the scne the object belongs to
    * @param rootUrl is a string, it's the root URL to prefix the `delayLoadingFile` property with
    * @returns a new TransformNode object parsed from the source provided.
    */
  inline def Parse(parsedTransformNode: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.transformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTransformNode.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.transformNodeMod.TransformNode]
  
  @JSImport("babylonjs/Legacy/legacy", "TransformNode._TmpRotation")
  @js.native
  def _TmpRotation: js.Any = js.native
  inline def _TmpRotation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpRotation")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "TransformNode._TmpScaling")
  @js.native
  def _TmpScaling: js.Any = js.native
  inline def _TmpScaling_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpScaling")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "TransformNode._TmpTranslation")
  @js.native
  def _TmpTranslation: js.Any = js.native
  inline def _TmpTranslation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpTranslation")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "TransformNode._lookAtVectorCache")
  @js.native
  def _lookAtVectorCache: js.Any = js.native
  inline def _lookAtVectorCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_lookAtVectorCache")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "TransformNode._rotationAxisCache")
  @js.native
  def _rotationAxisCache: js.Any = js.native
  inline def _rotationAxisCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_rotationAxisCache")(x.asInstanceOf[js.Any])
}
