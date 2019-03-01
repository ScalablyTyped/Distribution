package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerData extends js.Object {
  /**
    * The current height of the container
    */
  var height: scala.Double
  /**
    * The current width of the container
    */
  var width: scala.Double
}

object ContainerData {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ContainerData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ContainerData]
  }
}

