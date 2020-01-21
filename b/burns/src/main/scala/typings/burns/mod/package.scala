package typings.burns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Type Alias for event handlers
    */
  type EventHandler = typings.burns.mod.Handlers | (typings.std.Record[java.lang.String, typings.burns.mod.Handlers])
  /**
    * Function type for handling events
    */
  type HandlerFn = js.Function1[/* payload */ js.UndefOr[js.Any], js.Any]
  /**
    * This Type is an alias to the multiple
    * parameter types the `registerEvent` method accepts
    */
  type Handlers = java.lang.String | typings.burns.mod.HandlerFn | js.Array[typings.burns.mod.HandlerFn]
}
