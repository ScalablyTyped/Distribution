package typings.bip174.fromBufferMod

import typings.bip174.interfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtFromKeyValsArg extends js.Object {
  var globalMapKeyVals: js.Array[KeyValue] = js.native
  var inputKeyVals: js.Array[js.Array[KeyValue]] = js.native
  var outputKeyVals: js.Array[js.Array[KeyValue]] = js.native
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
  @scala.inline
  implicit class PsbtFromKeyValsArgOps[Self <: PsbtFromKeyValsArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalMapKeyValsVarargs(value: KeyValue*): Self = this.set("globalMapKeyVals", js.Array(value :_*))
    @scala.inline
    def setGlobalMapKeyVals(value: js.Array[KeyValue]): Self = this.set("globalMapKeyVals", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputKeyValsVarargs(value: js.Array[KeyValue]*): Self = this.set("inputKeyVals", js.Array(value :_*))
    @scala.inline
    def setInputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = this.set("inputKeyVals", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputKeyValsVarargs(value: js.Array[KeyValue]*): Self = this.set("outputKeyVals", js.Array(value :_*))
    @scala.inline
    def setOutputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = this.set("outputKeyVals", value.asInstanceOf[js.Any])
  }
  
}

