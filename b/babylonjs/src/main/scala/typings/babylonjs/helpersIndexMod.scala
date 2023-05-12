package typings.babylonjs

import typings.babylonjs.anon.AutoPlay
import typings.babylonjs.anon.PartialIEnvironmentHelper
import typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelper
import typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelperOptions
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience
import typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperienceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersIndexMod {
  
  @JSImport("babylonjs/Helpers/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Helpers/index", "EnvironmentHelper")
  @js.native
  open class EnvironmentHelper protected ()
    extends typings.babylonjs.helpersEnvironmentHelperMod.EnvironmentHelper {
    /**
      * constructor
      * @param options Defines the options we want to customize the helper
      * @param scene The scene to add the material to
      */
    def this(options: PartialIEnvironmentHelper, scene: Scene) = this()
  }
  /* static members */
  object EnvironmentHelper {
    
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default environment texture URL.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._EnvironmentTextureCDNUrl")
    @js.native
    def _EnvironmentTextureCDNUrl: Any = js.native
    inline def _EnvironmentTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EnvironmentTextureCDNUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the default options for the helper.
      * @param scene The scene the environment helper belongs to.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._GetDefaultOptions")
    @js.native
    def _GetDefaultOptions: Any = js.native
    inline def _GetDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDefaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Default ground texture URL.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._GroundTextureCDNUrl")
    @js.native
    def _GroundTextureCDNUrl: Any = js.native
    inline def _GroundTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GroundTextureCDNUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Default skybox texture URL.
      */
    @JSImport("babylonjs/Helpers/index", "EnvironmentHelper._SkyboxTextureCDNUrl")
    @js.native
    def _SkyboxTextureCDNUrl: Any = js.native
    inline def _SkyboxTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SkyboxTextureCDNUrl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Helpers/index", "PhotoDome")
  @js.native
  open class PhotoDome protected ()
    extends typings.babylonjs.helpersPhotoDomeMod.PhotoDome {
    /**
      * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
      * @param name Element's name, child elements will append suffixes for their own names.
      * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
      * @param options An object containing optional or exposed sub element properties
      * @param options.resolution
      * @param options.clickToPlay
      * @param options.autoPlay
      * @param options.loop
      * @param options.size
      * @param options.poster
      * @param options.faceForward
      * @param options.useDirectMapping
      * @param options.halfDomeMode
      * @param options.crossEyeMode
      * @param options.generateMipMaps
      * @param options.mesh
      * @param scene
      * @param onError
      */
    def this(name: String, textureUrlOrElement: String, options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: js.Array[String], options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: HTMLVideoElement, options: AutoPlay, scene: Scene) = this()
    def this(
      name: String,
      textureUrlOrElement: String,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: js.Array[String],
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: HTMLVideoElement,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
  }
  /* static members */
  object PhotoDome {
    
    /**
      * Define the image as a Monoscopic panoramic 360 image.
      */
    @JSImport("babylonjs/Helpers/index", "PhotoDome.MODE_MONOSCOPIC")
    @js.native
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the image as a Stereoscopic Side by Side panoramic 360 image.
      */
    @JSImport("babylonjs/Helpers/index", "PhotoDome.MODE_SIDEBYSIDE")
    @js.native
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
      */
    @JSImport("babylonjs/Helpers/index", "PhotoDome.MODE_TOPBOTTOM")
    @js.native
    val MODE_TOPBOTTOM: Double = js.native
  }
  
  @JSImport("babylonjs/Helpers/index", "VideoDome")
  @js.native
  open class VideoDome protected ()
    extends typings.babylonjs.helpersVideoDomeMod.VideoDome {
    /**
      * Create an instance of this class and pass through the parameters to the relevant classes- Texture, StandardMaterial, and Mesh.
      * @param name Element's name, child elements will append suffixes for their own names.
      * @param textureUrlOrElement defines the url(s) or the (video) HTML element to use
      * @param options An object containing optional or exposed sub element properties
      * @param options.resolution
      * @param options.clickToPlay
      * @param options.autoPlay
      * @param options.loop
      * @param options.size
      * @param options.poster
      * @param options.faceForward
      * @param options.useDirectMapping
      * @param options.halfDomeMode
      * @param options.crossEyeMode
      * @param options.generateMipMaps
      * @param options.mesh
      * @param scene
      * @param onError
      */
    def this(name: String, textureUrlOrElement: String, options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: js.Array[String], options: AutoPlay, scene: Scene) = this()
    def this(name: String, textureUrlOrElement: HTMLVideoElement, options: AutoPlay, scene: Scene) = this()
    def this(
      name: String,
      textureUrlOrElement: String,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: js.Array[String],
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
    def this(
      name: String,
      textureUrlOrElement: HTMLVideoElement,
      options: AutoPlay,
      scene: Scene,
      onError: Nullable[
            js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
          ]
    ) = this()
  }
  /* static members */
  object VideoDome {
    
    /**
      * Define the video source as a Monoscopic panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/index", "VideoDome.MODE_MONOSCOPIC")
    @js.native
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/index", "VideoDome.MODE_SIDEBYSIDE")
    @js.native
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
      */
    @JSImport("babylonjs/Helpers/index", "VideoDome.MODE_TOPBOTTOM")
    @js.native
    val MODE_TOPBOTTOM: Double = js.native
  }
  
  @JSImport("babylonjs/Helpers/index", "_forceSceneHelpersToBundle")
  @js.native
  def forceSceneHelpersToBundle: Boolean = js.native
  
  inline def forceSceneHelpersToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceSceneHelpersToBundle")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * Creates a default camera for the scene.
        * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-camera
        * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
        * @param replace has default false, when true replaces the active camera in the scene
        * @param attachCameraControls has default false, when true attaches camera controls to the canvas.
        */
      def createDefaultCamera(): Unit = js.native
      def createDefaultCamera(createArcRotateCamera: Boolean): Unit = js.native
      def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
      def createDefaultCamera(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
      def createDefaultCamera(createArcRotateCamera: Boolean, replace: Unit, attachCameraControls: Boolean): Unit = js.native
      def createDefaultCamera(createArcRotateCamera: Unit, replace: Boolean): Unit = js.native
      def createDefaultCamera(createArcRotateCamera: Unit, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
      def createDefaultCamera(createArcRotateCamera: Unit, replace: Unit, attachCameraControls: Boolean): Unit = js.native
      
      /**
        * Creates a default camera and a default light.
        * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-camera-or-light
        * @param createArcRotateCamera has the default false which creates a free camera, when true creates an arc rotate camera
        * @param replace has the default false, when true replaces the active camera/light in the scene
        * @param attachCameraControls has the default false, when true attaches camera controls to the canvas.
        */
      def createDefaultCameraOrLight(): Unit = js.native
      def createDefaultCameraOrLight(createArcRotateCamera: Boolean): Unit = js.native
      def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean): Unit = js.native
      def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
      def createDefaultCameraOrLight(createArcRotateCamera: Boolean, replace: Unit, attachCameraControls: Boolean): Unit = js.native
      def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Boolean): Unit = js.native
      def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Boolean, attachCameraControls: Boolean): Unit = js.native
      def createDefaultCameraOrLight(createArcRotateCamera: Unit, replace: Unit, attachCameraControls: Boolean): Unit = js.native
      
      /**
        * Creates a new environment
        * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-environment
        * @param options defines the options you can use to configure the environment
        * @returns the new EnvironmentHelper
        */
      def createDefaultEnvironment(): Nullable[typings.babylonjs.helpersEnvironmentHelperMod.EnvironmentHelper] = js.native
      def createDefaultEnvironment(options: PartialIEnvironmentHelper): Nullable[typings.babylonjs.helpersEnvironmentHelperMod.EnvironmentHelper] = js.native
      
      /**
        * Creates a default light for the scene.
        * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-light
        * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
        */
      def createDefaultLight(): Unit = js.native
      def createDefaultLight(replace: Boolean): Unit = js.native
      
      /**
        * Creates a new sky box
        * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/fastBuildWorld#create-default-skybox
        * @param environmentTexture defines the texture to use as environment texture
        * @param pbr has default false which requires the StandardMaterial to be used, when true PBRMaterial must be used
        * @param scale defines the overall scale of the skybox
        * @param blur is only available when pbr is true, default is 0, no blur, maximum value is 1
        * @param setGlobalEnvTexture has default true indicating that scene.environmentTexture must match the current skybox texture
        * @returns a new mesh holding the sky box
        */
      def createDefaultSkybox(): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Double, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Boolean, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Double, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Double, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: Unit, pbr: Unit, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Double, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(
        environmentTexture: BaseTexture,
        pbr: Boolean,
        scale: Double,
        blur: Double,
        setGlobalEnvTexture: Boolean
      ): Nullable[Mesh] = js.native
      def createDefaultSkybox(
        environmentTexture: BaseTexture,
        pbr: Boolean,
        scale: Double,
        blur: Unit,
        setGlobalEnvTexture: Boolean
      ): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Boolean, scale: Unit, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(
        environmentTexture: BaseTexture,
        pbr: Boolean,
        scale: Unit,
        blur: Double,
        setGlobalEnvTexture: Boolean
      ): Nullable[Mesh] = js.native
      def createDefaultSkybox(
        environmentTexture: BaseTexture,
        pbr: Boolean,
        scale: Unit,
        blur: Unit,
        setGlobalEnvTexture: Boolean
      ): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Double, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(
        environmentTexture: BaseTexture,
        pbr: Unit,
        scale: Double,
        blur: Double,
        setGlobalEnvTexture: Boolean
      ): Nullable[Mesh] = js.native
      def createDefaultSkybox(
        environmentTexture: BaseTexture,
        pbr: Unit,
        scale: Double,
        blur: Unit,
        setGlobalEnvTexture: Boolean
      ): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Unit, blur: Double): Nullable[Mesh] = js.native
      def createDefaultSkybox(
        environmentTexture: BaseTexture,
        pbr: Unit,
        scale: Unit,
        blur: Double,
        setGlobalEnvTexture: Boolean
      ): Nullable[Mesh] = js.native
      def createDefaultSkybox(environmentTexture: BaseTexture, pbr: Unit, scale: Unit, blur: Unit, setGlobalEnvTexture: Boolean): Nullable[Mesh] = js.native
      
      /**
        * Creates a new VREXperienceHelper
        * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/webVRHelper
        * @param webVROptions defines the options used to create the new VREXperienceHelper
        * @deprecated Please use createDefaultXRExperienceAsync instead
        * @returns a new VREXperienceHelper
        */
      def createDefaultVRExperience(): VRExperienceHelper = js.native
      def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): VRExperienceHelper = js.native
      
      /**
        * Creates a new WebXRDefaultExperience
        * @see https://doc.babylonjs.com/features/featuresDeepDive/webXR/introToWebXR
        * @param options experience options
        * @returns a promise for a new WebXRDefaultExperience
        */
      def createDefaultXRExperienceAsync(): js.Promise[WebXRDefaultExperience] = js.native
      def createDefaultXRExperienceAsync(options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = js.native
    }
  }
}
