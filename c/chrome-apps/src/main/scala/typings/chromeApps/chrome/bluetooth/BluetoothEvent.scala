package typings.chromeApps.chrome.bluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothEvent[T] extends js.Object {
  
  def addListener(callback: js.Function1[/* event */ T, Unit]): Unit = js.native
}
object BluetoothEvent {
  
  @scala.inline
  def apply[T](addListener: js.Function1[/* event */ T, Unit] => Unit): BluetoothEvent[T] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener))
    __obj.asInstanceOf[BluetoothEvent[T]]
  }
  
  @scala.inline
  implicit class BluetoothEventOps[Self <: BluetoothEvent[_], T] (val x: Self with BluetoothEvent[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(value: js.Function1[/* event */ T, Unit] => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
  }
}
