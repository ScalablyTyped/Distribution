package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileDashUploaderMod {
  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[stdLib.File], 
    /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event], 
    js.Any
  ]
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[stdLib.File], 
    /* rejected */ js.Array[stdLib.File], 
    /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event], 
    js.Any
  ]
  type GetDataTransferItems = js.Function1[
    /* event */ reactLib.reactMod.SyntheticEvent[js.Any, reactLib.Event], 
    js.Promise[js.Array[stdLib.File | stdLib.DataTransferItem]]
  ]
}
