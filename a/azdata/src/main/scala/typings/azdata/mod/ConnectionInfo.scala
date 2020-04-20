package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var options: StringDictionary[js.Any]
}

object ConnectionInfo {
  @scala.inline
  def apply(options: StringDictionary[js.Any]): ConnectionInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
}

