package typings.braftEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EditorState = typings.draftJs.mod.EditorState with typings.braftEditor.AnonIsEmpty
  type HookFunc = js.Function1[/* any */ js.Any, js.Any]
}
