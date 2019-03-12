package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  def button(ref: stdLib.HTMLElement): scala.Unit
}

object Anon_Button {
  @scala.inline
  def apply(button: stdLib.HTMLElement => scala.Unit): Anon_Button = {
    val __obj = js.Dynamic.literal(button = js.Any.fromFunction1(button))
  
    __obj.asInstanceOf[Anon_Button]
  }
}

