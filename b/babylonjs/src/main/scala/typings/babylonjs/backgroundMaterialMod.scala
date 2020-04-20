package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.colorCurvesMod.ColorCurves
import typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.pushMaterialMod.PushMaterial
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowLightMod.IShadowLight
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.float
import typings.babylonjs.typesMod.int
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Background/backgroundMaterial", JSImport.Namespace)
@js.native
object backgroundMaterialMod extends js.Object {
  @js.native
  class BackgroundMaterial protected () extends PushMaterial {
    /**
      * Instantiates a Background Material in the given scene
      * @param name The friendly name of the material
      * @param scene The scene to add the material to
      */
    def this(name: String, scene: Scene) = this()
    var __perceptualColor: Nullable[Color3] = js.native
    /**
      * Compute the primary color according to the chosen perceptual color.
      */
    var _computePrimaryColorFromPerceptualColor: js.Any = js.native
    /**
      * Compute the highlights and shadow colors according to their chosen levels.
      */
    var _computePrimaryColors: js.Any = js.native
    var _diffuseTexture: Nullable[BaseTexture] = js.native
    var _enableNoise: Boolean = js.native
    var _fovMultiplier: js.Any = js.native
    /**
      * Default configuration related to image processing available in the Background Material.
      */
    var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
    /**
      * Keep track of the image processing observer to allow dispose and replace.
      */
    var _imageProcessingObserver: js.Any = js.native
    var _maxSimultaneousLights: js.Any = js.native
    var _opacityFresnel: Boolean = js.native
    var _primaryColor: Color3 = js.native
    var _primaryColorHighlightLevel: float = js.native
    var _primaryColorShadowLevel: float = js.native
    var _primaryHighlightColor: js.Any = js.native
    var _primaryShadowColor: js.Any = js.native
    var _reflectionAmount: Double = js.native
    var _reflectionBlur: float = js.native
    var _reflectionControls: js.Any = js.native
    var _reflectionFalloffDistance: Double = js.native
    var _reflectionFresnel: Boolean = js.native
    var _reflectionReflectance0: Double = js.native
    var _reflectionReflectance90: Double = js.native
    var _reflectionTexture: Nullable[BaseTexture] = js.native
    var _renderTargets: js.Any = js.native
    var _sceneCenter: Vector3 = js.native
    var _shadowLevel: float = js.native
    var _shadowLights: Nullable[js.Array[IShadowLight]] = js.native
    var _useRGBColor: Boolean = js.native
    var _white: js.Any = js.native
    /**
      * Diffuse Texture used in the material.
      * Should be author in a specific way for the best result (refer to the documentation).
      */
    var diffuseTexture: Nullable[BaseTexture] = js.native
    /**
      * This helps reducing the banding effect that could occur on the background.
      */
    var enableNoise: Boolean = js.native
    /**
      * Number of Simultaneous lights allowed on the material.
      */
    var maxSimultaneousLights: int = js.native
    /**
      * This helps specifying that the material is falling off to the sky box at grazing angle.
      * This helps ensuring a nice transition when the camera goes under the ground.
      */
    var opacityFresnel: Boolean = js.native
    /**
      * Key light Color (multiply against the environement texture)
      */
    var primaryColor: Color3 = js.native
    /**
      * This specifies the weight of the reflection against the background in case of reflection Fresnel.
      */
    var reflectionAmount: Double = js.native
    /**
      * Reflection Texture level of blur.
      *
      * Can be use to reuse an existing HDR Texture and target a specific LOD to prevent authoring the
      * texture twice.
      */
    var reflectionBlur: float = js.native
    /**
      * This helps specifying the falloff radius off the reflection texture from the sceneCenter.
      * This helps adding a nice falloff effect to the reflection if used as a mirror for instance.
      */
    var reflectionFalloffDistance: Double = js.native
    /**
      * This helps specifying that the material is falling off from diffuse to the reflection texture at grazing angle.
      * This helps adding a mirror texture on the ground.
      */
    var reflectionFresnel: Boolean = js.native
    /**
      * This specifies the weight of the reflection at grazing angle.
      */
    var reflectionReflectance0: Double = js.native
    /**
      * This specifies the weight of the reflection at a perpendicular point of view.
      */
    var reflectionReflectance90: Double = js.native
    /**
      * Reflection Texture used in the material.
      * Should be author in a specific way for the best result (refer to the documentation).
      */
    var reflectionTexture: Nullable[BaseTexture] = js.native
    /**
      * In case of opacity Fresnel or reflection falloff, this is use as a scene center.
      * It is usually zero but might be interesting to modify according to your setup.
      */
    var sceneCenter: Vector3 = js.native
    /**
      * Helps adjusting the shadow to a softer level if required.
      * 0 means black shadows and 1 means no shadows.
      */
    var shadowLevel: float = js.native
    /**
      * Specify the list of lights casting shadow on the material.
      * All scene shadow lights will be included if null.
      */
    var shadowLights: Nullable[js.Array[IShadowLight]] = js.native
    /**
      * Due to a bug in iOS10, video tags (which are using the background material) are in BGR and not RGB.
      * Setting this flag to true (not done automatically!) will convert it back to RGB.
      */
    var switchToBGR: Boolean = js.native
    /**
      * Enable the FOV adjustment feature controlled by fovMultiplier.
      */
    var useEquirectangularFOV: Boolean = js.native
    /**
      * Helps to directly use the maps channels instead of their level.
      */
    var useRGBColor: Boolean = js.native
    /**
      * Attaches a new image processing configuration to the PBR Material.
      * @param configuration (if null the scene configuration will be use)
      */
    /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
    /**
      * Experimental Internal Use Only.
      *
      * Key light Color in "perceptual value" meaning the color you would like to see on screen.
      * This acts as a helper to set the primary color to a more "human friendly" value.
      * Conversion to linear space as well as exposure and tone mapping correction will be applied to keep the
      * output color as close as possible from the chosen value.
      * (This does not account for contrast color grading and color curves as they are considered post effect and not directly
      * part of lighting setup.)
      */
    def _perceptualColor: Nullable[Color3] = js.native
    def _perceptualColor(value: Nullable[Color3]): js.Any = js.native
    /**
      * Build the uniform buffer used in the material.
      */
    def buildUniformLayout(): Unit = js.native
    /**
      * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
      * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
      * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
      * corresponding to low luminance, medium luminance, and high luminance areas respectively.
      */
    def cameraColorCurves: Nullable[ColorCurves] = js.native
    /**
      * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
      * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
      * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
      * corresponding to low luminance, medium luminance, and high luminance areas respectively.
      */
    def cameraColorCurves(value: Nullable[ColorCurves]): js.Any = js.native
    /**
      * Gets wether the color curves effect is enabled.
      */
    def cameraColorCurvesEnabled: Boolean = js.native
    /**
      * Sets wether the color curves effect is enabled.
      */
    def cameraColorCurvesEnabled(value: Boolean): js.Any = js.native
    /**
      * Gets wether the color grading effect is enabled.
      */
    def cameraColorGradingEnabled: Boolean = js.native
    /**
      * Gets wether the color grading effect is enabled.
      */
    def cameraColorGradingEnabled(value: Boolean): js.Any = js.native
    /**
      * Gets the Color Grading 2D Lookup Texture.
      */
    def cameraColorGradingTexture: Nullable[BaseTexture] = js.native
    /**
      * Sets the Color Grading 2D Lookup Texture.
      */
    def cameraColorGradingTexture(value: Nullable[BaseTexture]): js.Any = js.native
    /**
      * Gets The camera contrast used on this material.
      */
    def cameraContrast: float = js.native
    /**
      * Sets The camera contrast used on this material.
      */
    def cameraContrast(value: float): js.Any = js.native
    /**
      * The camera exposure used on this material.
      * This property is here and not in the camera to allow controlling exposure without full screen post process.
      * This corresponds to a photographic exposure.
      */
    def cameraExposure: float = js.native
    /**
      * The camera exposure used on this material.
      * This property is here and not in the camera to allow controlling exposure without full screen post process.
      * This corresponds to a photographic exposure.
      */
    def cameraExposure(value: float): js.Any = js.native
    /**
      * Gets wether tonemapping is enabled or not.
      */
    def cameraToneMappingEnabled: Boolean = js.native
    /**
      * Sets wether tonemapping is enabled or not
      */
    def cameraToneMappingEnabled(value: Boolean): js.Any = js.native
    /**
      * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
      * Best used when trying to implement visual zoom effects like fish-eye or binoculars while not adjusting camera fov.
      * Recommended to be keep at 1.0 except for special cases.
      */
    def fovMultiplier: Double = js.native
    def fovMultiplier(value: Double): js.Any = js.native
    /**
      * Gets the image processing configuration used either in this material.
      */
    def imageProcessingConfiguration: Nullable[ImageProcessingConfiguration] = js.native
    /**
      * Sets the Default image processing configuration used either in the this material.
      *
      * If sets to null, the scene one is in use.
      */
    def imageProcessingConfiguration(value: Nullable[ImageProcessingConfiguration]): js.Any = js.native
    /**
      * Checks wether the material is ready to be rendered for a given mesh.
      * @param mesh The mesh to render
      * @param subMesh The submesh to check against
      * @param useInstances Specify wether or not the material is used with instances
      * @returns true if all the dependencies are ready (Textures, Effects...)
      */
    def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh): Boolean = js.native
    def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    /**
      * Defines the level of the highliights (highlight area of the reflection map) in order to help scaling the colors.
      * The primary color is used at the level chosen to define what the white area would look.
      */
    def primaryColorHighlightLevel: float = js.native
    def primaryColorHighlightLevel(value: float): js.Any = js.native
    /**
      * Defines the level of the shadows (dark area of the reflection map) in order to help scaling the colors.
      * The color opposite to the primary color is used at the level chosen to define what the black area would look.
      */
    def primaryColorShadowLevel: float = js.native
    def primaryColorShadowLevel(value: float): js.Any = js.native
    /**
      * Sets the reflection reflectance fresnel values according to the default standard
      * empirically know to work well :-)
      */
    def reflectionStandardFresnelWeight(value: Double): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object BackgroundMaterial extends js.Object {
    /**
      * Standard reflectance value at parallel view angle.
      */
    var StandardReflectance0: Double = js.native
    /**
      * Standard reflectance value at grazing angle.
      */
    var StandardReflectance90: Double = js.native
    /**
      * Parse a JSON input to create back a background material.
      * @param source The JSON data to parse
      * @param scene The scene to create the parsed material in
      * @param rootUrl The root url of the assets the material depends upon
      * @returns the instantiated BackgroundMaterial.
      */
    def Parse(source: js.Any, scene: Scene, rootUrl: String): BackgroundMaterial = js.native
  }
  
}

