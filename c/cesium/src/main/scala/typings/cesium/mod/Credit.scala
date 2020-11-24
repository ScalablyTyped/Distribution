package typings.cesium.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Credit")
@js.native
class Credit protected () extends js.Object {
  def this(html: String) = this()
  def this(html: String, showOnScreen: Boolean) = this()
  
  val element: HTMLElement = js.native
  
  def equals(credits: Credit): Boolean = js.native
  
  def hasImage(): Boolean = js.native
  
  def hasLink(): Boolean = js.native
  
  val html: String = js.native
  
  val imageUrl: String = js.native
  
  val link: String = js.native
  
  val showOnScreen: Boolean = js.native
  
  val text: String = js.native
}
/* static members */
@JSImport("cesium", "Credit")
@js.native
object Credit extends js.Object {
  
  def equals(left: Credit, right: Credit): Boolean = js.native
}
