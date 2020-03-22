package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarativeTableProperties extends js.Object {
  var columns: js.Array[DeclarativeTableColumn]
  var data: js.Array[js.Array[_]]
}

object DeclarativeTableProperties {
  @scala.inline
  def apply(columns: js.Array[DeclarativeTableColumn], data: js.Array[js.Array[_]]): DeclarativeTableProperties = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeclarativeTableProperties]
  }
}

