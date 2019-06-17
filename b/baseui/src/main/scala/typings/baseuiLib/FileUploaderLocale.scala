package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploaderLocale extends js.Object {
  var browseFiles: java.lang.String
  var cancel: java.lang.String
  var dropFilesToUpload: java.lang.String
  var or: java.lang.String
  var retry: java.lang.String
}

object FileUploaderLocale {
  @scala.inline
  def apply(
    browseFiles: java.lang.String,
    cancel: java.lang.String,
    dropFilesToUpload: java.lang.String,
    or: java.lang.String,
    retry: java.lang.String
  ): FileUploaderLocale = {
    val __obj = js.Dynamic.literal(browseFiles = browseFiles, cancel = cancel, dropFilesToUpload = dropFilesToUpload, or = or, retry = retry)
  
    __obj.asInstanceOf[FileUploaderLocale]
  }
}

