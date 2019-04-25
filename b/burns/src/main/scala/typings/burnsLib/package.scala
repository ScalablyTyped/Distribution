package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object burnsLib {
  /**
    * Type Alias for event handlers
    */
  type EventHandler = Handlers | (stdLib.Record[java.lang.String, Handlers])
  /**
    * Function type for handling events
    */
  type HandlerFn = js.Function1[/* payload */ js.UndefOr[js.Any], js.Any]
  /**
    * This Type is an alias to the multiple
    * parameter types the `registerEvent` method accepts
    */
  type Handlers = java.lang.String | HandlerFn | js.Array[HandlerFn]
}
