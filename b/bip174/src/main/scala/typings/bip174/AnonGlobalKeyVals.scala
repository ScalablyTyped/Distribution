package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobalKeyVals extends js.Object {
  var globalKeyVals: js.Array[KeyValue]
  var inputKeyVals: js.Array[js.Array[KeyValue]]
  var outputKeyVals: js.Array[js.Array[KeyValue]]
}

object AnonGlobalKeyVals {
  @scala.inline
  def apply(
    globalKeyVals: js.Array[KeyValue],
    inputKeyVals: js.Array[js.Array[KeyValue]],
    outputKeyVals: js.Array[js.Array[KeyValue]]
  ): AnonGlobalKeyVals = {
    val __obj = js.Dynamic.literal(globalKeyVals = globalKeyVals.asInstanceOf[js.Any], inputKeyVals = inputKeyVals.asInstanceOf[js.Any], outputKeyVals = outputKeyVals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobalKeyVals]
  }
}

