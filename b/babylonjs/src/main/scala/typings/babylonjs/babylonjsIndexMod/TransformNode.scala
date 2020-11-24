package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "TransformNode")
@js.native
class TransformNode protected ()
  extends typings.babylonjs.transformNodeMod.TransformNode {
  def this(name: String) = this()
  def this(name: String, scene: Nullable[Scene]) = this()
  def this(name: String, scene: js.UndefOr[Nullable[Scene]], isPure: Boolean) = this()
}
/* static members */
@JSImport("babylonjs/Meshes/index", "TransformNode")
@js.native
object TransformNode extends js.Object {
  
  /**
    * Object will rotate to face the camera
    */
  var BILLBOARDMODE_ALL: Double = js.native
  
  /**
    * Object will not rotate to face the camera
    */
  var BILLBOARDMODE_NONE: Double = js.native
  
  /**
    * Object will rotate to face the camera's position instead of orientation
    */
  var BILLBOARDMODE_USE_POSITION: Double = js.native
  
  /**
    * Object will rotate to face the camera but only on the x axis
    */
  var BILLBOARDMODE_X: Double = js.native
  
  /**
    * Object will rotate to face the camera but only on the y axis
    */
  var BILLBOARDMODE_Y: Double = js.native
  
  /**
    * Object will rotate to face the camera but only on the z axis
    */
  var BILLBOARDMODE_Z: Double = js.native
  
  /**
    * Returns a new TransformNode object parsed from the source provided.
    * @param parsedTransformNode is the source.
    * @param scene the scne the object belongs to
    * @param rootUrl is a string, it's the root URL to prefix the `delayLoadingFile` property with
    * @returns a new TransformNode object parsed from the source provided.
    */
  def Parse(parsedTransformNode: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.transformNodeMod.TransformNode = js.native
  
  var _TmpRotation: js.Any = js.native
  
  var _TmpScaling: js.Any = js.native
  
  var _TmpTranslation: js.Any = js.native
  
  var _lookAtVectorCache: js.Any = js.native
  
  var _rotationAxisCache: js.Any = js.native
}
