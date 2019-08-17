package typings.burns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object burnsMod {
  import typings.std.Record

  /**
    * Type Alias for event handlers
    */
  type EventHandler = Handlers | (Record[String, Handlers])
  /**
    * Function type for handling events
    */
  type HandlerFn = js.Function1[/* payload */ js.UndefOr[js.Any], js.Any]
  /**
    * This Type is an alias to the multiple
    * parameter types the `registerEvent` method accepts
    */
  type Handlers = String | HandlerFn | js.Array[HandlerFn]
}
