package typings.cordovaDashPluginDashNetworkDashInformation

import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection object, exposed via navigator.connection, provides information
  * about the device's cellular and wifi connection.
  */
@js.native
trait Connection extends js.Object {
  /**
    * This property offers a fast way to determine the device's network connection state, and type of connection.
    * One of:
    *     Connection.UNKNOWN
    *     Connection.ETHERNET
    *     Connection.WIFI
    *     Connection.CELL_2G
    *     Connection.CELL_3G
    *     Connection.CELL_4G
    *     Connection.CELL
    *     Connection.NONE
    */
  var `type`: String = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, useCapture: Boolean): Unit = js.native
}

@JSGlobal("Connection")
@js.native
object Connection extends js.Object {
  var CELL: String = js.native
  var CELL_2G: String = js.native
  var CELL_3G: String = js.native
  var CELL_4G: String = js.native
  var ETHERNET: String = js.native
  var NONE: String = js.native
  var UNKNOWN: String = js.native
  var WIFI: String = js.native
}

