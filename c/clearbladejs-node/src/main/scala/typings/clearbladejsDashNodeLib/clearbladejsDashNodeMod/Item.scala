package typings
package clearbladejsDashNodeLib.clearbladejsDashNodeMod

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
  def apply(data: js.Object, destroy: () => scala.Unit, refresh: () => scala.Unit, save: () => scala.Unit): Item = {
    val __obj = js.Dynamic.literal(data = data, destroy = js.Any.fromFunction0(destroy), refresh = js.Any.fromFunction0(refresh), save = js.Any.fromFunction0(save))
  
    __obj.asInstanceOf[Item]
  }
}

