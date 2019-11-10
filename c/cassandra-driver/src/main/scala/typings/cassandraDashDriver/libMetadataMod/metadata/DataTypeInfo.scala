package typings.cassandraDashDriver.libMetadataMod.metadata

import typings.cassandraDashDriver.Anon_Frozen
import typings.cassandraDashDriver.libTypesMod.types.dataTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeInfo extends js.Object {
  var code: dataTypes
  var info: String | DataTypeInfo | js.Array[DataTypeInfo]
  var options: Anon_Frozen
}

object DataTypeInfo {
  @scala.inline
  def apply(code: dataTypes, info: String | DataTypeInfo | js.Array[DataTypeInfo], options: Anon_Frozen): DataTypeInfo = {
    val __obj = js.Dynamic.literal(code = code, info = info.asInstanceOf[js.Any], options = options)
  
    __obj.asInstanceOf[DataTypeInfo]
  }
}

