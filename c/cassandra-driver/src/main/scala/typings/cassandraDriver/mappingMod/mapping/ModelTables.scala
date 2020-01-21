package typings.cassandraDriver.mappingMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelTables extends js.Object {
  var isView: Boolean
  var name: String
}

object ModelTables {
  @scala.inline
  def apply(isView: Boolean, name: String): ModelTables = {
    val __obj = js.Dynamic.literal(isView = isView.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModelTables]
  }
}

