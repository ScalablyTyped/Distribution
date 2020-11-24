package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.beforeChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "on")
@js.native
object on_beforeChange extends js.Object {
  
  /** See the description of the same event on editor instances. */
  def apply(
    doc: Doc,
    eventName: beforeChange,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChangeCancellable, Unit]
  ): Unit = js.native
}
