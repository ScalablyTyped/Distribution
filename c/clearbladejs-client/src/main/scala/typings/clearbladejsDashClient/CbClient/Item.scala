package typings.clearbladejsDashClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var data: js.Object
  def destroy(callback: CbCallback): Unit
  def refresh(callback: CbCallback): Unit
  def save(callback: CbCallback): Unit
}

object Item {
  @scala.inline
  def apply(
    data: js.Object,
    destroy: CbCallback => Unit,
    refresh: CbCallback => Unit,
    save: CbCallback => Unit
  ): Item = {
    val __obj = js.Dynamic.literal(data = data, destroy = js.Any.fromFunction1(destroy), refresh = js.Any.fromFunction1(refresh), save = js.Any.fromFunction1(save))
  
    __obj.asInstanceOf[Item]
  }
}

