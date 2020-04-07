package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostProcessOptions extends js.Object {
  var height: Double
  var width: Double
}

object PostProcessOptions {
  @scala.inline
  def apply(height: Double, width: Double): PostProcessOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PostProcessOptions]
  }
}

