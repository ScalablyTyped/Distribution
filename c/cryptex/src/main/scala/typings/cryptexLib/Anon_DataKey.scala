package typings
package cryptexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataKey extends js.Object {
  var dataKey: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DataKey {
  @scala.inline
  def apply(dataKey: java.lang.String = null, region: java.lang.String = null): Anon_DataKey = {
    val __obj = js.Dynamic.literal()
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Anon_DataKey]
  }
}

