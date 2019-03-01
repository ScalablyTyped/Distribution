package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptorOptions extends js.Object {
  var uuid: java.lang.String
  var value: js.UndefOr[nodeLib.Buffer | java.lang.String | scala.Null] = js.undefined
}

object DescriptorOptions {
  @scala.inline
  def apply(uuid: java.lang.String, value: nodeLib.Buffer | java.lang.String = null): DescriptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uuid")(uuid)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorOptions]
  }
}

