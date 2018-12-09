package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to load scene from various file formats using registered plugins
     * @see http://doc.babylonjs.com/how_to/load_from_any_file_type
     */
@JSImport("babylonjs", "SceneLoader")
@js.native
class SceneLoader ()
  extends babylonjsLib.BABYLONNs.SceneLoader

/**
     * Class used to load scene from various file formats using registered plugins
     * @see http://doc.babylonjs.com/how_to/load_from_any_file_type
     */
@JSImport("babylonjs", "SceneLoader")
@js.native
object SceneLoader extends js.Object {
  /**
           * Gets or set a boolean indicating if matrix weights must be cleaned upon loading
           */
  var CleanBoneMatrixWeights: scala.Boolean = js.native
  /**
           * Detailled logging while loading
           */
  val DETAILED_LOGGING: scala.Double = js.native
  /**
           * Gets or sets a boolean indicating if entire scene must be loaded even if scene contains incremental data
           */
  var ForceFullSceneLoadingForIncremental: scala.Boolean = js.native
  /**
           * Minimal logging while loading
           */
  val MINIMAL_LOGGING: scala.Double = js.native
  /**
           * No logging while loading
           */
  val NO_LOGGING: scala.Double = js.native
  /**
           * Event raised when a plugin is used to load a scene
           */
  var OnPluginActivatedObservable: babylonjsLib.BABYLONNs.Observable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Summary logging while loading
           */
  val SUMMARY_LOGGING: scala.Double = js.native
  /**
           * Gets or sets a boolean indicating if loading screen must be displayed while loading a scene
           */
  var ShowLoadingScreen: scala.Boolean = js.native
  var _CleanBoneMatrixWeights: js.Any = js.native
  var _ForceFullSceneLoadingForIncremental: js.Any = js.native
  var _ShowLoadingScreen: js.Any = js.native
  var _getDefaultPlugin: js.Any = js.native
  var _getDirectLoad: js.Any = js.native
  var _getFileInfo: js.Any = js.native
  var _getPluginForDirectLoad: js.Any = js.native
  var _getPluginForExtension: js.Any = js.native
  var _getPluginForFilename: js.Any = js.native
  var _loadData: js.Any = js.native
  var _loggingLevel: js.Any = js.native
  var _registeredPlugins: js.Any = js.native
  /**
           * Defines the current logging level (while loading the scene)
           * @ignorenaming
           */
  var loggingLevel: scala.Double = js.native
  /**
           * Append a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onSuccess a callback with the scene when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def Append(
    rootUrl: java.lang.String,
    sceneFilename: js.UndefOr[java.lang.String],
    scene: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]],
    onSuccess: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[js.Function1[/* scene */ babylonjsLib.BABYLONNs.Scene, scala.Unit]]
    ],
    onProgress: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
      ]
    ],
    onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function3[
          /* scene */ babylonjsLib.BABYLONNs.Scene, 
          /* message */ java.lang.String, 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]]
  ): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Append a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The given scene
           */
  def AppendAsync(rootUrl: java.lang.String): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Append a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The given scene
           */
  def AppendAsync(rootUrl: java.lang.String, sceneFilename: java.lang.String): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Append a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The given scene
           */
  def AppendAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Append a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The given scene
           */
  def AppendAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ]
  ): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Append a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The given scene
           */
  def AppendAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ],
    pluginExtension: babylonjsLib.BABYLONNs.Nullable[java.lang.String]
  ): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Gets a plugin that can load the given extension
           * @param extension defines the extension to load
           * @returns a plugin or null if none works
           */
  def GetPluginForExtension(extension: java.lang.String): babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync | babylonjsLib.BABYLONNs.ISceneLoaderPluginFactory = js.native
  /**
           * Import meshes into a scene
           * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene the instance of BABYLON.Scene to append to
           * @param onSuccess a callback with a list of imported meshes, particleSystems, and skeletons when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def ImportMesh(
    meshNames: js.Any,
    rootUrl: java.lang.String,
    sceneFilename: js.UndefOr[java.lang.String],
    scene: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]],
    onSuccess: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function4[
          /* meshes */ js.Array[babylonjsLib.BABYLONNs.AbstractMesh], 
          /* particleSystems */ js.Array[babylonjsLib.BABYLONNs.IParticleSystem], 
          /* skeletons */ js.Array[babylonjsLib.BABYLONNs.Skeleton], 
          /* animationGroups */ js.Array[babylonjsLib.BABYLONNs.AnimationGroup], 
          scala.Unit
        ]
      ]
    ],
    onProgress: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
      ]
    ],
    onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function3[
          /* scene */ babylonjsLib.BABYLONNs.Scene, 
          /* message */ java.lang.String, 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]]
  ): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Import meshes into a scene
           * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
           */
  def ImportMeshAsync(meshNames: js.Any, rootUrl: java.lang.String): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  /**
           * Import meshes into a scene
           * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
           */
  def ImportMeshAsync(meshNames: js.Any, rootUrl: java.lang.String, sceneFilename: java.lang.String): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  /**
           * Import meshes into a scene
           * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
           */
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  /**
           * Import meshes into a scene
           * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
           */
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ]
  ): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  /**
           * Import meshes into a scene
           * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
           */
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ],
    pluginExtension: babylonjsLib.BABYLONNs.Nullable[java.lang.String]
  ): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  /**
           * Gets a boolean indicating that the given extension can be loaded
           * @param extension defines the extension to load
           * @returns true if the extension is supported
           */
  def IsPluginForExtensionAvailable(extension: java.lang.String): scala.Boolean = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onSuccess a callback with the scene when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def Load(rootUrl: java.lang.String, sceneFilename: java.lang.String, engine: babylonjsLib.BABYLONNs.Engine): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onSuccess a callback with the scene when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def Load(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    engine: babylonjsLib.BABYLONNs.Engine,
    onSuccess: babylonjsLib.BABYLONNs.Nullable[js.Function1[/* scene */ babylonjsLib.BABYLONNs.Scene, scala.Unit]]
  ): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onSuccess a callback with the scene when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def Load(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    engine: babylonjsLib.BABYLONNs.Engine,
    onSuccess: babylonjsLib.BABYLONNs.Nullable[js.Function1[/* scene */ babylonjsLib.BABYLONNs.Scene, scala.Unit]],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ]
  ): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onSuccess a callback with the scene when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def Load(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    engine: babylonjsLib.BABYLONNs.Engine,
    onSuccess: babylonjsLib.BABYLONNs.Nullable[js.Function1[/* scene */ babylonjsLib.BABYLONNs.Scene, scala.Unit]],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ],
    onError: babylonjsLib.BABYLONNs.Nullable[
      js.Function3[
        /* scene */ babylonjsLib.BABYLONNs.Scene, 
        /* message */ java.lang.String, 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]
  ): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onSuccess a callback with the scene when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def Load(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    engine: babylonjsLib.BABYLONNs.Engine,
    onSuccess: babylonjsLib.BABYLONNs.Nullable[js.Function1[/* scene */ babylonjsLib.BABYLONNs.Scene, scala.Unit]],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ],
    onError: babylonjsLib.BABYLONNs.Nullable[
      js.Function3[
        /* scene */ babylonjsLib.BABYLONNs.Scene, 
        /* message */ java.lang.String, 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ],
    pluginExtension: babylonjsLib.BABYLONNs.Nullable[java.lang.String]
  ): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Load a scene into an asset container
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
           * @param onSuccess a callback with the scene when import succeeds
           * @param onProgress a callback with a progress event for each file being loaded
           * @param onError a callback with the scene, a message, and possibly an exception when import fails
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded plugin
           */
  def LoadAssetContainer(
    rootUrl: java.lang.String,
    sceneFilename: js.UndefOr[java.lang.String],
    scene: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]],
    onSuccess: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[js.Function1[/* assets */ babylonjsLib.BABYLONNs.AssetContainer, scala.Unit]]
    ],
    onProgress: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
      ]
    ],
    onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function3[
          /* scene */ babylonjsLib.BABYLONNs.Scene, 
          /* message */ java.lang.String, 
          /* exception */ js.UndefOr[_], 
          scala.Unit
        ]
      ]
    ],
    pluginExtension: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]]
  ): babylonjsLib.BABYLONNs.Nullable[
    babylonjsLib.BABYLONNs.ISceneLoaderPlugin | babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync
  ] = js.native
  /**
           * Load a scene into an asset container
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded asset container
           */
  def LoadAssetContainerAsync(rootUrl: java.lang.String): js.Promise[babylonjsLib.BABYLONNs.AssetContainer] = js.native
  /**
           * Load a scene into an asset container
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded asset container
           */
  def LoadAssetContainerAsync(rootUrl: java.lang.String, sceneFilename: java.lang.String): js.Promise[babylonjsLib.BABYLONNs.AssetContainer] = js.native
  /**
           * Load a scene into an asset container
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded asset container
           */
  def LoadAssetContainerAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]
  ): js.Promise[babylonjsLib.BABYLONNs.AssetContainer] = js.native
  /**
           * Load a scene into an asset container
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded asset container
           */
  def LoadAssetContainerAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ]
  ): js.Promise[babylonjsLib.BABYLONNs.AssetContainer] = js.native
  /**
           * Load a scene into an asset container
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param scene is the instance of BABYLON.Scene to append to
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded asset container
           */
  def LoadAssetContainerAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ],
    pluginExtension: babylonjsLib.BABYLONNs.Nullable[java.lang.String]
  ): js.Promise[babylonjsLib.BABYLONNs.AssetContainer] = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded scene
           */
  def LoadAsync(rootUrl: java.lang.String, sceneFilename: java.lang.String, engine: babylonjsLib.BABYLONNs.Engine): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded scene
           */
  def LoadAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    engine: babylonjsLib.BABYLONNs.Engine,
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ]
  ): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Load a scene
           * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
           * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
           * @param engine is the instance of BABYLON.Engine to use to create the scene
           * @param onProgress a callback with a progress event for each file being loaded
           * @param pluginExtension the extension used to determine the plugin
           * @returns The loaded scene
           */
  def LoadAsync(
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String,
    engine: babylonjsLib.BABYLONNs.Engine,
    onProgress: babylonjsLib.BABYLONNs.Nullable[
      js.Function1[/* event */ babylonjsLib.BABYLONNs.SceneLoaderProgressEvent, scala.Unit]
    ],
    pluginExtension: babylonjsLib.BABYLONNs.Nullable[java.lang.String]
  ): js.Promise[babylonjsLib.BABYLONNs.Scene] = js.native
  /**
           * Adds a new plugin to the list of registered plugins
           * @param plugin defines the plugin to add
           */
  def RegisterPlugin(plugin: babylonjsLib.BABYLONNs.ISceneLoaderPlugin): scala.Unit = js.native
  /**
           * Adds a new plugin to the list of registered plugins
           * @param plugin defines the plugin to add
           */
  def RegisterPlugin(plugin: babylonjsLib.BABYLONNs.ISceneLoaderPluginAsync): scala.Unit = js.native
}

