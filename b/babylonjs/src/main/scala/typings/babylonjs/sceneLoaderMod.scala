package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animationGroupMod.AnimationGroup
import typings.babylonjs.anon.IsBinary
import typings.babylonjs.assetContainerMod.AssetContainer
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.fileRequestMod.IFileRequest
import typings.babylonjs.geometryMod.Geometry
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.lightMod.Light
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webRequestMod.WebRequest
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneLoaderMod {
  
  @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader")
  @js.native
  class SceneLoader () extends StObject
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
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.Append")
    @js.native
    def Append(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
    /**
      * Append a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param scene is the instance of BABYLON.Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The given scene
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[Scene] = js.native
    
    /**
      * Detailled logging while loading
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.DETAILED_LOGGING")
    @js.native
    val DETAILED_LOGGING: Double = js.native
    
    /**
      * Gets the default plugin (used to load Babylon files)
      * @returns the .babylon plugin
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.GetDefaultPlugin")
    @js.native
    def GetDefaultPlugin(): IRegisteredPlugin = js.native
    
    /**
      * Gets a plugin that can load the given extension
      * @param extension defines the extension to load
      * @returns a plugin or null if none works
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.GetPluginForExtension")
    @js.native
    def GetPluginForExtension(extension: String): ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory = js.native
    
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
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportAnimations")
    @js.native
    def ImportAnimations(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      overwriteAnimations: js.UndefOr[Boolean],
      animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
      targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Unit = js.native
    
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
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportAnimationsAsync")
    @js.native
    def ImportAnimationsAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      overwriteAnimations: js.UndefOr[Boolean],
      animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
      targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): js.Promise[Scene] = js.native
    
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
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMesh")
    @js.native
    def ImportMesh(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[SceneLoaderSuccessCallback]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
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
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: Nullable[Scene]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = js.native
    
    /**
      * Gets a boolean indicating that the given extension can be loaded
      * @param extension defines the extension to load
      * @returns true if the extension is supported
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.IsPluginForExtensionAvailable")
    @js.native
    def IsPluginForExtensionAvailable(extension: String): Boolean = js.native
    
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
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.Load")
    @js.native
    def Load(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      engine: js.UndefOr[Nullable[Engine]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
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
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainer")
    @js.native
    def LoadAssetContainer(
      rootUrl: String,
      sceneFilename: js.UndefOr[String | File],
      scene: js.UndefOr[Nullable[Scene]],
      onSuccess: js.UndefOr[Nullable[js.Function1[/* assets */ AssetContainer, Unit]]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      onError: js.UndefOr[
          Nullable[
            js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
          ]
        ],
      pluginExtension: js.UndefOr[Nullable[String]]
    ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    
    /**
      * Load a scene into an asset container
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
      * @param scene is the instance of Scene to append to
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded asset container
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(rootUrl: String): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[AssetContainer] = js.native
    
    /**
      * Load a scene
      * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
      * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
      * @param engine is the instance of BABYLON.Engine to use to create the scene
      * @param onProgress a callback with a progress event for each file being loaded
      * @param pluginExtension the extension used to determine the plugin
      * @returns The loaded scene
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], engine: Nullable[Engine]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: String, engine: Nullable[Engine]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: File, engine: Nullable[Engine]): js.Promise[Scene] = js.native
    
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
    @scala.inline
    def OnPluginActivatedObservable_=(x: Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnPluginActivatedObservable")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a new plugin to the list of registered plugins
      * @param plugin defines the plugin to add
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.RegisterPlugin")
    @js.native
    def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = js.native
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.RegisterPlugin")
    @js.native
    def RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = js.native
    
    /**
      * Summary logging while loading
      */
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader.SUMMARY_LOGGING")
    @js.native
    val SUMMARY_LOGGING: Double = js.native
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetDirectLoad")
    @js.native
    def _GetDirectLoad: js.Any = js.native
    @scala.inline
    def _GetDirectLoad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDirectLoad")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetFileInfo")
    @js.native
    def _GetFileInfo: js.Any = js.native
    @scala.inline
    def _GetFileInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFileInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetPluginForDirectLoad")
    @js.native
    def _GetPluginForDirectLoad: js.Any = js.native
    @scala.inline
    def _GetPluginForDirectLoad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForDirectLoad")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetPluginForExtension")
    @js.native
    def _GetPluginForExtension: js.Any = js.native
    @scala.inline
    def _GetPluginForExtension_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForExtension")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._GetPluginForFilename")
    @js.native
    def _GetPluginForFilename: js.Any = js.native
    @scala.inline
    def _GetPluginForFilename_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForFilename")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._LoadData")
    @js.native
    def _LoadData: js.Any = js.native
    @scala.inline
    def _LoadData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadData")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._registeredPlugins")
    @js.native
    def _registeredPlugins: js.Any = js.native
    @scala.inline
    def _registeredPlugins_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_registeredPlugins")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/sceneLoader", "SceneLoader._showingLoadingScreen")
    @js.native
    def _showingLoadingScreen: js.Any = js.native
    @scala.inline
    def _showingLoadingScreen_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_showingLoadingScreen")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait SceneLoaderAnimationGroupLoadingMode extends StObject
  @JSImport("babylonjs/Loading/sceneLoader", "SceneLoaderAnimationGroupLoadingMode")
  @js.native
  object SceneLoaderAnimationGroupLoadingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SceneLoaderAnimationGroupLoadingMode with Double] = js.native
    
    /**
      * Reset all old animations to initial state then dispose them.
      */
    @js.native
    sealed trait Clean extends SceneLoaderAnimationGroupLoadingMode
    /* 0 */ val Clean: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Clean with Double = js.native
    
    /**
      * Old animations remains untouched.
      */
    @js.native
    sealed trait NoSync extends SceneLoaderAnimationGroupLoadingMode
    /* 3 */ val NoSync: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.NoSync with Double = js.native
    
    /**
      * Stop all old animations.
      */
    @js.native
    sealed trait Stop extends SceneLoaderAnimationGroupLoadingMode
    /* 1 */ val Stop: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Stop with Double = js.native
    
    /**
      * Restart old animations from first frame.
      */
    @js.native
    sealed trait Sync extends SceneLoaderAnimationGroupLoadingMode
    /* 2 */ val Sync: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Sync with Double = js.native
  }
  
  /**
    * Defines a plugin registered by the SceneLoader
    */
  @js.native
  trait IRegisteredPlugin extends StObject {
    
    /**
      * Defines if the plugin supports binary data
      */
    var isBinary: Boolean = js.native
    
    /**
      * Defines the plugin to use
      */
    var plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory = js.native
  }
  object IRegisteredPlugin {
    
    @scala.inline
    def apply(
      isBinary: Boolean,
      plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory
    ): IRegisteredPlugin = {
      val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRegisteredPlugin]
    }
    
    @scala.inline
    implicit class IRegisteredPluginMutableBuilder[Self <: IRegisteredPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISceneLoaderAsyncResult extends StObject {
    
    /**
      * The array of loaded animation groups
      */
    val animationGroups: js.Array[AnimationGroup] = js.native
    
    /**
      * The array of loaded geometries
      */
    val geometries: js.Array[Geometry] = js.native
    
    /**
      * The array of loaded lights
      */
    val lights: js.Array[Light] = js.native
    
    /**
      * The array of loaded meshes
      */
    val meshes: js.Array[AbstractMesh] = js.native
    
    /**
      * The array of loaded particle systems
      */
    val particleSystems: js.Array[IParticleSystem] = js.native
    
    /**
      * The array of loaded skeletons
      */
    val skeletons: js.Array[Skeleton] = js.native
    
    /**
      * The array of loaded transform nodes
      */
    val transformNodes: js.Array[TransformNode] = js.native
  }
  object ISceneLoaderAsyncResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ISceneLoaderAsyncResultMutableBuilder[Self <: ISceneLoaderAsyncResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationGroups(value: js.Array[AnimationGroup]): Self = StObject.set(x, "animationGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationGroupsVarargs(value: AnimationGroup*): Self = StObject.set(x, "animationGroups", js.Array(value :_*))
      
      @scala.inline
      def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value :_*))
      
      @scala.inline
      def setLights(value: js.Array[Light]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightsVarargs(value: Light*): Self = StObject.set(x, "lights", js.Array(value :_*))
      
      @scala.inline
      def setMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "meshes", js.Array(value :_*))
      
      @scala.inline
      def setParticleSystems(value: js.Array[IParticleSystem]): Self = StObject.set(x, "particleSystems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticleSystemsVarargs(value: IParticleSystem*): Self = StObject.set(x, "particleSystems", js.Array(value :_*))
      
      @scala.inline
      def setSkeletons(value: js.Array[Skeleton]): Self = StObject.set(x, "skeletons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkeletonsVarargs(value: Skeleton*): Self = StObject.set(x, "skeletons", js.Array(value :_*))
      
      @scala.inline
      def setTransformNodes(value: js.Array[TransformNode]): Self = StObject.set(x, "transformNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformNodesVarargs(value: TransformNode*): Self = StObject.set(x, "transformNodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ISceneLoaderPlugin extends ISceneLoaderPluginBase {
    
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
      meshesNames: js.Any,
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      meshes: js.Array[AbstractMesh],
      particleSystems: js.Array[IParticleSystem],
      skeletons: js.Array[Skeleton]
    ): Boolean = js.native
    def importMesh(
      meshesNames: js.Any,
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      meshes: js.Array[AbstractMesh],
      particleSystems: js.Array[IParticleSystem],
      skeletons: js.Array[Skeleton],
      onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[js.Any], Unit]
    ): Boolean = js.native
    
    /**
      * Load into a scene.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onError The callback when import fails
      * @returns True if successful or false otherwise
      */
    def load(scene: Scene, data: js.Any, rootUrl: String): Boolean = js.native
    def load(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[js.Any], Unit]
    ): Boolean = js.native
    
    /**
      * Load into an asset container.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onError The callback when import fails
      * @returns The loaded asset container
      */
    def loadAssetContainer(scene: Scene, data: js.Any, rootUrl: String): AssetContainer = js.native
    def loadAssetContainer(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[js.Any], Unit]
    ): AssetContainer = js.native
  }
  
  @js.native
  trait ISceneLoaderPluginAsync extends ISceneLoaderPluginBase {
    
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
    def importMeshAsync(meshesNames: js.Any, scene: Scene, data: js.Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = js.native
    def importMeshAsync(
      meshesNames: js.Any,
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.UndefOr[scala.Nothing],
      fileName: String
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    def importMeshAsync(
      meshesNames: js.Any,
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    def importMeshAsync(
      meshesNames: js.Any,
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
      fileName: String
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    
    /**
      * Load into an asset container.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onProgress The callback when the load progresses
      * @param fileName Defines the name of the file to load
      * @returns The loaded asset container
      */
    def loadAssetContainerAsync(scene: Scene, data: js.Any, rootUrl: String): js.Promise[AssetContainer] = js.native
    def loadAssetContainerAsync(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.UndefOr[scala.Nothing],
      fileName: String
    ): js.Promise[AssetContainer] = js.native
    def loadAssetContainerAsync(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
    ): js.Promise[AssetContainer] = js.native
    def loadAssetContainerAsync(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
      fileName: String
    ): js.Promise[AssetContainer] = js.native
    
    /**
      * Load into a scene.
      * @param scene The scene to load into
      * @param data The data to import
      * @param rootUrl The root url for scene and resources
      * @param onProgress The callback when the load progresses
      * @param fileName Defines the name of the file to load
      * @returns Nothing
      */
    def loadAsync(scene: Scene, data: js.Any, rootUrl: String): js.Promise[Unit] = js.native
    def loadAsync(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.UndefOr[scala.Nothing],
      fileName: String
    ): js.Promise[Unit] = js.native
    def loadAsync(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
    ): js.Promise[Unit] = js.native
    def loadAsync(
      scene: Scene,
      data: js.Any,
      rootUrl: String,
      onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
      fileName: String
    ): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait ISceneLoaderPluginBase extends StObject {
    
    /**
      * The callback that returns true if the data can be directly loaded.
      * @param data string containing the file data
      * @returns if the data can be loaded directly
      */
    var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.native
    
    /**
      * The callback that returns the data to pass to the plugin if the data can be directly loaded.
      * @param scene scene loading this data
      * @param data string containing the data
      * @returns data to pass to the plugin
      */
    var directLoad: js.UndefOr[js.Function2[/* scene */ Scene, /* data */ String, _]] = js.native
    
    /**
      * The file extensions supported by this plugin.
      */
    var extensions: String | ISceneLoaderPluginExtensions = js.native
    
    /**
      * The friendly name of this plugin.
      */
    var name: String = js.native
    
    /**
      * The callback called when loading from a file object.
      * @param scene scene loading this file
      * @param file defines the file to load
      * @param onSuccess defines the callback to call when data is loaded
      * @param onProgress defines the callback to call during loading process
      * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
      * @param onError defines the callback to call when an error occurs
      * @returns a file request object
      */
    var readFile: js.UndefOr[
        js.Function6[
          /* scene */ Scene, 
          /* file */ File, 
          /* onSuccess */ js.Function1[/* data */ js.Any, Unit], 
          /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, _]], 
          /* useArrayBuffer */ js.UndefOr[Boolean], 
          /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]], 
          IFileRequest
        ]
      ] = js.native
    
    /**
      * The callback called when loading from a url.
      * @param scene scene loading this url
      * @param url url to load
      * @param onSuccess callback called when the file successfully loads
      * @param onProgress callback called while file is loading (if the server supports this mode)
      * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
      * @param onError callback called when the file fails to load
      * @returns a file request object
      */
    var requestFile: js.UndefOr[
        js.Function6[
          /* scene */ Scene, 
          /* url */ String, 
          /* onSuccess */ js.Function2[/* data */ js.Any, /* request */ js.UndefOr[WebRequest], Unit], 
          /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, Unit]], 
          /* useArrayBuffer */ js.UndefOr[Boolean], 
          /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]], 
          IFileRequest
        ]
      ] = js.native
    
    /**
      * The callback that allows custom handling of the root url based on the response url.
      * @param rootUrl the original root url
      * @param responseURL the response url if available
      * @returns the new root url
      */
    var rewriteRootURL: js.UndefOr[js.Function2[/* rootUrl */ String, /* responseURL */ js.UndefOr[String], String]] = js.native
  }
  object ISceneLoaderPluginBase {
    
    @scala.inline
    def apply(extensions: String | ISceneLoaderPluginExtensions, name: String): ISceneLoaderPluginBase = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneLoaderPluginBase]
    }
    
    @scala.inline
    implicit class ISceneLoaderPluginBaseMutableBuilder[Self <: ISceneLoaderPluginBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDirectLoad(value: /* data */ String => Boolean): Self = StObject.set(x, "canDirectLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanDirectLoadUndefined: Self = StObject.set(x, "canDirectLoad", js.undefined)
      
      @scala.inline
      def setDirectLoad(value: (/* scene */ Scene, /* data */ String) => _): Self = StObject.set(x, "directLoad", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDirectLoadUndefined: Self = StObject.set(x, "directLoad", js.undefined)
      
      @scala.inline
      def setExtensions(value: String | ISceneLoaderPluginExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadFile(
        value: (/* scene */ Scene, /* file */ File, /* onSuccess */ js.Function1[/* data */ js.Any, Unit], /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, _]], /* useArrayBuffer */ js.UndefOr[Boolean], /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]]) => IFileRequest
      ): Self = StObject.set(x, "readFile", js.Any.fromFunction6(value))
      
      @scala.inline
      def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
      
      @scala.inline
      def setRequestFile(
        value: (/* scene */ Scene, /* url */ String, /* onSuccess */ js.Function2[/* data */ js.Any, /* request */ js.UndefOr[WebRequest], Unit], /* onProgress */ js.UndefOr[js.Function1[/* ev */ ISceneLoaderProgressEvent, Unit]], /* useArrayBuffer */ js.UndefOr[Boolean], /* onError */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]]) => IFileRequest
      ): Self = StObject.set(x, "requestFile", js.Any.fromFunction6(value))
      
      @scala.inline
      def setRequestFileUndefined: Self = StObject.set(x, "requestFile", js.undefined)
      
      @scala.inline
      def setRewriteRootURL(value: (/* rootUrl */ String, /* responseURL */ js.UndefOr[String]) => String): Self = StObject.set(x, "rewriteRootURL", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRewriteRootURLUndefined: Self = StObject.set(x, "rewriteRootURL", js.undefined)
    }
  }
  
  type ISceneLoaderPluginExtensions = /**
    * Defines the list of supported extensions
    */
  StringDictionary[IsBinary]
  
  @js.native
  trait ISceneLoaderPluginFactory extends StObject {
    
    /**
      * The callback that returns true if the data can be directly loaded.
      * @param data string containing the file data
      * @returns if the data can be loaded directly
      */
    var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.native
    
    /**
      * Function called to create a new plugin
      * @return the new plugin
      */
    def createPlugin(): ISceneLoaderPlugin | ISceneLoaderPluginAsync = js.native
    
    /**
      * Defines the name of the factory
      */
    var name: String = js.native
  }
  object ISceneLoaderPluginFactory {
    
    @scala.inline
    def apply(createPlugin: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync, name: String): ISceneLoaderPluginFactory = {
      val __obj = js.Dynamic.literal(createPlugin = js.Any.fromFunction0(createPlugin), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneLoaderPluginFactory]
    }
    
    @scala.inline
    implicit class ISceneLoaderPluginFactoryMutableBuilder[Self <: ISceneLoaderPluginFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDirectLoad(value: /* data */ String => Boolean): Self = StObject.set(x, "canDirectLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanDirectLoadUndefined: Self = StObject.set(x, "canDirectLoad", js.undefined)
      
      @scala.inline
      def setCreatePlugin(value: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync): Self = StObject.set(x, "createPlugin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISceneLoaderProgressEvent extends StObject {
    
    /**
      * Defines if data length to load can be evaluated
      */
    val lengthComputable: Boolean = js.native
    
    /**
      * Defines the loaded data length
      */
    val loaded: Double = js.native
    
    /**
      * Defines the data length to load
      */
    val total: Double = js.native
  }
  object ISceneLoaderProgressEvent {
    
    @scala.inline
    def apply(lengthComputable: Boolean, loaded: Double, total: Double): ISceneLoaderProgressEvent = {
      val __obj = js.Dynamic.literal(lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneLoaderProgressEvent]
    }
    
    @scala.inline
    implicit class ISceneLoaderProgressEventMutableBuilder[Self <: ISceneLoaderProgressEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
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
