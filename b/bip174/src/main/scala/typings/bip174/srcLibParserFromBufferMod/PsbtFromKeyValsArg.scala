package typings.bip174.srcLibParserFromBufferMod

import typings.bip174.srcLibInterfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PsbtFromKeyValsArg extends js.Object {
  var globalMapKeyVals: js.Array[KeyValue]
  var inputKeyVals: js.Array[js.Array[KeyValue]]
  var outputKeyVals: js.Array[js.Array[KeyValue]]
}

object PsbtFromKeyValsArg {
  @scala.inline
  def apply(
    globalMapKeyVals: js.Array[KeyValue],
    inputKeyVals: js.Array[js.Array[KeyValue]],
    outputKeyVals: js.Array[js.Array[KeyValue]]
  ): PsbtFromKeyValsArg = {
    val __obj = js.Dynamic.literal(globalMapKeyVals = globalMapKeyVals.asInstanceOf[js.Any], inputKeyVals = inputKeyVals.asInstanceOf[js.Any], outputKeyVals = outputKeyVals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PsbtFromKeyValsArg]
  }
}

