package typings.babylonjs

import typings.babylonjs.anon.NameString
import typings.babylonjs.anon.PartialXRSessionInit
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRFeaturesManagerMod {
  
  @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName")
  @js.native
  open class WebXRFeatureName () extends StObject
  /* static members */
  object WebXRFeatureName {
    
    /**
      * The name of the anchor system feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.ANCHOR_SYSTEM")
    @js.native
    val ANCHOR_SYSTEM: String = js.native
    
    /**
      * The name of the background remover feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.BACKGROUND_REMOVER")
    @js.native
    val BACKGROUND_REMOVER: String = js.native
    
    /**
      * The name of the DOM overlay feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.DOM_OVERLAY")
    @js.native
    val DOM_OVERLAY: String = js.native
    
    /**
      * The name of the eye tracking feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.EYE_TRACKING")
    @js.native
    val EYE_TRACKING: String = js.native
    
    /**
      * The name of the feature points feature.
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.FEATURE_POINTS")
    @js.native
    val FEATURE_POINTS: String = js.native
    
    /**
      * The name of the hand tracking feature.
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.HAND_TRACKING")
    @js.native
    val HAND_TRACKING: String = js.native
    
    /**
      * The name of the hit test feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.HIT_TEST")
    @js.native
    val HIT_TEST: String = js.native
    
    /**
      * The name of the image tracking feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.IMAGE_TRACKING")
    @js.native
    val IMAGE_TRACKING: String = js.native
    
    /**
      * The name of the composition layers feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.LAYERS")
    @js.native
    val LAYERS: String = js.native
    
    /**
      * The name of the light estimation feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.LIGHT_ESTIMATION")
    @js.native
    val LIGHT_ESTIMATION: String = js.native
    
    /**
      * The name of the mesh detection feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.MESH_DETECTION")
    @js.native
    val MESH_DETECTION: String = js.native
    
    /**
      * The name of the movement feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.MOVEMENT")
    @js.native
    val MOVEMENT: String = js.native
    
    /**
      * The name of the near interaction feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.NEAR_INTERACTION")
    @js.native
    val NEAR_INTERACTION: String = js.native
    
    /**
      * physics impostors for xr controllers feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.PHYSICS_CONTROLLERS")
    @js.native
    val PHYSICS_CONTROLLERS: String = js.native
    
    /**
      * The name of the plane detection feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.PLANE_DETECTION")
    @js.native
    val PLANE_DETECTION: String = js.native
    
    /**
      * The name of the pointer selection feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.POINTER_SELECTION")
    @js.native
    val POINTER_SELECTION: String = js.native
    
    /**
      * The name of the teleportation feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.TELEPORTATION")
    @js.native
    val TELEPORTATION: String = js.native
    
    /**
      * The name of the walking locomotion feature
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeatureName.WALKING_LOCOMOTION")
    @js.native
    val WALKING_LOCOMOTION: String = js.native
  }
  
  @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeaturesManager")
  @js.native
  open class WebXRFeaturesManager protected ()
    extends StObject
       with IDisposable {
    /**
      * constructs a new features manages.
      *
      * @param _xrSessionManager an instance of WebXRSessionManager
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    
    /**
      * This function will extend the session creation configuration object with enabled features.
      * If, for example, the anchors feature is enabled, it will be automatically added to the optional or required features list,
      * according to the defined "required" variable, provided during enableFeature call
      * @param xrSessionInit the xr Session init object to extend
      *
      * @returns an extended XRSessionInit object
      */
    def _extendXRSessionInitObject(xrSessionInit: XRSessionInit): js.Promise[XRSessionInit] = js.native
    
    /* private */ var _features: Any = js.native
    
    /* private */ var _xrSessionManager: Any = js.native
    
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
      * @param required is this feature required to the app. If set to true the session init will fail if the feature is not available.
      * @returns a new constructed feature or throws an error if feature not found or conflicts with another enabled feature.
      */
    def enableFeature(featureName: String): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: String): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: String, moduleOptions: Any): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: String, moduleOptions: Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: String,
      moduleOptions: Any,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: String,
      moduleOptions: Any,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: String, moduleOptions: Unit, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: String,
      moduleOptions: Unit,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: String,
      moduleOptions: Unit,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Double): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Double, moduleOptions: Any): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Double, moduleOptions: Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: Double,
      moduleOptions: Any,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: Double,
      moduleOptions: Any,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Double, moduleOptions: Unit, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: Double,
      moduleOptions: Unit,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: Double,
      moduleOptions: Unit,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Unit, moduleOptions: Any): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Unit, moduleOptions: Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: Unit,
      moduleOptions: Any,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Unit, moduleOptions: Any, attachIfPossible: Unit, required: Boolean): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Unit, moduleOptions: Unit, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: String,
      version: Unit,
      moduleOptions: Unit,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: String, version: Unit, moduleOptions: Unit, attachIfPossible: Unit, required: Boolean): IWebXRFeature = js.native
    def enableFeature(featureName: NameString): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: String): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: String, moduleOptions: Any): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: String, moduleOptions: Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: String,
      moduleOptions: Any,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: String,
      moduleOptions: Any,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: String, moduleOptions: Unit, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: String,
      moduleOptions: Unit,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: String,
      moduleOptions: Unit,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Double): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Double, moduleOptions: Any): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Double, moduleOptions: Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Double,
      moduleOptions: Any,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Double,
      moduleOptions: Any,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Double, moduleOptions: Unit, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Double,
      moduleOptions: Unit,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Double,
      moduleOptions: Unit,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Unit, moduleOptions: Any): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Unit, moduleOptions: Any, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Unit,
      moduleOptions: Any,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Unit,
      moduleOptions: Any,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(featureName: NameString, version: Unit, moduleOptions: Unit, attachIfPossible: Boolean): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Unit,
      moduleOptions: Unit,
      attachIfPossible: Boolean,
      required: Boolean
    ): IWebXRFeature = js.native
    def enableFeature(
      featureName: NameString,
      version: Unit,
      moduleOptions: Unit,
      attachIfPossible: Unit,
      required: Boolean
    ): IWebXRFeature = js.native
    
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
  object WebXRFeaturesManager {
    
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeaturesManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to register a module. After calling this function a developer can use this feature in the scene.
      * Mainly used internally.
      *
      * @param featureName the name of the feature to register
      * @param constructorFunction the function used to construct the module
      * @param version the (babylon) version of the module
      * @param stable is that a stable version of this module
      */
    inline def AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddWebXRFeature")(featureName.asInstanceOf[js.Any], constructorFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor, version: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddWebXRFeature")(featureName.asInstanceOf[js.Any], constructorFunction.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def AddWebXRFeature(
      featureName: String,
      constructorFunction: WebXRFeatureConstructor,
      version: Double,
      stable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddWebXRFeature")(featureName.asInstanceOf[js.Any], constructorFunction.asInstanceOf[js.Any], version.asInstanceOf[js.Any], stable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def AddWebXRFeature(featureName: String, constructorFunction: WebXRFeatureConstructor, version: Unit, stable: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AddWebXRFeature")(featureName.asInstanceOf[js.Any], constructorFunction.asInstanceOf[js.Any], version.asInstanceOf[js.Any], stable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns a constructor of a specific feature.
      *
      * @param featureName the name of the feature to construct
      * @param version the version of the feature to load
      * @param xrSessionManager the xrSessionManager. Used to construct the module
      * @param options optional options provided to the module.
      * @returns a function that, when called, will return a new instance of this feature
      */
    inline def ConstructFeature(featureName: String, version: Double, xrSessionManager: WebXRSessionManager): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
    inline def ConstructFeature(featureName: String, version: Double, xrSessionManager: WebXRSessionManager, options: Any): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
    inline def ConstructFeature(featureName: String, version: Unit, xrSessionManager: WebXRSessionManager): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
    inline def ConstructFeature(featureName: String, version: Unit, xrSessionManager: WebXRSessionManager, options: Any): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
    
    /**
      * Can be used to return the list of features currently registered
      *
      * @returns an Array of available features
      */
    inline def GetAvailableFeatures(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAvailableFeatures")().asInstanceOf[js.Array[String]]
    
    /**
      * Gets the versions available for a specific feature
      * @param featureName the name of the feature
      * @returns an array with the available versions
      */
    inline def GetAvailableVersions(featureName: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAvailableVersions")(featureName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * Return the latest unstable version of this feature
      * @param featureName the name of the feature to search
      * @returns the version number. if not found will return -1
      */
    inline def GetLatestVersionOfFeature(featureName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetLatestVersionOfFeature")(featureName.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Return the latest stable version of this feature
      * @param featureName the name of the feature to search
      * @returns the version number. if not found will return -1
      */
    inline def GetStableVersionOfFeature(featureName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetStableVersionOfFeature")(featureName.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeaturesManager._AvailableFeatures")
    @js.native
    val _AvailableFeatures: Any = js.native
    
    /**
      * The key is the feature to check and the value is the feature that conflicts.
      */
    @JSImport("babylonjs/XR/webXRFeaturesManager", "WebXRFeaturesManager._ConflictingFeatures")
    @js.native
    val _ConflictingFeatures: Any = js.native
  }
  
  @js.native
  trait IWebXRFeature
    extends StObject
       with IDisposable {
    
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
      * Is this feature attached
      */
    var attached: Boolean = js.native
    
    /**
      * A list of (Babylon WebXR) features this feature depends on
      */
    var dependsOn: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Detach the feature from the session
      * Will usually be called by the features manager
      *
      * @returns true if successful.
      */
    def detach(): Boolean = js.native
    
    /**
      * Should auto-attach be disabled?
      */
    var disableAutoAttach: Boolean = js.native
    
    /**
      * If this feature requires to extend the XRSessionInit object, this function will return the partial XR session init object
      */
    var getXRSessionInitExtension: js.UndefOr[js.Function0[js.Promise[PartialXRSessionInit]]] = js.native
    
    /**
      * This function will be executed during before enabling the feature and can be used to not-allow enabling it.
      * Note that at this point the session has NOT started, so this is purely checking if the browser supports it
      *
      * @returns whether or not the feature is compatible in this environment
      */
    def isCompatible(): Boolean = js.native
    
    /**
      * Was this feature disposed;
      */
    var isDisposed: Boolean = js.native
    
    /**
      * The name of the native xr feature name, if applicable (like anchor, hit-test, or hand-tracking)
      */
    var xrNativeFeatureName: js.UndefOr[String] = js.native
  }
  
  type WebXRFeatureConstructor = js.Function2[
    /* xrSessionManager */ WebXRSessionManager, 
    /* options */ js.UndefOr[Any], 
    js.Function0[IWebXRFeature]
  ]
}
