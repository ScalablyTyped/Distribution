package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRFeaturePointSystem
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _enabled: Any = js.native
  
  /* private */ var _featurePointCloud: Any = js.native
  
  /**
    * Initializes the feature. If the feature point feature is not available for this environment do not mark the feature as enabled.
    */
  /* private */ var _init: Any = js.native
  
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
