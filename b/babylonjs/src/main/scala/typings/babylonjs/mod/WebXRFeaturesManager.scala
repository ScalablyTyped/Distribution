package typings.babylonjs.mod

import typings.babylonjs.webXRFeaturesManagerMod.IWebXRFeature
import typings.babylonjs.webXRFeaturesManagerMod.WebXRFeatureConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRFeaturesManager")
@js.native
class WebXRFeaturesManager protected ()
  extends typings.babylonjs.legacyMod.WebXRFeaturesManager {
  /**
    * constructs a new features manages.
    *
    * @param _xrSessionManager an instance of WebXRSessionManager
    */
  def this(_xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager) = this()
}
/* static members */
object WebXRFeaturesManager {
  
  @JSImport("babylonjs", "WebXRFeaturesManager")
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
  inline def ConstructFeature(
    featureName: String,
    version: Double,
    xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
  ): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
  inline def ConstructFeature(
    featureName: String,
    version: Double,
    xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    options: js.Any
  ): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
  inline def ConstructFeature(
    featureName: String,
    version: Unit,
    xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
  ): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
  inline def ConstructFeature(
    featureName: String,
    version: Unit,
    xrSessionManager: typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager,
    options: js.Any
  ): js.Function0[IWebXRFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("ConstructFeature")(featureName.asInstanceOf[js.Any], version.asInstanceOf[js.Any], xrSessionManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[IWebXRFeature]]
  
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
  
  @JSImport("babylonjs", "WebXRFeaturesManager._AvailableFeatures")
  @js.native
  val _AvailableFeatures: js.Any = js.native
}
