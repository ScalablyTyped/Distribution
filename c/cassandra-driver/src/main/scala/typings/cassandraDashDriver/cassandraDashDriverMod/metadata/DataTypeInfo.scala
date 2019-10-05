package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import typings.cassandraDashDriver.Anon_Frozen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeInfo extends js.Object {
  var code: Double
  var info: String | DataTypeInfo | js.Array[DataTypeInfo]
  var options: Anon_Frozen
}

object DataTypeInfo {
  @scala.inline
  def apply(code: Double, info: String | DataTypeInfo | js.Array[DataTypeInfo], options: Anon_Frozen): DataTypeInfo = {
    val __obj = js.Dynamic.literal(code = code, info = info.asInstanceOf[js.Any], options = options)
  
    __obj.asInstanceOf[DataTypeInfo]
  }
}

