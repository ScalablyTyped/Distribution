package typings.cfenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var credentials: js.Object
  var label: String
  var name: String
  var plan: String
  var tags: js.Array[String]
}

object Service {
  @scala.inline
  def apply(credentials: js.Object, label: String, name: String, plan: String, tags: js.Array[String]): Service = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Service]
  }
}

