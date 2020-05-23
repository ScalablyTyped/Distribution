package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRFeature
import typings.babylonjs.BABYLON.WebXRFeatureConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRFeaturesManager")
@js.native
class WebXRFeaturesManager protected ()
  extends typings.babylonjs.BABYLON.WebXRFeaturesManager {
  /**
    * constructs a new features manages.
    *
    * @param _xrSessionManager an instance of WebXRSessionManager
    */
  def this(_xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
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
  /**
    * Returns a constructor of a specific feature.
    *
    * @param featureName the name of the feature to construct
    * @param version the version of the feature to load
    * @param xrSessionManager the xrSessionManager. Used to construct the module
    * @param options optional options provided to the module.
    * @returns a function that, when called, will return a new instance of this feature
    */
  def ConstructFeature(
    featureName: String,
    version: js.UndefOr[Double],
    xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager
  ): js.Function0[IWebXRFeature] = js.native
  def ConstructFeature(
    featureName: String,
    version: js.UndefOr[Double],
    xrSessionManager: typings.babylonjs.BABYLON.WebXRSessionManager,
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

