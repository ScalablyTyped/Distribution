package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.event
import typings.ckeditor.CKEDITOR.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.plugins.copyformatting")
@js.native
object copyformatting extends js.Object {
  
  @js.native
  trait state extends event {
    
    var editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    var filter: typings.ckeditor.CKEDITOR.filter = js.native
    
    var sticky: Boolean = js.native
    
    var styles: js.Array[style] = js.native
  }
}
