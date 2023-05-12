package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.PBRBaseMaterial")
@js.native
open class PBRBaseMaterial protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PBRBaseMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String) = this()
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
  
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
object PBRBaseMaterial {
  
  @JSGlobal("BABYLON.PBRBaseMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines the default value of how much AO map is occluding the analytical lights
    * (point spot...).
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.DEFAULT_AO_ON_ANALYTICAL_LIGHTS")
  @js.native
  def DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
  inline def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
  
  /**
    * PBRMaterialLightFalloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.LIGHTFALLOFF_GLTF")
  @js.native
  val LIGHTFALLOFF_GLTF: /* 1 */ Double = js.native
  
  /**
    * PBRMaterialLightFalloff Physical: light is falling off following the inverse squared distance law.
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.LIGHTFALLOFF_PHYSICAL")
  @js.native
  val LIGHTFALLOFF_PHYSICAL: /* 0 */ Double = js.native
  
  /**
    * PBRMaterialLightFalloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.LIGHTFALLOFF_STANDARD")
  @js.native
  val LIGHTFALLOFF_STANDARD: /* 2 */ Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.PBRMATERIAL_ALPHABLEND")
  @js.native
  val PBRMATERIAL_ALPHABLEND: /* 2 */ Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.PBRMATERIAL_ALPHATEST")
  @js.native
  val PBRMATERIAL_ALPHATEST: /* 1 */ Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    * They are also discarded below the alpha cutoff threshold to improve performances.
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.PBRMATERIAL_ALPHATESTANDBLEND")
  @js.native
  val PBRMATERIAL_ALPHATESTANDBLEND: /* 3 */ Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
    */
  @JSGlobal("BABYLON.PBRBaseMaterial.PBRMATERIAL_OPAQUE")
  @js.native
  val PBRMATERIAL_OPAQUE: /* 0 */ Double = js.native
}
