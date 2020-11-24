package typings.ckeditor.global.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.plugins.balloontoolbar.contextDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.plugins.balloontoolbar")
@js.native
object balloontoolbar extends js.Object {
  
  @js.native
  object PRIORITY extends /* pri */ StringDictionary[Double]
  
  @js.native
  class context protected ()
    extends typings.ckeditor.CKEDITOR.plugins.balloontoolbar.context {
    def this(editor: typings.ckeditor.CKEDITOR.editor, options: contextDefinition) = this()
  }
  
  @js.native
  class contextManager protected ()
    extends typings.ckeditor.CKEDITOR.plugins.balloontoolbar.contextManager {
    def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
  }
}
