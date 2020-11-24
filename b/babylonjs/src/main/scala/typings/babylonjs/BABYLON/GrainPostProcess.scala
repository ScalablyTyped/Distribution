package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrainPostProcess extends PostProcess {
  
  /**
    * If the grain should be randomized on every frame
    */
  var animated: Boolean = js.native
  
  /**
    * The intensity of the grain added (default: 30)
    */
  var intensity: Double = js.native
}
