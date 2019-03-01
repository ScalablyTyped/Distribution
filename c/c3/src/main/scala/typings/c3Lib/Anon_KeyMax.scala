package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyMax extends js.Object {
  var max: js.UndefOr[scala.Double | org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var min: js.UndefOr[scala.Double | org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
}

object Anon_KeyMax {
  @scala.inline
  def apply(
    max: scala.Double | org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    min: scala.Double | org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): Anon_KeyMax = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyMax]
  }
}

