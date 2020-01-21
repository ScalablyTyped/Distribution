package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileUploaderMod {
  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[typings.std.File], 
    /* event */ typings.react.mod.SyntheticEvent[typings.std.HTMLElement, typings.std.Event_], 
    js.Any
  ]
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[typings.std.File], 
    /* rejected */ js.Array[typings.std.File], 
    /* event */ typings.react.mod.SyntheticEvent[typings.std.HTMLElement, typings.std.Event_], 
    js.Any
  ]
  type GetDataTransferItems = js.Function1[
    /* event */ typings.react.mod.SyntheticEvent[js.Any, typings.std.Event_], 
    js.Promise[js.Array[typings.std.File | typings.std.DataTransferItem]]
  ]
}
