package typings.deluge.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deluge extends js.Object {
  
  /**
    * Add the torrent to Deluge
    * @param magnet
    * @param dlPath
    * @param callback
    */
  def add(
    magnet: String,
    dlPath: String,
    callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
  ): Unit = js.native
  def add(
    magnet: String,
    dlPath: DownloadOptions,
    callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
  ): Unit = js.native
  
  /**
    * Connect the WebUI to the wanted daemon
    * @param hostID
    * @param callback
    */
  def connect(
    hostID: String,
    callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
  ): Unit = js.native
  
  /**
    * Get the list of all the hosts that the WebUI can connect to
    * @param callback
    */
  def getHosts(
    callback: js.Function3[/* error */ String, /* result */ js.Array[Host], /* response */ ServerResponse, Unit]
  ): Unit = js.native
  
  /**
    * Get the list of all torrents and changing data that represents their status in the WebUI
    * @param callback
    */
  def getTorrentRecord(
    callback: js.Function3[/* error */ String, /* result */ TorrentRecord, /* response */ ServerResponse, Unit]
  ): Unit = js.native
  
  /**
    * Check if the WebUI is connected to a deamon. Return true or false as result of the callback.
    * @param callback
    */
  def isConnected(
    callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
  ): Unit = js.native
  
  /**
    * Set cookies in COOKIE_JAR, cookies is an object with urls as keys, example:
    * {'http://example.org/': 'uid=1234;pass=xxxx;'}
    * @object cookies
    */
  def setCookies(
    cookies: StringDictionary[String],
    callback: js.Function3[/* error */ String, /* result */ Boolean, /* response */ ServerResponse, Unit]
  ): Unit = js.native
}
