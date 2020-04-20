package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.AnonFrozen
import typings.cassandraDriver.typesMod.types.dataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeInfo extends js.Object {
  var code: dataTypes
  var info: String | DataTypeInfo | js.Array[DataTypeInfo]
  var options: AnonFrozen
}

object DataTypeInfo {
  @scala.inline
  def apply(code: dataTypes, info: String | DataTypeInfo | js.Array[DataTypeInfo], options: AnonFrozen): DataTypeInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeInfo]
  }
}

