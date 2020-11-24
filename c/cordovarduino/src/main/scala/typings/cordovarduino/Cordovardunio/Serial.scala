package typings.cordovarduino.Cordovardunio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serial extends js.Object {
  
  /**
    * Close connection.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def close(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  
  /**
    * Open a connection.
    *
    * @param opts            SerialOptions object
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def open(opts: SerialOptions, successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  
  /**
    * Read from the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def read(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  
  /**
    * Register a callback for the driver reading incoming data from the serial device
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def registerReadCallback(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  
  /**
    * Request permission to interact with the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def requestPermission(successCallback: js.Function, errorCallback: js.Function): Unit = js.native
  
  /**
    * Write to the serial port.
    *
    * @param data            String data to write to serial port
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def write(data: String, successCallback: js.Function, errorCallback: js.Function): Unit = js.native
}
object Serial {
  
  @scala.inline
  def apply(
    close: (js.Function, js.Function) => Unit,
    open: (SerialOptions, js.Function, js.Function) => Unit,
    read: (js.Function, js.Function) => Unit,
    registerReadCallback: (js.Function, js.Function) => Unit,
    requestPermission: (js.Function, js.Function) => Unit,
    write: (String, js.Function, js.Function) => Unit
  ): Serial = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction2(close), open = js.Any.fromFunction3(open), read = js.Any.fromFunction2(read), registerReadCallback = js.Any.fromFunction2(registerReadCallback), requestPermission = js.Any.fromFunction2(requestPermission), write = js.Any.fromFunction3(write))
    __obj.asInstanceOf[Serial]
  }
  
  @scala.inline
  implicit class SerialOps[Self <: Serial] (val x: Self) extends AnyVal {
    
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
    def setClose(value: (js.Function, js.Function) => Unit): Self = this.set("close", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpen(value: (SerialOptions, js.Function, js.Function) => Unit): Self = this.set("open", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRead(value: (js.Function, js.Function) => Unit): Self = this.set("read", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterReadCallback(value: (js.Function, js.Function) => Unit): Self = this.set("registerReadCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequestPermission(value: (js.Function, js.Function) => Unit): Self = this.set("requestPermission", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrite(value: (String, js.Function, js.Function) => Unit): Self = this.set("write", js.Any.fromFunction3(value))
  }
}
