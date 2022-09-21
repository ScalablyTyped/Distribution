package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animationGroupMod.AnimationGroup
import typings.babylonjs.anon.Exception
import typings.babylonjs.assetContainerMod.AssetContainer
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.cubeTextureMod.CubeTexture
import typings.babylonjs.equiRectangularCubeTextureMod.EquiRectangularCubeTexture
import typings.babylonjs.hdrCubeTextureMod.HDRCubeTexture
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.transformNodeMod.TransformNode
import typings.std.File
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetsManagerMod {
  
  @JSImport("babylonjs/Misc/assetsManager", "AbstractAssetTask")
  @js.native
  abstract class AbstractAssetTask protected () extends StObject {
    /**
      * Creates a new AssetsManager
      * @param name defines the name of the task
      */
    def this(/**
      * Task name
      */ name: String) = this()
    
    /* private */ var _errorObject: Any = js.native
    
    /* private */ var _isCompleted: Any = js.native
    
    /* private */ var _onDoneCallback: Any = js.native
    
    /* private */ var _onErrorCallback: Any = js.native
    
    /**
      * Internal only
      * @param message
      * @param exception
      * @hidden
      */
    def _setErrorObject(): Unit = js.native
    def _setErrorObject(message: String): Unit = js.native
    def _setErrorObject(message: String, exception: Any): Unit = js.native
    def _setErrorObject(message: Unit, exception: Any): Unit = js.native
    
    /* private */ var _taskState: Any = js.native
    
    /**
      * Gets the current error object (if task is in error)
      */
    def errorObject: Exception = js.native
    
    /**
      * Get if the task is completed
      */
    def isCompleted: Boolean = js.native
    
    /**
      * Task name
      */ var name: String = js.native
    
    /**
      * Callback called when the task is not successful
      */
    def onError(task: Any): Unit = js.native
    def onError(task: Any, message: String): Unit = js.native
    def onError(task: Any, message: String, exception: Any): Unit = js.native
    def onError(task: Any, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: Any): Unit = js.native
    
    /**
      * Reset will set the task state back to INIT, so the next load call of the assets manager will execute this task again.
      * This can be used with failed tasks that have the reason for failure fixed.
      */
    def reset(): Unit = js.native
    
    /**
      * Execute the current task
      * @param scene defines the scene where you want your assets to be loaded
      * @param onSuccess is a callback called when the task is successfully executed
      * @param onError is a callback called if an error occurs
      */
    def run(
      scene: Scene,
      onSuccess: js.Function0[Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    /**
      * Execute the current task
      * @param scene defines the scene where you want your assets to be loaded
      * @param onSuccess is a callback called when the task is successfully executed
      * @param onError is a callback called if an error occurs
      */
    def runTask(
      scene: Scene,
      onSuccess: js.Function0[Unit],
      onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
    ): Unit = js.native
    
    /**
      * Gets the current state of the task
      */
    def taskState: AssetTaskState = js.native
  }
  
  @js.native
  sealed trait AssetTaskState extends StObject
  @JSImport("babylonjs/Misc/assetsManager", "AssetTaskState")
  @js.native
  object AssetTaskState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AssetTaskState & Double] = js.native
    
    /**
      * Done
      */
    @js.native
    sealed trait DONE
      extends StObject
         with AssetTaskState
    /* 2 */ val DONE: typings.babylonjs.assetsManagerMod.AssetTaskState.DONE & Double = js.native
    
    /**
      * Error
      */
    @js.native
    sealed trait ERROR
      extends StObject
         with AssetTaskState
    /* 3 */ val ERROR: typings.babylonjs.assetsManagerMod.AssetTaskState.ERROR & Double = js.native
    
    /**
      * Initialization
      */
    @js.native
    sealed trait INIT
      extends StObject
         with AssetTaskState
    /* 0 */ val INIT: typings.babylonjs.assetsManagerMod.AssetTaskState.INIT & Double = js.native
    
    /**
      * Running
      */
    @js.native
    sealed trait RUNNING
      extends StObject
         with AssetTaskState
    /* 1 */ val RUNNING: typings.babylonjs.assetsManagerMod.AssetTaskState.RUNNING & Double = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "AssetsManager")
  @js.native
  /**
    * Creates a new AssetsManager
    * @param scene defines the scene to work on
    */
  open class AssetsManager () extends StObject {
    def this(scene: Scene) = this()
    
    /* private */ var _decreaseWaitingTasksCount: Any = js.native
    
    /* private */ var _formatTaskErrorMessage: Any = js.native
    
    /* private */ var _isLoading: Any = js.native
    
    /* private */ var _runTask: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* protected */ var _tasks: js.Array[AbstractAssetTask] = js.native
    
    /* protected */ var _totalTasksCount: Double = js.native
    
    /* protected */ var _waitingTasksCount: Double = js.native
    
    /**
      * Add a BinaryFileAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @returns a new BinaryFileAssetTask object
      */
    def addBinaryFileTask(taskName: String, url: String): BinaryFileAssetTask = js.native
    
    /**
      * Add a ContainerAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param meshesNames defines the name of meshes to load
      * @param rootUrl defines the root url to use to locate files
      * @param sceneFilename defines the filename of the scene file or the File itself
      * @returns a new ContainerAssetTask object
      */
    def addContainerTask(taskName: String, meshesNames: Any, rootUrl: String, sceneFilename: String): ContainerAssetTask = js.native
    def addContainerTask(taskName: String, meshesNames: Any, rootUrl: String, sceneFilename: File): ContainerAssetTask = js.native
    
    /**
      * Add a CubeTextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param extensions defines the extension to use to load the cube map (can be null)
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param files defines the list of files to load (can be null)
      * @param prefiltered defines the prefiltered texture option (default is false)
      * @returns a new CubeTextureAssetTask object
      */
    def addCubeTextureTask(taskName: String, url: String): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: js.Array[String]): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: js.Array[String], noMipmap: Boolean): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: Boolean,
      files: js.Array[String]
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: Boolean,
      files: js.Array[String],
      prefiltered: Boolean
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: Boolean,
      files: Unit,
      prefiltered: Boolean
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: Unit,
      files: js.Array[String]
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: Unit,
      files: js.Array[String],
      prefiltered: Boolean
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: js.Array[String],
      noMipmap: Unit,
      files: Unit,
      prefiltered: Boolean
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: Unit, noMipmap: Boolean): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: Unit, noMipmap: Boolean, files: js.Array[String]): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: Unit,
      noMipmap: Boolean,
      files: js.Array[String],
      prefiltered: Boolean
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: Unit,
      noMipmap: Boolean,
      files: Unit,
      prefiltered: Boolean
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: Unit, noMipmap: Unit, files: js.Array[String]): CubeTextureAssetTask = js.native
    def addCubeTextureTask(
      taskName: String,
      url: String,
      extensions: Unit,
      noMipmap: Unit,
      files: js.Array[String],
      prefiltered: Boolean
    ): CubeTextureAssetTask = js.native
    def addCubeTextureTask(taskName: String, url: String, extensions: Unit, noMipmap: Unit, files: Unit, prefiltered: Boolean): CubeTextureAssetTask = js.native
    
    /**
      *
      * Add a EquiRectangularCubeTextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param size defines the size you want for the cubemap (can be null)
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param gammaSpace Specifies if the texture will be used in gamma or linear space
      * (the PBR material requires those textures in linear space, but the standard material would require them in Gamma space)
      * @returns a new EquiRectangularCubeTextureAssetTask object
      */
    def addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Double): EquiRectangularCubeTextureAssetTask = js.native
    def addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Double, noMipmap: Boolean): EquiRectangularCubeTextureAssetTask = js.native
    def addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Double, noMipmap: Boolean, gammaSpace: Boolean): EquiRectangularCubeTextureAssetTask = js.native
    def addEquiRectangularCubeTextureAssetTask(taskName: String, url: String, size: Double, noMipmap: Unit, gammaSpace: Boolean): EquiRectangularCubeTextureAssetTask = js.native
    
    /**
      *
      * Add a HDRCubeTextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param size defines the size you want for the cubemap (can be null)
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param generateHarmonics defines if you want to automatically generate (true by default)
      * @param gammaSpace specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      * @param reserved Internal use only
      * @returns a new HDRCubeTextureAssetTask object
      */
    def addHDRCubeTextureTask(taskName: String, url: String, size: Double): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(taskName: String, url: String, size: Double, noMipmap: Boolean): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(taskName: String, url: String, size: Double, noMipmap: Boolean, generateHarmonics: Boolean): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Boolean,
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Boolean,
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Boolean,
      gammaSpace: Unit,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Unit,
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Unit,
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Boolean,
      generateHarmonics: Unit,
      gammaSpace: Unit,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(taskName: String, url: String, size: Double, noMipmap: Unit, generateHarmonics: Boolean): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Unit,
      generateHarmonics: Boolean,
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Unit,
      generateHarmonics: Boolean,
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Unit,
      generateHarmonics: Boolean,
      gammaSpace: Unit,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Unit,
      generateHarmonics: Unit,
      gammaSpace: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Unit,
      generateHarmonics: Unit,
      gammaSpace: Boolean,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    def addHDRCubeTextureTask(
      taskName: String,
      url: String,
      size: Double,
      noMipmap: Unit,
      generateHarmonics: Unit,
      gammaSpace: Unit,
      reserved: Boolean
    ): HDRCubeTextureAssetTask = js.native
    
    /**
      * Add a ImageAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @returns a new ImageAssetTask object
      */
    def addImageTask(taskName: String, url: String): ImageAssetTask = js.native
    
    /**
      * Add a MeshAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param meshesNames defines the name of meshes to load
      * @param rootUrl defines the root url to use to locate files
      * @param sceneFilename defines the filename of the scene file or the File itself
      * @returns a new MeshAssetTask object
      */
    def addMeshTask(taskName: String, meshesNames: Any, rootUrl: String, sceneFilename: String): MeshAssetTask = js.native
    def addMeshTask(taskName: String, meshesNames: Any, rootUrl: String, sceneFilename: File): MeshAssetTask = js.native
    
    /**
      * Add a TextFileAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @returns a new TextFileAssetTask object
      */
    def addTextFileTask(taskName: String, url: String): TextFileAssetTask = js.native
    
    /**
      * Add a TextureAssetTask to the list of active tasks
      * @param taskName defines the name of the new task
      * @param url defines the url of the file to load
      * @param noMipmap defines if the texture must not receive mipmaps (false by default)
      * @param invertY defines if you want to invert Y axis of the loaded texture (false by default)
      * @param samplingMode defines the sampling mode to use (Texture.TRILINEAR_SAMPLINGMODE by default)
      * @returns a new TextureAssetTask object
      */
    def addTextureTask(taskName: String, url: String): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Boolean): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Boolean, invertY: Boolean): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Boolean, invertY: Boolean, samplingMode: Double): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Boolean, invertY: Unit, samplingMode: Double): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Unit, invertY: Boolean): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Unit, invertY: Boolean, samplingMode: Double): TextureAssetTask = js.native
    def addTextureTask(taskName: String, url: String, noMipmap: Unit, invertY: Unit, samplingMode: Double): TextureAssetTask = js.native
    
    /**
      * Gets or sets a boolean defining if the AssetsManager should automatically hide the loading screen
      * when all assets have been downloaded.
      * If set to false, you need to manually call in hideLoadingUI() once your scene is ready.
      */
    var autoHideLoadingUI: Boolean = js.native
    
    /**
      * Start the loading process
      * @returns the current instance of the AssetsManager
      */
    def load(): AssetsManager = js.native
    
    /**
      * Start the loading process as an async operation
      * @returns a promise returning the list of failed tasks
      */
    def loadAsync(): js.Promise[Unit] = js.native
    
    /**
      * Callback called when all tasks are processed
      */
    def onFinish(tasks: js.Array[AbstractAssetTask]): Unit = js.native
    
    /**
      * Callback called when a task is done (whatever the result is)
      */
    def onProgress(remainingCount: Double, totalCount: Double, task: AbstractAssetTask): Unit = js.native
    
    /**
      * Observable called when a task is done (whatever the result is)
      */
    var onProgressObservable: Observable[IAssetsProgressEvent] = js.native
    
    /**
      * Callback called when a task had an error
      */
    def onTaskError(task: AbstractAssetTask): Unit = js.native
    
    /**
      * Observable called when a task had an error
      */
    var onTaskErrorObservable: Observable[AbstractAssetTask] = js.native
    
    /**
      * Callback called when a task is successful
      */
    def onTaskSuccess(task: AbstractAssetTask): Unit = js.native
    
    /**
      * Observable called when all tasks are processed
      */
    var onTaskSuccessObservable: Observable[AbstractAssetTask] = js.native
    
    /**
      * Observable called when all tasks were executed
      */
    var onTasksDoneObservable: Observable[js.Array[AbstractAssetTask]] = js.native
    
    /**
      * Remove a task from the assets manager.
      * @param task the task to remove
      */
    def removeTask(task: AbstractAssetTask): Unit = js.native
    
    /**
      * Reset the AssetsManager and remove all tasks
      * @returns the current instance of the AssetsManager
      */
    def reset(): AssetsManager = js.native
    
    /**
      * Gets or sets a boolean defining if the AssetsManager should use the default loading screen
      * @see https://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
      */
    var useDefaultLoadingScreen: Boolean = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "AssetsProgressEvent")
  @js.native
  open class AssetsProgressEvent protected ()
    extends StObject
       with IAssetsProgressEvent {
    /**
      * Creates a AssetsProgressEvent
      * @param remainingCount defines the number of remaining tasks to process
      * @param totalCount defines the total number of tasks
      * @param task defines the task that was just processed
      */
    def this(remainingCount: Double, totalCount: Double, task: AbstractAssetTask) = this()
    
    /**
      * Defines the number of remaining tasks to process
      */
    /* CompleteClass */
    var remainingCount: Double = js.native
    
    /**
      * Defines the task that was just processed
      */
    /* CompleteClass */
    var task: AbstractAssetTask = js.native
    
    /**
      * Defines the total number of tasks
      */
    /* CompleteClass */
    var totalCount: Double = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "BinaryFileAssetTask")
  @js.native
  open class BinaryFileAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new BinaryFileAssetTask object
      * @param name defines the name of the new task
      * @param url defines the location of the file to load
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String
    ) = this()
    
    /**
      * Gets the loaded data (as an array buffer)
      */
    var data: js.typedarray.ArrayBuffer = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: BinaryFileAssetTask): Unit = js.native
    def onError(task: BinaryFileAssetTask, message: String): Unit = js.native
    def onError(task: BinaryFileAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: BinaryFileAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: BinaryFileAssetTask): Unit = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "ContainerAssetTask")
  @js.native
  open class ContainerAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new ContainerAssetTask
      * @param name defines the name of the task
      * @param meshesNames defines the list of mesh's names you want to load
      * @param rootUrl defines the root url to use as a base to load your meshes and associated resources
      * @param sceneFilename defines the filename or File of the scene to load from
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: File
    ) = this()
    
    /**
      * Gets the list of loaded animation groups
      */
    var loadedAnimationGroups: js.Array[AnimationGroup] = js.native
    
    /**
      * Get the loaded asset container
      */
    var loadedContainer: AssetContainer = js.native
    
    /**
      * Gets the list of loaded meshes
      */
    var loadedMeshes: js.Array[AbstractMesh] = js.native
    
    /**
      * Gets the list of loaded particle systems
      */
    var loadedParticleSystems: js.Array[IParticleSystem] = js.native
    
    /**
      * Gets the list of loaded skeletons
      */
    var loadedSkeletons: js.Array[Skeleton] = js.native
    
    /**
      * Gets the list of loaded transforms
      */
    var loadedTransformNodes: js.Array[TransformNode] = js.native
    
    /**
      * Defines the list of mesh's names you want to load
      */
    var meshesNames: Any = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: ContainerAssetTask): Unit = js.native
    def onError(task: ContainerAssetTask, message: String): Unit = js.native
    def onError(task: ContainerAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: ContainerAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: ContainerAssetTask): Unit = js.native
    
    /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    var rootUrl: String = js.native
    
    /**
      * Defines the filename or File of the scene to load from
      */
    var sceneFilename: String | File = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "CubeTextureAssetTask")
  @js.native
  open class CubeTextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[CubeTexture] {
    /**
      * Creates a new CubeTextureAssetTask
      * @param name defines the name of the task
      * @param url defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      * @param extensions defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      * @param noMipmap defines if mipmaps should not be generated (default is false)
      * @param files defines the explicit list of files (undefined by default)
      * @param prefiltered
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: Unit,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: Unit,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: Unit,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String]
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String],
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: Unit,
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String],
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: js.Array[String],
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: Unit,
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: Unit,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String],
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: Unit,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: Unit,
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: Unit,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: js.Array[String],
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    url: String,
      /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    extensions: Unit,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines the explicit list of files (undefined by default)
      */
    files: Unit,
      /**
      * Defines the prefiltered texture option (default is false)
      */
    prefiltered: Boolean
    ) = this()
    
    /**
      * Defines the extensions to use to load files (["_px", "_py", "_pz", "_nx", "_ny", "_nz"] by default)
      */
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Defines the explicit list of files (undefined by default)
      */
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Defines if mipmaps should not be generated (default is false)
      */
    var noMipmap: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: CubeTextureAssetTask): Unit = js.native
    def onError(task: CubeTextureAssetTask, message: String): Unit = js.native
    def onError(task: CubeTextureAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: CubeTextureAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: CubeTextureAssetTask): Unit = js.native
    
    /**
      * Defines the prefiltered texture option (default is false)
      */
    var prefiltered: js.UndefOr[Boolean] = js.native
    
    /**
      * Gets the loaded texture
      */
    /* CompleteClass */
    var texture: CubeTexture = js.native
    
    /**
      * Defines the location of the files to load (You have to specify the folder where the files are + filename with no extension)
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "EquiRectangularCubeTextureAssetTask")
  @js.native
  open class EquiRectangularCubeTextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[EquiRectangularCubeTexture] {
    /**
      * Creates a new EquiRectangularCubeTextureAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      * @param size defines the desired size (the more it increases the longer the generation will be)
      * If the size is omitted this implies you are using a preprocessed cubemap.
      * @param noMipmap defines if mipmaps should not be generated (default is false)
      * @param gammaSpace specifies if the texture will be used in gamma or linear space
      * (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
      * (default is true)
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
      * but the standard material would require them in Gamma space) (default is true)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
      * but the standard material would require them in Gamma space) (default is true)
      */
    gammaSpace: Boolean
    ) = this()
    
    /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space,
      * but the standard material would require them in Gamma space) (default is true)
      */
    var gammaSpace: Boolean = js.native
    
    /**
      * Defines if mipmaps should not be generated (default is false)
      */
    var noMipmap: Boolean = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
    def onError(task: EquiRectangularCubeTextureAssetTask, message: String): Unit = js.native
    def onError(task: EquiRectangularCubeTextureAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: EquiRectangularCubeTextureAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: EquiRectangularCubeTextureAssetTask): Unit = js.native
    
    /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    var size: Double = js.native
    
    /**
      * Gets the loaded texture
      */
    /* CompleteClass */
    var texture: EquiRectangularCubeTexture = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "HDRCubeTextureAssetTask")
  @js.native
  open class HDRCubeTextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[HDRCubeTexture] {
    /**
      * Creates a new HDRCubeTextureAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      * @param size defines the desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
      * @param noMipmap defines if mipmaps should not be generated (default is false)
      * @param generateHarmonics specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      * @param gammaSpace specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      * @param reserved Internal use only
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Unit,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Unit,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Unit,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Unit,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Unit,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Unit,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Boolean,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Unit,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Unit,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Boolean,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    size: Double,
      /**
      * Defines if mipmaps should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    generateHarmonics: Unit,
      /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    gammaSpace: Unit,
      /**
      * Internal Use Only
      */
    reserved: Boolean
    ) = this()
    
    /**
      * Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
      */
    var gammaSpace: Boolean = js.native
    
    /**
      * Specifies whether you want to extract the polynomial harmonics during the generation process (default is true)
      */
    var generateHarmonics: Boolean = js.native
    
    /**
      * Defines if mipmaps should not be generated (default is false)
      */
    var noMipmap: Boolean = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: HDRCubeTextureAssetTask): Unit = js.native
    def onError(task: HDRCubeTextureAssetTask, message: String): Unit = js.native
    def onError(task: HDRCubeTextureAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: HDRCubeTextureAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: HDRCubeTextureAssetTask): Unit = js.native
    
    /**
      * Internal Use Only
      */
    var reserved: Boolean = js.native
    
    /**
      * Defines the desired size (the more it increases the longer the generation will be)
      */
    var size: Double = js.native
    
    /**
      * Gets the loaded texture
      */
    /* CompleteClass */
    var texture: HDRCubeTexture = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "ImageAssetTask")
  @js.native
  open class ImageAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new ImageAssetTask
      * @param name defines the name of the task
      * @param url defines the location of the image to load
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the image to load
      */
    url: String
    ) = this()
    
    /**
      * Gets the loaded images
      */
    var image: HTMLImageElement = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: ImageAssetTask): Unit = js.native
    def onError(task: ImageAssetTask, message: String): Unit = js.native
    def onError(task: ImageAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: ImageAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: ImageAssetTask): Unit = js.native
    
    /**
      * Defines the location of the image to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "MeshAssetTask")
  @js.native
  open class MeshAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new MeshAssetTask
      * @param name defines the name of the task
      * @param meshesNames defines the list of mesh's names you want to load
      * @param rootUrl defines the root url to use as a base to load your meshes and associated resources
      * @param sceneFilename defines the filename or File of the scene to load from
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the list of mesh's names you want to load
      */
    meshesNames: Any,
      /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    rootUrl: String,
      /**
      * Defines the filename or File of the scene to load from
      */
    sceneFilename: File
    ) = this()
    
    /**
      * Gets the list of loaded animation groups
      */
    var loadedAnimationGroups: js.Array[AnimationGroup] = js.native
    
    /**
      * Gets the list of loaded meshes
      */
    var loadedMeshes: js.Array[AbstractMesh] = js.native
    
    /**
      * Gets the list of loaded particle systems
      */
    var loadedParticleSystems: js.Array[IParticleSystem] = js.native
    
    /**
      * Gets the list of loaded skeletons
      */
    var loadedSkeletons: js.Array[Skeleton] = js.native
    
    /**
      * Gets the list of loaded transforms
      */
    var loadedTransformNodes: js.Array[TransformNode] = js.native
    
    /**
      * Defines the list of mesh's names you want to load
      */
    var meshesNames: Any = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: MeshAssetTask): Unit = js.native
    def onError(task: MeshAssetTask, message: String): Unit = js.native
    def onError(task: MeshAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: MeshAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: MeshAssetTask): Unit = js.native
    
    /**
      * Defines the root url to use as a base to load your meshes and associated resources
      */
    var rootUrl: String = js.native
    
    /**
      * Defines the filename or File of the scene to load from
      */
    var sceneFilename: String | File = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "TextFileAssetTask")
  @js.native
  open class TextFileAssetTask protected () extends AbstractAssetTask {
    /**
      * Creates a new TextFileAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String
    ) = this()
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: TextFileAssetTask): Unit = js.native
    def onError(task: TextFileAssetTask, message: String): Unit = js.native
    def onError(task: TextFileAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: TextFileAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: TextFileAssetTask): Unit = js.native
    
    /**
      * Gets the loaded text string
      */
    var text: String = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  @JSImport("babylonjs/Misc/assetsManager", "TextureAssetTask")
  @js.native
  open class TextureAssetTask protected ()
    extends AbstractAssetTask
       with ITextureAssetTask[Texture] {
    /**
      * Creates a new TextureAssetTask object
      * @param name defines the name of the task
      * @param url defines the location of the file to load
      * @param noMipmap defines if mipmap should not be generated (default is false)
      * @param invertY defines if texture must be inverted on Y axis (default is true)
      * @param samplingMode defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean,
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Boolean,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Unit,
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Boolean,
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    def this(
      /**
      * Defines the name of the task
      */
    name: String,
      /**
      * Defines the location of the file to load
      */
    url: String,
      /**
      * Defines if mipmap should not be generated (default is false)
      */
    noMipmap: Unit,
      /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    invertY: Unit,
      /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    samplingMode: Double
    ) = this()
    
    /**
      * Defines if texture must be inverted on Y axis (default is true)
      */
    var invertY: Boolean = js.native
    
    /**
      * Defines if mipmap should not be generated (default is false)
      */
    var noMipmap: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onError(task: TextureAssetTask): Unit = js.native
    def onError(task: TextureAssetTask, message: String): Unit = js.native
    def onError(task: TextureAssetTask, message: String, exception: Any): Unit = js.native
    def onError(task: TextureAssetTask, message: Unit, exception: Any): Unit = js.native
    
    /**
      * Callback called when the task is successful
      */
    def onSuccess(task: TextureAssetTask): Unit = js.native
    
    /**
      * Defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
      */
    var samplingMode: Double = js.native
    
    /**
      * Gets the loaded texture
      */
    /* CompleteClass */
    var texture: Texture = js.native
    
    /**
      * Defines the location of the file to load
      */
    var url: String = js.native
  }
  
  trait IAssetsProgressEvent extends StObject {
    
    /**
      * Defines the number of remaining tasks to process
      */
    var remainingCount: Double
    
    /**
      * Defines the task that was just processed
      */
    var task: AbstractAssetTask
    
    /**
      * Defines the total number of tasks
      */
    var totalCount: Double
  }
  object IAssetsProgressEvent {
    
    inline def apply(remainingCount: Double, task: AbstractAssetTask, totalCount: Double): IAssetsProgressEvent = {
      val __obj = js.Dynamic.literal(remainingCount = remainingCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAssetsProgressEvent]
    }
    
    extension [Self <: IAssetsProgressEvent](x: Self) {
      
      inline def setRemainingCount(value: Double): Self = StObject.set(x, "remainingCount", value.asInstanceOf[js.Any])
      
      inline def setTask(value: AbstractAssetTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITextureAssetTask[TEX /* <: BaseTexture */] extends StObject {
    
    /**
      * Gets the loaded texture
      */
    var texture: TEX
  }
  object ITextureAssetTask {
    
    inline def apply[TEX /* <: BaseTexture */](texture: TEX): ITextureAssetTask[TEX] = {
      val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextureAssetTask[TEX]]
    }
    
    extension [Self <: ITextureAssetTask[?], TEX /* <: BaseTexture */](x: Self & ITextureAssetTask[TEX]) {
      
      inline def setTexture(value: TEX): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    }
  }
}
