package typings.cordovaPluginWebsql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlResultSetRowList extends js.Object {
  var length: Double
  def item(index: Double): js.Object
}

object SqlResultSetRowList {
  @scala.inline
  def apply(item: Double => js.Object, length: Double): SqlResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlResultSetRowList]
  }
}

