package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.anon.Frozen
import typings.cassandraDriver.typesMod.types.dataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeInfo extends js.Object {
  var code: dataTypes
  var info: String | DataTypeInfo | js.Array[DataTypeInfo]
  var options: Frozen
}

object DataTypeInfo {
  @scala.inline
  def apply(code: dataTypes, info: String | DataTypeInfo | js.Array[DataTypeInfo], options: Frozen): DataTypeInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeInfo]
  }
}

