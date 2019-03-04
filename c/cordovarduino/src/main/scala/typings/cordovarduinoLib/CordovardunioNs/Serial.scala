package typings
package cordovarduinoLib.CordovardunioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serial extends js.Object {
  /**
    * Close connection.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def close(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Open a connection.
    *
    * @param opts            SerialOptions object
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def open(opts: SerialOptions, successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Read from the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def read(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Register a callback for the driver reading incoming data from the serial device
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def registerReadCallback(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Request permission to interact with the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def requestPermission(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Write to the serial port.
    *
    * @param data            String data to write to serial port
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def write(data: java.lang.String, successCallback: js.Function, errorCallback: js.Function): scala.Unit
}

object Serial {
  @scala.inline
  def apply(
    close: js.Function2[js.Function, js.Function, scala.Unit],
    open: js.Function3[SerialOptions, js.Function, js.Function, scala.Unit],
    read: js.Function2[js.Function, js.Function, scala.Unit],
    registerReadCallback: js.Function2[js.Function, js.Function, scala.Unit],
    requestPermission: js.Function2[js.Function, js.Function, scala.Unit],
    write: js.Function3[java.lang.String, js.Function, js.Function, scala.Unit]
  ): Serial = {
    val __obj = js.Dynamic.literal(close = close, open = open, read = read, registerReadCallback = registerReadCallback, requestPermission = requestPermission, write = write)
  
    __obj.asInstanceOf[Serial]
  }
}

