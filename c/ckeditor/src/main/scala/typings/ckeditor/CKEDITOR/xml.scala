package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait xml extends StObject {
  
  var baseXml: js.Any = js.native
  
  def getInnerXml(xpath: String): String = js.native
  def getInnerXml(xpath: String, contextNode: js.Any): String = js.native
  
  def selectNodes(xpath: String): js.Array[js.Any] = js.native
  def selectNodes(xpath: String, contextNode: js.Any): js.Array[js.Any] = js.native
  
  def selectSingleNode(xpath: String): js.Any = js.native
  def selectSingleNode(xpath: String, contextNode: js.Any): js.Any = js.native
}
