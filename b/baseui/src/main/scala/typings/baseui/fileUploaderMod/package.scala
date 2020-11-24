package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileUploaderMod {
  
  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[typings.std.File], 
    /* event */ typings.react.mod.SyntheticEvent[typings.std.HTMLElement, typings.std.Event], 
    js.Any
  ]
  
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[typings.std.File], 
    /* rejected */ js.Array[typings.std.File], 
    /* event */ typings.react.mod.SyntheticEvent[typings.std.HTMLElement, typings.std.Event], 
    js.Any
  ]
  
  type GetDataTransferItems = js.Function1[
    /* event */ typings.react.mod.SyntheticEvent[js.Any, typings.std.Event], 
    js.Promise[js.Array[typings.std.File | typings.std.DataTransferItem]]
  ]
}
