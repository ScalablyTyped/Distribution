package typings.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExported extends js.Object {
  var exported: js.Array[js.Object]
  var specifiers: js.Array[js.Object]
}

object AnonExported {
  @scala.inline
  def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): AnonExported = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExported]
  }
}

