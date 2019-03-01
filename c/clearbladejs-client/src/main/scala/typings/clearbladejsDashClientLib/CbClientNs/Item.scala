package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var data: js.Object
  def destroy(callback: CbCallback): scala.Unit
  def refresh(callback: CbCallback): scala.Unit
  def save(callback: CbCallback): scala.Unit
}

object Item {
  @scala.inline
  def apply(
    data: js.Object,
    destroy: js.Function1[CbCallback, scala.Unit],
    refresh: js.Function1[CbCallback, scala.Unit],
    save: js.Function1[CbCallback, scala.Unit]
  ): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[Item]
  }
}

