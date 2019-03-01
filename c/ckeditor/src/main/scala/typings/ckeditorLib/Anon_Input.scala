package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Input extends js.Object {
  def input(): scala.Unit
  def reset(): scala.Unit
}

object Anon_Input {
  @scala.inline
  def apply(input: js.Function0[scala.Unit], reset: js.Function0[scala.Unit]): Anon_Input = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[Anon_Input]
  }
}

