package typings.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.htmlParser.element
import typings.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.pastefromword")
@js.native
object pastefromword extends js.Object {
  @js.native
  class lists () extends js.Object {
    var numbering: numbering = js.native
  }
  
  @js.native
  class styles () extends js.Object {
    def pushStylesLower(element: element, exceptions: StringDictionary[Boolean]): Boolean = js.native
    def pushStylesLower(element: element, exceptions: StringDictionary[Boolean], wrapText: Boolean): Boolean = js.native
  }
  
  @js.native
  object lists extends js.Object {
    @js.native
    class numbering () extends js.Object {
      def getStyle(marker: String): String = js.native
      def toNumber(marker: String, markerType: String): Double = js.native
    }
    
  }
  
}

