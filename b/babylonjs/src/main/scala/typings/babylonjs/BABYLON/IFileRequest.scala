package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileRequest extends js.Object {
  /**
    * Raised when the request is complete (success or error).
    */
  var onCompleteObservable: Observable[IFileRequest]
  /**
    * Aborts the request for a file.
    */
  def abort(): Unit
}

object IFileRequest {
  @scala.inline
  def apply(abort: () => Unit, onCompleteObservable: Observable[IFileRequest]): IFileRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onCompleteObservable = onCompleteObservable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRequest]
  }
}

