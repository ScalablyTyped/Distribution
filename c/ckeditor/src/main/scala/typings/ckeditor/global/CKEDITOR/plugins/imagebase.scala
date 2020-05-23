package typings.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.fileTools.fileLoader
import typings.ckeditor.CKEDITOR.plugins.imagebase.imageWidgetDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.imagebase")
@js.native
object imagebase extends js.Object {
  @js.native
  class progressBar ()
    extends typings.ckeditor.CKEDITOR.plugins.imagebase.progressBar {
    /* CompleteClass */
    override var bar: element = js.native
    /* CompleteClass */
    override var wrapper: element = js.native
    /* CompleteClass */
    override def aborted(): Unit = js.native
    /* CompleteClass */
    override def bindLoader(loader: fileLoader): Unit = js.native
    /* CompleteClass */
    override def done(): Unit = js.native
    /* CompleteClass */
    override def failed(): Unit = js.native
    /* CompleteClass */
    override def remove(): Unit = js.native
    /* CompleteClass */
    override def updated(progress: Double): Unit = js.native
  }
  
  @js.native
  class progressReporter ()
    extends typings.ckeditor.CKEDITOR.plugins.imagebase.progressReporter {
    def this(wrapperHtml: String) = this()
    /* CompleteClass */
    override var wrapper: element = js.native
    /* CompleteClass */
    override def aborted(): Unit = js.native
    /* CompleteClass */
    override def bindLoader(loader: fileLoader): Unit = js.native
    /* CompleteClass */
    override def done(): Unit = js.native
    /* CompleteClass */
    override def failed(): Unit = js.native
    /* CompleteClass */
    override def remove(): Unit = js.native
    /* CompleteClass */
    override def updated(progress: Double): Unit = js.native
  }
  
  def addFeature(editor: editor, name: String, definition: imageWidgetDefinition): imageWidgetDefinition = js.native
  def addImageWidget(editor: editor, name: String, definition: imageWidgetDefinition): Unit = js.native
  @js.native
  object featuresDefinitions extends /* key */ StringDictionary[String]
  
}

