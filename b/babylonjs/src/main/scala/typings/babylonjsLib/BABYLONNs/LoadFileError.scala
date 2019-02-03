package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ignore
  * Application error to support additional information when loading a file
  */
@JSGlobal("BABYLON.LoadFileError")
@js.native
class LoadFileError protected ()
  extends nodeLib.Error {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional XHR request
    */
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, /** defines the optional XHR request */
  request: stdLib.XMLHttpRequest) = this()
  /** defines the optional XHR request */
  var request: js.UndefOr[stdLib.XMLHttpRequest] = js.native
}

/* static members */
@JSGlobal("BABYLON.LoadFileError")
@js.native
object LoadFileError extends js.Object {
  var _setPrototypeOf: js.Any = js.native
}

