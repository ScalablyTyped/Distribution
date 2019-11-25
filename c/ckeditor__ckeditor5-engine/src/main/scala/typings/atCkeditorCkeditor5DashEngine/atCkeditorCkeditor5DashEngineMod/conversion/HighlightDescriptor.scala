package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/conversion/downcast-converters
trait HighlightDescriptor extends js.Object {
  var attributes: js.Object
  var classes: String | js.Array[String]
  var id: String
  var priority: Double
}

object HighlightDescriptor {
  @scala.inline
  def apply(attributes: js.Object, classes: String | js.Array[String], id: String, priority: Double): HighlightDescriptor = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightDescriptor]
  }
}

