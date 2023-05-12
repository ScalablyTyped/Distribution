package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Material")
@js.native
open class Material protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Material {
  /**
    * Creates a material instance
    * @param name defines the name of the material
    * @param scene defines the scene to reference
    * @param doNotAdd specifies if the material should be added to the scene
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(name: String, scene: Unit, doNotAdd: Boolean) = this()
  def this(name: String, scene: Nullable[typings.babylonjs.BABYLON.Scene], doNotAdd: Boolean) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
  
  /**
    * Gets or sets the active clipplane 1
    */
  /* CompleteClass */
  var clipPlane: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 2
    */
  /* CompleteClass */
  var clipPlane2: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 3
    */
  /* CompleteClass */
  var clipPlane3: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 4
    */
  /* CompleteClass */
  var clipPlane4: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 5
    */
  /* CompleteClass */
  var clipPlane5: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 6
    */
  /* CompleteClass */
  var clipPlane6: Nullable[typings.babylonjs.BABYLON.Plane] = js.native
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
  val AllDirtyFlag: /* 63 */ Double = js.native
  
  /**
    * The dirty attribute flag value
    */
  @JSGlobal("BABYLON.Material.AttributesDirtyFlag")
  @js.native
  val AttributesDirtyFlag: /* 8 */ Double = js.native
  
  /**
    * Stores the clock-wise side orientation
    */
  @JSGlobal("BABYLON.Material.ClockWiseSideOrientation")
  @js.native
  val ClockWiseSideOrientation: /* 0 */ Double = js.native
  
  /**
    * Stores the counter clock-wise side orientation
    */
  @JSGlobal("BABYLON.Material.CounterClockWiseSideOrientation")
  @js.native
  val CounterClockWiseSideOrientation: /* 1 */ Double = js.native
  
  /**
    * The dirty fresnel flag value
    */
  @JSGlobal("BABYLON.Material.FresnelDirtyFlag")
  @js.native
  val FresnelDirtyFlag: /* 4 */ Double = js.native
  
  /**
    * The dirty light flag value
    */
  @JSGlobal("BABYLON.Material.LightDirtyFlag")
  @js.native
  val LightDirtyFlag: /* 2 */ Double = js.native
  
  /**
    * Returns the line list draw mode
    */
  @JSGlobal("BABYLON.Material.LineListDrawMode")
  @js.native
  val LineListDrawMode: /* 4 */ Double = js.native
  
  /**
    * Returns the line loop draw mode
    */
  @JSGlobal("BABYLON.Material.LineLoopDrawMode")
  @js.native
  val LineLoopDrawMode: /* 5 */ Double = js.native
  
  /**
    * Returns the line strip draw mode
    */
  @JSGlobal("BABYLON.Material.LineStripDrawMode")
  @js.native
  val LineStripDrawMode: /* 6 */ Double = js.native
  
  /**
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_ALPHABLEND")
  @js.native
  val MATERIAL_ALPHABLEND: /* 2 */ Double = js.native
  
  /**
    * MaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_ALPHATEST")
  @js.native
  val MATERIAL_ALPHATEST: /* 1 */ Double = js.native
  
  /**
    * MaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    * They are also discarded below the alpha cutoff threshold to improve performances.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_ALPHATESTANDBLEND")
  @js.native
  val MATERIAL_ALPHATESTANDBLEND: /* 3 */ Double = js.native
  
  /**
    * The Reoriented Normal Mapping method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  @JSGlobal("BABYLON.Material.MATERIAL_NORMALBLENDMETHOD_RNM")
  @js.native
  val MATERIAL_NORMALBLENDMETHOD_RNM: /* 1 */ Double = js.native
  
  /**
    * The Whiteout method is used to blend normals.
    * Details of the algorithm can be found here: https://blog.selfshadow.com/publications/blending-in-detail/
    */
  @JSGlobal("BABYLON.Material.MATERIAL_NORMALBLENDMETHOD_WHITEOUT")
  @js.native
  val MATERIAL_NORMALBLENDMETHOD_WHITEOUT: /* 0 */ Double = js.native
  
  /**
    * MaterialTransparencyMode: No transparency mode, Alpha channel is not use.
    */
  @JSGlobal("BABYLON.Material.MATERIAL_OPAQUE")
  @js.native
  val MATERIAL_OPAQUE: /* 0 */ Double = js.native
  
