package typings
package cordovaDashPluginDashNetworkDashInformationLib

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
  var `type`: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("Connection")
@js.native
object Connection extends js.Object {
  var CELL: java.lang.String = js.native
  var CELL_2G: java.lang.String = js.native
  var CELL_3G: java.lang.String = js.native
  var CELL_4G: java.lang.String = js.native
  var ETHERNET: java.lang.String = js.native
  var NONE: java.lang.String = js.native
  var UNKNOWN: java.lang.String = js.native
  var WIFI: java.lang.String = js.native
}

