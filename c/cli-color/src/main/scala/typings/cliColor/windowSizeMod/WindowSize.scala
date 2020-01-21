package typings.cliColor.windowSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowSize extends js.Object {
  /**
    * Returns terminal height
    */
  val height: Double
  /**
    * Returns terminal width
    */
  val width: Double
}

object WindowSize {
  @scala.inline
  def apply(height: Double, width: Double): WindowSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WindowSize]
  }
}

