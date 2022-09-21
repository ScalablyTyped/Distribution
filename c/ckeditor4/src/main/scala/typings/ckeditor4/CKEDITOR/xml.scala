package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait xml extends StObject {
  
  var baseXml: Any = js.native
  
  def getInnerXml(xpath: String): String = js.native
  def getInnerXml(xpath: String, contextNode: Any): String = js.native
  
  def selectNodes(xpath: String): js.Array[Any] = js.native
  def selectNodes(xpath: String, contextNode: Any): js.Array[Any] = js.native
  
  def selectSingleNode(xpath: String): Any = js.native
  def selectSingleNode(xpath: String, contextNode: Any): Any = js.native
}
