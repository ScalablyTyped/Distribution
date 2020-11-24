package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Material")
@js.native
class Material protected ()
  extends typings.babylonjs.indexMod.Material {
  /**
    * Creates a material instance
    * @param name defines the name of the material
    * @param scene defines the scene to reference
    * @param doNotAdd specifies if the material should be added to the scene
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene, doNotAdd: Boolean) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Material")
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
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    */
  val MATERIAL_ALPHABLEND: Double = js.native
  
  /**
    * MaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
    */
  val MATERIAL_ALPHATEST: Double = js.native
  
  /**
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    * They are also discarded below the alpha cutoff threshold to improve performances.
    */
  val MATERIAL_ALPHATESTANDBLEND: Double = js.native
  
  /**
    * The Reoriented Normal Mapping method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  val MATERIAL_NORMALBLENDMETHOD_RNM: Double = js.native
  
  /**
    * The Whiteout method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  val MATERIAL_NORMALBLENDMETHOD_WHITEOUT: Double = js.native
  
  /**
    * MaterialTransparencyMode: No transparency mode, Alpha channel is not use.
    */
  val MATERIAL_OPAQUE: Double = js.native
  
  /**
    * The dirty misc flag value
    */
  val MiscDirtyFlag: Double = js.native
  
  /**
    * Creates a material from parsed material data
    * @param parsedMaterial defines parsed material data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new material
    */
  def Parse(parsedMaterial: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typings.babylonjs.materialMod.Material] = js.native
  
  /**
    * Returns the point fill mode
    */
  val PointFillMode: Double = js.native
  
  /**
    * Returns the point list draw mode
    */
  val PointListDrawMode: Double = js.native
  
  /**
    * The dirty prepass flag value
    */
  val PrePassDirtyFlag: Double = js.native
  
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
  
  val _PrePassDirtyCallBack: js.Any = js.native
  
  val _RunDirtyCallBacks: js.Any = js.native
  
  var _TextureAndMiscDirtyCallBack: js.Any = js.native
  
  val _TextureDirtyCallBack: js.Any = js.native
}
