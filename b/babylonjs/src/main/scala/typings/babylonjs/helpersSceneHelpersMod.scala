package typings.babylonjs

import typings.babylonjs.anon.PartialIEnvironmentHelper
import typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelper
import typings.babylonjs.camerasVRVrExperienceHelperMod.VRExperienceHelperOptions
import typings.babylonjs.helpersEnvironmentHelperMod.EnvironmentHelper
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience
import typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperienceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersSceneHelpersMod {
  
  @JSImport("babylonjs/Helpers/sceneHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Helpers/sceneHelpers", "_forceSceneHelpersToBundle")
  @js.native
  def forceSceneHelpersToBundle: Boolean = js.native
  
  inline def forceSceneHelpersToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceSceneHelpersToBundle")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /**
        * Creates a default camera for the scene.
        * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-camera
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
        * @see https://doc.babylonjs.com/divingDeeper/scene/fastBuildWorld#create-default-camera-or-light
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
        * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-environment
        * @param options defines the options you can use to configure the environment
        * @returns the new EnvironmentHelper
        */
      def createDefaultEnvironment(): Nullable[EnvironmentHelper] = js.native
      def createDefaultEnvironment(options: PartialIEnvironmentHelper): Nullable[EnvironmentHelper] = js.native
      
      /**
        * Creates a default light for the scene.
        * @see https://doc.babylonjs.com/How_To/Fast_Build#create-default-light
        * @param replace has the default false, when true replaces the existing lights in the scene with a hemispheric light
        */
      def createDefaultLight(): Unit = js.native
      def createDefaultLight(replace: Boolean): Unit = js.native
      
      /**
        * Creates a new sky box
        * @see https://doc.babylonjs.com/divingDeeper/scene/fastBuildWorld#create-default-skybox
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
        * @see https://doc.babylonjs.com/divingDeeper/cameras/webVRHelper
        * @param webVROptions defines the options used to create the new VREXperienceHelper
        * @deprecated Please use createDefaultXRExperienceAsync instead
        * @returns a new VREXperienceHelper
        */
      def createDefaultVRExperience(): VRExperienceHelper = js.native
      def createDefaultVRExperience(webVROptions: VRExperienceHelperOptions): VRExperienceHelper = js.native
      
      /**
        * Creates a new WebXRDefaultExperience
        * @see https://doc.babylonjs.com/how_to/introduction_to_webxr
        * @param options experience options
        * @returns a promise for a new WebXRDefaultExperience
        */
      def createDefaultXRExperienceAsync(): js.Promise[WebXRDefaultExperience] = js.native
      def createDefaultXRExperienceAsync(options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = js.native
    }
  }
}
