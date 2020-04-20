package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreInfo extends js.Object {
  var options: StringDictionary[js.Any]
  var taskExecutionMode: TaskExecutionMode
}

object RestoreInfo {
  @scala.inline
  def apply(options: StringDictionary[js.Any], taskExecutionMode: TaskExecutionMode): RestoreInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], taskExecutionMode = taskExecutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreInfo]
  }
}

