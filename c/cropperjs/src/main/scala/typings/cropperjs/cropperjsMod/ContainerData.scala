package typings.cropperjs.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerData extends js.Object {
  /**
    * The current height of the container
    */
  var height: Double
  /**
    * The current width of the container
    */
  var width: Double
}

object ContainerData {
  @scala.inline
  def apply(height: Double, width: Double): ContainerData = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ContainerData]
  }
}

