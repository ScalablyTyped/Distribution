package typings.blissfuljs

import typings.blissfuljs.BlissNS.BlissBindedElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  @JSName("_")
  var _underscore: BlissBindedElement[Element]
}

object Element {
  @scala.inline
  def apply(_underscore: BlissBindedElement[Element]): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

