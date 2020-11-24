package typings.babylonjs.webXRHitTestLegacyMod

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.webXRFeaturesManagerMod.IWebXRFeature
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
