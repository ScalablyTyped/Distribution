package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GlobalKeyVals extends js.Object {
  var globalKeyVals: js.Array[KeyValue]
  var inputKeyVals: js.Array[js.Array[KeyValue]]
  var outputKeyVals: js.Array[js.Array[KeyValue]]
}

object Anon_GlobalKeyVals {
  @scala.inline
  def apply(
    globalKeyVals: js.Array[KeyValue],
    inputKeyVals: js.Array[js.Array[KeyValue]],
    outputKeyVals: js.Array[js.Array[KeyValue]]
  ): Anon_GlobalKeyVals = {
    val __obj = js.Dynamic.literal(globalKeyVals = globalKeyVals.asInstanceOf[js.Any], inputKeyVals = inputKeyVals.asInstanceOf[js.Any], outputKeyVals = outputKeyVals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GlobalKeyVals]
  }
}

