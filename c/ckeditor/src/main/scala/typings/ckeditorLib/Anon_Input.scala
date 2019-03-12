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
  def apply(input: () => scala.Unit, reset: () => scala.Unit): Anon_Input = {
    val __obj = js.Dynamic.literal(input = js.Any.fromFunction0(input), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[Anon_Input]
  }
}

