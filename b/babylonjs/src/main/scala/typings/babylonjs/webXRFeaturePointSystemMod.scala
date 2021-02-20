package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRFeaturePointSystemMod {
  
  @JSImport("babylonjs/XR/features/WebXRFeaturePointSystem", "WebXRFeaturePointSystem")
  @js.native
  class WebXRFeaturePointSystem protected () extends WebXRAbstractFeature {
    /**
      * construct the feature point system
      * @param _xrSessionManager an instance of xr Session manager
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    
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
  /* static members */
  object WebXRFeaturePointSystem {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRFeaturePointSystem", "WebXRFeaturePointSystem.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRFeaturePointSystem", "WebXRFeaturePointSystem.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @js.native
  trait IWebXRFeaturePoint extends StObject {
    
    /**
      * Represents the confidence value of the feature point in world space. 0 being least confident, and 1 being most confident.
      */
    var confidenceValue: Double = js.native
    
    /**
      * Represents the position of the feature point in world space.
      */
    var position: Vector3 = js.native
  }
  object IWebXRFeaturePoint {
    
    @scala.inline
    def apply(confidenceValue: Double, position: Vector3): IWebXRFeaturePoint = {
      val __obj = js.Dynamic.literal(confidenceValue = confidenceValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRFeaturePoint]
    }
    
    @scala.inline
    implicit class IWebXRFeaturePointMutableBuilder[Self <: IWebXRFeaturePoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidenceValue(value: Double): Self = StObject.set(x, "confidenceValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
