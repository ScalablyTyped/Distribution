package typings.cassandraDriver.metadataMod.metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Udt extends js.Object {
  var fields: js.Array[ColumnInfo]
  var name: String
}

object Udt {
  @scala.inline
  def apply(fields: js.Array[ColumnInfo], name: String): Udt = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Udt]
  }
}

