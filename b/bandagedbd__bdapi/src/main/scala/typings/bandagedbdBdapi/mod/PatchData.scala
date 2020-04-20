package typings.bandagedbdBdapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchData extends js.Object {
  var CancelPatch: typings.bandagedbdBdapi.mod.CancelPatch
  var methodArguments: js.Array[_]
  var returnValue: js.Any
  var thisObject: js.Object
  def callOriginalMethod(): Unit
  def originalMethod(): Unit
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
}