  /**
    * The dirty misc flag value
    */
  @JSGlobal("BABYLON.Material.MiscDirtyFlag")
  @js.native
  val MiscDirtyFlag: /* 16 */ Double = js.native
  
  /**
    * Event observable which raises global events common to all materials (like MaterialPluginEvent.Created)
    */
  @JSGlobal("BABYLON.Material.OnEventObservable")
  @js.native
  def OnEventObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Material] = js.native
  inline def OnEventObservable_=(x: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Material]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnEventObservable")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a material from parsed material data
    * @param parsedMaterial defines parsed material data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new material
    */
  inline def Parse(parsedMaterial: Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): Nullable[typings.babylonjs.BABYLON.Material] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMaterial.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Material]]
  
  /**
    * Returns the point fill mode
    */
  @JSGlobal("BABYLON.Material.PointFillMode")
  @js.native
  val PointFillMode: /* 2 */ Double = js.native
  
  /**
    * Returns the point list draw mode
    */
  @JSGlobal("BABYLON.Material.PointListDrawMode")
  @js.native
  val PointListDrawMode: /* 3 */ Double = js.native
  
  /**
    * The dirty prepass flag value
    */
  @JSGlobal("BABYLON.Material.PrePassDirtyFlag")
  @js.native
  val PrePassDirtyFlag: /* 32 */ Double = js.native
  
  /**
    * The dirty texture flag value
    */
  @JSGlobal("BABYLON.Material.TextureDirtyFlag")
  @js.native
  val TextureDirtyFlag: /* 1 */ Double = js.native
  
  /**
    * Returns the triangle fan draw mode
    */
  @JSGlobal("BABYLON.Material.TriangleFanDrawMode")
  @js.native
  val TriangleFanDrawMode: /* 8 */ Double = js.native
  
  /**
    * Returns the triangle fill mode
    */
  @JSGlobal("BABYLON.Material.TriangleFillMode")
  @js.native
  val TriangleFillMode: /* 0 */ Double = js.native
  
  /**
    * Returns the triangle strip draw mode
    */
  @JSGlobal("BABYLON.Material.TriangleStripDrawMode")
  @js.native
  val TriangleStripDrawMode: /* 7 */ Double = js.native
  
  /**
    * Returns the wireframe mode
    */
  @JSGlobal("BABYLON.Material.WireFrameFillMode")
  @js.native
  val WireFrameFillMode: /* 1 */ Double = js.native
  
  @JSGlobal("BABYLON.Material._AllDirtyCallBack")
  @js.native
  val _AllDirtyCallBack: Any = js.native
  
  @JSGlobal("BABYLON.Material._AttributeDirtyCallBack")
  @js.native
  val _AttributeDirtyCallBack: Any = js.native
  
  @JSGlobal("BABYLON.Material._DirtyCallbackArray")
  @js.native
  val _DirtyCallbackArray: Any = js.native
  
  @JSGlobal("BABYLON.Material._FresnelAndMiscDirtyCallBack")
  @js.native
  def _FresnelAndMiscDirtyCallBack: Any = js.native
  inline def _FresnelAndMiscDirtyCallBack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FresnelAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Material._FresnelDirtyCallBack")
  @js.native
  val _FresnelDirtyCallBack: Any = js.native
  
  @JSGlobal("BABYLON.Material._ImageProcessingDirtyCallBack")
  @js.native
  val _ImageProcessingDirtyCallBack: Any = js.native
  
  @JSGlobal("BABYLON.Material._LightsDirtyCallBack")
  @js.native
  val _LightsDirtyCallBack: Any = js.native
  
  @JSGlobal("BABYLON.Material._MiscDirtyCallBack")
  @js.native
  val _MiscDirtyCallBack: Any = js.native
  
  @JSGlobal("BABYLON.Material._PrePassDirtyCallBack")
  @js.native
  val _PrePassDirtyCallBack: Any = js.native
  
  @JSGlobal("BABYLON.Material._RunDirtyCallBacks")
  @js.native
  val _RunDirtyCallBacks: Any = js.native
  
  @JSGlobal("BABYLON.Material._TextureAndMiscDirtyCallBack")
  @js.native
  def _TextureAndMiscDirtyCallBack: Any = js.native
  inline def _TextureAndMiscDirtyCallBack_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureAndMiscDirtyCallBack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Material._TextureDirtyCallBack")
  @js.native
  val _TextureDirtyCallBack: Any = js.native
}
