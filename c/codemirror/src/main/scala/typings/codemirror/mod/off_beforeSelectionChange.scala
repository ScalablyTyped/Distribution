package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.beforeSelectionChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "off")
@js.native
object off_beforeSelectionChange extends js.Object {
  
  def apply(
    doc: Doc,
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ Editor, /* obj */ EditorSelectionChange, Unit]
  ): Unit = js.native
}
