package typings.babylonjs

import typings.babylonjs.anon.Exception
import typings.babylonjs.anon.PartialIEnvironmentHelper
import typings.babylonjs.materialsBackgroundBackgroundMaterialMod.BackgroundMaterial
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsTexturesMirrorTextureMod.MirrorTexture
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersEnvironmentHelperMod {
  
  @JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper")
  @js.native
  open class EnvironmentHelper protected () extends StObject {
    /**
      * constructor
      * @param options Defines the options we want to customize the helper
      * @param scene The scene to add the material to
      */
    def this(options: PartialIEnvironmentHelper, scene: Scene) = this()
    
    /* private */ var _errorHandler: Any = js.native
    
    /**
      * Get the scene sizes according to the setup.
      */
    /* private */ var _getSceneSize: Any = js.native
    
    /* private */ var _ground: Any = js.native
    
    /* private */ var _groundMaterial: Any = js.native
    
    /* private */ var _groundMirror: Any = js.native
    
    /* private */ var _groundTexture: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _rootMesh: Any = js.native
    
    /**
      * Stores the creation options.
      */
    /* private */ val _scene: Any = js.native
    
    /**
      * Setup the background according to the specified options.
      */
    /* private */ var _setupBackground: Any = js.native
    
    /**
      * Setup the environment texture according to the specified options.
      */
    /* private */ var _setupEnvironmentTexture: Any = js.native
    
    /**
      * Setup the ground according to the specified options.
      * @param sceneSize
      */
    /* private */ var _setupGround: Any = js.native
    
    /**
      * Setup the ground diffuse texture according to the specified options.
      */
    /* private */ var _setupGroundDiffuseTexture: Any = js.native
    
    /**
      * Setup the ground material according to the specified options.
      */
    /* private */ var _setupGroundMaterial: Any = js.native
    
    /**
      * Setup the ground mirror texture according to the specified options.
      * @param sceneSize
      */
    /* private */ var _setupGroundMirrorTexture: Any = js.native
    
    /**
      * Setup the image processing according to the specified options.
      */
    /* private */ var _setupImageProcessing: Any = js.native
    
    /**
      * Setup the ground to receive the mirror texture.
      */
    /* private */ var _setupMirrorInGroundMaterial: Any = js.native
    
    /**
      * Setup the skybox according to the specified options.
      * @param sceneSize
      */
    /* private */ var _setupSkybox: Any = js.native
    
    /**
      * Setup the skybox material according to the specified options.
      */
    /* private */ var _setupSkyboxMaterial: Any = js.native
    
    /**
      * Setup the skybox reflection texture according to the specified options.
      */
    /* private */ var _setupSkyboxReflectionTexture: Any = js.native
    
    /* private */ var _skybox: Any = js.native
    
    /* private */ var _skyboxMaterial: Any = js.native
    
    /* private */ var _skyboxTexture: Any = js.native
    
    /**
      * Dispose all the elements created by the Helper.
      */
    def dispose(): Unit = js.native
    
    /**
      * Gets the ground mesh created by the helper.
      */
    def ground: Nullable[Mesh] = js.native
    
    /**
      * Gets the ground material created by the helper.
      */
    def groundMaterial: Nullable[BackgroundMaterial] = js.native
    
    /**
      * Gets the ground mirror created by the helper.
      */
    def groundMirror: Nullable[MirrorTexture] = js.native
    
    /**
      * Gets the ground mirror render list to helps pushing the meshes
      * you wish in the ground reflection.
      */
    def groundMirrorRenderList: Nullable[js.Array[AbstractMesh]] = js.native
    
    /**
      * Gets the ground texture created by the helper.
      */
    def groundTexture: Nullable[BaseTexture] = js.native
    
    /**
      * This observable will be notified with any error during the creation of the environment,
      * mainly texture creation errors.
      */
    var onErrorObservable: Observable[Exception] = js.native
    
    /**
      * Gets the root mesh created by the helper.
      */
    def rootMesh: Mesh = js.native
    
    /**
      * Sets the primary color of all the available elements.
      * @param color the main color to affect to the ground and the background
      */
    def setMainColor(color: Color3): Unit = js.native
    
    /**
      * Gets the skybox created by the helper.
      */
    def skybox: Nullable[Mesh] = js.native
    
    /**
      * Gets the skybox material created by the helper.
      */
    def skyboxMaterial: Nullable[BackgroundMaterial] = js.native
    
    /**
      * Gets the skybox texture created by the helper.
      */
    def skyboxTexture: Nullable[BaseTexture] = js.native
    
    /**
      * Updates the background according to the new options
      * @param options
      */
    def updateOptions(options: PartialIEnvironmentHelper): Unit = js.native
  }
  /* static members */
  object EnvironmentHelper {
    
    @JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default environment texture URL.
      */
    @JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper._EnvironmentTextureCDNUrl")
    @js.native
    def _EnvironmentTextureCDNUrl: Any = js.native
    inline def _EnvironmentTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EnvironmentTextureCDNUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the default options for the helper.
      */
    @JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper._GetDefaultOptions")
    @js.native
    def _GetDefaultOptions: Any = js.native
    inline def _GetDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDefaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Default ground texture URL.
      */
    @JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper._GroundTextureCDNUrl")
    @js.native
    def _GroundTextureCDNUrl: Any = js.native
    inline def _GroundTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GroundTextureCDNUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Default skybox texture URL.
      */
    @JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper._SkyboxTextureCDNUrl")
    @js.native
    def _SkyboxTextureCDNUrl: Any = js.native
    inline def _SkyboxTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SkyboxTextureCDNUrl")(x.asInstanceOf[js.Any])
  }
  
  trait IEnvironmentHelperOptions extends StObject {
    
    /**
      * The background rotation around the Y axis of the scene.
      * This helps aligning the key lights of your scene with the background.
      * 0 by default.
      */
    var backgroundYRotation: Double
    
    /**
      * The value of the contrast to apply to the scene.
      * 1.6 by default if setupImageProcessing is true.
      */
    var cameraContrast: Double
    
    /**
      * The value of the exposure to apply to the scene.
      * 0.6 by default if setupImageProcessing is true.
      */
    var cameraExposure: Double
    
    /**
      * Specifies whether or not to create a ground.
      * True by default.
      */
    var createGround: Boolean
    
    /**
      * Specifies whether or not to create a skybox.
      * True by default.
      */
    var createSkybox: Boolean
    
    /**
      * Creates a mirror texture attach to the ground.
      * false by default.
      */
    var enableGroundMirror: Boolean
    
    /**
      * Enables the ground to receive shadows.
      * True by default.
      */
    var enableGroundShadow: Boolean
    
    /**
      * The texture used as your environment texture in the scene.
      * Comes from the BabylonJS CDN by default and in use if setupImageProcessing is true.
      *
      * Remarks: Can be either a texture or a url.
      */
    var environmentTexture: String | BaseTexture
    
    /**
      * The color mixed in the ground texture by default.
      * BabylonJS clearColor by default.
      */
    var groundColor: Color3
    
    /**
      * Specifies the ground mirror visibility amount.
      * 1 by default
      */
    var groundMirrorAmount: Double
    
    /**
      * Specifies the ground mirror blur kernel size.
      * 64 by default.
      */
    var groundMirrorBlurKernel: Double
    
    /**
      * Specifies the ground mirror Falloff distance.
      * This can helps reducing the size of the reflection.
      * 0 by Default.
      */
    var groundMirrorFallOffDistance: Double
    
    /**
      * Specifies the ground mirror reflectance weight.
      * This uses the standard weight of the background material to setup the fresnel effect
      * of the mirror.
      * 1 by default.
      */
    var groundMirrorFresnelWeight: Double
    
    /**
      * Specifies the ground mirror size ratio.
      * 0.3 by default as the default kernel is 64.
      */
    var groundMirrorSizeRatio: Double
    
    /**
      * Specifies the ground mirror texture type.
      * Unsigned Int by Default.
      */
    var groundMirrorTextureType: Double
    
    /**
      * Specifies the ground opacity.
      * 1 by default.
      */
    var groundOpacity: Double
    
    /**
      * Helps preventing the shadow to be fully black on the ground.
      * 0.5 by default.
      */
    var groundShadowLevel: Double
    
    /**
      * Specifies the ground size.
      * 15 by default.
      */
    var groundSize: Double
    
    /**
      * The texture used on the ground for the main color.
      * Comes from the BabylonJS CDN by default.
      *
      * Remarks: Can be either a texture or a url.
      */
    var groundTexture: String | BaseTexture
    
    /**
      * Specifies a bias applied to the ground vertical position to prevent z-fighting with
      * the shown objects.
      */
    var groundYBias: Double
    
    /**
      * Default position of the rootMesh if autoSize is not true.
      */
    var rootPosition: Vector3
    
    /**
      * Sets up the image processing in the scene.
      * true by default.
      */
    var setupImageProcessing: Boolean
    
    /**
      * Compute automatically the size of the elements to best fit with the scene.
      */
    var sizeAuto: Boolean
    
    /**
      * The color mixed in the skybox texture by default.
      * BabylonJS clearColor by default.
      */
    var skyboxColor: Color3
    
    /**
      * Specifies the skybox size.
      * 20 by default.
      */
    var skyboxSize: Double
    
    /**
      * The texture used on the skybox for the main color.
      * Comes from the BabylonJS CDN by default.
      *
      * Remarks: Can be either a texture or a url.
      */
    var skyboxTexture: String | BaseTexture
    
    /**
      * Specifies whether or not tonemapping should be enabled in the scene.
      * true by default if setupImageProcessing is true.
      */
    var toneMappingEnabled: Boolean
  }
  object IEnvironmentHelperOptions {
    
    inline def apply(
      backgroundYRotation: Double,
      cameraContrast: Double,
      cameraExposure: Double,
      createGround: Boolean,
      createSkybox: Boolean,
      enableGroundMirror: Boolean,
      enableGroundShadow: Boolean,
      environmentTexture: String | BaseTexture,
      groundColor: Color3,
      groundMirrorAmount: Double,
      groundMirrorBlurKernel: Double,
      groundMirrorFallOffDistance: Double,
      groundMirrorFresnelWeight: Double,
      groundMirrorSizeRatio: Double,
      groundMirrorTextureType: Double,
      groundOpacity: Double,
      groundShadowLevel: Double,
      groundSize: Double,
      groundTexture: String | BaseTexture,
      groundYBias: Double,
      rootPosition: Vector3,
      setupImageProcessing: Boolean,
      sizeAuto: Boolean,
      skyboxColor: Color3,
      skyboxSize: Double,
      skyboxTexture: String | BaseTexture,
      toneMappingEnabled: Boolean
    ): IEnvironmentHelperOptions = {
      val __obj = js.Dynamic.literal(backgroundYRotation = backgroundYRotation.asInstanceOf[js.Any], cameraContrast = cameraContrast.asInstanceOf[js.Any], cameraExposure = cameraExposure.asInstanceOf[js.Any], createGround = createGround.asInstanceOf[js.Any], createSkybox = createSkybox.asInstanceOf[js.Any], enableGroundMirror = enableGroundMirror.asInstanceOf[js.Any], enableGroundShadow = enableGroundShadow.asInstanceOf[js.Any], environmentTexture = environmentTexture.asInstanceOf[js.Any], groundColor = groundColor.asInstanceOf[js.Any], groundMirrorAmount = groundMirrorAmount.asInstanceOf[js.Any], groundMirrorBlurKernel = groundMirrorBlurKernel.asInstanceOf[js.Any], groundMirrorFallOffDistance = groundMirrorFallOffDistance.asInstanceOf[js.Any], groundMirrorFresnelWeight = groundMirrorFresnelWeight.asInstanceOf[js.Any], groundMirrorSizeRatio = groundMirrorSizeRatio.asInstanceOf[js.Any], groundMirrorTextureType = groundMirrorTextureType.asInstanceOf[js.Any], groundOpacity = groundOpacity.asInstanceOf[js.Any], groundShadowLevel = groundShadowLevel.asInstanceOf[js.Any], groundSize = groundSize.asInstanceOf[js.Any], groundTexture = groundTexture.asInstanceOf[js.Any], groundYBias = groundYBias.asInstanceOf[js.Any], rootPosition = rootPosition.asInstanceOf[js.Any], setupImageProcessing = setupImageProcessing.asInstanceOf[js.Any], sizeAuto = sizeAuto.asInstanceOf[js.Any], skyboxColor = skyboxColor.asInstanceOf[js.Any], skyboxSize = skyboxSize.asInstanceOf[js.Any], skyboxTexture = skyboxTexture.asInstanceOf[js.Any], toneMappingEnabled = toneMappingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEnvironmentHelperOptions]
    }
    
    extension [Self <: IEnvironmentHelperOptions](x: Self) {
      
      inline def setBackgroundYRotation(value: Double): Self = StObject.set(x, "backgroundYRotation", value.asInstanceOf[js.Any])
      
      inline def setCameraContrast(value: Double): Self = StObject.set(x, "cameraContrast", value.asInstanceOf[js.Any])
      
      inline def setCameraExposure(value: Double): Self = StObject.set(x, "cameraExposure", value.asInstanceOf[js.Any])
      
      inline def setCreateGround(value: Boolean): Self = StObject.set(x, "createGround", value.asInstanceOf[js.Any])
      
      inline def setCreateSkybox(value: Boolean): Self = StObject.set(x, "createSkybox", value.asInstanceOf[js.Any])
      
      inline def setEnableGroundMirror(value: Boolean): Self = StObject.set(x, "enableGroundMirror", value.asInstanceOf[js.Any])
      
      inline def setEnableGroundShadow(value: Boolean): Self = StObject.set(x, "enableGroundShadow", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentTexture(value: String | BaseTexture): Self = StObject.set(x, "environmentTexture", value.asInstanceOf[js.Any])
      
      inline def setGroundColor(value: Color3): Self = StObject.set(x, "groundColor", value.asInstanceOf[js.Any])
      
      inline def setGroundMirrorAmount(value: Double): Self = StObject.set(x, "groundMirrorAmount", value.asInstanceOf[js.Any])
      
      inline def setGroundMirrorBlurKernel(value: Double): Self = StObject.set(x, "groundMirrorBlurKernel", value.asInstanceOf[js.Any])
      
      inline def setGroundMirrorFallOffDistance(value: Double): Self = StObject.set(x, "groundMirrorFallOffDistance", value.asInstanceOf[js.Any])
      
      inline def setGroundMirrorFresnelWeight(value: Double): Self = StObject.set(x, "groundMirrorFresnelWeight", value.asInstanceOf[js.Any])
      
      inline def setGroundMirrorSizeRatio(value: Double): Self = StObject.set(x, "groundMirrorSizeRatio", value.asInstanceOf[js.Any])
      
      inline def setGroundMirrorTextureType(value: Double): Self = StObject.set(x, "groundMirrorTextureType", value.asInstanceOf[js.Any])
      
      inline def setGroundOpacity(value: Double): Self = StObject.set(x, "groundOpacity", value.asInstanceOf[js.Any])
      
      inline def setGroundShadowLevel(value: Double): Self = StObject.set(x, "groundShadowLevel", value.asInstanceOf[js.Any])
      
      inline def setGroundSize(value: Double): Self = StObject.set(x, "groundSize", value.asInstanceOf[js.Any])
      
      inline def setGroundTexture(value: String | BaseTexture): Self = StObject.set(x, "groundTexture", value.asInstanceOf[js.Any])
      
      inline def setGroundYBias(value: Double): Self = StObject.set(x, "groundYBias", value.asInstanceOf[js.Any])
      
      inline def setRootPosition(value: Vector3): Self = StObject.set(x, "rootPosition", value.asInstanceOf[js.Any])
      
      inline def setSetupImageProcessing(value: Boolean): Self = StObject.set(x, "setupImageProcessing", value.asInstanceOf[js.Any])
      
      inline def setSizeAuto(value: Boolean): Self = StObject.set(x, "sizeAuto", value.asInstanceOf[js.Any])
      
      inline def setSkyboxColor(value: Color3): Self = StObject.set(x, "skyboxColor", value.asInstanceOf[js.Any])
      
      inline def setSkyboxSize(value: Double): Self = StObject.set(x, "skyboxSize", value.asInstanceOf[js.Any])
      
      inline def setSkyboxTexture(value: String | BaseTexture): Self = StObject.set(x, "skyboxTexture", value.asInstanceOf[js.Any])
      
      inline def setToneMappingEnabled(value: Boolean): Self = StObject.set(x, "toneMappingEnabled", value.asInstanceOf[js.Any])
    }
  }
}
