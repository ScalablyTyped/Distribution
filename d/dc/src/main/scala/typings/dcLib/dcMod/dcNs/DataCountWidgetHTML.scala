package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCountWidgetHTML extends js.Object {
  var all: java.lang.String
  var some: java.lang.String
}

object DataCountWidgetHTML {
  @scala.inline
  def apply(all: java.lang.String, some: java.lang.String): DataCountWidgetHTML = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("some")(some)
    __obj.asInstanceOf[DataCountWidgetHTML]
  }
}

