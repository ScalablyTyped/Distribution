package typings
package delugeLib.delugeMod.delugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deluge extends js.Object {
  def add(
    magnet: java.lang.String,
    dlPath: DownloadOptions,
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* result */ scala.Boolean, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Add the torrent to Deluge
    * @param magnet
    * @param dlPath
    * @param callback
    */
  def add(
    magnet: java.lang.String,
    dlPath: java.lang.String,
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* result */ scala.Boolean, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Connect the WebUI to the wanted daemon
    * @param hostID
    * @param callback
    */
  def connect(
    hostID: java.lang.String,
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* result */ scala.Boolean, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get the list of all the hosts that the WebUI can connect to
    * @param callback
    */
  def getHosts(
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* result */ js.Array[Host], 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Get the list of all torrents and changing data that represents their status in the WebUI
    * @param callback
    */
  def getTorrentRecord(
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* result */ TorrentRecord, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Check if the WebUI is connected to a deamon. Return true or false as result of the callback.
    * @param callback
    */
  def isConnected(
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* result */ scala.Boolean, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Set cookies in COOKIE_JAR, cookies is an object with urls as keys, example:
    * {'http://example.org/': 'uid=1234;pass=xxxx;'}
    * @object cookies
    */
  def setCookies(
    cookies: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    callback: js.Function3[
      /* error */ java.lang.String, 
      /* result */ scala.Boolean, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

