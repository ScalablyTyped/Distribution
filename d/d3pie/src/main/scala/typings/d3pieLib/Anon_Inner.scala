package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inner extends js.Object {
  var label: java.lang.String
  var section: d3pieLib.d3pieLibStrings.outer | d3pieLib.d3pieLibStrings.inner
  var value: scala.Double
}

object Anon_Inner {
  @scala.inline
  def apply(
    label: java.lang.String,
    section: d3pieLib.d3pieLibStrings.outer | d3pieLib.d3pieLibStrings.inner,
    value: scala.Double
  ): Anon_Inner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Inner]
  }
}

