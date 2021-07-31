package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.htmlParser.basicWriter
import typings.ckeditor.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait htmlDataProcessor
  extends StObject
     with dataProcessor {
  
  var dataFilter: typings.ckeditor.CKEDITOR.htmlParser.filter = js.native
  
  var htmlFilter: typings.ckeditor.CKEDITOR.htmlParser.filter = js.native
  
  def toDataFormat(html: String): String = js.native
  def toDataFormat(html: String, options: Context): String = js.native
  
  def toHtml(data: String, options: htmlDataProcessorOptions): String = js.native
  
  var writer: basicWriter = js.native
}
