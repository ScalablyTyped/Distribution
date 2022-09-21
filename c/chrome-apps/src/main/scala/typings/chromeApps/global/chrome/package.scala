package typings.chromeApps.global.chrome

import typings.chromeApps.anon.OnloadT
import typings.chromeApps.chrome.deprecated
import typings.chromeApps.chrome.deprecatedButUsable
import typings.chromeApps.global.chrome.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// #endregion
// #region methods
/////////////
// METHODS //
/////////////
/**
  * Different page speed and load metrics
  */
inline def csi(): OnloadT = ^.asInstanceOf[js.Dynamic].applyDynamic("csi")().asInstanceOf[OnloadT]

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
inline def experimental: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("experimental").asInstanceOf[Any]

/**
  * @deprecated Deprecated in Chrome 64.
  * chrome.loadTimes() is a non-standard API that exposes loading metrics
  * and network information to developers in order to help them better
  * understand their site's performance in the real world.
  * @see[Use this instead]{@link https://www.w3.org/TR/navigation-timing-2/}
  * @see[Deprecation article]{@link https://developers.google.com/web/updates/2017/12/chrome-loadtimes-deprecated}
  */
inline def loadTimes(): deprecatedButUsable = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTimes")().asInstanceOf[deprecatedButUsable]

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
inline def serial: deprecated = ^.asInstanceOf[js.Dynamic].selectDynamic("serial").asInstanceOf[deprecated]
