package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aria extends js.Object {
  var aria: js.Array[java.lang.String]
  var display: js.Array[java.lang.String]
}

object Anon_Aria {
  @scala.inline
  def apply(aria: js.Array[java.lang.String], display: js.Array[java.lang.String]): Anon_Aria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria")(aria)
    __obj.updateDynamic("display")(display)
    __obj.asInstanceOf[Anon_Aria]
  }
}

