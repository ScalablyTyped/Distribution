package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * File request interface
  */
trait IFileRequest extends js.Object {
  /**
    * Raised when the request is complete (success or error).
    */
  var onCompleteObservable: Observable[IFileRequest]
  /**
    * Aborts the request for a file.
    */
  def abort(): scala.Unit
}

object IFileRequest {
  @scala.inline
  def apply(abort: () => scala.Unit, onCompleteObservable: Observable[IFileRequest]): IFileRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onCompleteObservable = onCompleteObservable)
  
    __obj.asInstanceOf[IFileRequest]
  }
}

