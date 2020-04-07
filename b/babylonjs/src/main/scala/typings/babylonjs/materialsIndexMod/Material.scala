package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "Material")
@js.native
class Material protected ()
  extends typings.babylonjs.materialMod.Material {
  /**
    * Creates a material instance
    * @param name defines the name of the material
    * @param scene defines the scene to reference
    * @param doNotAdd specifies if the material should be added to the scene
    */
  def this(name: String, scene: Scene) = this()
  def this(name: String, scene: Scene, doNotAdd: Boolean) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "Material")
@js.native
object Material extends js.Object {
  /**
    * The all dirty flag value
    */
  val AllDirtyFlag: Double = js.native
  /**
    * The dirty attribute flag value
    */
  val AttributesDirtyFlag: Double = js.native
  /**
    * Stores the clock-wise side orientation
    */
  val ClockWiseSideOrientation: Double = js.native
  /**
    * Stores the counter clock-wise side orientation
    */
  val CounterClockWiseSideOrientation: Double = js.native
  /**
    * The dirty fresnel flag value
    */
  val FresnelDirtyFlag: Double = js.native
  /**
    * The dirty light flag value
    */
  val LightDirtyFlag: Double = js.native
  /**
    * Returns the line list draw mode
    */
  val LineListDrawMode: Double = js.native
  /**
    * Returns the line loop draw mode
    */
  val LineLoopDrawMode: Double = js.native
  /**
    * Returns the line strip draw mode
    */
  val LineStripDrawMode: Double = js.native
  /**
    * The dirty misc flag value
    */
  val MiscDirtyFlag: Double = js.native
  /**
    * Returns the point fill mode
    */
  val PointFillMode: Double = js.native
  /**
    * Returns the point list draw mode
    */
  val PointListDrawMode: Double = js.native
  /**
    * The dirty texture flag value
    */
  val TextureDirtyFlag: Double = js.native
  /**
    * Returns the triangle fan draw mode
    */
  val TriangleFanDrawMode: Double = js.native
  /**
    * Returns the triangle fill mode
    */
  val TriangleFillMode: Double = js.native
  /**
    * Returns the triangle strip draw mode
    */
  val TriangleStripDrawMode: Double = js.native
  /**
    * Returns the wireframe mode
    */
  val WireFrameFillMode: Double = js.native
  val _AllDirtyCallBack: js.Any = js.native
  val _AttributeDirtyCallBack: js.Any = js.native
  val _DirtyCallbackArray: js.Any = js.native
  var _FresnelAndMiscDirtyCallBack: js.Any = js.native
  val _FresnelDirtyCallBack: js.Any = js.native
  val _ImageProcessingDirtyCallBack: js.Any = js.native
  val _LightsDirtyCallBack: js.Any = js.native
  val _MiscDirtyCallBack: js.Any = js.native
  val _RunDirtyCallBacks: js.Any = js.native
  var _TextureAndMiscDirtyCallBack: js.Any = js.native
  val _TextureDirtyCallBack: js.Any = js.native
  /**
    * Creates a material from parsed material data
    * @param parsedMaterial defines parsed material data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new material
    */
  def Parse(parsedMaterial: js.Any, scene: Scene, rootUrl: String): Nullable[typings.babylonjs.materialMod.Material] = js.native
}

