package typings.atBandagedbdBdapi.atBandagedbdBdapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchData extends js.Object {
  var CancelPatch: typings.atBandagedbdBdapi.atBandagedbdBdapiMod.CancelPatch
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
    val __obj = js.Dynamic.literal(CancelPatch = js.Any.fromFunction0(CancelPatch), callOriginalMethod = js.Any.fromFunction0(callOriginalMethod), methodArguments = methodArguments, originalMethod = js.Any.fromFunction0(originalMethod), returnValue = returnValue, thisObject = thisObject)
  
    __obj.asInstanceOf[PatchData]
  }
}

