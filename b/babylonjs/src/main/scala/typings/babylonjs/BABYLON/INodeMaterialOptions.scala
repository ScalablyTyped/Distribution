package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeMaterialOptions extends js.Object {
  /**
    * Defines if blocks should emit comments
    */
  var emitComments: Boolean
}

object INodeMaterialOptions {
  @scala.inline
  def apply(emitComments: Boolean): INodeMaterialOptions = {
    val __obj = js.Dynamic.literal(emitComments = emitComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeMaterialOptions]
  }
}

