package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Serial extends js.Object {
  // #endregion
  // #region classes
  /////////////
  // CLASSES //
  /////////////
  /**
    * New Chrome Event
    * @constructor
    */
  val Event: Anon_T
  // #endregion
  // #region placeholders
  //////////////////
  // PLACEHOLDERS //
  //////////////////
  /**
    * Chrome experimental apis may be using this namespace.
    * Please consult the official documentation.
    * @see[Documentation]{@link https://developer.chrome.com/apps/experimental}
    */
  val experimental: js.Any
  // #endregion
  // #region chrome.serial
  ////////////
  // Serial //
  ////////////
  /**
    * Use the chrome.socket API to send and receive data over the network using TCP and UDP connections.
    * @deprecated Note: Starting with Chrome 33,
    *  this API is deprecated in favor of the
    *  sockets.udp, sockets.tcp and sockets.tcpServer APIs.
    * @since Chrome 23
    */
  val serial: chromeDashAppsLib.chromeNs.deprecated
  // #endregion
  // #region methods
  /////////////
  // METHODS //
  /////////////
  /**
    * Different page speed and load metrics
    */
  def csi(): Anon_Tran
  /**
    * @deprecated Deprecated in Chrome 64.
    * chrome.loadTimes() is a non-standard API that exposes loading metrics
    * and network information to developers in order to help them better
    * understand their site's performance in the real world.
    * @see[Use this instead]{@link https://www.w3.org/TR/navigation-timing-2/}
    * @see[Deprecation article]{@link https://developers.google.com/web/updates/2017/12/chrome-loadtimes-deprecated}
    */
  def loadTimes(): chromeDashAppsLib.chromeNs.deprecatedButUsable
}

