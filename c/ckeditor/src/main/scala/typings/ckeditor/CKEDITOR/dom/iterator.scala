package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait iterator extends js.Object {
  
  val activeFilter: typings.ckeditor.CKEDITOR.filter = js.native
  
  var enforceRealBlocks: Boolean = js.native
  
  var enlargeBr: Boolean = js.native
  
  val filter: typings.ckeditor.CKEDITOR.filter = js.native
  
  var forceBrBreak: Boolean = js.native
  
  def getNextParagraph(): element = js.native
  def getNextParagraph(blockTag: String): element = js.native
  
  val range: typings.ckeditor.CKEDITOR.dom.range = js.native
}
