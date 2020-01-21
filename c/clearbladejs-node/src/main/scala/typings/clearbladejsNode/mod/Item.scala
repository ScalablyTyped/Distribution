package typings.clearbladejsNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var data: js.Object
  def destroy(): Unit
  def refresh(): Unit
  def save(): Unit
}

object Item {
  @scala.inline
  def apply(data: js.Object, destroy: () => Unit, refresh: () => Unit, save: () => Unit): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), refresh = js.Any.fromFunction0(refresh), save = js.Any.fromFunction0(save))
  
    __obj.asInstanceOf[Item]
  }
}

