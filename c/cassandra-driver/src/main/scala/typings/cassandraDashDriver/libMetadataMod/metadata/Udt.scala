package typings.cassandraDashDriver.libMetadataMod.metadata

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
    val __obj = js.Dynamic.literal(fields = fields, name = name)
  
    __obj.asInstanceOf[Udt]
  }
}

