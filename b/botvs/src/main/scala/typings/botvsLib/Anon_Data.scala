package typings
package botvsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var method: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(method: java.lang.String, data: java.lang.String = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_Data]
  }
}

