package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreDatabaseFileInfo extends js.Object {
  var fileType: String
  var logicalFileName: String
  var originalFileName: String
  var restoreAsFileName: String
}

object RestoreDatabaseFileInfo {
  @scala.inline
  def apply(fileType: String, logicalFileName: String, originalFileName: String, restoreAsFileName: String): RestoreDatabaseFileInfo = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], logicalFileName = logicalFileName.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], restoreAsFileName = restoreAsFileName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestoreDatabaseFileInfo]
  }
}

