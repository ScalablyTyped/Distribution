package typings.ckeditor.CKEDITOR.dom

import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait text extends node {
  
  @JSName("$")
  val $_text: Text = js.native
  
  def getLength(): Double = js.native
  
  def getText(): String = js.native
  
  def setText(text: String): Unit = js.native
  
  def split(offset: Double): text = js.native
  
  def substring(indexA: Double): Unit = js.native
  def substring(indexA: Double, indexB: Double): Unit = js.native
}
