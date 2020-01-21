package typings.ckeditor

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var removed: js.Array[String]
  var set: StringDictionary[String]
}

object AnonKey {
  @scala.inline
  def apply(removed: js.Array[String], set: StringDictionary[String]): AnonKey = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

