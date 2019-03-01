package typings
package crossfilterLib.CrossFilterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grouping[TKey, TValue] extends js.Object {
  var key: TKey
  var value: TValue
}

object Grouping {
  @scala.inline
  def apply[TKey, TValue](key: TKey, value: TValue): Grouping[TKey, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grouping[TKey, TValue]]
  }
}

