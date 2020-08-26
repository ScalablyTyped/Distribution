package typings.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.plugins.imagebase.imageWidgetDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.imagebase")
@js.native
object imagebase extends js.Object {
  @js.native
  class progressBar ()
    extends typings.ckeditor.CKEDITOR.plugins.imagebase.progressBar
  
  @js.native
  class progressReporter ()
    extends typings.ckeditor.CKEDITOR.plugins.imagebase.progressReporter {
    def this(wrapperHtml: String) = this()
  }
  
  def addFeature(editor: editor, name: String, definition: imageWidgetDefinition): imageWidgetDefinition = js.native
  def addImageWidget(editor: editor, name: String, definition: imageWidgetDefinition): Unit = js.native
  @js.native
  object featuresDefinitions extends /* key */ StringDictionary[String]
  
}

