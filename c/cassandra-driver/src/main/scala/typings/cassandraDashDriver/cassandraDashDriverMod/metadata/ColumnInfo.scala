package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnInfo extends js.Object {
  var name: String
  var `type`: DataTypeInfo
}

object ColumnInfo {
  @scala.inline
  def apply(name: String, `type`: DataTypeInfo): ColumnInfo = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColumnInfo]
  }
}

