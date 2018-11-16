package typings
package cordovaDashPluginDashMediaDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates properties of a media capture file. */
@js.native
trait MediaFile extends js.Object {
  /** The full path of the file, including the name. */
  var fullPath: java.lang.String = js.native
  /** The date and time when the file was last modified. */
  var lastModifiedDate: stdLib.Date = js.native
  /** The name of the file, without path information. */
  var name: java.lang.String = js.native
  /** The size of the file, in bytes. */
  var size: scala.Double = js.native
  /** The file's mime type */
  var `type`: java.lang.String = js.native
  /**
       * Retrieves format information about the media capture file.
       * @param successCallback Invoked with a MediaFileData object when successful.
       * @param errorCallback   Invoked if the attempt fails, this function. 
       */
  def getFormatData(successCallback: js.Function1[/* data */ MediaFileData, scala.Unit]): scala.Unit = js.native
  /**
       * Retrieves format information about the media capture file.
       * @param successCallback Invoked with a MediaFileData object when successful.
       * @param errorCallback   Invoked if the attempt fails, this function. 
       */
  def getFormatData(
    successCallback: js.Function1[/* data */ MediaFileData, scala.Unit],
    errorCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

