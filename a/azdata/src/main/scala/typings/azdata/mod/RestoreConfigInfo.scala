package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreConfigInfo extends js.Object {
  var configInfo: StringDictionary[js.Any]
}

object RestoreConfigInfo {
  @scala.inline
  def apply(configInfo: StringDictionary[js.Any]): RestoreConfigInfo = {
    val __obj = js.Dynamic.literal(configInfo = configInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreConfigInfo]
  }
}

