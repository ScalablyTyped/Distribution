package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenSpaceCurvaturePostProcess
  extends StObject
     with PostProcess {
  
  /* private */ var _geometryBufferRenderer: Any = js.native
  
  /**
    * Defines how much ridge the curvature effect displays.
    */
  var ridge: Double = js.native
  
  /**
    * Defines how much valley the curvature effect displays.
    */
  var valley: Double = js.native
}
