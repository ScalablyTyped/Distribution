package typings.baiduApp.swan

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTarget extends js.Object {
  var dataset: StringDictionary[String]
  var id: String
  var tagName: String
}

object EventTarget {
  @scala.inline
  def apply(dataset: StringDictionary[String], id: String, tagName: String): EventTarget = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
}

