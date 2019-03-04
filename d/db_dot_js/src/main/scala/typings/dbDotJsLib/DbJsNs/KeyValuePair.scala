package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValuePair[TKey, TValue] extends js.Object {
  var item: TValue
  var key: TKey
}

object KeyValuePair {
  @scala.inline
  def apply[TKey, TValue](item: TValue, key: TKey): KeyValuePair[TKey, TValue] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyValuePair[TKey, TValue]]
  }
}

