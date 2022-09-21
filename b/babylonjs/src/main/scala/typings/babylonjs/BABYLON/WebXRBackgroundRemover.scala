package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRBackgroundRemover
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _setBackgroundState: Any = js.native
  
  /**
    * registered observers will be triggered when the background state changes
    */
  var onBackgroundStateChangedObservable: Observable[Boolean] = js.native
  
  /**
    * read-only options to be used in this module
    */
  val options: IWebXRBackgroundRemoverOptions = js.native
}
