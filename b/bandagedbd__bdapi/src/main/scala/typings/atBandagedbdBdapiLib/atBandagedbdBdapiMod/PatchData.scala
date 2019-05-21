package typings
package atBandagedbdBdapiLib.atBandagedbdBdapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchData extends js.Object {
  var CancelPatch: atBandagedbdBdapiLib.atBandagedbdBdapiMod.CancelPatch
  var methodArguments: js.Array[_]
  var returnValue: js.Any
  var thisObject: js.Object
  def callOriginalMethod(): scala.Unit
  def originalMethod(): scala.Unit
}

object PatchData {
  @scala.inline
  def apply(
    CancelPatch: CancelPatch,
    callOriginalMethod: () => scala.Unit,
    methodArguments: js.Array[_],
    originalMethod: () => scala.Unit,
    returnValue: js.Any,
    thisObject: js.Object
  ): PatchData = {
    val __obj = js.Dynamic.literal(CancelPatch = CancelPatch, callOriginalMethod = js.Any.fromFunction0(callOriginalMethod), methodArguments = methodArguments, originalMethod = js.Any.fromFunction0(originalMethod), returnValue = returnValue, thisObject = thisObject)
  
    __obj.asInstanceOf[PatchData]
  }
}

