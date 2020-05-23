package typings.babylonjs

import typings.babylonjs.anon.NameString
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/webXRFeaturesManager", JSImport.Namespace)
@js.native
object webXRFeaturesManagerMod extends js.Object {
  @js.native
  trait IWebXRFeature extends IDisposable {
    /**
      * Is this feature attached
      */
    var attached: Boolean = js.native
    /**
      * Should auto-attach be disabled?
      */
    var disableAutoAttach: Boolean = js.native
    /**
      * Attach the feature to the session
      * Will usually be called by the features manager
      *
      * @param force should attachment be forced (even when already attached)
      * @returns true if successful.
      */
    def attach(): Boolean = js.native
    def attach(force: Boolean): Boolean = js.native
    /**
      * Detach the feature from the session
      * Will usually be called by the features manager
      *
      * @returns true if successful.
      */
    def detach(): Boolean = js.native
  }
  
  @js.native
  class WebXRFeatureName () extends js.Object
  
  @js.native
  class WebXRFeaturesManager protected () extends IDisposable {
    /**
      * constructs a new features manages.
      *
      * @param _xrSessionManager an instance of WebXRSessionManager
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    var _features: js.Any = js.native
    var _xrSessionManager: js.Any = js.native
    /**
      * Attach a feature to the current session. Mainly used when session started to start the feature effect.
      * Can be used during a session to start a feature
      * @param featureName the name of feature to attach
      */
    def attachFeature(featureName: String): Unit = js.native
    /**
      * Can be used inside a session or when the session ends to detach a specific feature
      * @param featureName the name of the feature to detach
      */
    def detachFeature(featureName: String): Unit = js.native
    /**
      * Used to disable an already-enabled feature
      * The feature will be disposed and will be recreated once enabled.
      * @param featureName the feature to disable
      * @returns true if disable was successful
      */
    def disableFeature(featureName: String): Boolean = js.native
    def disableFeature(featureName: NameString): Boolean = js.native
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Enable a feature using its name and a version. This will enable it in the scene, and will be responsible to attach it when the session starts.
      * If used twice, the old version will be disposed and a new one will be constructed. This way you can re-enable with different configuration.
      *
      * @param featureName the name of the feature to load or the class of the feature
      * @param version optional version to load. if not provided the latest version will be enabled
      * @param moduleOptions options provided to the module. Ses the module documentation / constructor
      * @param attachIfPossible if set to true (default) the feature will be automatically attached, if it is currently possible
      * @returns a new constructed feature or throws an error if feature not found.
      */
    def enableFeature(featureName: String): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: String): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: String, moduleOptions: js.Any): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: String, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Double): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Double, moduleOptions: js.Any): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Double, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(featureName: NameString): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: String): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: String, moduleOptions: js.Any): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: String, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Double): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Double, moduleOptions: js.Any): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Double, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    /**
      * get the implementation of an enabled feature.
      * @param featureName the name of the feature to load
      * @returns the feature class, if found
      */
    def getEnabledFeature(featureName: String): IWebXRFeature = js.native
    /**
      * Get the list of enabled features
      * @returns an array of enabled features
      */
    def getEnabledFeatures(): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object WebXRFeatureName extends js.Object {
    /**
      * The name of the anchor system feature
      */
    var ANCHOR_SYSTEM: String = js.native
    /**
      * The name of the background remover feature
      */
    var BACKGROUND_REMOVER: String = js.native
    /**
      * The name of the hit test feature
      */
    var HIT_TEST: String = js.native
    /**
      * physics impostors for xr controllers feature
      */
    var PHYSICS_CONTROLLERS: String = js.native
    /**
      * The name of the plane detection feature
      */
    var PLANE_DETECTION: String = js.native
    /**
      * The name of the pointer selection feature
      */
    var POINTER_SELECTION: String = js.native
    /**
      * The name of the teleportation feature
      */
    var TELEPORTATION: String = js.native
  }
  
  /* static members */
  @js.native
  object WebXRFeaturesManager extends js.Object {
    val _AvailableFeatures: js.Any = js.native
    /**
      * Used to register a module. After calling this function a developer can use this feature in the scene.
      * Mainly used internally.
      *
      * @param featureName the name of the feature to register
      * @param constructorFunction the function used to construct the module
      * @param version the (babylon) version of the module
      * @param stable is that a stable version of this module
      */
    def AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor): Unit = js.native
    def AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor, version: Double): Unit = js.native
    def AddWebXRFeature(
      featureName: String,
      constructorFunction: WebXRFeatureConstructor,
      version: Double,
      stable: Boolean
    ): Unit = js.native
    /**
      * Returns a constructor of a specific feature.
      *
      * @param featureName the name of the feature to construct
      * @param version the version of the feature to load
      * @param xrSessionManager the xrSessionManager. Used to construct the module
      * @param options optional options provided to the module.
      * @returns a function that, when called, will return a new instance of this feature
      */
    def ConstructFeature(featureName: String, version: js.UndefOr[Double], xrSessionManager: WebXRSessionManager): js.Function0[IWebXRFeature] = js.native
    def ConstructFeature(
      featureName: String,
      version: js.UndefOr[Double],
      xrSessionManager: WebXRSessionManager,
      options: js.Any
    ): js.Function0[IWebXRFeature] = js.native
    /**
      * Can be used to return the list of features currently registered
      *
      * @returns an Array of available features
      */
    def GetAvailableFeatures(): js.Array[String] = js.native
    /**
      * Gets the versions available for a specific feature
      * @param featureName the name of the feature
      * @returns an array with the available versions
      */
    def GetAvailableVersions(featureName: String): js.Array[String] = js.native
    /**
      * Return the latest unstable version of this feature
      * @param featureName the name of the feature to search
      * @returns the version number. if not found will return -1
      */
    def GetLatestVersionOfFeature(featureName: String): Double = js.native
    /**
      * Return the latest stable version of this feature
      * @param featureName the name of the feature to search
      * @returns the version number. if not found will return -1
      */
    def GetStableVersionOfFeature(featureName: String): Double = js.native
  }
  
  type WebXRFeatureConstructor = js.Function2[
    /* xrSessionManager */ WebXRSessionManager, 
    /* options */ js.UndefOr[js.Any], 
    js.Function0[IWebXRFeature]
  ]
}

