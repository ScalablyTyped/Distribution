package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMaterialCompilationOptions extends js.Object {
  /**
    * Defines whether clip planes are enabled.
    */
  var clipPlane: Boolean
  /**
    * Defines whether instances are enabled.
    */
  var useInstances: Boolean
}

object IMaterialCompilationOptions {
  @scala.inline
  def apply(clipPlane: Boolean, useInstances: Boolean): IMaterialCompilationOptions = {
    val __obj = js.Dynamic.literal(clipPlane = clipPlane.asInstanceOf[js.Any], useInstances = useInstances.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMaterialCompilationOptions]
  }
}

