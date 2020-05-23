package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightNumber extends js.Object {
  /**
    * Change the height of the subchart.
    */
  var height: Double
}

object HeightNumber {
  @scala.inline
  def apply(height: Double): HeightNumber = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightNumber]
  }
}

