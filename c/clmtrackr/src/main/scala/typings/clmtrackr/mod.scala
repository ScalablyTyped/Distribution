package typings.clmtrackr

import typings.clmtrackr.anon.UseWebWorkers
import typings.clmtrackr.clmtrackrBooleans.`false`
import typings.clmtrackr.clmtrackrStrings.blend
import typings.clmtrackr.clmtrackrStrings.cycle
import typings.clmtrackr.clmtrackrStrings.lbp
import typings.clmtrackr.clmtrackrStrings.raw
import typings.clmtrackr.clmtrackrStrings.single
import typings.clmtrackr.clmtrackrStrings.sobel
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("clmtrackr", "default.tracker")
    @js.native
    open class tracker ()
      extends StObject
         with typings.clmtrackr.mod._default.tracker {
      def this(params: TrackerParams) = this()
    }
    
    @JSImport("clmtrackr", "default.version")
    @js.native
    val version: String = js.native
  }
  
  type IPosition = js.Tuple2[Double, Double]
  
  type Model = Any
  
  trait TrackerParams extends StObject {
    
    /** whether to use constant velocity model when fitting (default is true) */
    var constantVelocity: js.UndefOr[Boolean] = js.undefined
    
    /** object with parameters for facedetection : */
    var faceDetection: js.UndefOr[UseWebWorkers] = js.undefined
    
    /** threshold for when to assume we've lost tracking (default is 0.50) */
    var scoreThreshold: js.UndefOr[Double] = js.undefined
    
    /** the size of the searchwindow around each point (default is 11) */
    var searchWindow: js.UndefOr[Double] = js.undefined
    
    /** whether to stop tracking when the fitting has converged (default is false) */
    var stopOnConvergence: js.UndefOr[Boolean] = js.undefined
    
    /** whether to use webGL if it is available (default is true) */
    var useWebGL: js.UndefOr[Boolean] = js.undefined
  }
  object TrackerParams {
    
    inline def apply(): TrackerParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackerParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrackerParams] (val x: Self) extends AnyVal {
      
      inline def setConstantVelocity(value: Boolean): Self = StObject.set(x, "constantVelocity", value.asInstanceOf[js.Any])
      
      inline def setConstantVelocityUndefined: Self = StObject.set(x, "constantVelocity", js.undefined)
      
      inline def setFaceDetection(value: UseWebWorkers): Self = StObject.set(x, "faceDetection", value.asInstanceOf[js.Any])
      
      inline def setFaceDetectionUndefined: Self = StObject.set(x, "faceDetection", js.undefined)
      
      inline def setScoreThreshold(value: Double): Self = StObject.set(x, "scoreThreshold", value.asInstanceOf[js.Any])
      
      inline def setScoreThresholdUndefined: Self = StObject.set(x, "scoreThreshold", js.undefined)
      
      inline def setSearchWindow(value: Double): Self = StObject.set(x, "searchWindow", value.asInstanceOf[js.Any])
      
      inline def setSearchWindowUndefined: Self = StObject.set(x, "searchWindow", js.undefined)
      
      inline def setStopOnConvergence(value: Boolean): Self = StObject.set(x, "stopOnConvergence", value.asInstanceOf[js.Any])
      
      inline def setStopOnConvergenceUndefined: Self = StObject.set(x, "stopOnConvergence", js.undefined)
      
      inline def setUseWebGL(value: Boolean): Self = StObject.set(x, "useWebGL", value.asInstanceOf[js.Any])
      
      inline def setUseWebGLUndefined: Self = StObject.set(x, "useWebGL", js.undefined)
    }
  }
  
  object _default {
    
    @js.native
    trait tracker extends StObject {
      
      def draw(canvas: HTMLCanvasElement): Unit = js.native
      
      def getConvergence(): Double = js.native
      
      def getCurrentParameters(): js.Array[Double] = js.native
      
      def getCurrentPosition(): js.Array[IPosition] | `false` = js.native
      
      def getScore(): Double = js.native
      
      def init(): Unit = js.native
      def init(model: Model): Unit = js.native
      
      def reset(): Unit = js.native
      
      def setResponseMode(`type`: single | cycle | blend, list: js.Array[raw | sobel | lbp]): Unit = js.native
      
      def start(element: HTMLCanvasElement): Unit = js.native
      def start(element: HTMLVideoElement): Unit = js.native
      
      def track(element: HTMLCanvasElement): js.Array[IPosition] | `false` = js.native
      def track(element: HTMLVideoElement): js.Array[IPosition] | `false` = js.native
    }
  }
}
