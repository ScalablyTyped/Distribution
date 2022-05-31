package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Material")
@js.native
class Material protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Material {
  /**
    * Creates a material instance
    * @param name defines the name of the material
    * @param scene defines the scene to reference
    * @param doNotAdd specifies if the material should be added to the scene
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene, doNotAdd: Boolean) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object Material {
  
  @JSGlobal("BABYLON.Material")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The all dirty flag value
    */
  @JSGlobal("BABYLON.Material.AllDirtyFlag")
  @js.native
  val AllDirtyFlag: Double = js.native
  
  /**
    * The dirty attribute flag value
    */
  @JSGlobal("BABYLON.Material.AttributesDirtyFlag")
  @js.native
  val AttributesDirtyFlag: Double = js.native
  
  /**
    * Stores the clock-wise side orientation
    */
  @JSGlobal("BABYLON.Material.ClockWiseSideOrientation")
  @js.native
  val ClockWiseSideOrientation: Double = js.native
  
  /**
    * Stores the counter clock-wise side orientation
    */
  @JSGlobal("BABYLON.Material.CounterClockWiseSideOrientation")
  @js.native
  val CounterClockWiseSideOrientation: Double = js.native
  
  /**
    * The dirty fresnel flag value
    */
  @JSGlobal("BABYLON.Material.FresnelDirtyFlag")
  @js.native
  val FresnelDirtyFlag: Double = js.native
  
  /**
    * The dirty light flag value
    */
  @JSGlobal("BABYLON.Material.LightDirtyFlag")
  @js.native
  val LightDirtyFlag: Double = js.native
  
  /**
    * Returns the line list draw mode
    */
  @JSGlobal("BABYLON.Material.LineListDrawMode")
  @js.native
  val LineListDrawMode: Double = js.native
  
  /**
    * Returns the line loop draw mode
    */
  @JSGlobal("BABYLON.Material.LineLoopDrawMode")
  @js.native
  val LineLoopDrawMode: Double = js.native
  
  /**
    * Returns the line strip draw mode
    */
  @JSGlobal("BABYLON.Material.LineStripDrawMode")
  @js.native
  val LineStripDrawMode: Double = js.native
  
  /**
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_ALPHABLEND")
  @js.native
  val MATERIAL_ALPHABLEND: Double = js.native
  
  /**
    * MaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_ALPHATEST")
  @js.native
  val MATERIAL_ALPHATEST: Double = js.native
  
  /**
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    * They are also discarded below the alpha cutoff threshold to improve performances.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_ALPHATESTANDBLEND")
  @js.native
  val MATERIAL_ALPHATESTANDBLEND: Double = js.native
  
  /**
    * The Reoriented Normal Mapping method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  @JSGlobal("BABYLON.Material.MATERIAL_NORMALBLENDMETHOD_RNM")
  @js.native
  val MATERIAL_NORMALBLENDMETHOD_RNM: Double = js.native
  
  /**
    * The Whiteout method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  @JSGlobal("BABYLON.Material.MATERIAL_NORMALBLENDMETHOD_WHITEOUT")
  @js.native
  val MATERIAL_NORMALBLENDMETHOD_WHITEOUT: Double = js.native
  
  /**
    * MaterialTransparencyMode: No transparency mode, Alpha channel is not use.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_OPAQUE")
  @js.native
  val MATERIAL_OPAQUE: Double = js.native
  
  /**
    * The dirty misc flag value
    */
  @JSGlobal("BABYLON.Material.MiscDirtyFlag")
  @js.native
  val MiscDirtyFlag: Double = js.native
  
  /**
    * Creates a material from parsed material data
    * @param parsedMaterial defines parsed material data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new material
    */
  inline def Parse(parsedMaterial: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): Nullable[typings.babylonjs.BABYLON.Material] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMaterial.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Material]]
  
  /**
    * Returns the point fill mode
    */
  @JSGlobal("BABYLON.Material.PointFillMode")
  @js.native
  val PointFillMode: Double = js.native
  
  /**
    * Returns the point list draw mode
    */
  @JSGlobal("BABYLON.Material.PointListDrawMode")
  @js.native
  val PointListDrawMode: Double = js.native
  
  /**
    * The dirty prepass flag value
    */
  @JSGlobal("BABYLON.Material.PrePassDirtyFlag")
  @js.native
  val PrePassDirtyFlag: Double = js.native
  
  /**
    * The dirty texture flag value
    */
  @JSGlobal("BABYLON.Material.TextureDirtyFlag")
  @js.native
  val TextureDirtyFlag: Double = js.native
  
  /**
    * Returns the triangle fan draw mode
    */
  @JSGlobal("BABYLON.Material.TriangleFanDrawMode")
  @js.native
  val TriangleFanDrawMode: Double = js.native
  
  /**
    * Returns the triangle fill mode
    */
  @JSGlobal("BABYLON.Material.TriangleFillMode")
  @js.native
  val TriangleFillMode: Double = js.native
  
  /**
    * Returns the triangle strip draw mode
    */
  @JSGlobal("BABYLON.Material.TriangleStripDrawMode")
  @js.native
  val TriangleStripDrawMode: Double = js.native
  
  /**
    * Returns the wireframe mode
    */
  @JSGlobal("BABYLON.Material.WireFrameFillMode")
  @js.native
  val WireFrameFillMode: Double = js.native
  
  @JSGlobal("BABYLON.Material._AllDirtyCallBack")
  @js.native
  val _AllDirtyCallBack: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._AttributeDirtyCallBack")
  @js.native
  val _AttributeDirtyCallBack: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._DirtyCallbackArray")
  @js.native
  val _DirtyCallbackArray: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._FresnelAndMiscDirtyCallBack")
  @js.native
  def _FresnelAndMiscDirtyCallBack: js.Any = js.native
  inline def _FresnelAndMiscDirtyCallBack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FresnelAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Material._FresnelDirtyCallBack")
  @js.native
  val _FresnelDirtyCallBack: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._ImageProcessingDirtyCallBack")
  @js.native
  val _ImageProcessingDirtyCallBack: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._LightsDirtyCallBack")
  @js.native
  val _LightsDirtyCallBack: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._MiscDirtyCallBack")
  @js.native
  val _MiscDirtyCallBack: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._PrePassDirtyCallBack")
  @js.native
  val _PrePassDirtyCallBack: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._RunDirtyCallBacks")
  @js.native
  val _RunDirtyCallBacks: js.Any = js.native
  
  @JSGlobal("BABYLON.Material._TextureAndMiscDirtyCallBack")
  @js.native
  def _TextureAndMiscDirtyCallBack: js.Any = js.native
  inline def _TextureAndMiscDirtyCallBack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Material._TextureDirtyCallBack")
  @js.native
  val _TextureDirtyCallBack: js.Any = js.native
}
