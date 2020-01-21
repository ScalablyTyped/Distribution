package typings.cordovaPluginMediaCapture

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates properties of a media capture file. */
@js.native
trait MediaFile extends js.Object {
  /** The full path of the file, including the name. */
  var fullPath: String = js.native
  /** The date and time when the file was last modified. */
  var lastModifiedDate: Date = js.native
  /** The name of the file, without path information. */
  var name: String = js.native
  /** The size of the file, in bytes. */
  var size: Double = js.native
  /** The file's mime type */
  var `type`: String = js.native
  /**
    * Retrieves format information about the media capture file.
    * @param successCallback Invoked with a MediaFileData object when successful.
    * @param errorCallback   Invoked if the attempt fails, this function. 
    */
  def getFormatData(successCallback: js.Function1[/* data */ MediaFileData, Unit]): Unit = js.native
  def getFormatData(successCallback: js.Function1[/* data */ MediaFileData, Unit], errorCallback: js.Function0[Unit]): Unit = js.native
}

