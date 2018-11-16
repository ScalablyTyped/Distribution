package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @ignore
     * Application error to support additional information when loading a file
     */
@JSImport("babylonjs", "LoadFileError")
@js.native
class LoadFileError protected ()
  extends babylonjsLib.BABYLONNs.LoadFileError {
  /**
           * Creates a new LoadFileError
           * @param message defines the message of the error
           * @param request defines the optional XHR request
           */
  def this(message: java.lang.String) = this()
  /**
           * Creates a new LoadFileError
           * @param message defines the message of the error
           * @param request defines the optional XHR request
           */
  def this(message: java.lang.String, /** defines the optional XHR request */
  request: stdLib.XMLHttpRequest) = this()
}

/**
     * @ignore
     * Application error to support additional information when loading a file
     */
@JSImport("babylonjs", "LoadFileError")
@js.native
object LoadFileError extends js.Object {
  var _setPrototypeOf: js.Any = js.native
}

