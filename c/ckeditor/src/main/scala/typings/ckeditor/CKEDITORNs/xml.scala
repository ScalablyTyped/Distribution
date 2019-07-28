package typings.ckeditor.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.xml")
@js.native
class xml protected () extends js.Object {
  def this(xmlObjectOrData: js.Any) = this()
  var baseXml: js.Any = js.native
  def getInnerXml(xpath: String): String = js.native
  def getInnerXml(xpath: String, contextNode: js.Any): String = js.native
  def selectNodes(xpath: String): js.Array[_] = js.native
  def selectNodes(xpath: String, contextNode: js.Any): js.Array[_] = js.native
  def selectSingleNode(xpath: String): js.Any = js.native
  def selectSingleNode(xpath: String, contextNode: js.Any): js.Any = js.native
}

