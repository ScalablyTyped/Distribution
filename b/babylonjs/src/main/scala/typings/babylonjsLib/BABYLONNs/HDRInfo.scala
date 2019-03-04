package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Header information of HDR texture files.
  */
trait HDRInfo extends js.Object {
  /**
    * The index of the beginning of the data in the binary file.
    */
  var dataPosition: scala.Double
  /**
    * The height of the texture in pixels.
    */
  var height: scala.Double
  /**
    * The width of the texture in pixels.
    */
  var width: scala.Double
}

object HDRInfo {
  @scala.inline
  def apply(dataPosition: scala.Double, height: scala.Double, width: scala.Double): HDRInfo = {
    val __obj = js.Dynamic.literal(dataPosition = dataPosition, height = height, width = width)
  
    __obj.asInstanceOf[HDRInfo]
  }
}

