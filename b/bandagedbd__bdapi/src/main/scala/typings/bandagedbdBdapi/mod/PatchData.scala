package typings.bandagedbdBdapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchData extends js.Object {
  var CancelPatch: typings.bandagedbdBdapi.mod.CancelPatch = js.native
  var methodArguments: js.Array[_] = js.native
  var returnValue: js.Any = js.native
  var thisObject: js.Object = js.native
  def callOriginalMethod(): Unit = js.native
  def originalMethod(): Unit = js.native
}

object PatchData {
  @scala.inline
  def apply(
    CancelPatch: () => Unit,
    callOriginalMethod: () => Unit,
    methodArguments: js.Array[_],
    originalMethod: () => Unit,
    returnValue: js.Any,
    thisObject: js.Object
  ): PatchData = {
    val __obj = js.Dynamic.literal(CancelPatch = js.Any.fromFunction0(CancelPatch), callOriginalMethod = js.Any.fromFunction0(callOriginalMethod), methodArguments = methodArguments.asInstanceOf[js.Any], originalMethod = js.Any.fromFunction0(originalMethod), returnValue = returnValue.asInstanceOf[js.Any], thisObject = thisObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchData]
  }
  @scala.inline
  implicit class PatchDataOps[Self <: PatchData] (val x: Self) extends AnyVal {
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
    def setCancelPatch(value: () => Unit): Self = this.set("CancelPatch", js.Any.fromFunction0(value))
    @scala.inline
    def setCallOriginalMethod(value: () => Unit): Self = this.set("callOriginalMethod", js.Any.fromFunction0(value))
    @scala.inline
    def setMethodArgumentsVarargs(value: js.Any*): Self = this.set("methodArguments", js.Array(value :_*))
    @scala.inline
    def setMethodArguments(value: js.Array[_]): Self = this.set("methodArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalMethod(value: () => Unit): Self = this.set("originalMethod", js.Any.fromFunction0(value))
    @scala.inline
    def setReturnValue(value: js.Any): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setThisObject(value: js.Object): Self = this.set("thisObject", value.asInstanceOf[js.Any])
  }
  
}

