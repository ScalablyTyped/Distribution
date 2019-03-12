package typings
package blessedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HexColor extends js.Object {
  def `match`(hexColor: java.lang.String): java.lang.String
}

object Anon_HexColor {
  @scala.inline
  def apply(`match`: java.lang.String => java.lang.String): Anon_HexColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Anon_HexColor]
  }
}

