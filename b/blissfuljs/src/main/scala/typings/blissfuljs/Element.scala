package typings.blissfuljs

import typings.blissfuljs.BlissNSNs.BlissBindedElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var `_`: BlissBindedElement[Element]
}

object Element {
  @scala.inline
  def apply(`_`: BlissBindedElement[Element]): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Element]
  }
}

