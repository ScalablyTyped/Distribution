package typings.babylonjs.BABYLON

import typings.babylonjs.AnonNameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRFeaturesManager")
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
  def disableFeature(featureName: AnonNameString): Boolean = js.native
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
  def enableFeature(featureName: AnonNameString): IWebXRFeature = js.native
  def enableFeature(featureName: AnonNameString, version: String): IWebXRFeature = js.native
  def enableFeature(featureName: AnonNameString, version: String, moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(featureName: AnonNameString, version: String, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
  def enableFeature(featureName: AnonNameString, version: Double): IWebXRFeature = js.native
  def enableFeature(featureName: AnonNameString, version: Double, moduleOptions: js.Any): IWebXRFeature = js.native
  def enableFeature(featureName: AnonNameString, version: Double, moduleOptions: js.Any, attachIfPossible: Boolean): IWebXRFeature = js.native
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
@JSGlobal("BABYLON.WebXRFeaturesManager")
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
  def ConstructFeature(featureName: String, version: js.UndefOr[scala.Nothing], xrSessionManager: WebXRSessionManager): js.Function0[IWebXRFeature] = js.native
  def ConstructFeature(
    featureName: String,
    version: js.UndefOr[scala.Nothing],
    xrSessionManager: WebXRSessionManager,
    options: js.Any
  ): js.Function0[IWebXRFeature] = js.native
  /**
    * Returns a constructor of a specific feature.
    *
    * @param featureName the name of the feature to construct
    * @param version the version of the feature to load
    * @param xrSessionManager the xrSessionManager. Used to construct the module
    * @param options optional options provided to the module.
    * @returns a function that, when called, will return a new instance of this feature
    */
  def ConstructFeature(featureName: String, version: Double, xrSessionManager: WebXRSessionManager): js.Function0[IWebXRFeature] = js.native
  def ConstructFeature(featureName: String, version: Double, xrSessionManager: WebXRSessionManager, options: js.Any): js.Function0[IWebXRFeature] = js.native
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

