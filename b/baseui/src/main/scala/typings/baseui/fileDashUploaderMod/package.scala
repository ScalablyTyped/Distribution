package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileDashUploaderMod {
  import typings.react.reactMod.SyntheticEvent
  import typings.std.DataTransferItem
  import typings.std.Event
  import typings.std.File
  import typings.std.HTMLElement

  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[File], 
    /* event */ SyntheticEvent[HTMLElement, Event], 
    js.Any
  ]
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[File], 
    /* rejected */ js.Array[File], 
    /* event */ SyntheticEvent[HTMLElement, Event], 
    js.Any
  ]
  type GetDataTransferItems = js.Function1[
    /* event */ SyntheticEvent[js.Any, Event], 
    js.Promise[js.Array[File | DataTransferItem]]
  ]
}
