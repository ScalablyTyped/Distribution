package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.getUacGroups()
trait UacGroup extends js.Object {
  var id: Double
  var name: String
  var showName: String
}

object UacGroup {
  @scala.inline
  def apply(id: Double, name: String, showName: String): UacGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showName = showName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UacGroup]
  }
}

