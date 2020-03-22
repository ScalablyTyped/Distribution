package typings.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.AnonExec
import typings.ckeditor.CKEDITOR.command
import typings.ckeditor.CKEDITOR.commandDefinition
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.indent")
@js.native
object indent extends js.Object {
  @js.native
  class genericDefinition () extends commandDefinition {
    @JSName("async")
    var async_genericDefinition: Boolean = js.native
    @JSName("canUndo")
    var canUndo_genericDefinition: Boolean = js.native
    @JSName("contextSensitive")
    var contextSensitive_genericDefinition: Boolean = js.native
    @JSName("context")
    var context_genericDefinition: Boolean = js.native
    @JSName("editorFocus")
    var editorFocus_genericDefinition: Boolean = js.native
    @JSName("fakeKeystroke")
    var fakeKeystroke_genericDefinition: Double = js.native
    val isIndent: Boolean = js.native
    @JSName("modes")
    var modes_genericDefinition: StringDictionary[js.Any] = js.native
    @JSName("readOnly")
    var readOnly_genericDefinition: Boolean = js.native
    @JSName("startDisabled")
    var startDisabled_genericDefinition: Boolean = js.native
  }
  
  @js.native
  class specificDefinition () extends js.Object {
    var database: StringDictionary[js.Any] = js.native
    val enterBr: Boolean = js.native
    val indentKey: StringDictionary[js.Any] = js.native
    val isIndent: Boolean = js.native
    val jobs: StringDictionary[AnonExec] = js.native
    val relatedGlobal: StringDictionary[js.Any] = js.native
    def execJob(editor: editor, priority: Double): Boolean = js.native
    def getContext(node: elementPath): element = js.native
    def refreshJob(editor: editor, priority: Double): Double = js.native
  }
  
  def registerCommands(editor: editor, commands: StringDictionary[command]): Unit = js.native
}

