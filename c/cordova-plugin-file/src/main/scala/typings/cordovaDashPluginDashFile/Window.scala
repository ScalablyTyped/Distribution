package typings.cordovaDashPluginDashFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var PERSISTENT: Double = js.native
  var TEMPORARY: Double = js.native
  /**
    * Requests a filesystem in which to store application data.
    * @param type              Whether the filesystem requested should be persistent, as defined above. Use one of TEMPORARY or PERSISTENT.
    * @param size              This is an indicator of how much storage space, in bytes, the application expects to need.
    * @param successCallback   The callback that is called when the user agent provides a filesystem.
    * @param errorCallback     A callback that is called when errors happen, or when the request to obtain the filesystem is denied.
    */
  def requestFileSystem(
    `type`: LocalFileSystem,
    size: Double,
    successCallback: js.Function1[/* fileSystem */ FileSystem, Unit]
  ): Unit = js.native
  def requestFileSystem(
    `type`: LocalFileSystem,
    size: Double,
    successCallback: js.Function1[/* fileSystem */ FileSystem, Unit],
    errorCallback: js.Function1[/* fileError */ FileError, Unit]
  ): Unit = js.native
  /**
    * Look up file system Entry referred to by local URI.
    * @param string uri       URI referring to a local file or directory
    * @param successCallback  invoked with Entry object corresponding to URI
    * @param errorCallback    invoked if error occurs retrieving file system entry
    */
  def resolveLocalFileSystemURI(uri: String, successCallback: js.Function1[/* entry */ Entry, Unit]): Unit = js.native
  def resolveLocalFileSystemURI(
    uri: String,
    successCallback: js.Function1[/* entry */ Entry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  /**
    * Look up file system Entry referred to by local URL.
    * @param string url       URL referring to a local file or directory
    * @param successCallback  invoked with Entry object corresponding to URL
    * @param errorCallback    invoked if error occurs retrieving file system entry
    */
  def resolveLocalFileSystemURL(url: String, successCallback: js.Function1[/* entry */ Entry, Unit]): Unit = js.native
  def resolveLocalFileSystemURL(
    url: String,
    successCallback: js.Function1[/* entry */ Entry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
}

