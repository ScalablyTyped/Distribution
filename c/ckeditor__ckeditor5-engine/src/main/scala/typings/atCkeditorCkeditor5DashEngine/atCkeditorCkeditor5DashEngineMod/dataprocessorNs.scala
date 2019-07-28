package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod

import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.dataprocessorNs.DataProcessor
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.dataprocessorNs.HtmlWriter
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "dataprocessor")
@js.native
object dataprocessorNs extends js.Object {
  // engine/dataprocessor/basichtmlwriter
  @js.native
  class BasicHtmlWriter () extends HtmlWriter {
    /* CompleteClass */
    override def getHtml(fragment: DocumentFragment): String = js.native
  }
  
  // engine/dataprocessor/dataprocessor
  trait DataProcessor extends js.Object
  
  // engine/dataprocessor/htmldataprocessor
  @js.native
  class HtmlDataProcessor () extends DataProcessor
  
  // engine/dataprocessor/htmlwriter
  trait HtmlWriter extends js.Object {
    def getHtml(fragment: DocumentFragment): String
  }
  
  // engine/dataprocessor/xmldataprocessor
  @js.native
  class XmlDataProcessor () extends DataProcessor
  
}

