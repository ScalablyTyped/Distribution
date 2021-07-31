package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.event
import typings.ckeditor.CKEDITOR.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object copyformatting {
  
  @js.native
  trait state
    extends StObject
       with event {
    
    var editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    var filter: typings.ckeditor.CKEDITOR.filter = js.native
    
    var sticky: Boolean = js.native
    
    var styles: js.Array[style] = js.native
  }
}
