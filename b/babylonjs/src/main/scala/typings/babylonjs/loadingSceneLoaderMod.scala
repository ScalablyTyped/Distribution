package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.animationsAnimationGroupMod.AnimationGroup
import typings.babylonjs.anon.IsBinary
import typings.babylonjs.assetContainerMod.AssetContainer
import typings.babylonjs.bonesSkeletonMod.Skeleton
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.lightsLightMod.Light
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesGeometryMod.Geometry
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscFileRequestMod.IFileRequest
import typings.babylonjs.miscFileToolsMod.LoadFileError
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscWebRequestMod.WebRequest
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingSceneLoaderMod {
  
  @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader")
  @js.native
  open class SceneLoader () extends StObject
  /* static members */
  object SceneLoader {
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Append a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    inline def Append(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[Any], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("Append")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
    
    /**
      * Append a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The given scene
      */
    inline def AppendAsync(rootUrl: String): js.Promise[Scene] = ^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(rootUrl: String, sceneFilename: Unit, scene: Nullable[Scene]): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("AppendAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    
    /**
      * Detailed logging while loading
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.DETAILED_LOGGING")
    @js.native
    val DETAILED_LOGGING: Double = js.native
    
    /**
      * Gets the default plugin (used to load Babylon files)
      * @returns the .babylon plugin
      */
    inline def GetDefaultPlugin(): IRegisteredPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaultPlugin")().asInstanceOf[IRegisteredPlugin]
    
    /**
      * Gets a plugin that can load the given extension
      * @param extension defines the extension to load
      * @returns a plugin or null if none works
      */
    inline def GetPluginForExtension(`extension`: String): ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPluginForExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory]
    
    /**
      * Import animations from a file into a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
      * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
      * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
      * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      */
    inline def ImportAnimations(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      overwriteAnimations: js.UndefOr[Boolean],
      animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
      targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ Any, Any]]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[Any], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportAnimations")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], overwriteAnimations.asInstanceOf[js.Any], animationGroupLoadingMode.asInstanceOf[js.Any], targetConverter.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Import animations from a file into a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
      * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
      * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
      * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns the updated scene with imported animations
      */
    inline def ImportAnimationsAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      overwriteAnimations: js.UndefOr[Boolean],
      animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
      targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ Any, Any]]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[Any], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportAnimationsAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], overwriteAnimations.asInstanceOf[js.Any], animationGroupLoadingMode.asInstanceOf[js.Any], targetConverter.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    
    /**
      * Import meshes into a scene
      * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene the instance of BABYLON.Scene to append to
      * @param onSuccess a callback with a list of imported meshes, particleSystems, skeletons, and animationGroups when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    inline def ImportMesh(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[SceneLoaderSuccessCallback]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[Any], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMesh")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
    
    /**
      * Import meshes into a scene
      * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene the instance of BABYLON.Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
      */
    inline def ImportMeshAsync(meshNames: Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: String): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: Unit, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: File): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(meshNames: Any, rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    inline def ImportMeshAsync(
      meshNames: Any,
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportMeshAsync")(meshNames.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISceneLoaderAsyncResult]]
    
    /**
      * Gets a boolean indicating that the given extension can be loaded
      * @param extension defines the extension to load
      * @returns true if the extension is supported
      */
    inline def IsPluginForExtensionAvailable(`extension`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPluginForExtensionAvailable")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Load a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param engine is the instance of BABYLON.Engine to use to create the scene
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    inline def Load(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      engine: js.UndefOr[Nullable[Engine]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[Any], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("Load")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
    
    /**
      * Load a scene into an asset container
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
      * @param onSuccess a callback with the scene when import succeeds
      * @param onProgress a callback with a progress event for each file being loaded
      * @param onError a callback with the scene, a message, and possibly an exception when import fails
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded plugin
      */
    inline def LoadAssetContainer(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* assets */ AssetContainer, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[Any], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainer")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]]
    
    /**
      * Load a scene into an asset container
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
      * @param scene is the instance of Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded asset container
      */
    inline def LoadAssetContainerAsync(rootUrl: String): js.Promise[AssetContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: Unit, scene: Nullable[Scene]): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: Unit,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: File): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    inline def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: Nullable[Scene],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAssetContainerAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AssetContainer]]
    
    /**
      * Load a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param engine is the instance of BABYLON.Engine to use to create the scene
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded scene
      */
    inline def LoadAsync(rootUrl: String): js.Promise[Scene] = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(rootUrl: String, sceneFilename: String, engine: Nullable[Engine]): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: Nullable[Engine],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: Nullable[Engine],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: Nullable[Engine],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: Unit,
      engine: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: Unit,
      engine: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: Unit,
      engine: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(rootUrl: String, sceneFilename: Unit, engine: Nullable[Engine]): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: Unit,
      engine: Nullable[Engine],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: Unit,
      engine: Nullable[Engine],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: Unit,
      engine: Nullable[Engine],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: Unit,
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: Unit,
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(rootUrl: String, sceneFilename: File, engine: Nullable[Engine]): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: Nullable[Engine],
      onProgress: Unit,
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: Nullable[Engine],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    inline def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: Nullable[Engine],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadAsync")(rootUrl.asInstanceOf[js.Any], sceneFilename.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any], pluginExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scene]]
    
    /**
      * Minimal logging while loading
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.MINIMAL_LOGGING")
    @js.native
    val MINIMAL_LOGGING: Double = js.native
    
    /**
      * No logging while loading
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.NO_LOGGING")
    @js.native
    val NO_LOGGING: Double = js.native
    
    /**
      * Event raised when a plugin is used to load a scene
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.OnPluginActivatedObservable")
    @js.native
    def OnPluginActivatedObservable: Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    inline def OnPluginActivatedObservable_=(x: Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnPluginActivatedObservable")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a new plugin to the list of registered plugins
      * @param plugin defines the plugin to add
      */
    inline def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Summary logging while loading
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.SUMMARY_LOGGING")
    @js.native
    val SUMMARY_LOGGING: Double = js.native
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._FormatErrorMessage")
    @js.native
    def _FormatErrorMessage: Any = js.native
    inline def _FormatErrorMessage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FormatErrorMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetDirectLoad")
    @js.native
    def _GetDirectLoad: Any = js.native
    inline def _GetDirectLoad_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDirectLoad")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetFileInfo")
    @js.native
    def _GetFileInfo: Any = js.native
    inline def _GetFileInfo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFileInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetPluginForDirectLoad")
    @js.native
    def _GetPluginForDirectLoad: Any = js.native
    inline def _GetPluginForDirectLoad_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForDirectLoad")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetPluginForExtension")
    @js.native
    def _GetPluginForExtension: Any = js.native
    inline def _GetPluginForExtension_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForExtension")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetPluginForFilename")
    @js.native
    def _GetPluginForFilename: Any = js.native
    inline def _GetPluginForFilename_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForFilename")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._LoadData")
    @js.native
    def _LoadData: Any = js.native
    inline def _LoadData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadData")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._RegisteredPlugins")
    @js.native
    def _RegisteredPlugins: Any = js.native
    inline def _RegisteredPlugins_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RegisteredPlugins")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._ShowingLoadingScreen")
    @js.native
    def _ShowingLoadingScreen: Any = js.native
    inline def _ShowingLoadingScreen_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ShowingLoadingScreen")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait SceneLoaderAnimationGroupLoadingMode extends StObject
  @JSImport("babylonjs/Loading/sceneLoader", "SceneLoaderAnimationGroupLoadingMode")
  @js.native
  object SceneLoaderAnimationGroupLoadingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SceneLoaderAnimationGroupLoadingMode & Double] = js.native
    
    /**
      * Reset all old animations to initial state then dispose them.
      */
    @js.native
    sealed trait Clean
      extends StObject
         with SceneLoaderAnimationGroupLoadingMode
    /* 0 */ val Clean: typings.babylonjs.loadingSceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Clean & Double = js.native
    
    /**
      * Old animations remains untouched.
      */
    @js.native
    sealed trait NoSync
      extends StObject
         with SceneLoaderAnimationGroupLoadingMode
    /* 3 */ val NoSync: typings.babylonjs.loadingSceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.NoSync & Double = js.native
    
    /**
      * Stop all old animations.
      */
    @js.native
    sealed trait Stop
      extends StObject
         with SceneLoaderAnimationGroupLoadingMode
    /* 1 */ val Stop: typings.babylonjs.loadingSceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Stop & Double = js.native
    
    /**
      * Restart old animations from first frame.
      */
    @js.native
    sealed trait Sync
      extends StObject
         with SceneLoaderAnimationGroupLoadingMode
    /* 2 */ val Sync: typings.babylonjs.loadingSceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Sync & Double = js.native
  }
  
  /**
    * Defines a plugin registered by the SceneLoader
    */
  trait IRegisteredPlugin extends StObject {
    
    /**
      * Defines if the plugin supports binary data
      */
    var isBinary: Boolean
    
    /**
      * Defines the plugin to use
      */
    var plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory
  }
  object IRegisteredPlugin {
    
    inline def apply(
      isBinary: Boolean,
      plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory
    ): IRegisteredPlugin = {
      val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRegisteredPlugin]
    }
    
    extension [Self <: IRegisteredPlugin](x: Self) {
      
      inline def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISceneLoaderAsyncResult extends StObject {
    
    /**
      * The array of loaded animation groups
      */
    val animationGroups: js.Array[AnimationGroup]
    
    /**
      * The array of loaded geometries
      */
    val geometries: js.Array[Geometry]
    
    /**
      * The array of loaded lights
      */
    val lights: js.Array[Light]
    
    /**
      * The array of loaded meshes
      */
    val meshes: js.Array[AbstractMesh]
    
    /**
      * The array of loaded particle systems
      */
    val particleSystems: js.Array[IParticleSystem]
    
    /**
      * The array of loaded skeletons
      */
    val skeletons: js.Array[Skeleton]
    
    /**
      * The array of loaded transform nodes
      */
    val transformNodes: js.Array[TransformNode]
  }
  object ISceneLoaderAsyncResult {
    
    inline def apply(
      animationGroups: js.Array[AnimationGroup],
      geometries: js.Array[Geometry],
      lights: js.Array[Light],
      meshes: js.Array[AbstractMesh],
      particleSystems: js.Array[IParticleSystem],
      skeletons: js.Array[Skeleton],
      transformNodes: js.Array[TransformNode]
    ): ISceneLoaderAsyncResult = {
      val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], particleSystems = particleSystems.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any], transformNodes = transformNodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneLoaderAsyncResult]
    }
    
    extension [Self <: ISceneLoaderAsyncResult](x: Self) {
      
      inline def setAnimationGroups(value: js.Array[AnimationGroup]): Self = StObject.set(x, "animationGroups", value.asInstanceOf[js.Any])
      
      inline def setAnimationGroupsVarargs(value: AnimationGroup*): Self = StObject.set(x, "animationGroups", js.Array(value*))
      
      inline def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setLights(value: js.Array[Light]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
      
      inline def setLightsVarargs(value: Light*): Self = StObject.set(x, "lights", js.Array(value*))
      
      inline def setMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
      
      inline def setMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "meshes", js.Array(value*))
      
      inline def setParticleSystems(value: js.Array[IParticleSystem]): Self = StObject.set(x, "particleSystems", value.asInstanceOf[js.Any])
      
      inline def setParticleSystemsVarargs(value: IParticleSystem*): Self = StObject.set(x, "particleSystems", js.Array(value*))
      
      inline def setSkeletons(value: js.Array[Skeleton]): Self = StObject.set(x, "skeletons", value.asInstanceOf[js.Any])
      
      inline def setSkeletonsVarargs(value: Skeleton*): Self = StObject.set(x, "skeletons", js.Array(value*))
      
      inline def setTransformNodes(value: js.Array[TransformNode]): Self = StObject.set(x, "transformNodes", value.asInstanceOf[js.Any])
      
      inline def setTransformNodesVarargs(value: TransformNode*): Self = StObject.set(x, "transformNodes", js.Array(value*))
    }
  }
  
  @js.native
  trait ISceneLoaderPlugin
    extends StObject
       with ISceneLoaderPluginBase {
    
    /**
      * Import meshes into a scene.
      * @param meshesNames An array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
      * @param scene The scene to import into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param meshes The meshes array to import into
      * @param particleSystems The particle systems array to import into
      * @param skeletons The skeletons array to import into
      * @param onError The callback when import fails
      * @returns True if successful or false otherwise
      */
    def importMesh(
      meshesNames: Any,
      scene: Scene,
      data: Any,
      rootUrl: String,
      meshes: js.Array[AbstractMesh],
      particleSystems: js.Array[IParticleSystem],
      skeletons: js.Array[Skeleton]
    ): Boolean = js.native
    def importMesh(
      meshesNames: Any,
      scene: Scene,
      data: Any,
      rootUrl: String,
      meshes: js.Array[AbstractMesh],
      particleSystems: js.Array[IParticleSystem],
      skeletons: js.Array[Skeleton],
      onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[Any], Unit]
    ): Boolean = js.native
    
    /**
      * Load into a scene.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onError The callback when import fails
      * @returns True if successful or false otherwise
      */
    def load(scene: Scene, data: Any, rootUrl: String): Boolean = js.native
    def load(
      scene: Scene,
      data: Any,
      rootUrl: String,
      onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[Any], Unit]
    ): Boolean = js.native
    
    /**
      * Load into an asset container.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onError The callback when import fails
      * @returns The loaded asset container
      */
    def loadAssetContainer(scene: Scene, data: Any, rootUrl: String): AssetContainer = js.native
    def loadAssetContainer(
      scene: Scene,
      data: Any,
      rootUrl: String,
      onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[Any], Unit]
    ): AssetContainer = js.native
  }
  
  @js.native
  trait ISceneLoaderPluginAsync
    extends StObject
       with ISceneLoaderPluginBase {
    
    /**
      * Import meshes into a scene.
      * @param meshesNames An array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
      * @param scene The scene to import into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onProgress The callback when the load progresses
      * @param fileName Defines the name of the file to load
      * @returns The loaded objects (e.g. meshes, particle systems, skeletons, animation groups, etc.)
      */
    def importMeshAsync(meshesNames: Any, scene: Scene, data: Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = js.native
    def importMeshAsync(
      meshesNames: Any,
      scene: Scene,
      data: Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    def importMeshAsync(
      meshesNames: Any,
      scene: Scene,
      data: Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
      fileName: String
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    def importMeshAsync(meshesNames: Any, scene: Scene, data: Any, rootUrl: String, onProgress: Unit, fileName: String): js.Promise[ISceneLoaderAsyncResult] = js.native
    
    /**
      * Load into an asset container.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onProgress The callback when the load progresses
      * @param fileName Defines the name of the file to load
      * @returns The loaded asset container
      */
    def loadAssetContainerAsync(scene: Scene, data: Any, rootUrl: String): js.Promise[AssetContainer] = js.native
    def loadAssetContainerAsync(
      scene: Scene,
      data: Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
    ): js.Promise[AssetContainer] = js.native
    def loadAssetContainerAsync(
      scene: Scene,
      data: Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
      fileName: String
    ): js.Promise[AssetContainer] = js.native
    def loadAssetContainerAsync(scene: Scene, data: Any, rootUrl: String, onProgress: Unit, fileName: String): js.Promise[AssetContainer] = js.native
    
    /**
      * Load into a scene.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onProgress The callback when the load progresses
      * @param fileName Defines the name of the file to load
      * @returns Nothing
      */
    def loadAsync(scene: Scene, data: Any, rootUrl: String): js.Promise[Unit] = js.native
    def loadAsync(
      scene: Scene,
      data: Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
    ): js.Promise[Unit] = js.native
    def loadAsync(
      scene: Scene,
      data: Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
      fileName: String
    ): js.Promise[Unit] = js.native
    def loadAsync(scene: Scene, data: Any, rootUrl: String, onProgress: Unit, fileName: String): js.Promise[Unit] = js.native
  }
  
  trait ISceneLoaderPluginBase extends StObject {
    
    /**
      * The callback that returns true if the data can be directly loaded.
      * @param data string containing the file data
      * @returns if the data can be loaded directly
      */
    var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.undefined
    
    /**
      * The callback that returns the data to pass to the plugin if the data can be directly loaded.
      * @param scene scene loading this data
      * @param data string containing the data
      * @returns data to pass to the plugin
      */
    var directLoad: js.UndefOr[js.Function2[/* scene */ Scene, /* data */ String, Any]] = js.undefined
    
    /**
      * The file extensions supported by this plugin.
      */
    var extensions: String | ISceneLoaderPluginExtensions
    
    /**
      * The callback called when loading from a url.
      * @param scene scene loading this url
      * @param fileOrUrl file or url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @returns a file request object
      */
    var loadFile: js.UndefOr[
        js.Function6[
          /* scene */ Scene, 
          /* fileOrUrl */ File | String, 
          /* onSuccess */ js.Function2[/* data */ Any, /* responseURL */ js.UndefOr[String], Unit], 
          /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, Unit]], 
          /* useArrayBuffer */ js.UndefOr[Boolean], 
          /* onError */ js.UndefOr[
            js.Function2[
              /* request */ js.UndefOr[WebRequest], 
              /* exception */ js.UndefOr[LoadFileError], 
              Unit
            ]
          ], 
          IFileRequest
        ]
      ] = js.undefined
    
    /**
      * The friendly name of this plugin.
      */
    var name: String
    
    /**
      * The callback that allows custom handling of the root url based on the response url.
      * @param rootUrl the original root url
      * @param responseURL the response url if available
      * @returns the new root url
      */
    var rewriteRootURL: js.UndefOr[js.Function2[/* rootUrl */ String, /* responseURL */ js.UndefOr[String], String]] = js.undefined
  }
  object ISceneLoaderPluginBase {
    
    inline def apply(extensions: String | ISceneLoaderPluginExtensions, name: String): ISceneLoaderPluginBase = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneLoaderPluginBase]
    }
    
    extension [Self <: ISceneLoaderPluginBase](x: Self) {
      
      inline def setCanDirectLoad(value: /* data */ String => Boolean): Self = StObject.set(x, "canDirectLoad", js.Any.fromFunction1(value))
      
      inline def setCanDirectLoadUndefined: Self = StObject.set(x, "canDirectLoad", js.undefined)
      
      inline def setDirectLoad(value: (/* scene */ Scene, /* data */ String) => Any): Self = StObject.set(x, "directLoad", js.Any.fromFunction2(value))
      
      inline def setDirectLoadUndefined: Self = StObject.set(x, "directLoad", js.undefined)
      
      inline def setExtensions(value: String | ISceneLoaderPluginExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setLoadFile(
        value: (/* scene */ Scene, /* fileOrUrl */ File | String, /* onSuccess */ js.Function2[/* data */ Any, /* responseURL */ js.UndefOr[String], Unit], /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, Unit]], /* useArrayBuffer */ js.UndefOr[Boolean], /* onError */ js.UndefOr[
              js.Function2[
                /* request */ js.UndefOr[WebRequest], 
                /* exception */ js.UndefOr[LoadFileError], 
                Unit
              ]
            ]) => IFileRequest
      ): Self = StObject.set(x, "loadFile", js.Any.fromFunction6(value))
      
      inline def setLoadFileUndefined: Self = StObject.set(x, "loadFile", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRewriteRootURL(value: (/* rootUrl */ String, /* responseURL */ js.UndefOr[String]) => String): Self = StObject.set(x, "rewriteRootURL", js.Any.fromFunction2(value))
      
      inline def setRewriteRootURLUndefined: Self = StObject.set(x, "rewriteRootURL", js.undefined)
    }
  }
  
  type ISceneLoaderPluginExtensions = /**
    * Defines the list of supported extensions
    */
  StringDictionary[IsBinary]
  
  trait ISceneLoaderPluginFactory extends StObject {
    
    /**
      * The callback that returns true if the data can be directly loaded.
      * @param data string containing the file data
      * @returns if the data can be loaded directly
      */
    var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.undefined
    
    /**
      * Function called to create a new plugin
      * @returns the new plugin
      */
    def createPlugin(): ISceneLoaderPlugin | ISceneLoaderPluginAsync
    
    /**
      * Defines the name of the factory
      */
    var name: String
  }
  object ISceneLoaderPluginFactory {
    
    inline def apply(createPlugin: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync, name: String): ISceneLoaderPluginFactory = {
      val __obj = js.Dynamic.literal(createPlugin = js.Any.fromFunction0(createPlugin), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneLoaderPluginFactory]
    }
    
    extension [Self <: ISceneLoaderPluginFactory](x: Self) {
      
      inline def setCanDirectLoad(value: /* data */ String => Boolean): Self = StObject.set(x, "canDirectLoad", js.Any.fromFunction1(value))
      
      inline def setCanDirectLoadUndefined: Self = StObject.set(x, "canDirectLoad", js.undefined)
      
      inline def setCreatePlugin(value: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync): Self = StObject.set(x, "createPlugin", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISceneLoaderProgressEvent extends StObject {
    
    /**
      * Defines if data length to load can be evaluated
      */
    val lengthComputable: Boolean
    
    /**
      * Defines the loaded data length
      */
    val loaded: Double
    
    /**
      * Defines the data length to load
      */
    val total: Double
  }
  object ISceneLoaderProgressEvent {
    
    inline def apply(lengthComputable: Boolean, loaded: Double, total: Double): ISceneLoaderProgressEvent = {
      val __obj = js.Dynamic.literal(lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneLoaderProgressEvent]
    }
    
    extension [Self <: ISceneLoaderProgressEvent](x: Self) {
      
      inline def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type SceneLoaderSuccessCallback = js.Function7[
    /* meshes */ js.Array[AbstractMesh], 
    /* particleSystems */ js.Array[IParticleSystem], 
    /* skeletons */ js.Array[Skeleton], 
    /* animationGroups */ js.Array[AnimationGroup], 
    /* transformNodes */ js.Array[TransformNode], 
    /* geometries */ js.Array[Geometry], 
    /* lights */ js.Array[Light], 
    Unit
  ]
}
