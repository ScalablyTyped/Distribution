package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRHitTestFeature[T /* <: IWebXRLegacyHitResult */] extends IWebXRFeature {
  
  /**
    * Triggered when new babylon (transformed) hit test results are available
    */
  var onHitTestResultObservable: Observable[js.Array[T]] = js.native
}
