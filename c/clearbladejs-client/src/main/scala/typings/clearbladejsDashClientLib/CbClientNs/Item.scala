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
    destroy: CbCallback => scala.Unit,
    refresh: CbCallback => scala.Unit,
    save: CbCallback => scala.Unit
  ): Item = {
    val __obj = js.Dynamic.literal(data = data, destroy = js.Any.fromFunction1(destroy), refresh = js.Any.fromFunction1(refresh), save = js.Any.fromFunction1(save))
  
    __obj.asInstanceOf[Item]
  }
}

