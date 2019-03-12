package typings
package cordovaDashPluginDashWebsqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlResultSetRowList extends js.Object {
  var length: scala.Double
  def item(index: scala.Double): js.Object
}

object SqlResultSetRowList {
  @scala.inline
  def apply(item: scala.Double => js.Object, length: scala.Double): SqlResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length)
  
    __obj.asInstanceOf[SqlResultSetRowList]
  }
}

