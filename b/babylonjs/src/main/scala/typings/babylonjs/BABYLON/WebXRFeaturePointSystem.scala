package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRFeaturePointSystem extends WebXRAbstractFeature {
  
  var _enabled: js.Any = js.native
  
  var _featurePointCloud: js.Any = js.native
  
  /**
    * Initializes the feature. If the feature point feature is not available for this environment do not mark the feature as enabled.
    */
  var _init: js.Any = js.native
  
  /**
    * The current feature point cloud maintained across frames.
    */
  def featurePointCloud: js.Array[IWebXRFeaturePoint] = js.native
  
  /**
    * Observers registered here will be executed whenever new feature points are added (on XRFrame while the session is tracking).
    * Will notify the observers about which feature points have been added.
    */
  val onFeaturePointsAddedObservable: Observable[js.Array[Double]] = js.native
  
  /**
    * Observers registered here will be executed whenever a feature point has been updated (on XRFrame while the session is tracking).
    * Will notify the observers about which feature points have been updated.
    */
  val onFeaturePointsUpdatedObservable: Observable[js.Array[Double]] = js.native
}
