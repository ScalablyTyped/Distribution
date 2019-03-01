package typings
package clearbladejsDashServerLib.CbServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var data: js.Object
  def destroy(): scala.Unit
  def refresh(): scala.Unit
  def save(): scala.Unit
}

object Item {
  @scala.inline
  def apply(
    data: js.Object,
    destroy: js.Function0[scala.Unit],
    refresh: js.Function0[scala.Unit],
    save: js.Function0[scala.Unit]
  ): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[Item]
  }
}

