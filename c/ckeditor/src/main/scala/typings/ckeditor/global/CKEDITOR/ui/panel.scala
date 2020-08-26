package typings.ckeditor.global.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.panel")
@js.native
class panel protected ()
  extends typings.ckeditor.CKEDITOR.ui.panel {
  def this(document: typings.ckeditor.CKEDITOR.dom.document, definition: StringDictionary[js.Any]) = this()
}

@JSGlobal("CKEDITOR.ui.panel")
@js.native
object panel extends js.Object {
  @js.native
  class block ()
    extends typings.ckeditor.CKEDITOR.ui.panel.block
  
  val handler: typings.ckeditor.CKEDITOR.ui.handlerDefinition[typings.ckeditor.CKEDITOR.ui.panel] = js.native
}

