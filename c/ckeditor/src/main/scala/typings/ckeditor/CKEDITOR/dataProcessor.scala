package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dataProcessor extends StObject {
  
  def toDataFormat(html: String, fixForBody: String): Unit = js.native
  
  def toHtml(data: String): Unit = js.native
  def toHtml(data: String, fixForBody: String): Unit = js.native
}
