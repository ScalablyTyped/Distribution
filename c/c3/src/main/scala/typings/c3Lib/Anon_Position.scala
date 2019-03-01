package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: java.lang.String
  var text: java.lang.String
}

object Anon_Position {
  @scala.inline
  def apply(position: java.lang.String, text: java.lang.String): Anon_Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Position]
  }
}

