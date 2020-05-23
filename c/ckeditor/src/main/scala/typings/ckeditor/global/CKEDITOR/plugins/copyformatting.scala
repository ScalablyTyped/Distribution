package typings.ckeditor.global.CKEDITOR.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.copyformatting")
@js.native
object copyformatting extends js.Object {
  @js.native
  class state protected ()
    extends typings.ckeditor.CKEDITOR.plugins.copyformatting.state {
    def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
  }
  
  var breakOnElements: js.Array[String] = js.native
  var elementsForInlineTransform: js.Array[String] = js.native
  var excludedAttributes: js.Array[String] = js.native
  var excludedAttributesFromInlineTransform: js.Array[String] = js.native
  var inlineBoundary: js.Array[String] = js.native
  var preservedElements: js.Array[String] = js.native
}

